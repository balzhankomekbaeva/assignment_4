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

