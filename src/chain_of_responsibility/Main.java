package chain_of_responsibility;
public class Main {
    public static void main(String[] args) {
        ApprovalChain approvalChain = new ApprovalChain();

        ExpenseRequest[] requests = {
                new ExpenseRequest(500, "Office supplies"),
                new ExpenseRequest(1500, "Team lunch"),
                new ExpenseRequest(6000, "New software licenses"),
                new ExpenseRequest(12000, "Company retreat")
        };

        for (ExpenseRequest request : requests) {
            String result = approvalChain.processRequest(request);
            System.out.println(result);
        }
    }
}

