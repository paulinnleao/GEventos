package com.paulinnleao.geventos.event;

import com.paulinnleao.geventos.user.User;

import java.util.Date;
import java.util.UUID;

public record EventReciveDTO(
        UUID id,
        String title,
        String description,
        Date startDate,
        Date endDate,
        String location,
        Integer avaliableSlots,
        User user) {
}
