package Package1;

import java.util.ArrayList;

public class JavaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
        ArrayList<Integer> tempArr = new ArrayList<Integer>();
        
        int[] a = {1,4,8,15,17};
        int[] b=  {3,5,8,18,15};
        
        for(int i = 0;i<a.length;i++) {
        	if(a[i] == b[i]) {
        		tempArr.add(a[i]);        	        	
        	}
        }
        
        //System.out.println(tempArr.toArray());
        Object[] c = tempArr.toArray();
        for(Object t : c) {
        	System.out.println(t);
        }
	}

}
