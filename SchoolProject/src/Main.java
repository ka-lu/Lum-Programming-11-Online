//Extends allows methods and variables from School Class to be used in Main Class
public class Main extends School {

    public static void main(String[] args) {
        //Methods
        addStudent();
        addStudent();
        addStudent();
        addStudent();
        addStudent();
        addStudent();
        addStudent();
        addStudent();
        addStudent();
        addStudent();
        addTeacher();
        addTeacher();
        addTeacher();
        printStudents();
        System.out.println("\n");
        printTeachers();
        System.out.println("\n");
        removeStudent();
        removeStudent();
        removeTeacher();
        printStudents();
        System.out.println("\n");
        printTeachers();
    }
}