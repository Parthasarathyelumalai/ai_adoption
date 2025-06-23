package com.example.todoapp.domain.usecase

import com.example.todoapp.domain.model.Task
import com.example.todoapp.domain.repository.TaskRepository
import javax.inject.Inject

/**
 * Use case for deleting a task.
 */
class DeleteTaskUseCase @Inject constructor(
    private val repository: TaskRepository
) {
    /**
     * Execute the use case.
     * @param task The task to delete
     */
    suspend operator fun invoke(task: Task) = repository.deleteTask(task)
} 