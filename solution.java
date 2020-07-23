import java.util.*;

class Program {
  public static String longestPalindromicSubstring(String str) {
    // Write your code here.
		String longest = "";
		for (int i = 0 ; i < str.length() ; i++)
			for(int j = i ; j < str.length() ; j++){
				String substring = str.substring(i , j+1);
				if (longest.length() < substring.length() && isPalindrom(substring)){
						longest = substring;
				}
				
			}
		
    return longest;
  }
	
	
	public static boolean isPalindrom(String str){
		int left= 0;
		int right = str.length() - 1;
		while (left < right){
			if(str.charAt(left) != str.charAt(right)){
				return false;
			}
			left++;
			right--;
		}		
		return true;
	}
}
