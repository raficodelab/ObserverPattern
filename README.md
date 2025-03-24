# Observer Pattern Implementation

## Overview
This project demonstrates the **Observer Design Pattern** in Java. The pattern is implemented using a `Subject` class that maintains a list of observers. Whenever the state of the `Subject` changes, all attached observers are notified.

Additionally, the project includes an **SMS Support Listener** that checks for long messages exceeding 100 characters and issues warnings accordingly.

## Project Structure
```
|-- src/
    |-- observer/
        |-- BinaryObserver.java
        |-- HexaObserver.java
        |-- OctalObserver.java
        |-- Observer.java
        |-- Subject.java
    |-- observer/eventarmanagerment/
        |-- SMSReceiver.java
        |-- SMSSupportListener.java
    |-- ObserverPatternDemo.java
```

## Classes and Functionality

### Observer Pattern
- **Subject.java**: Maintains the state and a list of observers. Notifies observers upon state change.
- **Observer.java**: Abstract class that defines the `update` method.
- **BinaryObserver.java**: Converts the state to a binary string and displays it.
- **HexaObserver.java**: Converts the state to a hexadecimal string and displays it.
- **OctalObserver.java**: Converts the state to an octal string and displays it.

### SMS Event Management
- **SMSReceiver.java**: Receives SMS messages and forwards them to a listener.
- **SMSSupportListener.java**: Checks SMS length and issues warnings if it exceeds 100 characters.

### ObserverPatternDemo.java
- Demonstrates the observer pattern by creating a `Subject` and attaching observers.
- Changes the state of the subject and observes the output.
- Demonstrates SMS length checking functionality.

## How to Run
1. Clone the repository:
   ```sh
   git clone <repository_url>
   ```
2. Navigate to the project directory:
   ```sh
   cd observer-pattern
   ```
3. Compile and run the program:
   ```sh
   javac observer/*.java observer/eventarmanagerment/*.java ObserverPatternDemo.java
   java ObserverPatternDemo
   ```

## Expected Output
```
First state change: 15
Hex String: F
Octal String: 17
Binary String: 1111

Second state change: 10
Hex String: A
Octal String: 12

Receiving SMS: This is a long SMS message that exceeds the 100 character limit...
Warning: SMS content exceeds 100 characters!

Receiving SMS: Short SMS.
SMS content is within the acceptable length.
```

## License
This project is open-source and available for use under the [MIT License](LICENSE).

