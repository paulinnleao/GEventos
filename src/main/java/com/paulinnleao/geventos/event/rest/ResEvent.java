package com.paulinnleao.geventos.event.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class ResEvent {
    @GetMapping
    public ResponseEntity<List<?>> getAllEvents(){
        return null;
    }

    @GetMapping(name = "/{idEvent}")
    public ResponseEntity<?> getEventById(@PathVariable(name = "idEvent") Integer idEvent){
        return null;
    }

    @PostMapping
    public ResponseEntity<?> createEvent(){
        return null;
    }

    @PutMapping(name = "/{idEvent}")
    public ResponseEntity<?> updateEventById(@PathVariable(name = "idEvent")Integer idEvenet){
        return null;
    }

    @DeleteMapping(name = "{idEvent}")
    public ResponseEntity<?> deleteEventById(@PathVariable(name = "idEvent") Integer idEvenet){
        return ResponseEntity.noContent().build();
    }
}
