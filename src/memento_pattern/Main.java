package memento_pattern;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        VersionControl versionControl = new VersionControl();

        document.setContent("Version 1: Initial draft.");
        versionControl.saveVersion(document.save());

        document.setContent("Version 2: Added introduction.");
        versionControl.saveVersion(document.save());

        document.setContent("Version 3: Added conclusion.");
        versionControl.saveVersion(document.save());

        System.out.println("Saved versions:");
        versionControl.listVersions();

        // Restore to a previous version
        System.out.println("\nRestoring to version 1...");
        document.restore(versionControl.getVersion(0));
        System.out.println("Current document: " + document);

        System.out.println("\nRestoring to version 3...");
        document.restore(versionControl.getVersion(2));
        System.out.println("Current document: " + document);
    }
}

