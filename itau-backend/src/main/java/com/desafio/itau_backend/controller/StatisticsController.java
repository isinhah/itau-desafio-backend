package com.desafio.itau_backend.controller;

import com.desafio.itau_backend.dto.StatisticsResponseDto;
import com.desafio.itau_backend.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.DoubleSummaryStatistics;

@RequiredArgsConstructor
@RestController
@RequestMapping("/estatistica")
public class StatisticsController {

    private final TransactionService transactionService;

    @GetMapping
    public ResponseEntity<StatisticsResponseDto> getStatistics() {
        DoubleSummaryStatistics stats = transactionService.getStatistics();
        return ResponseEntity.ok(new StatisticsResponseDto(stats));
    }
}
