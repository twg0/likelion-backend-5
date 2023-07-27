package com.example.auth;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthController {
    @GetMapping("role-user")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void roleUser() {}

    @GetMapping("role-admin")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void roleAdmin() {}

    @GetMapping("priv-read")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void privilegeRead() {}

    @GetMapping("priv-write")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void privilegeWrite() {}
}
