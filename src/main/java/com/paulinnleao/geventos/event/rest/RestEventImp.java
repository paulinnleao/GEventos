package com.paulinnleao.geventos.event.rest;

import org.springframework.http.ResponseEntity;

import java.util.List;

public class RestEventImp implements RestEvent{

    @Override
    public ResponseEntity<List<?>> getAllEvents(){
        return null;
    }

    @Override
    public ResponseEntity<?> getEventById(Integer idEvent){
        return null;
    }

    @Override
    public ResponseEntity<?> createEvent(){
        return null;
    }

    @Override
    public ResponseEntity<?> updateEventById(Integer idEvent){
        return null;
    }

    @Override
    public ResponseEntity<?> deleteEventById(Integer idEvent){
        return ResponseEntity.noContent().build();
    }


    // Registers
    @Override
    public ResponseEntity<?> registerAtTheEvent(Integer idEvent){
        return null;
    }

    @Override
    public ResponseEntity<?> deleteRegisterById(Integer idEvent){
        return ResponseEntity.noContent().build();
    }
}
