package template_pattern;

class PlainTextReportGenerator extends ReportGenerator {
    @Override
    protected void formatHeader() {
        System.out.println("Formatting Plain Text Header...");
    }

    @Override
    protected void formatBody() {
        System.out.println("Formatting Plain Text Body...");
    }

    @Override
    protected void formatFooter() {
        System.out.println("Formatting Plain Text Footer...");
    }
}
