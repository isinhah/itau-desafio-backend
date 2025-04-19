package com.desafio.itau_backend.dto;

import java.util.DoubleSummaryStatistics;

public record StatisticsResponseDto(
        Long count,
        double sum,
        double avg,
        double min,
        double max
) {
    public StatisticsResponseDto(DoubleSummaryStatistics stats) {
        this(
                stats.getCount(),
                stats.getSum(),
                stats.getAverage(),
                stats.getMin(),
                stats.getMax()
        );
    }
}