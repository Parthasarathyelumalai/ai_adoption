package com.example.todoapp.domain.usecase

import com.example.todoapp.domain.model.Task
import com.example.todoapp.domain.repository.TaskRepository
import javax.inject.Inject

/**
 * Use case for adding a new task.
 */
class AddTaskUseCase @Inject constructor(
    private val repository: TaskRepository
) {
    /**
     * Execute the use case.
     * @param task The task to add
     * @return The ID of the added task
     */
    suspend operator fun invoke(task: Task): Long = repository.insertTask(task)
} 