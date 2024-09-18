import java.util.HashMap;
public class CourseService  {
    HashMap<String, Student> students = new HashMap<>();

    HashMap<String, Course> courses = new HashMap<>();


    public CourseService()  {
        students.put( "120120", new Student( "Santiago", "120120" ) );
        students.put( "884545", new Student( "Kate", "884545" ) );
        students.put( "458787", new Student( "Alejandra", "458787" ) );
        students.put( "135464", new Student( "Maria", "135464" ) );
        students.put( "778979", new Student( "Peter", "778979" ) );

        courses.put( "math_01", new Course( "Mathematics 1", "math_01", 8 ) );
        courses.put( "biol_01", new Course( "Biology 1", "biol_01", 8 ) );
        courses.put( "phys_01", new Course( "Physics 1", "phys_01", 8 ) );
        courses.put( "art_01", new Course( "Arts 1", "art_01", 8 ) );
        courses.put( "chem_01", new Course( "Chemistry 1", "chem_01", 8 ) );
        courses.put( "sport_01", new Course( "Sports 1", "sport_01", 8 ) );
    }

    public void enrollStudent(String studentId, String courseId){
        // agrega el curso al estudiante
    	Student student = students.get(studentId);
    	Course course = courses.get(courseId);
    	student.enroll(course);
    }

    public void unEnrollStudent(String studentId, String courseId){
        // quita el curso al estudiante
    	Student student = students.get(studentId);
    	Course course = courses.get(courseId);
    	student.unEnroll(course);
    }

    public void displayCourseInformation(String courseId){
        // muestra el nombre del curso, su id y los creditos
    	Course course = courses.get(courseId);
    	System.out.println(course.toString());
    }

    public void displayStudentInformation(String studentId){
        // muestra el nombre del estudiante, su id y sus cursos a los que esta inscrito
    	Student student = students.get(studentId);
    	System.out.println(student.toString() + 
    			"Total enrolled courses: " + student.totalEnrolledCourses());
    }
}