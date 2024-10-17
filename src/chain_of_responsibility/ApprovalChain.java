package chain_of_responsibility;

class ApprovalChain {
    private Approver teamLead;
    private Approver manager;
    private Approver director;
    private Approver ceo;

    public ApprovalChain() {
        teamLead = new TeamLead();
        manager = new Manager();
        director = new Director();
        ceo = new CEO();

        teamLead.setNext(manager);
        manager.setNext(director);
        director.setNext(ceo);
    }

    public String processRequest(ExpenseRequest request) {
        return teamLead.handleRequest(request);
    }
}
