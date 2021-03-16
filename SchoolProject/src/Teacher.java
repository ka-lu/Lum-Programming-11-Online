public class Teacher {
    /*Fields of Teacher, each instance
    of a teacher will have its own value
     */
    private String firstName;
    private String lastName;
    private String subject;

    /*Constructor of teacher - used to initialize objects (teacher) and is
     used when a teacher object is created
     */
    Teacher (){
        firstName = "";
        lastName = "";
        subject = "";
    }

    /*Constructor of teacher with parameters
    "this" keyword is referring to the teacher object
     */
    public Teacher (String firstName, String lastName, String subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    //Method returning the name of teacher and subject instead of location in memory
        public String toString(){
            return "Name:" + this.firstName + "," + this.lastName + "  Subject:" + subject;
        }

    /*Getters and setters
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
