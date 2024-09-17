package com.paulinnleao.geventos.enrollment.repository;

import com.paulinnleao.geventos.enrollment.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EnrollmentRepository extends JpaRepository<Enrollment, UUID> {
}
