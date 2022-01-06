
public class CollegeClass {
  
  String className;
  int creditHours;
  char letterGrade;

  CollegeClass(String className, int creditHours, char letterGrade) {
    this.className = className;
    this.creditHours = creditHours;
    this.letterGrade = letterGrade;
  }

  public void setClassName(String className){
   this.className = className;
  }

  public String getClassName() {
    return className;
  }

 public void setCreditHours(int creditHours){
   this.creditHours = creditHours;
 }

  public int getCreditHours(){
    return creditHours;
  }

  public void setLetterGrade(char letterGrade){
    this.letterGrade = letterGrade;
  }

  public char getLetterGrade(){
    return letterGrade;
  }

  public String toString() {
    return "\n" + this.className + "\nCredit Hours: " + this.creditHours + "\nLetter Grade: " + this.letterGrade;
  }
}