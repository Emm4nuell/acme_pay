package br.com.acme_pay;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customers {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String document;
}
