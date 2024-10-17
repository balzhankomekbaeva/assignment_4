package iterator_pattern;

class Song {
    private String title;
    private String genre;

    public Song(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return title + " (" + genre + ")";
    }
}

