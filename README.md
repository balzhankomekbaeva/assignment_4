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



