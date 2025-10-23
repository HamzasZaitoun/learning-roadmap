import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>  {

    private List<Student> students;

    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    @Override
    public Iterator<Student> iterator() {
        return this.students.iterator();
    }
}
