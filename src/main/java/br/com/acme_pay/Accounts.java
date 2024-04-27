package br.com.acme_pay;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Accounts {
    private Long id;
    private Integer number;
    private Integer agency;
    private BigDecimal balance;
    private Customers customer;
    private List<Cards> cards;
    private Customers customers;
    private LocalDateTime created_at;
    private LocalDateTime update_at;
    private boolean closed;
}
