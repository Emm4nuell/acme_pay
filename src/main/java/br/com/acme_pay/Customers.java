package br.com.acme_pay;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customers {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String document;
    private LocalDateTime created_at;
    private LocalDateTime update_at;
    private List<String> transactions = new ArrayList<>();

    private List<Customers> listCustomers = new ArrayList<>();

    public void create(Customers customers){
        if (!checkeCustomers(customers.document)){
            throw new NullPointerException("error create");
        }
        this.setId(customers.id);
        this.setName(customers.name);
        this.setEmail(customers.email);
        this.setPhone(customers.phone);
        this.setDocument(customers.document);
        this.setCreated_at(customers.created_at);
        this.setUpdate_at(customers.update_at);
        transactions.add("create customers " + LocalDateTime.now());
        listCustomers.add(this);
    }

    public List<Customers> list(){
        return listCustomers;
    }

    public void delete(Long id){
        for (Customers x : listCustomers){
            if (x.id == id){
                listCustomers.set(id.intValue(), new Customers());
            }
        }
        throw new NullPointerException("error delete");
    }

    public void update(String document, Customers customers){
        if (!checkeCustomers(document)){
            throw new NullPointerException("error and update");
        }
    }

    public Customers getByCustomerCPF(String document){
        for (Customers x : listCustomers){
            if (x.document.contains(document)){
                return x;
            }
        }
        throw new NullPointerException("error nullpointer");
    }

    public boolean checkeCustomers(String document){
        for (Customers c : listCustomers){
            if (c.document.contains(document)){
                return true;
            }
        }
        return false;
    }





    //create-------
    //list----------
    //delete -----
    //update
    //getByCustomerCPF------
}
