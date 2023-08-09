package com.example.imobilestylemain.domain.reservation.port

import com.example.imobileappapi.utils.OperationResult
import com.example.imobilestylemain.domain.reservation.entity.Location
import com.example.imobilestylemain.domain.reservation.entity.Reservation

interface IManageLocation {
    fun savelocation(client: Reservation): OperationResult<Location>
    fun findAllLocation():MutableList<Location>
}