import java.util.ArrayList;
import java.util.List;

public class Show {
    protected String title; // название спектакля
    protected int duration; // длительность спектакля в минутах
    protected Director director; // режиссер
    protected List<Actor> listOfActors;  // список актеров

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

// Добавление актера
    public void addActor(Actor actor) {
        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
        } else {
            System.out.println("Предупреждение: актёр " + actor + " уже участвует в спектакле.");
        }
    }

// Замена актера
    public void replaceActor(String surname, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(surname)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Предупреждение: актёр с фамилией " + surname + " не найден.");
    }

// Печать актеров
    public void printActors() {
        System.out.println("Список актёров в спектакле \"" + title + "\":");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

// Печать режиссера спектакля
    public void printDirectorInfo() {
        System.out.println("Режиссёр спектакля \"" + title + "\": " + director);
    }
}




/*

public class Show {

    String title; // название спектакля
    int duration; // длительность спектакля
    String director; // режиссер

    Scanner scanner = new Scanner(System.in);

    // Список актеров
    ArrayList<Actor> listOfActors;

    public Show() {
        this.listOfActors = new ArrayList<>(); // инициализация списка
    }
// Добавление актера
    public void addActor() {
        System.out.println("Введите имя актера:");
        String nameActor = scanner.nextLine();
        System.out.println("Введите фамилию актера:");
        String surnameActor = scanner.nextLine();
        System.out.println("Введите рост актера:");
        int heightActor = scanner.nextInt();
        System.out.println("Введите пол актера MALE (мужской) / FEMALE (женский):");

        String genderActor = scanner.next();
        Flow genderA;
        if (genderActor.equals("MALE") || genderActor.equals("FEMALE")) {
            genderA = Flow.valueOf(genderActor);
        } else {
            System.out.println("Некорректный ввод.");
            genderA = Flow.MALE;
        }

            if (isActorExists(nameActor, surnameActor, heightActor)) {
                System.out.println("Актер с такими данными добавлен!");
            } else {
                listOfActors.add(new Actor(nameActor, surnameActor, genderA, heightActor));
        }
    }

// Замена актера
    public void replaceActor() {
        System.out.println("Введите данные актера, которого хотите заменить:");
        System.out.println("Имя актера:");
        String oldNameActor = scanner.nextLine();
        System.out.println("Фамилия актера:");
        String oldSurnameActor = scanner.nextLine();
        System.out.println("Рост актера:");
        int oldHeightActor = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера
        System.out.println("Пол актера - MALE (мужской) / FEMALE (женский):");
        String oldGenderActor = scanner.nextLine();

        Flow genderA;
        if (oldGenderActor.equals("MALE") || oldGenderActor.equals("FEMALE")) {
            genderA = Flow.valueOf(oldGenderActor);
        } else {
            System.out.println("Некорректный ввод.");
            genderA = Flow.MALE;
        }


        if (!isActorExists(oldNameActor, oldSurnameActor, oldHeightActor)) {
            System.out.println("Актер с такими данными отсутствует");
        } else {
            Actor oldActor = new Actor(oldNameActor, oldSurnameActor, genderA, oldHeightActor);
            System.out.println("Введите данные нового актера:");
            System.out.println("Имя актера:");
            String newNameActor = scanner.nextLine();
            System.out.println("Фамилия актера:");
            String newSurnameActor = scanner.nextLine();
            System.out.println("Рост актера:");
            int newHeightActor = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера
            System.out.println("Пол актера - MALE (мужской) / FEMALE (женский):");
            String newGenderActor = scanner.nextLine();

            Flow genderB;
            if (newGenderActor.equals("MALE") || newGenderActor.equals("FEMALE")) {
                genderB = Flow.valueOf(newGenderActor);
            } else {
                System.out.println("Некорректный ввод.");
                genderB = Flow.MALE;
            }

            Actor newActor = new Actor(newNameActor, newSurnameActor, genderB, newHeightActor);

            if (listOfActors.remove(oldActor)) {
                listOfActors.add(newActor);
                System.out.println("Актер заменён.");
            } else {
                System.out.println("Актер не найден.");
            }
        }
    }

// Печать списка актеров
    public void printNameActor() {
        if (listOfActors.isEmpty()) {
            System.out.println("Список актеров пуст.");
        } else {
            for (Actor actor : listOfActors) {
                System.out.println(actor);
            }
        }
    }
// Проверка наличия актера
    public boolean isActorExists(String nameActor, String surnameActor, int heightActor) {
        for (Actor actor : listOfActors) {
            if (actor.getName().equals(nameActor) && actor.getSurname().equals(surnameActor) && actor.getHeight() == heightActor) {
                return true;
            }
        }
        return false;
    }
}
*/