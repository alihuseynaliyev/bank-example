package az.alinazim.bank.example.model.response;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class AccountResponse {
    private String accountNumber;
    private BigDecimal balance;
}
