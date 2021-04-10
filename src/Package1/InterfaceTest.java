package Package1;

interface ParentInterface{
	int a = 10;
}

public class InterfaceTest implements ParentInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentInterface.a = 20;
		System.out.println(ParentInterface.a);
	}

}
