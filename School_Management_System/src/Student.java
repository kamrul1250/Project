class Student extends Person
{
    private int studentId;
    private double gpa;

    public Student(String name, int age, int studentId, double gpa)
    {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Gpa: " + gpa);
    }
}