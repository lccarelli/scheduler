package tech.lab.scheduller

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SchedullerApplication

fun main(args: Array<String>) {
    runApplication<SchedullerApplication>(*args)
}
