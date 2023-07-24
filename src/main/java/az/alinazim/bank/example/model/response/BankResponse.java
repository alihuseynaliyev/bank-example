package az.alinazim.bank.example.model.response;

import az.alinazim.bank.example.dao.entity.CustomerEntity;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class BankResponse {
    private String name;
    private List<CustomerResponse> customers;
}
