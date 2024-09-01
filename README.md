# Library Management System

A simple library management system implemented in Java, allowing users to perform basic operations such as adding books, borrowing books, returning books, and viewing available books. This project follows the principles of Test-Driven Development (TDD) and adheres to clean coding practices.

## Table of Contents

- [Project Overview](#project-overview)
- [Features](#features)
- [Getting Started](#getting-started)
- [Running the Project](#running-the-project)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)

## Project Overview

The Library Management System is designed to manage the operations of a library. The system allows users to add books to the library, borrow books, return books, and view the available books. The system ensures that a book can only be borrowed if it is available and updates the status of the book upon return.

## Features

- **Add Books:** Add new books to the library with a unique identifier (ISBN), title, author, and publication year.
- **Borrow Books:** Borrow a book from the library, ensuring that the book is available before borrowing.
- **Return Books:** Return a borrowed book and update its availability in the library.
- **View Available Books:** View a list of all books currently available in the library.

## Getting Started

### Prerequisites

To run this project, you will need:

- **Java Development Kit (JDK) 8 or later**
- **IntelliJ IDEA** or any other Java IDE
- **Git** for version control

### Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/MahekTandel17/Library-Management-System.git
   cd Library-Management-System
   
2. **Open the project in IntelliJ IDEA:**
   
    Launch IntelliJ IDEA.
    Open the LibraryManagementSystem project directory.
   
3. **Ensure JUnit 5 is set up:**
   
     If you are using Maven, JUnit 5 dependencies are already included in the pom.xml.
     If not using Maven, ensure JUnit 5 is added to your project manually.

## Running the Project
You can run the main class directly from your IDE or using the command line.

1. **Running from IntelliJ IDEA**
1.Open the Library class.
2.Right-click and select Run 'Library.main()'.

2. **Running from Command Line**
   Navigate to the project directory.
   Compile the project:
    `javac -d bin src/library/*.java`
   Run the main class:
    `java -cp bin library.Library`

## Testing
This project uses JUnit 5 for testing. Follow the instructions below to run the tests.

1. **Running Tests in IntelliJ IDEA**
   Navigate to the LibraryTest.java file located in the test package.
   Right-click on the file and select Run 'LibraryTest' to run all tests.
2. **Running Tests from the Command Line**
   If using Maven, you can run all tests with:
   `mvn test`
   If not using Maven, ensure your classpath includes the JUnit 5 library, and run the tests manually.

## Contributing
Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes and commit them (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Create a new Pull Request.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

### Key Points:

- **Project Overview**: Provides a brief introduction to what the project is about.
- **Features**: Lists the functionalities available in the system.
- **Getting Started**: Guides users on how to set up the project.
- **Running the Project**: Explains how to execute the project both in an IDE and via the command line.
- **Testing**: Describes how to run the tests.
- **Contributing**: Provides a guideline on how to contribute to the project.
- **License**: Indicates the licensing for the project.








