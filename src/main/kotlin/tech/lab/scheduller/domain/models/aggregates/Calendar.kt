package tech.lab.scheduller.domain.models.entities

import com.fasterxml.jackson.databind.ObjectMapper
import software.amazon.awssdk.services.sns.SnsClient
import software.amazon.awssdk.services.sns.model.PublishRequest
import tech.lab.scheduller.domain.models.events.AppointmentEvent
import tech.lab.scheduller.domain.models.valueobjects.Identifier
import tech.lab.scheduller.infraestructure.aws.SnsClientProvider

class Calendar(
    private val id: Identifier = Identifier(),
    private val appointments: MutableList<Appointment> = mutableListOf(),
    private val snsClient: SnsClient = SnsClientProvider.createSnsClient(),
    private val topicArn: String = "arn:aws:sns:region:account-id:topic-name",
) {
    private val objectMapper = ObjectMapper().findAndRegisterModules()

    fun addAppointment(appointment: Appointment) {
        appointments.add(appointment)
        val event = AppointmentEvent.from(appointment, id.toString())
        publishEvent(event)
    }

    private fun publishEvent(event: AppointmentEvent) {
        val message = objectMapper.writeValueAsString(event)
        val publishRequest =
            PublishRequest
                .builder()
                .topicArn(topicArn)
                .message(message)
                .build()
        snsClient.publish(publishRequest)
    }
}
