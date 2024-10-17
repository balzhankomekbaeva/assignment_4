package memento_pattern;

class DocumentVersion {
    private final String content;

    public DocumentVersion(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

