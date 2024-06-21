package tech.lab.scheduller

import org.springframework.boot.fromApplication
import org.springframework.boot.with

fun main(args: Array<String>) {
    fromApplication<SchedullerApplication>().with(TestcontainersConfiguration::class).run(*args)
}
