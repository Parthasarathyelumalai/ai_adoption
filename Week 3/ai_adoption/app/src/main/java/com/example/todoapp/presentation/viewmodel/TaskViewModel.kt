package com.example.todoapp.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todoapp.domain.model.Task
import com.example.todoapp.domain.usecase.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel for managing tasks in the UI.
 */
@HiltViewModel
class TaskViewModel @Inject constructor(
    private val getAllTasksUseCase: GetAllTasksUseCase,
    private val getCompletedTasksUseCase: GetCompletedTasksUseCase,
    private val addTaskUseCase: AddTaskUseCase,
    private val updateTaskUseCase: UpdateTaskUseCase,
    private val deleteTaskUseCase: DeleteTaskUseCase
) : ViewModel() {

    private val _tasks = MutableStateFlow<List<Task>>(emptyList())
    val tasks: StateFlow<List<Task>> = _tasks.asStateFlow()

    private val _completedTasks = MutableStateFlow<List<Task>>(emptyList())
    val completedTasks: StateFlow<List<Task>> = _completedTasks.asStateFlow()

    init {
        viewModelScope.launch {
            getAllTasksUseCase().collect { taskList ->
                _tasks.value = taskList
            }
        }

        viewModelScope.launch {
            getCompletedTasksUseCase().collect { taskList ->
                _completedTasks.value = taskList
            }
        }
    }

    /**
     * Add a new task.
     */
    fun addTask(title: String, description: String) {
        viewModelScope.launch {
            val task = Task(
                title = title,
                description = description
            )
            addTaskUseCase(task)
        }
    }

    /**
     * Update an existing task.
     */
    fun updateTask(task: Task) {
        viewModelScope.launch {
            updateTaskUseCase(task)
        }
    }

    /**
     * Delete a task.
     */
    fun deleteTask(task: Task) {
        viewModelScope.launch {
            deleteTaskUseCase(task)
        }
    }

    /**
     * Toggle the completion status of a task.
     */
    fun toggleTaskCompletion(task: Task) {
        viewModelScope.launch {
            updateTaskUseCase(task.copy(isDone = !task.isDone))
        }
    }
} 