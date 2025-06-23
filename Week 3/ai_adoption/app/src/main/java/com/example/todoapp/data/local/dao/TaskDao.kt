package com.example.todoapp.data.local.dao

import androidx.room.*
import com.example.todoapp.data.local.entity.TaskEntity
import kotlinx.coroutines.flow.Flow

/**
 * Data Access Object for the tasks table.
 */
@Dao
interface TaskDao {
    /**
     * Get all tasks as a Flow.
     */
    @Query("SELECT * FROM tasks ORDER BY createdAt DESC")
    fun getAllTasks(): Flow<List<TaskEntity>>

    /**
     * Get all completed tasks as a Flow.
     */
    @Query("SELECT * FROM tasks WHERE isDone = 1 ORDER BY createdAt DESC")
    fun getCompletedTasks(): Flow<List<TaskEntity>>

    /**
     * Get a task by its ID.
     */
    @Query("SELECT * FROM tasks WHERE id = :id")
    suspend fun getTaskById(id: Long): TaskEntity?

    /**
     * Insert a new task.
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTask(task: TaskEntity): Long

    /**
     * Update an existing task.
     */
    @Update
    suspend fun updateTask(task: TaskEntity)

    /**
     * Delete a task.
     */
    @Delete
    suspend fun deleteTask(task: TaskEntity)
} 