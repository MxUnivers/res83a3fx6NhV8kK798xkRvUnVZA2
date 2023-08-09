package com.example.imobilestylemain.domain.reservation.entity
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class Availability(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    var dateTime: LocalDateTime,

    @ManyToOne
    var location: Location, // L'emplacement concerné

    // Autres attributs liés à la disponibilité
)
