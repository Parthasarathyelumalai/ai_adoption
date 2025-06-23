package com.example.todoapp.domain.usecase

import com.example.todoapp.domain.model.Task
import com.example.todoapp.domain.repository.TaskRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Use case for retrieving completed tasks.
 */
class GetCompletedTasksUseCase @Inject constructor(
    private val repository: TaskRepository
) {
    /**
     * Execute the use case.
     * @return Flow of list of completed tasks
     */
    operator fun invoke(): Flow<List<Task>> = repository.getCompletedTasks()
} 