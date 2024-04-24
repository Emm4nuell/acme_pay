package br.com.acme_pay;

import java.math.BigDecimal;

public class Cards {
    private Long id;
    private String flag;
    private BigDecimal card_limit;
    private Accounts card_account;

    public Cards() {
    }

    public Cards(Long id, String flag, BigDecimal card_limit, Accounts card_account) {
        this.id = id;
        this.flag = flag;
        this.card_limit = card_limit;
        this.card_account = card_account;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public BigDecimal getCard_limit() {
        return card_limit;
    }

    public void setCard_limit(BigDecimal card_limit) {
        this.card_limit = card_limit;
    }

    public Accounts getCard_account() {
        return card_account;
    }

    public void setCard_account(Accounts card_account) {
        this.card_account = card_account;
    }
}
