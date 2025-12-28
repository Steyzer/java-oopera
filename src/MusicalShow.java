public class MusicalShow extends Show {
    protected String musicAuthor; // автор либретто
    protected String librettoText; // текст либретто

    public MusicalShow(String title, int duration, Director director, String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    // Печать либретто
    public void printLibretto() {
        System.out.println("Либретто спектакля \"" + title + "\":");
        System.out.println("Текст либретто: " + librettoText);
        System.out.println("Автор либретто: " + musicAuthor);
    }
}


/*public class MusicalShow extends Show {
String musicAuthor; // автор либретто
String librettoText; // текст либретто
    public MusicalShow (String musicAuthor, String librettoText) {
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }
   public void printLibretto () {
       System.out.println("Автор либретто: " + musicAuthor);
       System.out.println("Текст либретто: " + librettoText);
    }
}*/
