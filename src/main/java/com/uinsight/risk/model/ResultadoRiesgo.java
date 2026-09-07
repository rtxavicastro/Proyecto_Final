package com.uinsight.risk.model;

public class ResultadoRiesgo {
    private Long id;
    private String nivelRiesgo;
    private int reglasEvaluadas;
    private int reglasActivadas;

    public ResultadoRiesgo(Long id, String nivelRiesgo, int reglasEvaluadas, int reglasActivadas) {
        this.id = id;
        this.nivelRiesgo = nivelRiesgo;
        this.reglasEvaluadas = reglasEvaluadas;
        this.reglasActivadas = reglasActivadas;
    }

    public Long getId() { return id; }
    public String getNivelRiesgo() { return nivelRiesgo; }
    public int getReglasEvaluadas() { return reglasEvaluadas; }
    public int getReglasActivadas() { return reglasActivadas; }
}
