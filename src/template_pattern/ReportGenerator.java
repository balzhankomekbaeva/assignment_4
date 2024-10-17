package template_pattern;

abstract class ReportGenerator {
    public final void generateReport() {
        formatHeader();
        formatBody();
        formatFooter();
        exportReport();
    }

    protected abstract void formatHeader();
    protected abstract void formatBody();
    protected abstract void formatFooter();

    protected void exportReport() {
        System.out.println("Exporting report...");
    }
}

