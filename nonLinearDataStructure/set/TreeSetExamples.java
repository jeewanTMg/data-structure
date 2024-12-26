package nonLinearDataStructure.set;


import nonLinearDataStructure.set.problem.SortByGrade;
import nonLinearDataStructure.set.problem.SortingBaseByRollNoAndClass;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExamples {
    public static void main(String[] args) {
        Set<Student> data = new TreeSet(new SortingBaseByRollNoAndClass());
        data.add(new Student("java",4,15));
        data.add(new Student("programming", 7,18));
        data.add(new Student("Language",3,6));

        for(Student std : data) {
            System.out.println(std.toString());
        }

        System.out.println("#############################");
        Set<Student>  data1 = new TreeSet<>(new SortByGrade());
        data1.add(new Student("java",4,15));
        data1.add(new Student("programming", 7,18));
        data1.add(new Student("Language",3,6));

        for(Student std : data1) {
            System.out.println(std.toString());
        }
    }
}
