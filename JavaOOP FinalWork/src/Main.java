import java.util.ArrayList;
import java.util.Arrays;



public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.createTimetable(controller.createTeacher("Ян", "Амос", "Коменский", 99L),
                new ArrayList<>(
                        Arrays.asList(
                                new Student("Александр", "Сергеевич", "Пушкин"),
                                new Student("Антон", "Павлович", "Чехов"),
                                new Student("Лев", "Николаевич", "Толстой")

                        )
                ));

        controller.createTimetable(controller.createTeacher("Иоганн", "Генрих", "Песталоцци", 89L)
                , new ArrayList<>(
                        Arrays.asList(
                                new Student("Юрий", "Алексеевич", "Гагарин"),
                                new Student("Алексей", "Архтпович", "Леонов"),
                                new Student("Герман", "Степанович", "Титов")

                        )
                ));

        controller.showStudentsInGroups();


    }
}
