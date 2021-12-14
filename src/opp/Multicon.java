package opp;
class Employ{
	private int variable;
	public Employ() {
		this.variable=10;
	}
	public Employ(int num) {
		this.variable=num;
			}
	public int getValue() {
		return variable;
	}
}
class Student{
	String branch;
	int Usn;
	String semester;
	int age;
	String Sname;
	int rollno;
	String section;
	
	
Student(String branch,int Usn,String semester,int age,String Sname,int rollno,String section);
this.branch=branch;
this.Usnn=Usn;
this.semester=semester;
this.age=age;
this.Sname=Sname;
this.roolno=rollno;
this.section=section;

	
}
void display() {
	System.out.println("branch :" + branch + "Usn :" + Usn + "semester :" + semster + "age :" + age + "sname :" + Sname + "rollno :" + rollno + "section :" + section  );
}

public class Multicon {
    public static void main(String[] args) {
		/*Employ obj=new Employ();
		Employ obj=new Employ(100);
		System.out.println(Employ);*/
Student sobj=new Student("CSE","4ddgsdg","7","23","sachin","5847","c");
sobj.display();
}

}
