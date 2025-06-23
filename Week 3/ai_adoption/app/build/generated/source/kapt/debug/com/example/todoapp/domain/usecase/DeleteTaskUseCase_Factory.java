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
public final class DeleteTaskUseCase_Factory implements Factory<DeleteTaskUseCase> {
  private final Provider<TaskRepository> repositoryProvider;

  public DeleteTaskUseCase_Factory(Provider<TaskRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public DeleteTaskUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static DeleteTaskUseCase_Factory create(Provider<TaskRepository> repositoryProvider) {
    return new DeleteTaskUseCase_Factory(repositoryProvider);
  }

  public static DeleteTaskUseCase newInstance(TaskRepository repository) {
    return new DeleteTaskUseCase(repository);
  }
}
