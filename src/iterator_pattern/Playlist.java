package iterator_pattern;

import java.util.ArrayList;
import java.util.List;

class Playlist {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public List<Song> getSongs() {
        return songs;
    }

    // Method to get sequential iterator
    public Iterator getSequentialIterator() {
        return new SequentialIterator(this);
    }

    // Method to get shuffle iterator
    public Iterator getShuffleIterator() {
        return new ShuffleIterator(this);
    }

    // Method to get genre filter iterator
    public Iterator getGenreFilterIterator(String genre) {
        return new GenreFilterIterator(this, genre);
    }
}

