package com.paulinnleao.geventos.notification;

import com.paulinnleao.geventos.user.UserReciveDTO;

import java.util.UUID;

public record NotificationReciveDTO(UUID idNotification, UserReciveDTO user, String message) {
}
