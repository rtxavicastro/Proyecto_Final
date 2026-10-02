package com.sandbox.uinsight.alert.dto.response;

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
public class RiskEvaluationResponse {

    private Long sectionId;
    private String riskLevel;
    private double score;

    private int rulesEvaluated;
    private int rulesTriggered;
    private int alertsGenerated;

    private List<String> activatedRules;
}
