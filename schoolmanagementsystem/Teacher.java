package schoolmanagementsystem;

public class Teacher {
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	public Teacher(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.salaryEarned=0;
	}
	
	//return the id of teacher
	
	public int getId()
	{
	
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getSalary()
	{
		return salary;
	}
	
	public void setSalary(int salary) 
	{
	this.salary=salary;	
	}
//add to salary
	//remove from the total money earn by school
  public void receiveSalary(int Salary )
  {
  salaryEarned +=Salary;
School.updatetotalmoneySpent(salary);
}
//@override
public String tostring()
{
	return "name of the teacher:"+name+ "total salary earned so far $"+salaryEarned;
}
}