import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 */

/**
 * @author Aleena
 *
 */
public class UniqueSubString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="aaaa bbbb cccc def fffffffffffffffff ghijklmnopqrst";
		String lower = str.toLowerCase();
		System.out.println(lower);
		UniqueSubString us = new UniqueSubString();
		int result = us.solution(lower);
		System.out.println(result);
		
	}
	
	public int solution (String str) {
		StringBuilder temp = new StringBuilder();
		int unique=0, maximumLength;
		int indexFirst, indexNext=0, indexLast=0;;
		int i=0,k=0;
		int result=0;
		ArrayList<Integer> uniqueList = new ArrayList();
		indexFirst = str.indexOf(' ');
		indexNext=str.indexOf(' ', indexFirst+1);
		indexLast=str.lastIndexOf(' ');
		//System.out.println(indexFirst);
		
		//System.out.println(indexLast);
		try {
			temp.append(str.substring(i, indexFirst));
			System.out.println(temp);
			while(i<indexFirst) {
				for(int j=i+1; j<indexFirst; j++) {
					if(str.charAt(i) == str.charAt(j)) {
						unique++;
					}
				}
				i++;
			}
			unique = temp.length() - unique;
			uniqueList.add(unique);
			unique=0;
			temp.delete(0, temp.length());
			
			while(indexFirst<indexLast) {
				temp.append(str.substring(indexFirst+1, indexNext));
				System.out.println(temp);
				k=0;
				//System.out.println(k);
				//System.out.println(temp.length());
				while(k<(temp.length()-1)) {
					for(int j=k+1; j<temp.length(); j++) {
						if(temp.charAt(k) == temp.charAt(j)) {
							unique++;
						}
					}
					k++;
				}
				unique = temp.length() - unique;
				uniqueList.add(unique);
				unique=0;
				temp.delete(0, temp.length());
				indexFirst=indexNext;
				//System.out.println(indexFirst);
				if(indexNext != indexLast)
					indexNext = str.indexOf(' ', indexNext+1);
				//System.out.println(indexNext);
				
			}
		
			/*indexFirst=indexNext;
			System.out.println(indexFirst);
			indexNext = str.indexOf(' ', indexNext+1);
			System.out.println(indexNext);*/
			unique=0;
			temp.delete(0, temp.length());
			
			temp.append(str.substring(indexLast+1, str.length()));
			System.out.println(temp);
			while(indexLast<( str.length()-1) ) {
				for(int j=indexLast+1; j<(str.length()); j++) {
					if(str.charAt(indexLast) == str.charAt(j)) {
						unique++;
					}
				}
				indexLast++;
			}
			unique = temp.length() - unique;
			uniqueList.add(unique);
			unique=0;
			temp.delete(0, temp.length());
			//System.out.println(unique);
			System.out.println(uniqueList);
			result = Collections.max(uniqueList);
		} catch(Exception e) {e.printStackTrace();}
		return result;
	}

}
