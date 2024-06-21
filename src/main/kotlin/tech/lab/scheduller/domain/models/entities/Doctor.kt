package tech.lab.scheduller.domain.models.entities

import tech.lab.scheduller.domain.models.valueobjects.Document
import tech.lab.scheduller.domain.models.valueobjects.Identifier
import tech.lab.scheduller.domain.models.valueobjects.Name
import tech.lab.scheduller.domain.models.valueobjects.Registration
import tech.lab.scheduller.domain.models.valueobjects.Specialty

data class Doctor(
    val id: Identifier,
    val name: Name,
    val specialty: Specialty,
    val registration: Registration,
    val document: Document,
)
