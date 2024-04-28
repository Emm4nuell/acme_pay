package br.com.acme_pay.application.domain.models;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountModel {
    private Long id;
    private Integer number;
    private Integer agency;
    private BigDecimal balance;
    private CustomerModel customer;
    private List<CardsModel> cards;
    private LocalDateTime created_at;
    private LocalDateTime update_at;
    private boolean closed;
    public List<String> transactions = new ArrayList<>();
}
