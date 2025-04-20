package de.bugz.api.entity

import de.bugz.api.dto.CreateBug
import de.bugz.api.dto.ViewBug
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "bugs")
data class Bug(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val title: String,
    val summary: String
) {
    fun toView() = ViewBug(id, title, summary)

    companion object {
        fun fromCreate(createBug: CreateBug): Bug = Bug(title = createBug.title, summary = createBug.summary)
    }
}