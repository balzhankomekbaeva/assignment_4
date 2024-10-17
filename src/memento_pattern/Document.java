package memento_pattern;

class Document {
    private String content;

    public Document() {
        this.content = "";
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    // Creates a memento (DocumentVersion) to save the current state
    public DocumentVersion save() {
        return new DocumentVersion(content);
    }

    // Restores the document to a previous state
    public void restore(DocumentVersion version) {
        this.content = version.getContent();
    }

    @Override
    public String toString() {
        return content;
    }
}

