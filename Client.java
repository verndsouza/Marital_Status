package Marital;

public class Client {

	public static void main(String[] args) {
		Person p = new Person("Sam","single");
		p.print();
		System.out.println();
		p.changeStatus("widow");
		p.print();
		p.changeStatus("married");
		System.out.println();
		p.print();
		System.out.println();
		p.changeStatus("single");
		p.print();
		System.out.println();
		p.changeStatus("divorced");
		p.print();
		System.out.println();
		p.changeStatus("widow");
		p.print();
		System.out.println();
		p.changeStatus("married");
		p.print();
		System.out.println();
		p.changeStatus("widow");
		p.print();
		System.out.println(); 
		p.changeStatus("married");
		p.print();
	}

}