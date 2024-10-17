package iterator_pattern;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Song A", "Pop"));
        playlist.addSong(new Song("Song B", "Rock"));
        playlist.addSong(new Song("Song C", "Pop"));
        playlist.addSong(new Song("Song D", "Jazz"));
        playlist.addSong(new Song("Song E", "Rock"));

        System.out.println("---- Sequential Order ----");
        Iterator sequentialIterator = playlist.getSequentialIterator();
        while (sequentialIterator.hasNext()) {
            System.out.println(sequentialIterator.next());
        }

        System.out.println("\n---- Shuffle Order ----");
        Iterator shuffleIterator = playlist.getShuffleIterator();
        while (shuffleIterator.hasNext()) {
            System.out.println(shuffleIterator.next());
        }

        System.out.println("\n---- Genre Filtered (Rock) ----");
        Iterator genreFilterIterator = playlist.getGenreFilterIterator("Rock");
        while (genreFilterIterator.hasNext()) {
            System.out.println(genreFilterIterator.next());
        }
    }
}
