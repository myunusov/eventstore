package org.maxur.eventstore

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class EventstoreApplication

fun main(args: Array<String>) {
    SpringApplication.run(EventstoreApplication::class.java, *args)
}
