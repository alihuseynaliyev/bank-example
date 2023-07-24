package az.alinazim.bank.example.model.request;

import lombok.Data;

import java.util.List;

@Data
public class BankRequest {
    private String name;
    private List<CustomerRequest> customers;
}


