package br.com.acme_pay;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Notifications {
    private Long id;
    private LocalDateTime data_transaction;
    private Integer source_account;
    private Integer destination_account;
    private BigDecimal amount;

    public Notifications() {
    }

    public Notifications(Long id, LocalDateTime data_transaction, Integer source_account, Integer destination_account, BigDecimal amount) {
        this.id = id;
        this.data_transaction = data_transaction;
        this.source_account = source_account;
        this.destination_account = destination_account;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getData_transaction() {
        return data_transaction;
    }

    public void setData_transaction(LocalDateTime data_transaction) {
        this.data_transaction = data_transaction;
    }

    public Integer getSource_account() {
        return source_account;
    }

    public void setSource_account(Integer source_account) {
        this.source_account = source_account;
    }

    public Integer getDestination_account() {
        return destination_account;
    }

    public void setDestination_account(Integer destination_account) {
        this.destination_account = destination_account;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
