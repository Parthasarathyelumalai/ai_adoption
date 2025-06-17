package com.example.todoapp.domain.usecase

import com.example.todoapp.domain.model.Task
import com.example.todoapp.domain.repository.TaskRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Use case for retrieving all tasks.
 */
class GetAllTasksUseCase @Inject constructor(
    private val repository: TaskRepository
) {
    /**
     * Execute the use case.
     * @return Flow of list of tasks
     */
    operator fun invoke(): Flow<List<Task>> = repository.getAllTasks()
} 