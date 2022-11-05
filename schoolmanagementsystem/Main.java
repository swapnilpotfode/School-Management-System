package schoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

public class Main {

	public static void main(String[] args)
	{

Teacher aarti=new Teacher(1, "aarti", 50000);
Teacher swapnali=new Teacher(2,"swapnali",60000);
Teacher priya=new Teacher(3,"priya",70000);

List<Teacher>teacherList=new ArrayList<>();
teacherList.add(aarti);
teacherList.add(swapnali);
teacherList.add(priya);

Student vaishanavi=new Student(11,"vaishanavi",4);
Student komal=new Student (12,"komal",2);
Student monika=new Student(13,"monika",3);

List<Student>StudentList=new ArrayList<>();
StudentList.add(vaishanavi);
StudentList.add(komal);
StudentList.add(monika);
 
School ghs=new School(teacherList,StudentList);
System.out.println("ghs has earned  $ "+ghs.gettotalmoneyEarned());
vaishanavi.payfees(5000);
komal.payfees(6000);
vaishanavi.payfees(7000);
System.out.println("ghs has earned  $ "+ghs.gettotalmoneyEarned());

System.out.println("----------Making school pay salary--------");
      aarti.receiveSalary(aarti.getSalary());
System.out.println("ghs has spent for salary to"+aarti.getName()+
		"and now has $"+ghs.gettotalmoneyEarned());
swapnali.receiveSalary(swapnali.getSalary());
    System.out.println("ghs has spent for salary to"+swapnali.getName()
	+ "and now has $"+ghs.gettotalmoneyEarned());
System.out.println(komal);
System.out.println(vaishanavi);
	priya.receiveSalary(priya.getSalary());
	System.out.println(priya);
	}
	}


