import java.util.ArrayList;
import java.util.List;
class School implements Management {
    private List<Student> students;
    private Teacher teacher;

    public School() {
        students = new ArrayList<>();
    }

    @Override
    public void admitStudent(Student student) {
        students.add(student);
        System.out.println("Student " + student.getName() + " admitted successfully.");
    }

    @Override
    public void expelStudent(Student student) {
        if (students.remove(student)) {
            System.out.println("Student " + student.getName() + " expelled successfully.");
        } else {
            System.out.println("Student " + student.getName() + " not found.");
        }
    }

    @Override
    public void assignTeacher(Teacher teacher) {
        if (this.teacher == null) {
            this.teacher = teacher;
            System.out.println("Teacher " + teacher.getName() + " assigned successfully.");
        } else {
            System.out.println("Teacher already assigned.");
        }
    }

    public void displayStudents() {
        for (Student student : students) {
            student.displayInfo();
            System.out.println("---------------------");
        }
    }

    public void displayTeacher() {
        if (teacher != null) {
            teacher.displayInfo();
        } else {
            System.out.println("No teacher assigned yet.");
        }
    }
}