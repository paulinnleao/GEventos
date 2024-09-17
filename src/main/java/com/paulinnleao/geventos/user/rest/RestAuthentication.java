package com.paulinnleao.geventos.user.rest;

import com.paulinnleao.geventos.user.UserReciveDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class RestAuthentication {

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserReciveDTO userReciveDTO){
        return ResponseEntity.ok().build();
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserReciveDTO userReciveDTO){
        return ResponseEntity.ok().build();
    }
}
