package com.sandbox.uinsight.alert.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sandbox.uinsight.alert.dto.response.RiskEvaluationResponse;
import com.sandbox.uinsight.alert.dto.section.SectionIndicatorsDto;
import com.sandbox.uinsight.alert.service.RiskEvaluationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/risk-evaluation")
@RequiredArgsConstructor
public class RiskEvaluationController {

    private final RiskEvaluationService riskEvaluationService;

    @PostMapping("/sections/{id}")
    public RiskEvaluationResponse evaluateSection(
            @PathVariable Long id,
            @RequestBody SectionIndicatorsDto dto) {

        dto.setSectionId(id);

        return riskEvaluationService.evaluateSection(dto);
    }
}
