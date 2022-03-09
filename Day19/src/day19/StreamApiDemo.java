package day19;

import java.util.Arrays;
import java.util.List;

public class StreamApiDemo {
	
	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		/*for(int i=0;i,6;i++) {
		  System.out.println(values.get(i));
		  }
		 */
		
		/*Iterator<Integer> iValues = values.iterator();
		  while(iValues.hasNext()) {
		      System.out.println(iValues.next());
		  }
		 */
		
		/*for(int i: values) {
			System.out.println(i);
			
		}
		*/
		
		/*values.forEach(i-> System.out.println(i));
		values.forEach(new Consumer<Integer>()) {
			System.out.println(i);
		}
	}); */
		
		
		//values.forEach(i-> doubleIt(i));
		values.forEach(StreamApiDemo::doubleIt);
	    }
	
	public static void doubleIt(int i) {
		System.out.println(i*2);
		
	}
}
