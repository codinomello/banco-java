package com.codinomello.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codinomello.bank.model.Account;

import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID> {
}