package com.example.todoapp.domain.usecase

import com.example.todoapp.domain.model.Task
import com.example.todoapp.domain.repository.TaskRepository
import javax.inject.Inject

/**
 * Use case for updating an existing task.
 */
class UpdateTaskUseCase @Inject constructor(
    private val repository: TaskRepository
) {
    /**
     * Execute the use case.
     * @param task The task to update
     */
    suspend operator fun invoke(task: Task) = repository.updateTask(task)
} 