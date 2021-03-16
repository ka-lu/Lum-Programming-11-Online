import java.util.ArrayList;

public class School {
/*Fields (variables within classes) of a School, each instance
of a School will have its own value
 */
    private ArrayList <Student> Student;
    private ArrayList <Teacher> Teacher;
    private ArrayList Course;
    private String name;
    private int popDensity;
    private String principal;


/* Static fields are variables that are held by
*all variables of type School with same value
*
*Each arraylist will hold either courses, teachers, or students
 */
    static ArrayList<String> courses = new ArrayList<String>();
    static ArrayList<Teacher> teachers = new ArrayList<>();
    static ArrayList<Student> students = new ArrayList<>();


     //adding courses to courses arraylist
     static{
         courses.add("Math");
         courses.add("Physics");
         courses.add("Chemistry");
     }

    /*Constructor - initializes objects (school) and is
     used when an object of school class is created
     */

    School() {
        name = "";
        popDensity = 1000;
        principal = "";
        Student = students;
        Teacher = teachers;
        Course = courses;
    }

    /*Constructor with parameters
    "this" keyword is used and refers to the School object
    */
     School(String name, int popDensity, String principal) {
        this.name = "";
        this.popDensity = 1000;
        this.principal = "";
        this.Student = students;
        this.Teacher = teachers;
        this.Course = courses;

    }

    //Method adding a student to the students arraylist
    public static void addStudent(){
    if (students.size() == 0){
    students.add(new Student( "John" , "Lee", 8 ));
    }
        else if (students.size() == 1){
             students.add(new Student("Josh","Dixon", 12));
         }

      else  if (students.size() == 2){
            students.add(new Student("Jane","Hanlon", 10));
        }

    else if (students.size() == 3){
            students.add(new Student("Jerry","Wong", 8));
        }
    else  if (students.size() == 4){
            students.add(new Student("Jake","Robertson", 8));
        }
    else  if (students.size() == 5){
            students.add(new Student("Joe","Smith", 9));
        }
    else  if (students.size() == 6){
            students.add(new Student("June","lennon", 12));
        }
    else   if (students.size() == 7){
            students.add(new Student("Jenet","Feng", 11));
        }
    else   if (students.size() == 8){
            students.add(new Student("Jenelope","Fong", 8));
        }
    else  if (students.size() == 9){
            students.add(new Student("Jasper","Sharma", 9));
        }
    }

    //Method printing all students in the students arraylist
    public static void printStudents (){
        for (int i= 0; i < students.size(); i ++){
            System.out.println(students.get(i));
        }
    }

    //Method removing the last student in the students arraylist
    public static void removeStudent (){
        students.remove(students.size()-1);
    }

    //Method adding a teacher to the teachers arraylist
    public static void addTeacher (){
      if (teachers.size() == 0){
          teachers.add(new Teacher("Joan", "Jung", "Math"));
      }
      else  if (teachers.size() == 1){
            teachers.add(new Teacher("Julie", "Tam", "Physics"));
        }
       else if (teachers.size() == 2){
            teachers.add(new Teacher("Julia", "Richardson", "Chemistry"));
        }

    }

    //Method printing all teachers in teachers arraylist
    static public void printTeachers (){

        for (int i= 0; i < teachers.size(); i ++){
            System.out.println(teachers.get(i));
        }

    }

    //Method removing last teacher in the teachers arraylist
    public static void removeTeacher (){
        teachers.remove(teachers.size()-1);
    }


    /*getters and setters
    Allow private variables to be public and used in other classes
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopDensity() {
        return popDensity;
    }

    public void setPopDensity(int popDensity) {
        this.popDensity = popDensity;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }



    public ArrayList getStudent() {
        return Student;
    }


    public ArrayList getTeacher() {
        return Teacher;
    }


    public ArrayList getCourse() {

        return Course;
    }

    public void setCourse(ArrayList course) {
        Course = course;
    }

    public void setStudent(ArrayList<Student> student) {
        Student = student;
    }

    public void setTeacher(ArrayList<Teacher> teacher) {
        Teacher = teacher;
    }

    public void getTeacher (ArrayList<Teacher> teacher){
        Teacher = teacher;
    }
}