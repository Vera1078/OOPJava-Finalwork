import java.util.concurrent.atomic.AtomicLong;

public class Student extends User{
    private Long studentID;
    private  static final AtomicLong id = new AtomicLong(0);
    public Student(String firstName, String patronymic, String lastName) {
        super(firstName, patronymic, lastName);
    }


    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }
}