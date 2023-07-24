package az.alinazim.bank.example.controller;

import az.alinazim.bank.example.dao.entity.BankEntity;
import az.alinazim.bank.example.model.request.BankRequest;
import az.alinazim.bank.example.model.response.BankResponse;
import az.alinazim.bank.example.service.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("banks")
@RequiredArgsConstructor
public class BankController {

    private final BankService bankService;

    @GetMapping
    public List<BankEntity> getAllBanksWithCustomersAndAccounts() {
        return bankService.getAllBanksWithCustomersAndAccounts();
    }

    @PostMapping
    public void createBank(@RequestBody BankRequest bankRequest) {
        bankService.saveBank(bankRequest);
    }
}
