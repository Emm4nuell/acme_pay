package br.com.acme_pay;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Accounts {
    private Long id;
    private Integer number;
    private Integer agency;
    private BigDecimal balance;
    private Customers customer;
    private List<Cards> cards;
    private LocalDateTime created_at;
    private LocalDateTime update_at;
    private boolean closed;

    public List<String> transactions = new ArrayList<>();

    public void create(Accounts accounts){
        this.setId(accounts.id);
        this.setNumber(accounts.number);
        this.setAgency(accounts.agency);
        this.setBalance(accounts.balance);
        this.setCustomer(accounts.customer);
        this.setCards(accounts.cards);
        this.setCreated_at(accounts.created_at);
        this.setUpdate_at(accounts.update_at);
        this.setClosed(accounts.closed);
        this.transactions.add("account created successfully" + LocalDateTime.now());
    }

    public void deposit(BigDecimal ammount){
        this.balance = this.balance.add(ammount);
    }

    public void withdraw(BigDecimal ammount){
        this.balance.subtract(ammount);
    }

    public void transfer(Accounts accounts, BigDecimal ammount){
        if (checkAmmount(ammount)){
            throw new NullPointerException("error transfer");
        }
        deposit(ammount);
        accounts.balance.subtract(ammount);
    }

    public boolean checkAmmount(BigDecimal ammount){
        return this.balance.compareTo(ammount) >= 0;
    }
}
