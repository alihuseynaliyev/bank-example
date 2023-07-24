package az.alinazim.bank.example.service;

import az.alinazim.bank.example.dao.entity.AccountEntity;
import az.alinazim.bank.example.dao.entity.BankEntity;
import az.alinazim.bank.example.dao.entity.CustomerEntity;
import az.alinazim.bank.example.dao.repository.BankRepository;
import az.alinazim.bank.example.model.request.BankRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BankService {
    private final BankRepository bankRepository;

    public List<BankEntity> getAllBanksWithCustomersAndAccounts() {
        return bankRepository.findAll();
    }

    public void saveBank(BankRequest bankRequest) {
        BankEntity bank = new BankEntity();
        bank.setName(bankRequest.getName());

        Set<CustomerEntity> customers = bankRequest.getCustomers().stream()
                .map(customerRequest -> {
                    CustomerEntity customer = new CustomerEntity();
                    customer.setName(customerRequest.getName());
                    Set<AccountEntity> accounts = customerRequest.getAccounts().stream()
                            .map(accountRequest -> {
                                AccountEntity account = new AccountEntity();
                                account.setAccountNumber(accountRequest.getAccountNumber());
                                account.setBalance(accountRequest.getBalance());
                                return account;
                            })
                            .collect(Collectors.toSet());
                    customer.setAccounts(accounts);
                    return customer;
                })
                .collect(Collectors.toSet());

        bank.setCustomers(customers);
        bankRepository.save(bank);
    }
}

