package com.example.todoapp.domain.repository

import com.example.todoapp.domain.model.Task
import kotlinx.coroutines.flow.Flow

/**
 * Repository interface for managing tasks.
 * This interface defines the contract for task-related operations.
 */
interface TaskRepository {
    /**
     * Get all tasks as a Flow.
     * @return Flow of list of tasks
     */
    fun getAllTasks(): Flow<List<Task>>

    /**
     * Get all completed tasks as a Flow.
     * @return Flow of list of completed tasks
     */
    fun getCompletedTasks(): Flow<List<Task>>

    /**
     * Get a task by its ID.
     * @param id The ID of the task to retrieve
     * @return The task if found, null otherwise
     */
    suspend fun getTaskById(id: Long): Task?

    /**
     * Insert a new task.
     * @param task The task to insert
     * @return The ID of the inserted task
     */
    suspend fun insertTask(task: Task): Long

    /**
     * Update an existing task.
     * @param task The task to update
     */
    suspend fun updateTask(task: Task)

    /**
     * Delete a task.
     * @param task The task to delete
     */
    suspend fun deleteTask(task: Task)
} 