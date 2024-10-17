package chain_of_responsibility;

abstract class Approver {
    protected Approver nextApprover;

    public void setNext(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract String handleRequest(ExpenseRequest request);
}

class TeamLead extends Approver {
    @Override
    public String handleRequest(ExpenseRequest request) {
        if (request.getAmount() <= 1000) {
            return "Team Lead approved the expense of " + request.getAmount() + " for " + request.getPurpose() + ".";
        } else if (nextApprover != null) {
            return nextApprover.handleRequest(request);
        }
        return null;
    }
}

class Manager extends Approver {
    @Override
    public String handleRequest(ExpenseRequest request) {
        if (request.getAmount() <= 5000) {
            return "Manager approved the expense of " + request.getAmount() + " for " + request.getPurpose() + ".";
        } else if (nextApprover != null) {
            return nextApprover.handleRequest(request);
        }
        return null;
    }
}

class Director extends Approver {
    @Override
    public String handleRequest(ExpenseRequest request) {
        if (request.getAmount() <= 10000) {
            return "Director approved the expense of " + request.getAmount() + " for " + request.getPurpose() + ".";
        } else if (nextApprover != null) {
            return nextApprover.handleRequest(request);
        }
        return null;
    }
}

class CEO extends Approver {
    @Override
    public String handleRequest(ExpenseRequest request) {
        return "CEO approved the expense of " + request.getAmount() + " for " + request.getPurpose() + ".";
    }
}