package lab4;

public class Student {
	private int rollNo;
	protected char grade;
	public String name;
	
	public void setDetails(int rollNo,char grade,String name) {
		this.rollNo=rollNo;
		this.grade=grade;
		this.name=name;
	}
	public void showDetails() {
		System.out.println("Roll Number: "+rollNo);
		System.out.println("Grade: "+grade);
		System.out.println("Name: "+name);
	}

}
