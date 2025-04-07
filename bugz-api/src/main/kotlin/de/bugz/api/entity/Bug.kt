package de.bugz.api.entity

import de.bugz.api.dto.ViewBug
import jakarta.persistence.*

@Entity
@Table(name = "bugs")
data class Bug(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val title: String,
    val summary: String
) {fun toView() = ViewBug(id,title,summary)}