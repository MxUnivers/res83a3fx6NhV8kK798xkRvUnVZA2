package com.example.imobilestylemain.domain.reservation.port

import com.example.imobileappapi.utils.OperationResult
import com.example.imobilestylemain.domain.reservation.entity.Reservation

interface IManageReservation {
    fun saveReservation(client: Reservation): OperationResult<Reservation>
    fun findAllReservation():MutableList<Reservation>
}