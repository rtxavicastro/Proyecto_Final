package com.sandbox.uinsight.alert.dto.section;
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
public class SectionIndicatorsDto {

    private Long sectionId;
    private CentralTendencyDto centralTendency;
    private PositionDto position;
    private DispersionDto dispersion;
    private TrendDto trend;
    private Integer studentsAtRisk;
}
