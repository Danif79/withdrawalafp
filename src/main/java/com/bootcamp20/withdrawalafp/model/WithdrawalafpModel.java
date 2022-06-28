package com.bootcamp20.withdrawalafp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WithdrawalafpModel {
    @JsonProperty("withdrawalafpId")
    @Builder.Default
    private Long id = null;

    @Builder.Default
    private int dni = 0;

    @Builder.Default
    private Double amountwithdrawal = null;

    @Builder.Default
    private String afp = null;
}
