
// Take 5 students objects in an array and filter out only those students who got grade "A"


package First.Java;

public class Student {

	   private String sname;
       private int rollNo;
       private char grade;

   public Student(String sname, int rollNo, char grade) {
       this.sname = sname;
       this.rollNo = rollNo;
       this.grade = grade;
   }

   public String getSname() {
       return sname;
   }

   public void setSname(String sname) {
       this.sname = sname;
   }

   public int getRollNo() {
       return rollNo;
   }

   public void setRollNo(int rollNo) {
       this.rollNo = rollNo;
   }

   public char getGrade() {
       return grade;
   }

   public void setGrade(char grade) {
       this.grade = grade;
   }

   @Override
   public String toString() {
       return "Student{" +
               "sname='" + sname + '\'' +
               ", rollNo=" + rollNo +
               ", grade=" + grade +
               '}';
   }
	

}
