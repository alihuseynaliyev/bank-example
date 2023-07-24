package az.alinazim.bank.example.model.response;

import az.alinazim.bank.example.dao.entity.AccountEntity;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class CustomerResponse {
    private String name;
    private Set<AccountEntity> accounts;
}
