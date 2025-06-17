package com.example.todoapp.domain.usecase;

/**
 * Use case for updating an existing task.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086B\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/todoapp/domain/usecase/UpdateTaskUseCase;", "", "repository", "Lcom/example/todoapp/domain/repository/TaskRepository;", "(Lcom/example/todoapp/domain/repository/TaskRepository;)V", "invoke", "", "task", "Lcom/example/todoapp/domain/model/Task;", "(Lcom/example/todoapp/domain/model/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UpdateTaskUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.example.todoapp.domain.repository.TaskRepository repository = null;
    
    @javax.inject.Inject()
    public UpdateTaskUseCase(@org.jetbrains.annotations.NotNull()
    com.example.todoapp.domain.repository.TaskRepository repository) {
        super();
    }
    
    /**
     * Execute the use case.
     * @param task The task to update
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    com.example.todoapp.domain.model.Task task, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}