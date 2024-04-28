package br.com.acme_pay.application.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerModel {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String document;
    private LocalDateTime created_at;
    private LocalDateTime update_at;
    private List<String> transactions = new ArrayList<>();
    private List<CustomerModel> listCustomers = new ArrayList<>();
}
