package com.example.imobilestylemain.domain.reservation.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Location(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val name: String,
    var description: String,
    var capacity: Int = 0,

    // Autres attributs comme le tarif, etc.
)