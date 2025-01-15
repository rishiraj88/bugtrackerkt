package rr.buggie.tracker

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<BugTrackerApplication>().with(TestcontainersConfiguration::class).run(*args)
}
