# Let the Battle Commence — Advanced Programming Assignment 1

A Java OOP simulation of a turn-based battle system between two teams of fighters and monsters, demonstrating inheritance, abstract classes, and interfaces.

## Class Structure

```
.
├── class/          # Provided bytecode (Part A — do not modify)
│   ├── Combatable.class   # Interface
│   ├── Human.class        # Abstract
│   ├── Fighter.class      # Abstract, extends Human
│   ├── Monster.class      # Abstract
│   ├── Battle.class       # Battle simulation engine
│   └── Main.class         # Entry point
├── source/         # Implemented classes (Part B)
│   ├── Knight.java
│   ├── Warrior.java
│   ├── Paladin.java
│   └── DeathEater.java
└── util/           # Utility classes (Part C — free to change)
    ├── Complex.java
    ├── Utility.java
    └── TeamMaker.java
```

## Combat Score Rules

| Class | Condition | Score |
|-------|-----------|-------|
| **Knight** | `GROUND` is a square number | `baseHP × 2` |
| **Knight** | `WP == 1` | `baseHP` |
| **Knight** | otherwise | `baseHP / 10` |
| **Warrior** | `GROUND` is a prime number | `baseHP × 2` |
| **Warrior** | `WP == 1` | `baseHP` |
| **Warrior** | otherwise | `baseHP / 10` |
| **Paladin** | `baseHP` is Fibonacci Fₙ (n > 2) | `1000 + n` |
| **Paladin** | otherwise | `baseHP × 3` (can exceed 999) |
| **DeathEater** | always | `√(real² + imaginary²)` (magnitude of mana) |

> Knight and Warrior scores are capped at **999**. Paladin is exempt from this cap.

## Build & Run

```bash
# Compile (all .java files must be in the same directory as .class files)
javac *.java

# Run
java Main
```

## Course

**Advanced Programming** — Ho Chi Minh City University of Technology (HCMUT)
