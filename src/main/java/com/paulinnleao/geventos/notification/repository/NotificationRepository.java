package com.paulinnleao.geventos.notification.repository;

import com.paulinnleao.geventos.notification.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NotificationRepository extends JpaRepository<Notification, UUID> {
}
