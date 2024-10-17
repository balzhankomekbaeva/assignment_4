package iterator_pattern;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class ShuffleIterator implements Iterator {
    private List<Song> shuffledSongs;
    private int position;

    public ShuffleIterator(Playlist playlist) {
        this.shuffledSongs = new ArrayList<>(playlist.getSongs());
        Collections.shuffle(this.shuffledSongs); // Shuffle the songs
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < shuffledSongs.size();
    }

    @Override
    public Song next() {
        return shuffledSongs.get(position++);
    }
}

