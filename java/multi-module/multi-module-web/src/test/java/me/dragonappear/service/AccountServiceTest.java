package me.dragonappear.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AccountServiceTest {

    @Autowired AccountService accountService;

    @DisplayName("signUp 테스트 - 성공")
    @Test
    void sign_up_success() throws Exception {
        Long id = accountService.signUp("test","test@gmail.com");
        Assertions.assertThat(id).isEqualTo(1L);
    }

}