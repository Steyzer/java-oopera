import java.util.Objects;

public class Director extends Person {
    private int numberOfShows; // количество поставленных спектаклей

    public Director(String name, String surname, String gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    // сравнение режиссёров по имени, фамилии, полу и количеству спектаклей
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Director director = (Director) o;
        return numberOfShows == director.numberOfShows;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfShows);
    }

    // вывод информации о режиссёре
    @Override
    public String toString() {
        return super.toString() + " (" + numberOfShows + " спектаклей)";
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
