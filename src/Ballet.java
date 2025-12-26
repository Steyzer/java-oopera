public class Ballet extends MusicalShow {
    private String choreographer; // хореограф

    public Ballet(String title, int duration, Director director, String musicAuthor, String librettoText, String choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}



/*public class Ballet extends MusicalShow {
    String choreographer; // хореограф
    public Ballet(String musicAuthor, String librettoText) {
        super(musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
    public void setChoreographer(String choreographer) {
        this.choreographer = choreographer;
    }
}*/
