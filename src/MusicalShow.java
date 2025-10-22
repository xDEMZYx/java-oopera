public class MusicalShow extends Show {

    public Person musicAuthor;
    public String librettoText;

    public MusicalShow(String title, int duration, Director director,
                       Person musicAuthor,
                       String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }
}
