public class Student {
    /*Fields of a Student, each instance
    *of a student  will have its own value
    *Static field (student number), a variable held by
    *all variables of type student
     */

  private String firstName;
  private String lastName;
  private int grade;
  static int studentNumber =1;
  private int idNum;


   /*Constructor of student - used to initialize objects (student) and is
     used when a student object is created
     */
    Student (){
        firstName = "";
        lastName = "";
        grade = getGrade();
        idNum = studentNumber;
        studentNumber++;
    }

    /*Constructor of student with parameters
     "this" keyword is referring to the student object
      */
   public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.idNum = studentNumber;
        studentNumber++;
    }

    //Method returning the name of student and grade instead of location in memory
    public String toString(){
        return "Name:" + this.firstName + "," + this.lastName + "  Grade:" + this.grade;
    }

    /*getters and setters
    Allows private variables to be public and used in other classes
     */
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public int getIdNum() {
        return idNum;
    }
    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }
    public static int getStudentNumber() {
        return studentNumber;
    }
    public static void setStudentNumber(int studentNumber) {
        Student.studentNumber = studentNumber;
    }
}