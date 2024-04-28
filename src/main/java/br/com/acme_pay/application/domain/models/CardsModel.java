package br.com.acme_pay.application.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardsModel {
    private Long id;
    private String flag;
    private BigDecimal card_limit;
    private AccountModel card_account;
}
