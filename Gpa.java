import java.text.DecimalFormat;
import java.util.ArrayList;

class Gpa {
  double gpa;
  DecimalFormat df = new DecimalFormat("#0.00");
  ArrayList<CollegeClass> classes;

  Gpa (ArrayList<CollegeClass> classes){
    this.classes = classes;
  }

  public double calculateGpa () {
     int num = 0;
     int denom = 0;
     
     for(CollegeClass colClass : classes){
       int letterNumber = handleLetterGrades(colClass.getLetterGrade());
       num += (letterNumber * colClass.getCreditHours());
       denom += colClass.getCreditHours();
     }

     gpa = (double)(num/denom);
     return gpa;		
  }

  private int handleLetterGrades(char letterGrade) {
    int number = 0;

   		
		if (letterGrade == 'A' || letterGrade =='a'){
		  number = 4;
		}
		else if (letterGrade== 'B' || letterGrade== 'b'){
			number = 3;
		}
		else if (letterGrade== 'C' || letterGrade== 'c'){
			number = 2;
		}
		else if (letterGrade=='D' || letterGrade=='d') {

			number = 1;
		}
		else if (letterGrade =='F' || letterGrade == 'f'){		
			number = 0;
	}
    return number;
  }

  public void setGpa (double gpa) {
    this.gpa = gpa;
  }

  public double getGpa () {
    return gpa;
  }

  public String toString() {
    return "\nFinal GPA: " + df.format(gpa);
  }
}