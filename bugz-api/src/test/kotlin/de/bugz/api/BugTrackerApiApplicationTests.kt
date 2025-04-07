package de.bugz.api

import de.bugz.api.controller.BugzController
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import

@Import(TestcontainersConfiguration::class)
@SpringBootTest
class BugTrackerApiApplicationTests {
	val bugzController: BugzController = BugzController()

	@Test
	fun should_return_all_bugs() =
	bugzController.getAllBugs()

	@Test
	fun contextLoads() {
	}

}
