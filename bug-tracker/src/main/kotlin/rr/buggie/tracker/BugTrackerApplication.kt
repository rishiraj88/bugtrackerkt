package rr.buggie.tracker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BugTrackerApplication

fun main(args: Array<String>) {
	runApplication<BugTrackerApplication>(*args)
}
