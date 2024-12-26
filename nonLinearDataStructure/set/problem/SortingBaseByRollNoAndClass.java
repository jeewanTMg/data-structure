package nonLinearDataStructure.set.problem;

import nonLinearDataStructure.set.Student;

import java.util.Comparator;

public class SortingBaseByRollNoAndClass implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
         return Integer.compare(s1.getRollNo(), s2.getRollNo());
    }

}
