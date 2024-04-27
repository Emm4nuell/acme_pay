package br.com.acme_pay;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cards {
    private Long id;
    private String flag;
    private BigDecimal card_limit;
    private Accounts card_account;
}
