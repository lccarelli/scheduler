package tech.lab.scheduller.domain.models.events

import com.fasterxml.jackson.annotation.JsonFormat
import tech.lab.scheduller.domain.models.entities.Appointment
import java.time.LocalDateTime

data class AppointmentEvent(
    val calendarId: String,
    val appointmentId: String,
    val doctorId: String,
    val patientId: String,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    val appointmentDateTime: LocalDateTime,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    val createdAt: LocalDateTime = LocalDateTime.now(),
) {
    companion object {
        fun from(
            appointment: Appointment,
            calendarId: String,
        ): AppointmentEvent =
            AppointmentEvent(
                calendarId = calendarId,
                appointmentId = appointment.id.toString(),
                doctorId = appointment.doctor.id.toString(),
                patientId = appointment.patient.id.toString(),
                appointmentDateTime = appointment.date,
            )
    }
}
