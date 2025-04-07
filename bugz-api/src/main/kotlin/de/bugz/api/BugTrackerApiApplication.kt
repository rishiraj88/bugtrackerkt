package de.bugz.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BugTrackerApiApplication

fun main(args: Array<String>) {
	runApplication<BugTrackerApiApplication>(*args)
}
