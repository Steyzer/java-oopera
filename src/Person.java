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
    public String toString() {
        return name + " " + surname;
    }
}


/*public class Person {
    String name; // имя человека
    String surname; // фамилия человека
}*/
