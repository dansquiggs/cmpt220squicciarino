package idk;

public class Lab7Problem10_9Test {
	
    public static void main(String[] args) {

    	Lab7Problem10_9 course = new Lab7Problem10_9("Course");

        for (int i = 0; i < 3; i++) {
            course.addStudent("Student " + (i + 1));
        }

        String[] students = course.getStudents();
        
        System.out.println("Number of students: " + course.getNumberOfStudents());
        System.out.println("");
        System.out.println("Dropping student(s) from course:");
        System.out.println("Student 1 dropped.");
        course.dropStudent("Student " + (1));
        System.out.println("");
        System.out.println("Displaying students:");
        for (int i = 0; i < course.getNumberOfStudents(); i++)
            System.out.printf("%-12s ", students[i]);
        
        System.out.println("");
        System.out.println("Number of students: " + course.getNumberOfStudents());
    }
	
}
