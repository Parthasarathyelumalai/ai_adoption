package com.example.todoapp.data.repository

import com.example.todoapp.data.local.dao.TaskDao
import com.example.todoapp.data.local.entity.TaskEntity
import com.example.todoapp.domain.model.Task
import com.example.todoapp.domain.repository.TaskRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

/**
 * Implementation of the TaskRepository interface.
 */
class TaskRepositoryImpl @Inject constructor(
    private val taskDao: TaskDao
) : TaskRepository {

    override fun getAllTasks(): Flow<List<Task>> =
        taskDao.getAllTasks().map { entities ->
            entities.map { it.toTask() }
        }

    override fun getCompletedTasks(): Flow<List<Task>> =
        taskDao.getCompletedTasks().map { entities ->
            entities.map { it.toTask() }
        }

    override suspend fun getTaskById(id: Long): Task? =
        taskDao.getTaskById(id)?.toTask()

    override suspend fun insertTask(task: Task): Long =
        taskDao.insertTask(TaskEntity.fromTask(task))

    override suspend fun updateTask(task: Task) =
        taskDao.updateTask(TaskEntity.fromTask(task))

    override suspend fun deleteTask(task: Task) =
        taskDao.deleteTask(TaskEntity.fromTask(task))
} 