package recursionTest;

public class Palindrome {
	private String word;
	
	public Palindrome(String word){
		this.word = word;
	}
	
	public void solve(){
		if(isPalindrome(word)){
			System.out.println("It is a palindrome");
		}else{
			System.out.println("It is NOT a palindrome");	
		}
	}
	
	private boolean isPalindrome(String test){
		System.out.println(test);
		if(test.length() == 0 || test.length() ==1 )
			return true;
			
			return test.charAt(0)==test.charAt(test.length()-1) &&
					isPalindrome(test.substring(1, test.length()-1));
	}
	
	public static void main(String[] args) {
		Palindrome pal = new Palindrome("abrakarba");
		pal.solve();
	}

}
