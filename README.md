# 🏢 Company Hierarchy System

A **Java-based Company Hierarchy Management System** that manages different employee roles such as **Manager, Developer, and HR** using **Object-Oriented Programming (OOP)** concepts.
The system supports employee management, department filtering, performance ratings, salary processing with multithreading, and file-based data persistence.

---

## 🚀 Features

### 👨‍💼 Employee Management

* Add **Developer, Manager, HR**
* Auto **Employee ID Generation**
* Remove employee
* Update employee details
* Search employee by ID

### 🏢 Department System

* View employees by department
* Department-based filtering

### 💰 Salary Management

* Salary increment system
* **Multithreaded salary processor**
* Sort employees by salary

### ⭐ Performance System

* Employee **performance rating (1–5)**
* Rating-based salary increment

### 💾 Data Persistence

* **File Handling (Serialization)**
* Save employee data to file
* Load employee data automatically

---

## 📁 Project Structure

```
CompanyHierarchySystem
│
├── Employee.java
├── Developer.java
├── Manager.java
├── HR.java
├── Company.java
└── Main.java
```

---

## 🧠 Concepts Used

* Object-Oriented Programming (OOP)
* Inheritance
* Polymorphism
* Encapsulation
* ArrayList Collections
* File Handling (Serialization)
* Multithreading
* Lambda Expressions
* Iterator

---

## ⚙️ How to Run

1. Clone the repository

```
git clone https://github.com/yogeshkumarsaini/company-hierarchy-system.git
```

2. Navigate to project folder

```
cd company-hierarchy-system
```

3. Compile Java files

```
javac *.java
```

4. Run the program

```
java Main
```

---

## 📌 Example Menu

```
===== COMPANY SYSTEM =====
1 Add Developer
2 Add Manager
3 Add HR
4 Display Employees
5 Remove Employee
6 Update Employee
7 Sort by Salary
8 Department Employees
9 Rate Employee
10 Process Salary (Thread)
11 Save & Exit
```

---

## 📊 Sample Output

```
ID: 1000
Name: Rahul
Department: IT
Salary: 70000
Rating: 4
Role: Developer
Language: Java
```


