package de.bugz.api

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<BugTrackerApiApplication>().with(TestcontainersConfiguration::class).run(*args)
}
