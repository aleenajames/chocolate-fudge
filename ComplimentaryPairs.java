import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 */

/**
 * @author Aleena
 *
 */
public class ComplimentaryPairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,8,-3,0,1,3,-2,4,5};
		int k=6;
		
		ComplimentaryPairs temp = new ComplimentaryPairs();
		int result = temp.solution(k,a);
		System.out.println("The Result is " + result);

	}
	
	public int solution(int k, int[] a) {
		
		int i,j;
		int sum=0, count=0;
		int result;
		ArrayList<Integer> sums = new ArrayList();
		for (i=0; i<a.length; i++) {
			for(j=0; j<a.length; j++) {
				sum = a[i] + a[j];
				if(sum == k)
					count++;
				sum=0;
			}
		}
		
		//result = Collections.max(sums);
		//System.out.println(result);
		//System.out.println(sums);
		return count;
		
		
	}

}
