import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Controller {


    private final UserService userService = new UserService();

    private final StudentView studentView = new StudentView();

    private final StudentGroupService studentGroupService = new StudentGroupService();

    private List<Student> studentsList;

    public void createUser(String firstName, String patronymic, String lastName) {
        userService.createUser(firstName, patronymic, lastName);

    }

    public Teacher createTeacher(String firstName, String lastName, String patronymic, Long teacherId) {
        return userService.createUser(firstName, patronymic, lastName, teacherId);

    }

    public void showAllStudents() {
        List<User> students = userService.getAll();
        studentView.sendOnConsole(students);
    }

    public List<Student> getOnlyStudents() {
        return userService.getAllStudents();
    }

    public void showTeacherInfo(Teacher teacher) {
        List<User> teachers = new ArrayList<>();
        teachers.add(teacher);
        studentView.sendOnConsole(teachers);
    }

    public void showStudyGroups() {
        studentView.showStudentGroups(this.studentGroupService.getStudentGroupList());
    }

    public void showSortStudyGroup(List<Student> studentsList) {
        Collections.sort(studentsList, new StudentGroupComparator());
        studentView.showStudents(studentsList);
    }


    public void createTimetable(Teacher teacher, List<Student> studentList) {
        this.studentGroupService.completeStudentGroup(teacher, studentList);
    }


    public void showStudentsInGroups() {
        this.studentView.showStudentsInGroup(this.studentGroupService.getStudentGroupList());

    }

}