

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService {
    private final List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    @Override
    public void createUser(String firstName, String patronymic, String lastName) {
        this.users.add(new Student(firstName, patronymic, lastName));
    }


    public Teacher createUser(String firstName, String patronymic, String lastName, Long Id) {
        return new Teacher(firstName, patronymic, lastName, Id);
    }

    public void clearAll(){
        this.users.clear();

    }


    @Override
    public List<User> getAll() {
        return this.users;
    }

    @Override
    public void deleteUser(Long id) {
        for (User user : this.users) {
            if (user instanceof Student) {
                if (id.equals(((Student) user).getStudentID())) {
                    this.users.remove(user);
                }
            }
        }
    }

    public List<Student> getAllStudents(){
        List <Student> listStudents = new ArrayList<>();
        for (User user:this.getAll()
        ) {
            if(user instanceof Student){
                listStudents.add((Student) user);

            }

        }

        return listStudents;
    }

}