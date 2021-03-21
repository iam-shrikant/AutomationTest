package Package1;


class Parent{
	String name;
	public void method() {
		System.out.println("Inside Parent Class");
	}
}

class Child extends Parent{
	int id;
	
	public void method() {
		System.out.println("Inside Child class");
	}
	
	public void method2() {
		System.out.println("another child method");
	}
}


public class TypeCastingInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		//Child c2 = (Child) new Parent();
		
		Parent p = new Child();
		
		p.name="Parent Name";
		System.out.println("Name "+p.name);
		p.method();
		
		Child c2 = (Child) p;
		
		c.name = "Shrikant";
		c.id = 4;
		System.out.println("Name "+c.name+" Id: "+c.id);
		c.method();
		c.method2();
		
		
		
		
	}

}
