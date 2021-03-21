package Package1;

public class TestingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "shrikanta";		
		//String[] vov = {"a","i","e","o","u"};
		int countOfA = 0;
		int countOfI = 0;
		int countOfE = 0;
		int countOfO = 0;
		int countOfu = 0;
		
		for(int i=0; i<name.length();i++) {
			if(name.charAt(i) == 'a') {
				countOfA++;
			}else if(name.charAt(i) == 'i') {
				countOfI++;
			}else if(name.charAt(i) == 'e') {
				countOfE++;
			}else if(name.charAt(i) == 'o') {
				countOfO++;
			}else if(name.charAt(i) == 'u') {
				countOfu++;
			}
		}
		
		System.out.println("Count of a in string "+countOfA);
		System.out.println("Count of i in string "+countOfI);
		System.out.println("Count of e in string "+countOfE);
		System.out.println("Count of o in string "+countOfO);
		System.out.println("Count of u in string "+countOfu);
	} 
}
