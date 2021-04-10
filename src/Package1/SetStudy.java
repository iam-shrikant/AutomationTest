package Package1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> a = new HashSet<Integer>();
		
		Integer[] arr1 =  { 1, 3, 2, 4, 8, 9, 0 };
		Integer[] arr2 =  { 1, 3, 7, 5, 4, 0, 7, 5 };
		
        a.addAll(Arrays.asList(arr1));
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(arr2));
        
     // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);
        
	}

}
