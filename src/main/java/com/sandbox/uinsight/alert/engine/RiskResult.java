package com.sandbox.uinsight.alert.engine;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RiskResult {
    private String riskLevel;
    private double score;
    private int rulesEvaluated;
    private int rulesTriggered;
    private int alertsGenerated;
    private List<String> activatedRules;
}
