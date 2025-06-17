package com.example.todoapp.di;

import com.example.todoapp.data.local.TodoDatabase;
import com.example.todoapp.data.local.dao.TaskDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class DatabaseModule_ProvideTaskDaoFactory implements Factory<TaskDao> {
  private final Provider<TodoDatabase> databaseProvider;

  public DatabaseModule_ProvideTaskDaoFactory(Provider<TodoDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public TaskDao get() {
    return provideTaskDao(databaseProvider.get());
  }

  public static DatabaseModule_ProvideTaskDaoFactory create(
      Provider<TodoDatabase> databaseProvider) {
    return new DatabaseModule_ProvideTaskDaoFactory(databaseProvider);
  }

  public static TaskDao provideTaskDao(TodoDatabase database) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideTaskDao(database));
  }
}
