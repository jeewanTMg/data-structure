package nonLinearDataStructure.set;

public class Student {
    String name;
    int rollNo;
    int grade;

    Student(String name, int rollNo, int grade) {
        this.name=name;
        this.rollNo = rollNo;
        this.grade =grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", grade=" + grade +
                '}';
    }
}
