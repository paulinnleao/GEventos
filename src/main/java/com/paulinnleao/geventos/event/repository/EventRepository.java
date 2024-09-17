package com.paulinnleao.geventos.event.repository;

import com.paulinnleao.geventos.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {
}
