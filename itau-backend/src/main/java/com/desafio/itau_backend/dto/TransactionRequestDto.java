package com.desafio.itau_backend.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

import java.time.OffsetDateTime;

public record TransactionRequestDto(

        @NotNull(message = "O campo valor não pode ser nulo")
        @DecimalMin(value = "0", message = "O valor da transação deve ter valor igual ou maior que zero")
        Double valor,

        @NotNull(message = "O campo dataHora não pode ser nulo")
        @PastOrPresent(message = "A data e hora devem ser no passado ou no presente")
        OffsetDateTime dataHora
) {
}