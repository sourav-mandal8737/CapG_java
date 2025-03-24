package Composition;

public class Car {
	String name;
	Engine e;
	public Car(String name,String type) {
		this.name=name;
		this.e=new Engine(type);
	}
	public void display() {
		System.out.println(name+" "+e.type);
	}

}



perform agggregation in same way fro bank and customer u have to pass name of the bank and name of the customer