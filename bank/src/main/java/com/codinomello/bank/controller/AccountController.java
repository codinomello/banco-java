package com.codinomello.bank.controller;

import com.codinomello.bank.model.Account;
import com.codinomello.bank.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    @PostMapping
    public Account create(@RequestParam String ownerName) {
        return service.createAccount(ownerName);
    }

    @GetMapping
    public List<Account> getAll() {
        return service.findAll();
    }
}