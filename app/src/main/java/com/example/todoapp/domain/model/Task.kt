package com.example.todoapp.domain.model

import java.util.Date

/**
 * Represents a task in the TODO application.
 *
 * @property id Unique identifier for the task
 * @property title Title of the task
 * @property description Detailed description of the task
 * @property isDone Completion status of the task
 * @property createdAt Timestamp when the task was created
 */
data class Task(
    val id: Long = 0,
    val title: String,
    val description: String,
    val isDone: Boolean = false,
    val createdAt: Date = Date()
) 