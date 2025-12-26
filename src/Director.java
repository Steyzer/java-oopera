public class Director extends Person {
    private int numberOfShows; // количество поставленных спектаклей

    public Director(String name, String surname, String gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }
}


/*public class Director extends Person {

    int numberOfShows; // количество поставленных спектаклей

    public Director (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    @Override
    public String toString() {
        return "Режиссер: " + name + " " + surname + ".";
    }
}*/
