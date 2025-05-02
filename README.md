# Password Generator in Java Swing

## Overview

This Java application generates random passwords using the Swing GUI toolkit. It provides a simple interface with a button to generate a password and a text field to display the generated password.

## Features

*   Generates random passwords of a fixed length (8 characters).
*   Uses a combination of uppercase letters, lowercase letters, and numbers.
*   Simple and easy-to-use graphical interface.

## How to Run

1.  **Prerequisites:** Ensure you have the Java Development Kit (JDK) installed on your system.

2.  **Compilation:** Compile the `GeneratePass.java` file using the following command:

    ```bash
    javac GeneratePass.java
    ```

3.  **Execution:** Run the compiled class file using the following command:

    ```bash
    java GeneratePass
    ```

    This will launch the Password Generator application.

## Usage

1.  Click the "Generate" button to create a new random password.
2.  The generated password will be displayed in the text field.

## Code Explanation

*   **`GeneratePass` Class:** The main class that creates the GUI and handles password generation.
*   **GUI Components:**
    *   `JFrame`: The main window of the application.
    *   `JTextField`: Displays the generated password.
    *   `JPanel`: Used to organize the text field and button.
    *   `JButton`: Triggers the password generation process.
*   **Password Generation:**
    *   `numLetters`: A string containing all possible characters for the password (uppercase, lowercase, and numbers).
    *   `passLength`: An integer defining the length of the password (currently set to 8).
    *   `Random`: Used to generate random numbers for selecting characters.
    *   The `actionPerformed` method is triggered when the "Generate" button is clicked. It generates a random password by selecting characters from `numLetters` and appending them to a `StringBuilder`. The generated password is then displayed in the `JTextField`.

## Customization

*   **Password Length:** To change the password length, modify the `passLength` variable:

    ```java
    int passLength = 12; // Example: set password length to 12
    ```

*   **Character Set:** To modify the characters used in the password, change the `numLetters` string:

    ```java
    String numLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()"; // Example: add special characters
    ```

## Dependencies

*   Java Swing library (`javax.swing.*`)
*   Java AWT library (`java.awt.*`)

## Author

joshpadernal29
