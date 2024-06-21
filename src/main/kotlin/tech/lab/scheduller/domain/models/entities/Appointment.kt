package tech.lab.scheduller.domain.models.entities

import tech.lab.scheduller.domain.models.valueobjects.Identifier
import java.time.LocalDateTime

data class Appointment(
    val id: Identifier,
    val date: LocalDateTime,
    val patient: Patient,
    val doctor: Doctor,
)
