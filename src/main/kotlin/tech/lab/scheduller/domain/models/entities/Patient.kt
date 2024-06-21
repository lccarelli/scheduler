package tech.lab.scheduller.domain.models.entities

import tech.lab.scheduller.domain.models.valueobjects.Document
import tech.lab.scheduller.domain.models.valueobjects.Identifier
import tech.lab.scheduller.domain.models.valueobjects.MedicalRecord
import tech.lab.scheduller.domain.models.valueobjects.Name

data class Patient(
    val id: Identifier,
    val name: Name,
    val document: Document,
    val medicalRecord: MedicalRecord,
    val appointments: MutableList<Appointment> = mutableListOf(),
)
