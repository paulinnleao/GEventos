package com.paulinnleao.geventos.notification;

import com.paulinnleao.geventos.user.UserRequestDTO;

import java.util.UUID;

public record NotificationRequestDTO(UUID idNotification, UserRequestDTO user, String message) {
}
