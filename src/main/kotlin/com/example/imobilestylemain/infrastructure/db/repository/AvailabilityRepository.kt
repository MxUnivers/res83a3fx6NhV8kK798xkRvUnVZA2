package com.example.imobilestylemain.infrastructure.db.repository

import com.example.imobilestylemain.domain.reservation.entity.Availability
import org.springframework.data.jpa.repository.JpaRepository

interface AvailabilityRepository:JpaRepository<Availability,Long> {
}