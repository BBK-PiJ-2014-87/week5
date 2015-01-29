package recursionTest;

public class Test {
	private int n;
	
	public Test(int n){
		this.n = n;
	}
	
	public void solve(){
		if(checkIfPalindrome(n)){
			System.out.println("TRUE");
		}else{
			System.out.println("FLASE");	
		}
	}
	
	private boolean checkIfPalindrome(int n1){
		
//		if(n1 ==1 )
//			return true;
			
		return n1 != 1;
		
	}
	
	public static void main(String[] args) {
		Test pal = new Test(1);
		pal.solve();
	}

}
