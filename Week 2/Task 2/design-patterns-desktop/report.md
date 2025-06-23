# Design Patterns Project Report

## Overview
This project demonstrates the implementation and evaluation of three classic design patterns in Kotlin:
- Strategy Pattern (Payment Processing)
- Observer Pattern (Event Notification System)
- Factory Pattern (Database Connection Factory)

Each pattern is implemented with best practices, unit tests, and a client example.

---

## 1. Strategy Pattern: Payment Processing

**Files:**
- `strategy/src/main/kotlin/PaymentStrategy.kt` (interface)
- `CreditCardPayment.kt`, `PayPalPayment.kt`, `BankTransferPayment.kt` (concrete strategies)
- `PaymentContext.kt` (context)
- `Client.kt` (usage example)
- `PaymentStrategyTest.kt` (unit tests)

**Pattern Fit:** Excellent. The Strategy pattern allows runtime selection of payment algorithms, decoupling the context from concrete implementations.

**Code Quality:** 9/10. Clean, idiomatic Kotlin. Easily extensible. Could be improved with error handling and async support.

**SOLID Principles:** Fully respected. New strategies require no changes to existing code.

---

## 2. Observer Pattern: Event Notification System

**Files:**
- `observer/src/main/kotlin/EventListener.kt` (interface)
- `EventManager.kt` (subject)
- `EmailListener.kt`, `SmsListener.kt` (observers)
- `Client.kt` (usage example)
- `ObserverTest.kt` (unit tests)

**Pattern Fit:** Excellent. The Observer pattern is ideal for one-to-many event notification.

**Code Quality:** 9/10. Well-structured, dynamic subscription. Could be improved with event objects and thread safety.

**SOLID Principles:** Fully respected. Observers are decoupled from the subject.

---

## 3. Factory Pattern: Database Connection Factory

**Files:**
- `factory/src/main/kotlin/Connection.kt` (interface)
- `MySqlConnection.kt`, `PostgreSqlConnection.kt` (products)
- `ConnectionFactory.kt` (factory)
- `Client.kt` (usage example)
- `FactoryTest.kt` (unit tests)

**Pattern Fit:** Good. The Factory pattern centralizes object creation and decouples clients from concrete classes.

**Code Quality:** 8/10. Simple and effective. Could be improved with config-based creation and better OCP adherence.

**SOLID Principles:** Mostly respected. Adding new types requires a factory change.

---

## Comparison
- **Best Implementation:** Strategy Pattern (most extensible, best OCP adherence)
- **Improvements:** Use configuration for Factory, add error handling, and thread safety for Observer.

---

## How to Run
1. Open the project in IntelliJ IDEA or another Kotlin-compatible IDE.
2. Ensure you have JUnit 5 and Mockito dependencies for tests.
3. Run the `main` functions in each pattern's `Client.kt` to see examples.
4. Run the test files to verify correctness.

---

## What Was Done
- Implemented three design patterns in Kotlin.
- Wrote unit tests for each pattern.
- Provided client code examples.
- Evaluated each pattern for fit, code quality, and SOLID principles.
- Documented findings and recommendations. 