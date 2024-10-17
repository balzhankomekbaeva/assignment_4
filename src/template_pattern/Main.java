package template_pattern;

public class Main {
    public static void main(String[] args) {
        ReportingSystem system = new ReportingSystem();

        System.out.println("---- Generating PDF Report ----");
        ReportGenerator pdfReport = new PDFReportGenerator();
        system.generateReport(pdfReport);

        System.out.println("\n---- Generating HTML Report ----");
        ReportGenerator htmlReport = new HTMLReportGenerator();
        system.generateReport(htmlReport);

        System.out.println("\n---- Generating Plain Text Report ----");
        ReportGenerator plainTextReport = new PlainTextReportGenerator();
        system.generateReport(plainTextReport);
    }
}

