import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
    ArrayList<CollegeClass> classes = new ArrayList<>();
    int numOfClasses = 0;
    String className = "";
    int credits = 0;
    char letterGrade = 'A';

    System.out.print("*********** GPA Calculator *************");
    System.out.print("\nHow many classes would you like to enter: ");
    numOfClasses = Integer.parseInt(s.nextLine());

    for(int i = 0; i < numOfClasses; i++){
      System.out.print("\nEnter the class name: ");
      className = s.nextLine();

      System.out.print("Enter the number of credits: ");
      credits = Integer.parseInt(s.nextLine());

      System.out.print("Enter the Letter Grade: ");
      letterGrade = (s.nextLine()).charAt(0);
    
      CollegeClass colClass = new CollegeClass(className, credits, letterGrade);
      classes.add(colClass);
    }

    s.close();

    Gpa gpa = new Gpa(classes);
    gpa.calculateGpa();

    for (CollegeClass colClass : classes) {
      System.out.println(colClass.toString());
    }

    System.out.print("\n" + gpa.toString());

	}

}
