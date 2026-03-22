package com.codinomello.bank.service;

import com.codinomello.bank.model.Account;
import com.codinomello.bank.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class AccountService {

    private final AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public Account createAccount(String ownerName) {
        Account account = new Account();
        account.setOwnerName(ownerName);
        account.setBalance(BigDecimal.ZERO);

        return repository.save(account);
    }

    public List<Account> findAll() {
        return repository.findAll();
    }
}