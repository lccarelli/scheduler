package tech.lab.scheduller.infraestructure.aws

import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider
import software.amazon.awssdk.regions.Region
import software.amazon.awssdk.services.sns.SnsClient

class SnsClientProvider {
    companion object {
        fun createSnsClient(): SnsClient =
            SnsClient
                .builder()
                .region(Region.US_WEST_2)
                .credentialsProvider(ProfileCredentialsProvider.create())
                .build()
    }
}
