package Package1;

public class FoundCharCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Archana";

		for(int i=0; i<name.length();i++){
		int cnt = 0;
		char tempV = name.charAt(i); 

		for(int j=0;j<name.length();j++){
			if(tempV == name.charAt(j)){
				cnt++;
			}
		}

		System.out.println("Nubmer of occurance of "+tempV+" :"+cnt);

		}

	}

}
