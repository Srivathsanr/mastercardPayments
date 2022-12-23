package com.evaluation.mastercardPayments.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddAmountDto {

    @NotNull
    @NotBlank
    private String accountId;

    @NotNull
    @NotBlank
    private BigDecimal amount;
}
