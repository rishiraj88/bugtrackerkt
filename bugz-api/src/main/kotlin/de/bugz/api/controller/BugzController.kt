package de.bugz.api.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

data class ViewBug(val name:String="starter for Bugz")

@RestController
@RequestMapping("/api/v1/bugz")
class BugzController {
    @GetMapping
    fun getAllBugs():Iterable<ViewBug> = listOf(ViewBug())
}