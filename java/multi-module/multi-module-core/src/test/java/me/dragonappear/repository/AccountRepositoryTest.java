package me.dragonappear.repository;

import me.dragonappear.domain.Account;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class AccountRepositoryTest {

    @Autowired
    private AccountRepository accountRepository;

    @DisplayName("Account 등록 - 성공")
    @Test
    void save_success() throws Exception {
        Account account = new Account("test", "test@test.com");
        Long id = accountRepository.save(account).getId();
        Optional<Account> optionalAccount = accountRepository.findById(id);

        Assertions.assertThat(optionalAccount).isPresent();
        Assertions.assertThat(optionalAccount.get()).isEqualTo(account);


    }

}