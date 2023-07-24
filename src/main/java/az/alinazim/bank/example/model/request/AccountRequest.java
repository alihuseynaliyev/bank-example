package az.alinazim.bank.example.model.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AccountRequest {
    private String accountNumber;
    private BigDecimal balance;
}