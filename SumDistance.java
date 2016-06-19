import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 */

/**
 * @author Aleena
 *
 */
public class SumDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,-3};
		
		SumDistance temp = new SumDistance();
		int result = temp.solution(a);
		System.out.println(result);

	}
	
	public int solution(int[] a) {
		
		int i,j;
		int sum=0;
		int result;
		ArrayList<Integer> sums = new ArrayList();
		for (i=0; i<a.length; i++) {
			for(j=0; j<a.length; j++) {
				sum = a[i] + a[j] + (j-i);
				sums.add(sum);
				sum=0;
			}
		}
		
		result = Collections.max(sums);
		//System.out.println(result);
		//System.out.println(sums);
		return result;
		
		
	}

}
