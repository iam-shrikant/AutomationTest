package Package1;

public class CountC {
	
	static int count;
	
	CountC(){
		count++;
	}
	
	public void printCount() {
		System.out.println("count :"+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(System.getProperty("java.runtime.version"));
		CountC c = new CountC();
		c.printCount();
		CountC c1 = new CountC();
		c1.printCount();
		CountC c2 = new CountC();
		c2.printCount();
	}

}
