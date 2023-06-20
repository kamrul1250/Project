import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        try {
            School school = new School();

            Scanner input_1 = new Scanner(System.in);
            System.out.println("Enter the student name :");
            String name_1 = input_1.nextLine();
            System.out.println("Enter the student age :");
            int age_1 = input_1.nextInt();
            System.out.println("Enter the student studentId :");
            int studentId_1 = input_1.nextInt();
            System.out.println("Enter the student gpa :");
            double gpa_1 = input_1.nextDouble();

        Scanner input_2=new Scanner(System.in);
        System.out.println("Enter the student name :");
        String name_2=input_2.nextLine();
        System.out.println("Enter the student age :");
        int age_2=input_2.nextInt();
        System.out.println("Enter the student studentId :");
        int studentId_2=input_2.nextInt();
        System.out.println("Enter the student gpa :");
        double gpa_2=input_2.nextDouble();

        Scanner input_3=new Scanner(System.in);
        System.out.println("Enter the student name :");
        String name_3=input_3.nextLine();
        System.out.println("Enter the student age :");
        int age_3=input_3.nextInt();
        System.out.println("Enter the student studentId :");
        int studentId_3=input_3.nextInt();
        System.out.println("Enter the student gpa :");
        double gpa_3=input_3.nextDouble();


        Scanner input_4=new Scanner(System.in);
        System.out.println("Enter the teacher name :");
        String name_4=input_4.nextLine();
        System.out.println("Enter the teacher age :");
        int age_4=input_4.nextInt();
        System.out.println("Enter the teacherId  :");
        int teacherId_1=input_4.nextInt();
        System.out.println("Enter the subject name  :");
        String subject_1=input_4.nextLine();
        input_4.nextLine();

        Scanner input_5=new Scanner(System.in);
        System.out.println("Enter the teacher name :");
        String name_5=input_5.nextLine();
        System.out.println("Enter the teacher age :");
        int age_5=input_5.nextInt();
        System.out.println("Enter the  teacherId :");
        int teacherId_2=input_5.nextInt();
        System.out.println("Enter the subject name :");
        String subject_2=input_5.nextLine();
        input_5.nextLine();


        Student student1 = new Student(name_1,age_1,studentId_1,gpa_1);
       Student student2 = new Student(name_2,age_2,studentId_2,gpa_2);
        Student student3 = new Student(name_3,age_3,studentId_3,gpa_3);

   Teacher teacher1 = new Teacher(name_4,age_4,teacherId_1,subject_1);
        Teacher teacher2 = new Teacher(name_5,age_5,teacherId_2,subject_2);


            school.admitStudent(student1);
  school.admitStudent(student2);
        school.admitStudent(student3);



       school.assignTeacher(teacher1);
        school.assignTeacher(teacher2);



            school.displayStudents();
            school.displayTeacher();

             school.expelStudent(student2);

            school.displayStudents();
            Display display=new Result(name_1,age_1,studentId_1,gpa_1);
            display.displayResult();

        }catch (RuntimeException e)
        {
            System.out.println("Wrong input");
        }finally {
            System.out.println("Try again");
        }

    }
}
