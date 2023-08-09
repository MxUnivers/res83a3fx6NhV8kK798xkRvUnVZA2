package com.example.imobilestylemain.infrastructure.db.repository

import com.example.imobilestylemain.domain.reservation.entity.Location
import org.springframework.data.jpa.repository.JpaRepository

interface LocationRepository:JpaRepository<Location,Long> {
}