package com.example.imobilestylemain.domain.reservation.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import java.time.LocalDateTime


@Entity
class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0;

    lateinit var startTime: LocalDateTime;
    lateinit var endTime: LocalDateTime;

    /*@ManyToOne
    val user: User, // L'utilisateur associé à la réservation

    @ManyToOne
    val location: Location,*/
}