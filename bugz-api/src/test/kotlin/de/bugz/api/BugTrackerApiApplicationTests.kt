package de.bugz.api

import de.bugz.api.controller.BugController
import de.bugz.api.repo.BugRepository
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import

@Import(TestcontainersConfiguration::class)
@SpringBootTest
class BugTrackerApiApplicationTests() {

    @InjectMocks
    lateinit var bugzController: BugController

    @Mock
    lateinit var bugRepository: BugRepository

    @Test
    fun should_return_all_bugs() =
        bugzController.getAllBugs()

    @Test
    fun contextLoads() {
    }

}
