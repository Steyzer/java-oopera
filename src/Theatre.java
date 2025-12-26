public class Theatre {
    public static void main(String[] args) {
        // Создаём актёров
        Actor actor1 = new Actor("Илья", "Пупкин", "М", 175);
        Actor actor2 = new Actor("Антонина", "Копчик", "Ж", 161);
        Actor actor3 = new Actor("Олимпия", "Пикчерс", "Ж", 160);

        // Создаём режиссёров
        Director director1 = new Director("Акакий", "Смирнов", "М", 12);
        Director director2 = new Director("Инесса", "Кузнецова", "Ж", 11);

        // Создаём автора музыки и хореографа
        String musicAuthor = "Лихой";
        String choreographer = "Бакланчик";

        // Создаём спектакли
        Show regularShow = new Show("Обычный спектакль, ничего примечательного", 60, director1);
        Opera opera = new Opera("Оперный спектакль, и такое бывает...", 90, director2, musicAuthor, "Либретто оперного спектакля.", 30);
        Ballet ballet = new Ballet("Оперный балет, мы тоже любим креативить :)", 120, director1, musicAuthor, "Либретто оперного балета", choreographer);

        // Распределяем актёров по спектаклям
        regularShow.addActor(actor1);
        regularShow.addActor(actor2);
        opera.addActor(actor2);
        opera.addActor(actor3);
        ballet.addActor(actor1);
        ballet.addActor(actor3);

        // Выводим списки актёров
        regularShow.printActors();
        opera.printActors();
        ballet.printActors();

        // Заменяем актёра
        regularShow.replaceActor("Иванов", actor3);
        regularShow.printActors();

        // Пробуем заменить несуществующего актёра
        regularShow.replaceActor("Неизвестный", actor1);

        // Выводим либретто
        opera.printLibretto();
        ballet.printLibretto();
    }
}


/*import java.util.Scanner;

public class Theatre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Поехали!");
        MusicalShow musicalShow = new MusicalShow("Пётр Андреев", "Полевых цветов веночек, в утренней росе цветок...");

        Director director = new Director("Иван", "Кузнецов");

        Show show = new Show();

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                musicalShow.printLibretto();
            } else if (command == 2) {
                System.out.println(director);
            } else if (command == 3) {
                show.printNameActor();
            } else if (command == 4) {
                show.addActor();
            } else if (command == 5) {
                show.replaceActor();
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }

    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Распечатать текст либретто");
        System.out.println("2 - Режиссер спектакля");
        System.out.println("3 - Список актеров");
        System.out.println("4 - Добавить актера");
        System.out.println("5 - Заменить актера");
        System.out.println("0 - Выход");
    }
}*/
