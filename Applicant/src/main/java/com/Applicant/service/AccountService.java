package com.Applicant.service;

import com.Applicant.entity.Account;
import com.Applicant.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class AccountService {
    @Autowired
    AccountRepository accountRepository;

    // READ_COMMITTED: See only committed data
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public double checkBalance_ReadCommitted(Long accountId) {
        Optional<Account> acc = accountRepository.findById(accountId);
        return acc.map(Account::getBalance).orElse(0.0);
    }

    // REPEATABLE_READ: Repeatable reads within the same transaction
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public double checkBalance_RepeatableRead(Long accountId) {
        Optional<Account> acc = accountRepository.findById(accountId);
        sleep(10000); // Simulate delay
        Optional<Account> accAgain = accountRepository.findById(accountId);
        return accAgain.map(Account::getBalance).orElse(0.0);
    }

    // Update balance in a different transaction
    @Transactional
    public void updateBalance(Long accountId, double newBalance) {
        Optional<Account> accOpt = accountRepository.findById(accountId);
        accOpt.ifPresent(acc -> {
            acc.setBalance(newBalance);
            accountRepository.save(acc);
        });
    }

    private void sleep(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException ignored) {}
    }
}
