package memento_pattern;

import java.util.ArrayList;
import java.util.List;

class VersionControl {
    private List<DocumentVersion> versions = new ArrayList<>();

    // Save a new version of the document
    public void saveVersion(DocumentVersion version) {
        versions.add(version);
    }

    // Get a specific version by index
    public DocumentVersion getVersion(int index) {
        if (index >= 0 && index < versions.size()) {
            return versions.get(index);
        }
        return null;
    }

    // List all saved versions
    public void listVersions() {
        for (int i = 0; i < versions.size(); i++) {
            System.out.println("Version " + (i + 1) + ": " + versions.get(i).getContent());
        }
    }
}

