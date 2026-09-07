package com.uinsight.risk.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uinsight.risk.model.ResultadoRiesgo;
import com.uinsight.risk.service.EvaluacionRiesgo;

@RestController
@RequestMapping("/api/v1/risk-evaluation")
public class EvaluacionRiesgoController {

    @Autowired 
    private EvaluacionRiesgo servicio;

    @PostMapping("/sections/{id}")
    public ResultadoRiesgo evaluar(@PathVariable Long id) {
        return servicio.evaluateSection(id);
    }
}
