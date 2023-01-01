package me.dragonappear.controller;

import lombok.RequiredArgsConstructor;
import me.dragonappear.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.UUID;

@RequiredArgsConstructor
@RequestMapping("/")
@RestController
public class AccountController {

    private final AccountService accountService;

    @GetMapping
    public ResponseEntity signUp() {
        Long id = accountService.signUp(UUID.randomUUID().toString(), UUID.randomUUID().toString());
        return ResponseEntity.ok().body(Map.of("id", id));
    }
}
