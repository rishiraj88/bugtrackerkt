package de.bugz.api.repo

import de.bugz.api.entity.Bug
import org.springframework.data.repository.CrudRepository

interface BugRepository :CrudRepository<Bug,Long>