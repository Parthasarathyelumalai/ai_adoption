package com.example.todoapp.domain.usecase;

/**
 * Use case for retrieving completed tasks.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/todoapp/domain/usecase/GetCompletedTasksUseCase;", "", "repository", "Lcom/example/todoapp/domain/repository/TaskRepository;", "(Lcom/example/todoapp/domain/repository/TaskRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/todoapp/domain/model/Task;", "app_debug"})
public final class GetCompletedTasksUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.example.todoapp.domain.repository.TaskRepository repository = null;
    
    @javax.inject.Inject()
    public GetCompletedTasksUseCase(@org.jetbrains.annotations.NotNull()
    com.example.todoapp.domain.repository.TaskRepository repository) {
        super();
    }
    
    /**
     * Execute the use case.
     * @return Flow of list of completed tasks
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.todoapp.domain.model.Task>> invoke() {
        return null;
    }
}