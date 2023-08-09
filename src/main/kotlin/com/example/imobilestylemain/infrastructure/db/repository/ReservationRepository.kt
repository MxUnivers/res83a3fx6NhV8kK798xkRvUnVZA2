package com.example.imobilestylemain.infrastructure.db.repository

import com.example.imobilestylemain.domain.reservation.entity.Reservation
import org.springframework.data.jpa.repository.JpaRepository

interface ReservationRepository:JpaRepository<Reservation,Long> {
}