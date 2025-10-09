# 📱 Android MVVM + Clean Architecture + Hilt + Room + Testing

Este repositorio contiene una guía práctica y progresiva sobre cómo implementar la arquitectura **MVVM (Model - View - ViewModel)** en Android utilizando **Kotlin**, integrando gradualmente conceptos avanzados como **Clean Architecture**, **Dagger Hilt**, **Room Database** y **Testing (JUnit, MockK, CoroutinesTest)**.

---

## 🧱 Estructura del proyecto (por ramas)

El repositorio está organizado por **ramas (branches)** que representan cada etapa del aprendizaje y desarrollo:

| Rama | Descripción |
|------|--------------|
| `feature/mvvm-basico` | 🔹 Implementación básica de la arquitectura **MVVM** con `ViewModel` y `LiveData`. |
| `feature/mvvm-clean-architecture` | 🧩 Se integra **Clean Architecture**, separando capas de dominio, datos y presentación. |
| `feature/mvvm-dagger-hilt` | 💉 Implementa **inyección de dependencias** usando **Dagger Hilt**. |
| `feature/mvvm-room-database` | 🗄️ Se agrega **Room Database** al proyecto para manejo local de datos. |
| `feature/mvvm-start-testing` | 🧪 Se agregan **dependencias y configuraciones de testing** con `JUnit`, `MockK` y `CoroutinesTest`. |

---

## 🚀 Cómo usar este repositorio

1. **Clona el proyecto**
   ```bash
   git clone https://github.com/albinrk10/ExampleMVVM.git
   cd tu-repositorio

   
Instala dependencias
Abre el proyecto en Android Studio y permite que Gradle sincronice las dependencias automáticamente.

Explora cada rama
Cada rama representa una evolución del proyecto. Puedes cambiar entre ramas con:

git checkout feature/mvvm-basico


o

git checkout feature/mvvm-room-database


Ejecuta el proyecto
Desde Android Studio, selecciona un emulador o dispositivo físico y ejecuta la app.

🧩 Tecnologías utilizadas

Kotlin

XML

ViewModel

LiveData

Room

Clean Architecture

Dagger Hilt

Coroutines

JUnit & MockK (Testing)

Gradle Kotlin DSL

🧠 Objetivo del repositorio

El objetivo es servir como un recurso educativo y práctico para comprender paso a paso cómo construir una aplicación Android escalable y mantenible utilizando buenas prácticas y patrones de arquitectura moderna.
