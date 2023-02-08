import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class StudentView {

    public void sendOnConsole(List<User> users) {
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (User user : users) {
            log.info(user.toString());
        }
    }

    public void showStudentGroups(List<StudentGroup> studentGroups ){
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (StudentGroup group : studentGroups) {
            log.info(group.toString());
        }
    }

    public void showStudents(List<Student> students ){
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (Student group : students) {
            log.info(group.toString());
        }
    }

    public void showStudentsInGroup( List<StudentGroup> studentGroupList){
        //Logger log = Logger.getLogger(StudentView.class.getName());
        Logger log = Logger.getAnonymousLogger();
        for (StudentGroup groups : studentGroupList) {
//            log.info("Id: " + groups.toString());
            System.out.println("Группа №: " + groups.getIdStudentGroup());
            List <Student> studentsList = groups.getStudentsList();
            studentsList.sort(new StudentGroupComparator());
            for (Student student:studentsList){
                System.out.println(student);
//                System.out.println(student.getStudentID());
            };
        }

    }

}

