package com.example.todoapp.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.todoapp.domain.model.Task
import java.util.Date

/**
 * Entity class for the Room database representing a task.
 */
@Entity(tableName = "tasks")
data class TaskEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val title: String,
    val description: String,
    val isDone: Boolean,
    val createdAt: Date
) {
    /**
     * Convert TaskEntity to domain Task model.
     */
    fun toTask(): Task = Task(
        id = id,
        title = title,
        description = description,
        isDone = isDone,
        createdAt = createdAt
    )

    companion object {
        /**
         * Convert domain Task model to TaskEntity.
         */
        fun fromTask(task: Task): TaskEntity = TaskEntity(
            id = task.id,
            title = task.title,
            description = task.description,
            isDone = task.isDone,
            createdAt = task.createdAt
        )
    }
} 