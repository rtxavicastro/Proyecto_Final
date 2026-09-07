package com.uinsight.risk.service;
import org.springframework.stereotype.Service;

import com.uinsight.risk.model.ReglaAlerta;
import com.uinsight.risk.model.ResultadoRiesgo;
import com.uinsight.risk.model.SeccionAnalitica;

@Service
public class EvaluacionRiesgo {
    private final SeccionAnalitica analitico = new SeccionAnalitica();
    private final ReglaAlerta reglas = new ReglaAlerta();

    public ResultadoRiesgo evaluateSection(Long id) {

        int evaluado = 3;
        int activado = 0;

        boolean r1 = reglas.rulePromedioBajoYTrendNegativa(
                analitico.getPromedio(),
                analitico.getTendencia()
        );

        boolean r2 = reglas.ruleAltaDispersion(
                analitico.getNivelDispersion()
        );

        boolean r3 = reglas.rulePorcentajeBajo(
                analitico.getEstudiantesBajos(),
                analitico.getTotalEstudiantes()
        );

        if (r1) activado++;
        if (r2) activado++;
        if (r3) activado++;

        String nivelRiesgo = activado == 0 ? "BAJO" :
                           activado == 1 ? "MODERADO" : "ALTO";

        return new ResultadoRiesgo(id, nivelRiesgo, evaluado, activado);
    }
}
