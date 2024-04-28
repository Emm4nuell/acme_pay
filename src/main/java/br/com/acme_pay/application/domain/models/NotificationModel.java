package br.com.acme_pay.application.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationModel {
    private Long id;
    private LocalDateTime data_transaction;
    private Integer source_account;
    private Integer destination_account;
    private BigDecimal amount;
}
