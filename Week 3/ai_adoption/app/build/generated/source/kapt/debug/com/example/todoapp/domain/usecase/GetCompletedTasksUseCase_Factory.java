package com.example.todoapp.domain.usecase;

import com.example.todoapp.domain.repository.TaskRepository;
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
public final class GetCompletedTasksUseCase_Factory implements Factory<GetCompletedTasksUseCase> {
  private final Provider<TaskRepository> repositoryProvider;

  public GetCompletedTasksUseCase_Factory(Provider<TaskRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetCompletedTasksUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetCompletedTasksUseCase_Factory create(
      Provider<TaskRepository> repositoryProvider) {
    return new GetCompletedTasksUseCase_Factory(repositoryProvider);
  }

  public static GetCompletedTasksUseCase newInstance(TaskRepository repository) {
    return new GetCompletedTasksUseCase(repository);
  }
}
