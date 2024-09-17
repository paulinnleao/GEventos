package com.paulinnleao.geventos.event.rest;

import jakarta.websocket.server.PathParam;
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
    public ResponseEntity<?> updateEventById(@PathVariable(name = "idEvent")Integer idEvent){
        return null;
    }

    @DeleteMapping(name = "{idEvent}")
    public ResponseEntity<?> deleteEventById(@PathVariable(name = "idEvent") Integer idEvent){
        return ResponseEntity.noContent().build();
    }


    // Registers
    @PostMapping(name = "/{idEvent}/enroll")
    public ResponseEntity<?> registerAtTheEvent(@PathVariable(value = "idEvent") Integer idEvent){
        return null;
    }

    @DeleteMapping(name = "/{idEvent}/enroll")
    public ResponseEntity<?> deleteRegisterById(@PathVariable(name = "idEvent") Integer idEvent){
        return ResponseEntity.noContent().build();
    }

}
