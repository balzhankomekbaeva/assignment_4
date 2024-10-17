package template_pattern;

class HTMLReportGenerator extends ReportGenerator {
    @Override
    protected void formatHeader() {
        System.out.println("Formatting HTML Header...");
    }

    @Override
    protected void formatBody() {
        System.out.println("Formatting HTML Body...");
    }

    @Override
    protected void formatFooter() {
        System.out.println("Formatting HTML Footer...");
    }
}

