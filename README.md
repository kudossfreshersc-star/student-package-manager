# Student Package Manager

Java tiny project demonstrating how packages organize student-related classes and how classes are imported from one package into another.

## Package structure
- `studentmanager.model` -> Student class
- `studentmanager.service` -> StudentManager class
- `studentmanager.app` -> Main class

## Compile
From the project folder:

```bash
javac -d out studentmanager/model/Student.java studentmanager/service/StudentManager.java studentmanager/app/Main.java
```

## Run
```bash
java -cp out studentmanager.app.Main
```

## Expected output
STUDENT PACKAGE MANAGER

--- Student List ---
ID: 101 | Name: Aarav | Course: BCA | Marks: 82.50
ID: 102 | Name: Riya | Course: BCA | Marks: 91.00
ID: 103 | Name: Karan | Course: BCA | Marks: 76.50
