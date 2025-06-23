package de.bugz.api.controller

import de.bugz.api.dto.CreateBug
import de.bugz.api.dto.ViewBug
import de.bugz.api.entity.Bug
import de.bugz.api.repo.BugRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/bugz")
class BugController(val bugRepository: BugRepository) {

    @GetMapping
    fun getAllBugs(): Iterable<ViewBug> = bugRepository.findAll().map { it.toView() }

    @PostMapping
    fun createBug(@RequestBody createBug: CreateBug): ViewBug {
        return bugRepository.save(
            Bug.fromCreate(createBug)
        ).toView()
    }
}