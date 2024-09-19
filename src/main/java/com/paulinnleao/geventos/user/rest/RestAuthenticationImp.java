package com.paulinnleao.geventos.user.rest;

import com.paulinnleao.geventos.config.security.TokenService;
import com.paulinnleao.geventos.user.AuthenticationDTO;
import com.paulinnleao.geventos.user.LoginResponseDTO;
import com.paulinnleao.geventos.user.User;
import com.paulinnleao.geventos.user.UserRequestDTO;
import com.paulinnleao.geventos.user.repository.UserRepositry;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
public class RestAuthenticationImp implements RestAuthentication{

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepositry userRepositry;

    @Autowired
    private TokenService tokenService;

    @Override
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserRequestDTO userRequestDTO){
        if(this.userRepositry.findByEmail(userRequestDTO.email()) != null) return ResponseEntity.badRequest().build();

        String encryptedPassword = new BCryptPasswordEncoder().encode(userRequestDTO.password());
        User newUser = new User(userRequestDTO.name(), userRequestDTO.email(), encryptedPassword, userRequestDTO.role());

        this.userRepositry.save(newUser);

        return ResponseEntity.ok().build();
    }

    @Override
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody @Valid AuthenticationDTO authenticationDTO){
        var usernamePassword = new UsernamePasswordAuthenticationToken(authenticationDTO.email(), authenticationDTO.password());
        var auth = this.authenticationManager.authenticate(usernamePassword);

        var token = tokenService.generateToken((User) auth.getPrincipal());

        return ResponseEntity.ok(new LoginResponseDTO(token));
    }
}
