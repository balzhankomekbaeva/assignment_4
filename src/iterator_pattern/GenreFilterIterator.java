package iterator_pattern;

class GenreFilterIterator implements Iterator {
    private Playlist playlist;
    private String genre;
    private int position;

    public GenreFilterIterator(Playlist playlist, String genre) {
        this.playlist = playlist;
        this.genre = genre;
        this.position = 0;
    }
    @Override
    public boolean hasNext() {
        while (position < playlist.getSongs().size()) {
            Song song = playlist.getSongs().get(position);
            if (song.getGenre().equalsIgnoreCase(genre)) {
                return true;
            }
            position++;
        }
        return false;
    }

    @Override
    public Song next() {
        return playlist.getSongs().get(position++);
    }
}


