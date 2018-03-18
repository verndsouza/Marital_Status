package Marital;

public class Person {
	
	MaritalState ms;
	String name;

	Person(String n, String m)
	{
		this.name = n;
		this.ms = new MaritalState(m);
	}
	
	public void changeStatus(String c)
	{
		this.ms.changeState(c);
	}
	
	public void print()
	{
		System.out.println("Name: "+name + " Status: "+ms.getState());
	}
}