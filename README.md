# Java Playground

<style>
@import url('https://fonts.googleapis.com/css2?family=JetBrains+Mono:wght@400;500;600&display=swap');
body {
  font-family: 'JetBrains Mono', 'Courier New', monospace !important;
}
* {
  font-family: 'JetBrains Mono', 'Courier New', monospace !important;
}
</style>

A comprehensive Java coding practice project featuring various programming concepts, algorithms, and data structure implementations.

## Overview

This project serves as a learning repository for Java programming concepts and best practices. It contains practical examples and implementations of common coding problems, data structures, and algorithms.

## Project Structure

```
java-playground/
├── src/
│   ├── Main.java                 # Main entry point with example usage
│   └── streams/
│       ├── StreamsPractice.java  # Java Stream API examples
│       └── README.md            # Streams module documentation
├── .gitignore                   # Git ignore file
├── README.md                   # This file
└── Coding Practice.iml         # IntelliJ IDEA module file
```

## Modules

### Streams Module (`src/streams/`)

The streams module demonstrates practical applications of Java 8+ Stream API:

- **Duplicate Detection**: Find duplicate elements in arrays
- **String Analysis**: Non-repeating character detection, frequency counting
- **List Operations**: Second-highest number finding, duplicate removal
- **String Algorithms**: Anagram checking using streams

### Main Application (`src/Main.java`)

The main class provides example usage and testing of various implementations. Currently demonstrates stream operations with commented examples for different scenarios.

## Features

- **Java 8+ Compatible**: Uses modern Java features including Stream API
- **Modular Design**: Organized into logical modules for different concepts
- **Practical Examples**: Real-world coding problems and solutions
- **Well Documented**: Comprehensive documentation and comments

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- IntelliJ IDEA (recommended) or any Java IDE

### Running the Project

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd core-java
   ```

2. Open the project in your IDE
3. Run the `Main.java` file to see example outputs

### Building

```bash
javac src/*.java src/streams/*.java
java -cp src Main
```

## Learning Objectives

This project helps in mastering:

- Java Stream API and functional programming
- Problem-solving with Java
- Data structure implementations
- Algorithm design and optimization
- Code organization and best practices

## Contributing

Feel free to add new modules, examples, or improvements:

1. Create appropriate packages for new concepts
2. Follow existing code style and documentation patterns
3. Add comprehensive examples and tests
4. Update documentation accordingly

## Dependencies

- Java 8+ (no external dependencies required)
