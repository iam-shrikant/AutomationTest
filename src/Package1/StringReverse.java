package Package1;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I love mumbai";
		
		String[] s2 = s.split(" ");
		String reverStatement = "";
		for(int i =0; i<s2.length;i++) {
			
			String word = s2[i];
			System.out.println(word.length());
			
			for(int j = word.length()-1; j >= 0; j--) {
				reverStatement = reverStatement + word.charAt(j);
			}						
			reverStatement = reverStatement + " ";
		}
		System.out.println(reverStatement);
	}

}
