# User Registration Modernization (Java to Kotlin)

## Overview
This project demonstrates the modernization of a legacy Java user registration function into a modular, secure, and testable Kotlin implementation.

## Modernization Steps
- Refactored monolithic Java code into modular Kotlin classes
- Applied SOLID principles and best practices
- Added input validation, error handling, and password hashing
- Used dependency injection for testability
- Provided comprehensive unit tests

## How to Run
1. Ensure you have Kotlin and Gradle installed.
2. Add the `org.mindrot:jbcrypt` library for password hashing.
3. Compile and run the `UserRegistrationServiceTest.kt` file using your preferred IDE or command line.

## Testing
Unit tests are provided in `UserRegistrationServiceTest.kt` and can be run with JUnit 5.

## Security
- Passwords are hashed using BCrypt
- No SQL or database code is present in this sample (repository is abstracted)

## Files
- `UserRegistrationService.kt`: Main service and data classes
- `UserRegistrationServiceTest.kt`: Unit tests
- `README.md`: This file
- `report.md`: Modernization analysis and comparison 