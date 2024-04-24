package br.com.acme_pay;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

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

    public Accounts() {
    }

    public Accounts(Long id, Integer number, Integer agency, BigDecimal balance, Customers customer, List<Cards> cards, Customers customers, LocalDateTime created_at, LocalDateTime update_at, boolean closed) {
        this.id = id;
        this.number = number;
        this.agency = agency;
        this.balance = balance;
        this.customer = customer;
        this.cards = cards;
        this.customers = customers;
        this.created_at = created_at;
        this.update_at = update_at;
        this.closed = closed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getAgency() {
        return agency;
    }

    public void setAgency(Integer agency) {
        this.agency = agency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }

    public List<Cards> getCards() {
        return cards;
    }

    public void setCards(List<Cards> cards) {
        this.cards = cards;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(LocalDateTime update_at) {
        this.update_at = update_at;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }
}
