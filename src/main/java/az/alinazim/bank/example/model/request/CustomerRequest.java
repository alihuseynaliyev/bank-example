package az.alinazim.bank.example.model.request;

import lombok.Data;

import java.util.List;

@Data
public class CustomerRequest {
    private String name;
    private List<AccountRequest> accounts;
}