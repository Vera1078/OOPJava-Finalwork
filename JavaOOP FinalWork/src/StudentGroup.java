import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class StudentGroup {

    private Teacher teacher;
    private List<Student> studentsList;
    private  static final AtomicLong studentGroupID = new AtomicLong(0);
    private final Long idStudentGroup;

    public StudentGroup(Teacher teacher, List<Student> studentsList) {
        this.teacher = teacher;
        this.studentsList = studentsList;
        this.idStudentGroup = studentGroupID.incrementAndGet();
    }


    public Long getIdStudentGroup() {
        return idStudentGroup;
    }
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "teacher=" + teacher +
                ", studentsList=" + studentsList +
                ", idStudentGroup=" + idStudentGroup +
                '}';
    }
}
