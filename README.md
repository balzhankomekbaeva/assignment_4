# Expense Approval System - chain of responsibility

This project is an example of how an expense approval system works using a chain of responsibility pattern. Each class plays a role in the process of approving expenses based on the amount.

### Classes and Their Roles:

1. **ApprovalChain**:
   - This class creates the approval process.
   - It sets up who will approve the expense first (Team Lead) and who to go to next if needed (Manager, Director, CEO).
   - It sends the expense request through the chain of approval.

2. **Approver**:
   - This is the base (abstract) class for all approvers.
   - It defines a method `handleRequest()` that each approver uses to decide if they can approve the expense or pass it to the next person.
   - It has a `setNext()` method to link to the next approver.

3. **TeamLead, Manager, Director, CEO**:
   - These are specific classes that extend `Approver`.
   - Each class decides if it can approve the expense based on the amount:
     - **TeamLead**: Approves up to 1000.
     - **Manager**: Approves up to 5000.
     - **Director**: Approves up to 10000.
     - **CEO**: Approves any expense above 10000.

4. **ExpenseRequest**:
   - This class represents an expense.
   - It holds information like the amount and the purpose of the expense.
   - The approval chain uses this information to decide who will approve it.

5. **Main**:
   - This is the class that runs the program.
   - It creates different expense requests and sends them through the approval process.
   - The program prints out who approves each request.
  

# TV Remote Control - Command Pattern

This project demonstrates the **Command Pattern** using a TV remote control. The idea is that you can assign different commands (like turning the TV on and off) to the remote and also undo those commands.

### Classes and Their Roles:

1. **Command**:
   - This is an interface that defines two methods: `execute()` and `undo()`.
   - Every specific command (like turning the TV on or off) will implement this interface.

2. **TurnTVOn and TurnTVOff**:
   - These classes implement the `Command` interface.
   - **TurnTVOn**: Turns the TV on when `execute()` is called, and can undo the action by turning the TV off using the `undo()` method.
   - **TurnTVOff**: Turns the TV off when `execute()` is called, and can undo the action by turning the TV back on using the `undo()` method.

3. **TV**:
   - This class represents the TV itself.
   - It has two methods: `on()` to turn the TV on and `off()` to turn the TV off.
   - These methods are called by the `TurnTVOn` and `TurnTVOff` commands.

4. **RemoteControl**:
   - This class represents the remote control.
   - It can store commands in slots, execute them, and undo the last executed command.
   - When you press a button on the remote (`pressButton()`), it runs the command in that slot. You can also undo the last command with `pressUndo()`.

5. **Main**:
   - This is the class that runs the program.
   - It creates the remote control, a TV object, and two commands (to turn the TV on and off).
   - It sets the commands on the remote and simulates pressing the buttons and undoing actions.


# Playlist Iterator System - Iterator Pattern

This project demonstrates the **Iterator Pattern** using a music playlist. The pattern is used to access elements (songs) from the playlist in different ways, such as by sequential order, shuffle, or filtering by genre.

### Classes and Their Roles:

1. **Iterator**:
   - This is an interface that defines two methods: `hasNext()` and `next()`.
   - Every specific way of iterating through the playlist (like sequential, shuffle, or genre filter) will implement this interface.

2. **SequentialIterator**:
   - Implements the `Iterator` interface.
   - This class goes through the playlist in the order that the songs were added.

3. **ShuffleIterator**:
   - Implements the `Iterator` interface.
   - It shuffles the playlist and goes through the songs in random order.

4. **GenreFilterIterator**:
   - Implements the `Iterator` interface.
   - This iterator filters the songs based on a specific genre and returns only the songs that match.

5. **Playlist**:
   - This class represents the collection of songs.
   - It stores the songs in a list and has methods to get different types of iterators (sequential, shuffle, or genre filter).

6. **Song**:
   - This class represents a song with a `title` and a `genre`.
   - Each song is added to the playlist and can be accessed through one of the iterators.

7. **Main**:
   - This class runs the program.
   - It creates a playlist, adds songs, and then demonstrates the different types of iterators (sequential, shuffle, and filtering by genre).

# Chat Room System - Mediator Pattern

This project demonstrates the **Mediator Pattern** using a chat room. In this pattern, the **mediator** handles communication between users instead of users interacting directly with each other.

### Classes and Their Roles:

1. **ChatMediator**:
   - This is an interface that defines two methods:
     - `sendMessage()`: Sends a message from one user to all other users.
     - `addUser()`: Adds a user to the chat room.

2. **ChatRoom**:
   - Implements the `ChatMediator` interface.
   - Acts as the central hub (the mediator) for communication between users.
   - It manages a list of users and ensures that when a message is sent, only other users receive it (the sender does not receive their own message).

3. **User** (Abstract Class):
   - This is an abstract class that represents a user in the chat room.
   - It defines two abstract methods:
     - `sendMessage()`: Sends a message to other users via the mediator (chat room).
     - `receiveMessage()`: Receives a message from the chat room.
   - Each user has a `mediator` (chat room) and a `name`.

4. **RegularUser**:
   - Extends the `User` class.
   - Implements the `sendMessage()` and `receiveMessage()` methods for regular users.
   - When a regular user sends a message, it prints the user's name along with the message.

5. **PremiumUser**:
   - Extends the `User` class.
   - Implements the `sendMessage()` and `receiveMessage()` methods for premium users.
   - When a premium user sends or receives a message, it is marked as a "Premium" user.

6. **Main**:
   - This class runs the program.
   - It creates a chat room (the mediator) and multiple users (regular and premium).
   - The users are added to the chat room, and they send messages to each other through the mediator.


# Document Version Control - Memento Pattern

This project demonstrates the **Memento Pattern**, which is used to save and restore the state of an object (in this case, a document) without exposing its internal structure. The **memento** is a snapshot of the document at a specific point in time, and it can be used to revert back to earlier versions.

### Classes and Their Roles:

1. **Document**:
   - This class represents the document we are working with.
   - It has content that can be updated, saved, and restored.
   - The `save()` method creates a memento (a `DocumentVersion`) to capture the current state of the document.
   - The `restore()` method restores the document’s state from a specific version (memento).

2. **DocumentVersion**:
   - This class acts as the **memento** that stores the state (content) of the document.
   - It holds the document’s content at the time of saving and provides access to that content.

3. **VersionControl**:
   - This class is responsible for managing multiple versions (mementos) of the document.
   - It can:
     - Save new versions (`saveVersion()`).
     - Retrieve a specific version (`getVersion()`).
     - List all saved versions (`listVersions()`).

4. **Main**:
   - This class runs the program.
   - It creates a document, changes its content over time, and saves each version.
   - The document can be restored to any previously saved version using the version control.


# Weather Data Observer Pattern

This project demonstrates the Observer Pattern through a weather data monitoring system.

## Classes Overview

### 1. `WeatherDisplay` (Interface)
Defines the method for updating weather data:
- **`update(float temperature, float humidity, float pressure)`**

### 2. `CurrentConditionsDisplay`
Implements `WeatherDisplay` to show current temperature and humidity.
- **Attributes**: `temperature`, `humidity`
- **Methods**: 
  - `update(...)`: Updates data and calls `display()`.
  - `display()`: Prints current conditions.

### 3. `ForecastDisplay`
Implements `WeatherDisplay` to forecast weather based on pressure.
- **Attributes**: `lastPressure`, `currentPressure`
- **Methods**: 
  - `update(...)`: Updates pressure data and calls `display()`.
  - `display()`: Prints weather forecast based on pressure trends.

### 4. `StatisticsDisplay`
Implements `WeatherDisplay` to show temperature statistics.
- **Attributes**: `maxTemp`, `minTemp`, `tempSum`, `numReadings`
- **Methods**: 
  - `update(...)`: Updates temperature statistics and calls `display()`.
  - `display()`: Prints average, max, and min temperatures.

### 5. `WeatherStation`
Acts as the subject that notifies observers of weather changes.
- **Attributes**: `observers`, `temperature`, `humidity`, `pressure`
- **Methods**: 
  - `registerObserver(...)`: Adds an observer.
  - `removeObserver(...)`: Removes an observer.
  - `notifyObservers()`: Updates all observers.
  - `setWeatherData(...)`: Sets new weather data and notifies observers.

### 6. `WeatherData` (Main Class)
Contains the `main` method to initialize the `WeatherStation` and its displays, simulating weather data updates.

# State Pattern Implementation

This project demonstrates the State Pattern, a behavioral design pattern that allows an object to alter its behavior when its internal state changes. The pattern encapsulates state-specific behavior in separate classes and delegates the request to the current state object.

## Overview

The State Pattern is particularly useful for managing the state of an object with multiple behaviors. In this implementation, we manage the states of an `Order` object, which can transition through various states such as New, Paid, Shipped, Delivered, and Cancelled.

## Components

- **State Interface**: Defines the methods for handling state transitions (`payOrder`, `shipOrder`, `deliverOrder`, `cancelOrder`).
- **Order Class**: Maintains a reference to the current state and provides methods to delegate state-related actions.
- **State Implementations**: Various states of the order, each implementing the `State` interface:
  - `NewState`
  - `PaidState`
  - `ShippedState`
  - `DeliveredState`
  - `CancelledState`

## Class Descriptions

### `Order`
Represents the context that maintains the current state. It has methods to perform actions based on the current state.

### `State`
An interface that defines the operations available to all states.

### `NewState`
Handles the initial state of the order, allowing payment and cancellation.

### `PaidState`
Represents the state after payment is made. It allows shipping the order and cancelling it.

### `ShippedState`
Represents the state after the order has been shipped. It allows delivery and disallows cancellation.

### `DeliveredState`
Represents the final state after delivery. It disallows any further state changes.

### `CancelledState`
Represents the state when an order is cancelled. It prevents any further actions on the order.


# Strategy Pattern Implementation

This project demonstrates the Strategy Pattern, a behavioral design pattern that enables selecting an algorithm's behavior at runtime. It allows a class to delegate the responsibility of executing an algorithm to different strategy classes.

## Overview

The Strategy Pattern is particularly useful when you have multiple ways of performing a task and want to choose the appropriate method dynamically. In this implementation, we handle various payment methods in an online shopping context.

## Components

- **PaymentStrategy Interface**: Defines a common interface for all payment strategies.
- **Concrete Strategies**: Implements different payment methods:
  - `CreditCardPayment`
  - `PayPalPayment`
  - `CryptoPayment`
- **ShoppingCart Class**: Maintains a reference to a `PaymentStrategy` and delegates payment processing to the selected strategy.

## Class Descriptions

### `PaymentStrategy`
An interface that defines the method `processPayment(double amount)` for payment processing.

### `CreditCardPayment`
Implements the `PaymentStrategy` interface to process credit card payments.

### `PayPalPayment`
Implements the `PaymentStrategy` interface to process payments via PayPal.

### `CryptoPayment`
Implements the `PaymentStrategy` interface to process cryptocurrency payments.

### `ShoppingCart`
Represents a shopping cart that can utilize different payment strategies. It allows setting the payment method and performing checkout operations.


# Template Pattern Implementation

This project demonstrates the Template Pattern, a behavioral design pattern that defines the skeleton of an algorithm in a method, deferring some steps to subclasses. The Template Pattern lets subclasses redefine certain steps of an algorithm without changing its structure.

## Overview

The Template Pattern is particularly useful when you have a common process that varies in specific steps across different implementations. In this implementation, we generate reports in various formats (PDF, HTML, and Plain Text) using a template method.

## Components

- **ReportGenerator Abstract Class**: Defines the template method `generateReport()` and abstract methods for formatting the report's header, body, and footer.
- **Concrete Implementations**: Classes that provide specific implementations for formatting reports:
  - `PDFReportGenerator`
  - `HTMLReportGenerator`
  - `PlainTextReportGenerator`
- **ReportingSystem Class**: Responsible for generating reports using the specified report generator.

## Class Descriptions

### `ReportGenerator`
An abstract class that provides the template method for report generation. It defines the common structure for generating reports, ensuring the sequence of operations is followed.

### `PDFReportGenerator`
Implements the `ReportGenerator` class to format PDF reports, providing specific implementations for the header, body, and footer.

### `HTMLReportGenerator`
Implements the `ReportGenerator` class to format HTML reports with custom header, body, and footer formatting.

### `PlainTextReportGenerator`
Implements the `ReportGenerator` class to format plain text reports, defining its own formatting for the header, body, and footer.

### `ReportingSystem`
Provides functionality to generate reports using different report generators.


# Visitor Pattern Implementation

This project demonstrates the Visitor Pattern, a behavioral design pattern that lets you separate an algorithm from the object structure on which it operates. By using the Visitor Pattern, you can add new operations to existing object structures without modifying those structures.

## Overview

The Visitor Pattern is particularly useful when you want to perform operations on a group of objects with different types. In this implementation, we calculate the areas of various geometric shapes (Circle, Rectangle, and Triangle) using a visitor.

## Components

- **Shape Interface**: Defines the accept(Visitor visitor) method that accepts a visitor.
- **Concrete Shapes**: Implements the Shape interface:
  - Circle
  - Rectangle
  - Triangle
- **Visitor Interface**: Declares a visit method for each type of shape.
- **AreaCalculator**: A concrete visitor that implements the Visitor interface to calculate the area of each shape.
- **Drawing Class**: Manages a collection of shapes and accepts a visitor to perform operations on them.

## Class Descriptions

### Shape
An interface that defines the accept method for accepting a visitor.

### Circle
Implements the Shape interface, representing a circle with a specified radius.

### Rectangle
Implements the Shape interface, representing a rectangle with a specified length and width.

### Triangle
Implements the Shape interface, representing a triangle with a specified base and height.

### Visitor
An interface that declares methods for visiting different shapes.

### AreaCalculator
Implements the Visitor interface to calculate the area of the shapes by overriding the visit methods.

### Drawing
Maintains a collection of shapes and provides a method to calculate their areas by accepting a visitor.
