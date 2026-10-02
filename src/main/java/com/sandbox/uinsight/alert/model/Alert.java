package com.sandbox.uinsight.alert.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "alert")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Alert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long sectionId;
    private String riskLevel;
    private Integer rulesEvaluated;
    private Integer rulesTriggered;
    private Integer alertsGenerated;
}
