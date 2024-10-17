package template_pattern;

class PDFReportGenerator extends ReportGenerator {
    @Override
    protected void formatHeader() {
        System.out.println("Formatting PDF Header...");
    }

    @Override
    protected void formatBody() {
        System.out.println("Formatting PDF Body...");
    }

    @Override
    protected void formatFooter() {
        System.out.println("Formatting PDF Footer...");
    }
}
