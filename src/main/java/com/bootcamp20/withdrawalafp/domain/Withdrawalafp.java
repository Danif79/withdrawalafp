package com.bootcamp20.withdrawalafp.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Withdrawalafp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int dni;

    private Double amountwithdrawal;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private String afp;
}
