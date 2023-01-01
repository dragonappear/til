package me.dragonappear.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.dragonappear.domain.Account;
import me.dragonappear.repository.AccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Slf4j
@RequiredArgsConstructor
@Service @Transactional
public class AccountService {

    private final AccountRepository accountRepository;

    public Long signUp(String name, String email) {
        return accountRepository.save(new Account(name,email)).getId();
    }
}
