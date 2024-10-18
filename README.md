# Expense Approval System

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

