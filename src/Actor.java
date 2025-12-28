import java.util.Objects;

public class Actor extends Person {
    private int height; // рост актера

    public Actor(String name, String surname, String gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    // геттер для получения роста
    public int getHeight() {
        return height;
    }

    // сравнение актеров
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false; // Вызов метода equals из базового класса
        Actor actor = (Actor) o;
        return height == actor.height; // Добавляем сравнение по росту
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }


    @Override
    public String toString() {
        return super.toString() + " (" + height + " см)";
    }
}



/*
import java.util.Objects;

public class Actor extends Person {

    int height; // рост актера
    Flow gender; // пол актера
    public Actor (String name, String surname, Flow gender, int height) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.height = height;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Flow getGender() {
        return gender;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return height == actor.height &&
                Objects.equals(name, actor.name) &&
                Objects.equals(surname, actor.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }

    @Override //
    public String toString() {
        return "Актер: " + name + " " + surname + " (" + height + " см)."; // просто возвращаем поля класса
    }

}
*/