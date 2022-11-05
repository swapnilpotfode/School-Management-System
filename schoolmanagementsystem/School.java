package schoolmanagementsystem;

import java.util.List;

//implementing teachers and student using an ArrayList
public class School 
  {
	private List<Teacher> Teachers;
	private List<Student> Students;
	private static int totalmoneyEarned;
	private static int totalmoneySpent;
	public School(List<Teacher> teachers,List<Student>students) 
	{
	this.Teachers=teachers;
	this.Students=students;
	totalmoneyEarned=0;
	totalmoneySpent=0;
	}
	//returns the list of teacher in the school
	public List<Teacher>getTeachers()
	{	
	return Teachers;
	}
	//add a teacher to school
	public void addTeacher(Teacher teacher) 
	{
	Teachers.add(teacher);	
	}
	//return list of student in the school
public List<Student>getstudents()
{
return Students;
}
//add students to the school
public void addStudent(Student student) 
{
	Students.add(student);
}
//@return total money earned by the  school
public static int gettotalmoneyEarned()
{
	return totalmoneyEarned;
}
//@param moneyspent the money Earned by school
public static void updatetotalmoneyeErned(int MoneyEarned) 
{
	totalmoneyEarned +=MoneyEarned;
}
//@return the total money spent by the school
public int gettotalmoneySpent() 
{
	return totalmoneySpent;
}
//**update the money that is spent by the school which is the salary given by the school to its teachers
public static void updatetotalmoneySpent(int moneyspent)
{
	totalmoneyEarned=moneyspent;
}
}