package com.sandbox.uinsight.alert.service;
import org.springframework.stereotype.Service;

import com.sandbox.uinsight.alert.dto.response.RiskEvaluationResponse;
import com.sandbox.uinsight.alert.dto.section.SectionIndicatorsDto;
import com.sandbox.uinsight.alert.engine.RiskEngine;
import com.sandbox.uinsight.alert.engine.RiskResult;
import com.sandbox.uinsight.alert.model.Alert;
import com.sandbox.uinsight.alert.repository.AlertRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor 
public class RiskEvaluationService {
    private final AlertRepository alertRepository;
    private final RiskEngine riskEngine = new RiskEngine();

    public RiskEvaluationResponse evaluateSection(SectionIndicatorsDto dto) {

        RiskResult result = riskEngine.evaluate(dto);

        Alert alert = Alert.builder()
                .sectionId(dto.getSectionId())
                .riskLevel(result.getRiskLevel())
                .rulesEvaluated(result.getRulesEvaluated())
                .rulesTriggered(result.getRulesTriggered())
                .alertsGenerated(result.getAlertsGenerated())
                .build();

        alertRepository.save(alert);

        return RiskEvaluationResponse.builder()
                .sectionId(dto.getSectionId())
                .riskLevel(result.getRiskLevel())
                .score(result.getScore())
                .rulesEvaluated(result.getRulesEvaluated())
                .rulesTriggered(result.getRulesTriggered())
                .alertsGenerated(result.getAlertsGenerated())
                .activatedRules(result.getActivatedRules())
                .build();
    }
}
