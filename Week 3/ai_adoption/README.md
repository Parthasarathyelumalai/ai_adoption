# Todo App

A modern, clean-architecture Android TODO list application built with Kotlin, Jetpack Compose, Room, Hilt, and MVVM.  
This app demonstrates best practices in Android development, including dependency injection, reactive UI, and local data persistence.

---

## Features

- **Add, edit, delete, and complete tasks**
- **Material3 UI** with Jetpack Compose
- **Room Database** for local persistence
- **MVVM architecture** with clean separation of concerns
- **Dependency Injection** using Hilt
- **Kotlin Coroutines & Flow** for async and reactive programming
- **Dark mode** support
- **Unit test support** (see below)

---

## Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/todoapp/
│   │   │   ├── data/         # Data layer: Room, repository implementation
│   │   │   ├── di/           # Hilt modules for DI
│   │   │   ├── domain/       # Domain layer: entities, use cases, repository interface
│   │   │   ├── presentation/ # UI: ViewModel, Composables, Screens
│   │   │   ├── ui/           # Theme and style
│   │   │   ├── MainActivity.kt
│   │   │   └── TodoApplication.kt
│   │   ├── res/              # Resources: themes, icons, strings
│   │   └── AndroidManifest.xml
│   └── test/                 # (Add your unit tests here)
├── build.gradle.kts
└── settings.gradle.kts
```

---

## Main Components

### Domain Layer
- `Task`: Entity representing a todo item.
- `TaskRepository`: Interface for task data operations.
- Use Cases: `AddTaskUseCase`, `UpdateTaskUseCase`, `DeleteTaskUseCase`, `GetAllTasksUseCase`, `GetCompletedTasksUseCase`.

### Data Layer
- `TaskEntity`: Room entity for tasks.
- `TaskDao`: Room DAO for CRUD operations.
- `TodoDatabase`: Room database.
- `TaskRepositoryImpl`: Implements `TaskRepository` using Room and DAO.
- `Converters`: Type converters for Room (e.g., Date).

### Presentation Layer
- `TaskViewModel`: Exposes state and actions for the UI.
- `TaskListScreen`: Main screen showing the list of tasks.
- `TaskItem`: Composable for displaying a single task.
- `AddTaskDialog`: Composable dialog for adding/editing tasks.

### Dependency Injection
- `DatabaseModule`: Provides Room database and DAO.
- `RepositoryModule`: Binds repository implementation to interface.

### UI & Theme
- Material3 theme with light/dark support.
- Custom colors and typography.

---

## Getting Started

### Prerequisites

- Android Studio (Giraffe or newer recommended)
- Android SDK 34+
- JDK 11 or 17 (project is set up for JDK 11, but can be updated for 17)

### Build & Run

1. **Clone the repository**
2. **Open in Android Studio**
3. **Sync Gradle**
4. **Run on emulator or device**

Or, from the command line:
```sh
./gradlew :app:installDebug
```

### Running Tests

```sh
./gradlew :app:testDebugUnitTest
```
Test reports: `app/build/reports/tests/testDebugUnitTest/index.html`

---

## Usage

- Tap the **"+"** button to add a new task.
- Tap a task to edit it.
- Use the checkbox to mark as complete/incomplete.
- Tap the delete icon to remove a task.

---

## Extending

- Add more features (notifications, due dates, categories, etc.)
- Add UI tests in `androidTest`
- Add more unit tests in `test`

---

## License

MIT (or specify your license here)

---

## Credits

- [Jetpack Compose](https://developer.android.com/jetpack/compose)
- [Room](https://developer.android.com/jetpack/androidx/releases/room)
- [Hilt](https://dagger.dev/hilt/)
- [Material3](https://m3.material.io/)

--- 