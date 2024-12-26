package nonLinearDataStructure.set.problem;

import nonLinearDataStructure.set.Student;
import java.util.Comparator;

public class SortByGrade implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getGrade(),o1.getGrade());
    }
}
