package tech.lab.scheduller.domain.models.valueobjects

data class Identifier(
    val value: String =
        java.util.UUID
            .randomUUID()
            .toString(),
)
