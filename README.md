# 🎓 Student Management System — Java OOP Project

A console-based Student Management System built in Java as a hands-on practice project after completing Object-Oriented Programming concepts. This project was written from scratch without copy-pasting — every line typed and understood manually.

## 💡 Why I Built This

After learning the four pillars of OOP — Abstraction, Encapsulation, Inheritance, and Polymorphism — I wanted to apply all of them together in one real-world project before moving to Android development. A college management system felt like a perfect fit because it maps directly to real life.

## 🧠 OOP Concepts Used

- **Abstraction** — `Person` is an abstract class with an abstract `displayInfo()` method. No object of Person can be created directly.
- **Encapsulation** — All fields are private. Marks, salary, and age can only be changed through validated setters — preventing bad data.
- **Inheritance** — `Student` and `Teacher` both extend `Person` and inherit its fields and methods using `super()`.
- **Polymorphism** — `displayInfo()` is overridden in both child classes. The same method call produces completely different output depending on the object type.

## 📁 Project Structure

```
StudentManagement/
├── Person.java      # Abstract base class
├── Student.java     # Marks, grade, pass/fail logic
├── Teacher.java     # Salary, experience, rank logic
├── College.java     # ArrayList management + result summary
└── Main.java        # Interactive console menu
```

## ▶️ How to Run

1. Clone this repository
2. Open in IntelliJ IDEA or any Java IDE
3. Run `Main.java`
4. Use the menu to add students, search by ID, view results and topper

## 🛠 Tech Stack
- **Language** — Java
- **IDE** — IntelliJ IDEA Community (free)
- **Level** — Beginner OOP practice

## 📌 Part of my Android Developer roadmap — building from Java fundamentals toward Kotlin and Android Studio.
