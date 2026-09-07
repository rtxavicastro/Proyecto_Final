package com.uinsight.risk.model;

public class ReglaAlerta {
    public boolean rulePromedioBajoYTrendNegativa(double promedio, String tendencia) {
        return promedio < 60 && tendencia.equals("NEGATIVO");
    }

    public boolean ruleAltaDispersion(String dispersion) {
        return dispersion.equals("DISPERSION_ALTA");
    }

    public boolean rulePorcentajeBajo(int abajo, int total) {
        double pct = (abajo * 100.0) / total;
        return pct >= 40;
    }    
}
