package com.example.todoapp.presentation.viewmodel;

/**
 * ViewModel for managing tasks in the UI.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0010J\u000e\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0010J\u000e\u0010 \u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0010R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/todoapp/presentation/viewmodel/TaskViewModel;", "Landroidx/lifecycle/ViewModel;", "getAllTasksUseCase", "Lcom/example/todoapp/domain/usecase/GetAllTasksUseCase;", "getCompletedTasksUseCase", "Lcom/example/todoapp/domain/usecase/GetCompletedTasksUseCase;", "addTaskUseCase", "Lcom/example/todoapp/domain/usecase/AddTaskUseCase;", "updateTaskUseCase", "Lcom/example/todoapp/domain/usecase/UpdateTaskUseCase;", "deleteTaskUseCase", "Lcom/example/todoapp/domain/usecase/DeleteTaskUseCase;", "(Lcom/example/todoapp/domain/usecase/GetAllTasksUseCase;Lcom/example/todoapp/domain/usecase/GetCompletedTasksUseCase;Lcom/example/todoapp/domain/usecase/AddTaskUseCase;Lcom/example/todoapp/domain/usecase/UpdateTaskUseCase;Lcom/example/todoapp/domain/usecase/DeleteTaskUseCase;)V", "_completedTasks", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/todoapp/domain/model/Task;", "_tasks", "completedTasks", "Lkotlinx/coroutines/flow/StateFlow;", "getCompletedTasks", "()Lkotlinx/coroutines/flow/StateFlow;", "tasks", "getTasks", "addTask", "", "title", "", "description", "deleteTask", "task", "toggleTaskCompletion", "updateTask", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class TaskViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.todoapp.domain.usecase.GetAllTasksUseCase getAllTasksUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.todoapp.domain.usecase.GetCompletedTasksUseCase getCompletedTasksUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.todoapp.domain.usecase.AddTaskUseCase addTaskUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.todoapp.domain.usecase.UpdateTaskUseCase updateTaskUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.todoapp.domain.usecase.DeleteTaskUseCase deleteTaskUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.todoapp.domain.model.Task>> _tasks = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.todoapp.domain.model.Task>> tasks = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.todoapp.domain.model.Task>> _completedTasks = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.todoapp.domain.model.Task>> completedTasks = null;
    
    @javax.inject.Inject()
    public TaskViewModel(@org.jetbrains.annotations.NotNull()
    com.example.todoapp.domain.usecase.GetAllTasksUseCase getAllTasksUseCase, @org.jetbrains.annotations.NotNull()
    com.example.todoapp.domain.usecase.GetCompletedTasksUseCase getCompletedTasksUseCase, @org.jetbrains.annotations.NotNull()
    com.example.todoapp.domain.usecase.AddTaskUseCase addTaskUseCase, @org.jetbrains.annotations.NotNull()
    com.example.todoapp.domain.usecase.UpdateTaskUseCase updateTaskUseCase, @org.jetbrains.annotations.NotNull()
    com.example.todoapp.domain.usecase.DeleteTaskUseCase deleteTaskUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.todoapp.domain.model.Task>> getTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.todoapp.domain.model.Task>> getCompletedTasks() {
        return null;
    }
    
    /**
     * Add a new task.
     */
    public final void addTask(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description) {
    }
    
    /**
     * Update an existing task.
     */
    public final void updateTask(@org.jetbrains.annotations.NotNull()
    com.example.todoapp.domain.model.Task task) {
    }
    
    /**
     * Delete a task.
     */
    public final void deleteTask(@org.jetbrains.annotations.NotNull()
    com.example.todoapp.domain.model.Task task) {
    }
    
    /**
     * Toggle the completion status of a task.
     */
    public final void toggleTaskCompletion(@org.jetbrains.annotations.NotNull()
    com.example.todoapp.domain.model.Task task) {
    }
}