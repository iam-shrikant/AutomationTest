package Package1;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "Hi234Hello243How231Are213You222";
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(x);
		int highestNumber = 0;
        while(m.find()) {
        	int number = Integer.parseInt(m.group());
        	
        	if( number > highestNumber) {
        		highestNumber = number;
        	}            
        }
        System.out.println(highestNumber);
	}
}
