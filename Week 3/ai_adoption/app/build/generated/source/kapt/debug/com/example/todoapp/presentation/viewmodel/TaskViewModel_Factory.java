package com.example.todoapp.presentation.viewmodel;

import com.example.todoapp.domain.usecase.AddTaskUseCase;
import com.example.todoapp.domain.usecase.DeleteTaskUseCase;
import com.example.todoapp.domain.usecase.GetAllTasksUseCase;
import com.example.todoapp.domain.usecase.GetCompletedTasksUseCase;
import com.example.todoapp.domain.usecase.UpdateTaskUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class TaskViewModel_Factory implements Factory<TaskViewModel> {
  private final Provider<GetAllTasksUseCase> getAllTasksUseCaseProvider;

  private final Provider<GetCompletedTasksUseCase> getCompletedTasksUseCaseProvider;

  private final Provider<AddTaskUseCase> addTaskUseCaseProvider;

  private final Provider<UpdateTaskUseCase> updateTaskUseCaseProvider;

  private final Provider<DeleteTaskUseCase> deleteTaskUseCaseProvider;

  public TaskViewModel_Factory(Provider<GetAllTasksUseCase> getAllTasksUseCaseProvider,
      Provider<GetCompletedTasksUseCase> getCompletedTasksUseCaseProvider,
      Provider<AddTaskUseCase> addTaskUseCaseProvider,
      Provider<UpdateTaskUseCase> updateTaskUseCaseProvider,
      Provider<DeleteTaskUseCase> deleteTaskUseCaseProvider) {
    this.getAllTasksUseCaseProvider = getAllTasksUseCaseProvider;
    this.getCompletedTasksUseCaseProvider = getCompletedTasksUseCaseProvider;
    this.addTaskUseCaseProvider = addTaskUseCaseProvider;
    this.updateTaskUseCaseProvider = updateTaskUseCaseProvider;
    this.deleteTaskUseCaseProvider = deleteTaskUseCaseProvider;
  }

  @Override
  public TaskViewModel get() {
    return newInstance(getAllTasksUseCaseProvider.get(), getCompletedTasksUseCaseProvider.get(), addTaskUseCaseProvider.get(), updateTaskUseCaseProvider.get(), deleteTaskUseCaseProvider.get());
  }

  public static TaskViewModel_Factory create(
      Provider<GetAllTasksUseCase> getAllTasksUseCaseProvider,
      Provider<GetCompletedTasksUseCase> getCompletedTasksUseCaseProvider,
      Provider<AddTaskUseCase> addTaskUseCaseProvider,
      Provider<UpdateTaskUseCase> updateTaskUseCaseProvider,
      Provider<DeleteTaskUseCase> deleteTaskUseCaseProvider) {
    return new TaskViewModel_Factory(getAllTasksUseCaseProvider, getCompletedTasksUseCaseProvider, addTaskUseCaseProvider, updateTaskUseCaseProvider, deleteTaskUseCaseProvider);
  }

  public static TaskViewModel newInstance(GetAllTasksUseCase getAllTasksUseCase,
      GetCompletedTasksUseCase getCompletedTasksUseCase, AddTaskUseCase addTaskUseCase,
      UpdateTaskUseCase updateTaskUseCase, DeleteTaskUseCase deleteTaskUseCase) {
    return new TaskViewModel(getAllTasksUseCase, getCompletedTasksUseCase, addTaskUseCase, updateTaskUseCase, deleteTaskUseCase);
  }
}
