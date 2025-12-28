import java.util.Objects;

public class Person {
    protected String name; // имя человека
    protected String surname; // фамилия человека
    protected String gender; // пол человека

    public Person(String name, String surname, String gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender);
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}


/*public class Person {
    String name; // имя человека
    String surname; // фамилия человека
}*/
