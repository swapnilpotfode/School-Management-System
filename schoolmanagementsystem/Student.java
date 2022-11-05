package schoolmanagementsystem;

public class Student {
	private int id;
	private String name;
	private int grade;
	private int feespaid;
	private int feesTotal;
	 
	//to create new student by initialising
	//use of constructor
	
	 public Student(int id, String name,int grade) 
	 {
		 this.feespaid=0;
		 this.feesTotal=30000;
		 this.id=id;
		 this.name=name;
		 this.grade=grade;
		  }
	
	 public void SetGrade(int grade) {
		 this.grade=grade;
	 }
	
	 public void payfees(int fees)
	 {
		 feespaid +=fees;
		 School.gettotalmoneyEarned();
		 }
	 public int getId()
	 {
		 return id;
	 }
	public String getName() 
	{
		return name;
	}
   public int  getGrade()
   {
	   return grade;
   }
   public int getfeesPaid()
   {
	   return feespaid;
   }
	
	public int getfeesTotal()
	{
		return feesTotal;
	}
// return the remaining  fees	
	public int getremainingfees() {
		return feesTotal - feespaid;
	}
	//@override
	public String toString()
	{
		return "student's name:"+name+ "total fees paid so far $" +feespaid;
		}
   }
