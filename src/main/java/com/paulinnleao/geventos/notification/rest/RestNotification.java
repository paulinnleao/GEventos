package com.paulinnleao.geventos.notification.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/notifications")
public class RestNotification {

    @GetMapping
    public ResponseEntity<List<?>> allNotification(){
        return null;
    }
}
