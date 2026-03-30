# SymptomChecker
# 🩺 Symptom Checker & Health Advisor

A Java console application that helps users identify possible medical conditions based on their symptoms and provides first-aid advice. Built as a rule-based expert system using core Java concepts.

---

## 📌 Problem Statement

In many parts of India, especially in semi-urban and rural areas, people lack easy access to basic medical guidance. A first-time symptom often causes panic or is dangerously ignored. This tool bridges that gap by giving users immediate, structured health information based on their symptoms — making it clear when they need to see a doctor urgently.

---

## ✨ Features

- Accepts multiple symptoms as input
- Matches symptoms against a knowledge base of 15 common conditions
- Ranks results by match score and percentage
- Shows severity level: 🔴 HIGH / 🟡 MEDIUM / 🟢 LOW
- Displays detailed advice per condition
- Issues emergency warnings for HIGH severity matches
- Logs every session to `session_log.txt` for record keeping
- Supports multiple patients in one run

---

## 🗂️ Project Structure

```
SymptomChecker/
├── src/
│   ├── Main.java           # Entry point, main application loop
│   ├── Symptom.java        # Symptom data model
│   ├── Condition.java      # Condition model with match logic
│   ├── KnowledgeBase.java  # Rule-based disease-symptom database (15 conditions)
│   ├── DiagnosisEngine.java# Core matching and ranking logic
│   ├── DiagnosisResult.java# Result model (condition + score)
│   ├── ConsoleUI.java      # All display / formatting logic
│   └── SessionLogger.java  # File I/O — logs sessions to session_log.txt
├── session_log.txt         # Auto-created on first run
└── README.md
```

---

## 🛠️ Setup & How to Run

### Prerequisites
- Java JDK 8 or above installed
- Any terminal / command prompt

### Steps

**1. Clone the repository**
```bash
git clone https://github.com/YOUR_USERNAME/SymptomChecker.git
cd SymptomChecker/src
```

**2. Compile all Java files**
```bash
javac *.java
```

**3. Run the application**
```bash
java Main
```

---

## 🖥️ Sample Output

```
╔══════════════════════════════════════════════════════════╗
║         SYMPTOM CHECKER & HEALTH ADVISOR                ║
║         Java Console Application  v1.0                  ║
╚══════════════════════════════════════════════════════════╝

  Enter your name: Rahul
  Enter your age : 22

  Symptom: high fever
  ✔ Added: high fever
  Symptom: chills
  ✔ Added: chills
  Symptom: headache
  ✔ Added: headache
  Symptom: done

──────────────────────────────────────────────────────────
  ANALYSIS RESULTS
──────────────────────────────────────────────────────────

  #    Possible Condition              Match%    Severity    Matched
  1    Malaria                         42.9%     🔴 HIGH     3/7 symptoms
  2    Influenza (Flu)                 37.5%     🟡 MED      3/8 symptoms
  3    Dengue Fever                    37.5%     🔴 HIGH     3/8 symptoms
```

---

## 📋 Conditions in the Knowledge Base

| Condition | Severity |
|---|---|
| Common Cold | 🟢 LOW |
| Influenza (Flu) | 🟡 MEDIUM |
| Typhoid Fever | 🔴 HIGH |
| Dengue Fever | 🔴 HIGH |
| Malaria | 🔴 HIGH |
| COVID-19 | 🔴 HIGH |
| Gastroenteritis | 🟡 MEDIUM |
| Hypertension | 🟡 MEDIUM |
| Diabetes (Type 2) | 🟡 MEDIUM |
| Asthma | 🟡 MEDIUM |
| Anemia | 🟡 MEDIUM |
| Migraine | 🟡 MEDIUM |
| Chickenpox | 🟢 LOW |
| Urinary Tract Infection | 🟡 MEDIUM |
| Jaundice | 🔴 HIGH |

---

## ⚠️ Disclaimer

This tool is for **informational and educational purposes only**. It is **not** a substitute for professional medical advice, diagnosis, or treatment. Always consult a qualified healthcare professional for medical concerns.

---

## 🧑‍💻 Concepts Used

- Object-Oriented Programming (Classes, Encapsulation, Inheritance)
- Collections Framework (ArrayList, List)
- File I/O (FileWriter, PrintWriter for session logging)
- Exception Handling (try-catch for input validation and I/O errors)
- Scanner for console input
- Comparable interface for sorting results
- Modular design with separation of concerns

---

## 👤 Author

**[Your Name]**  
VIT Bhopal University  
BYOP Submission — [Course Name]
