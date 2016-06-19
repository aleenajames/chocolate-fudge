import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 */

/**
 * @author Aleena
 *
 */
public class BinaryGap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N=567456;
		BinaryGap bg = new BinaryGap();
		int result = bg.solution(N);
		System.out.println(result);

	}
	
	public int solution(int N) {
		
		String binary = Integer.toBinaryString(N);
		System.out.println(binary);
		int first=0,temp=0, last=0;
		int maxBinaryGap=0;
		ArrayList<Integer> indexes = new ArrayList();
		ArrayList<Integer> binaryGap = new ArrayList();
		
		try {
			first = binary.indexOf("1");
			last=binary.lastIndexOf("1");
			int i=first;
			while(i < last) {
				indexes.add(binary.indexOf("1", i));
				temp = binary.indexOf("1", i);
				i = temp+1;
			}
			//System.out.println(indexes);
			
			for(int k=1; k<indexes.size(); k++) {
				binaryGap.add(indexes.get(k) - indexes.get(k-1) - 1);
			}
			//System.out.println(binaryGap);
			
			maxBinaryGap = Collections.max(binaryGap);
		}catch(Exception e){System.out.println("Exception Occured!");}
		
		return maxBinaryGap;
		
	}

}
