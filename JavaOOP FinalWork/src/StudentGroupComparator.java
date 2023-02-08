import java.util.Comparator;

public class StudentGroupComparator implements Comparator <Student> {


        @Override
        public int compare(Student s1, Student s2) {
            if(s1.getLastName().equalsIgnoreCase(s2.getLastName())){
                return s1.getFirstname().compareTo(s2.getFirstname());
            }

            return s1.getLastName().compareTo(s2.getLastName());
        }
}
