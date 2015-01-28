package recursionTest;
/*
 * 1. Move disks 1 and 2 to 2nd tower
 * 	1.1 Move disk 1 to 3rd
 * 	1.2 Move disk 2 to 2nd
 * 	1.3 Move disk 1 to 2nd
 * 2. Move disk 3 to 3rd tower
 * 3. Move disk 1 and 2 to 3rd tower using step 1
 * 
 * 
 */
public class Hanoi {
	
	public void doHanoi(int disks, String tA, String tB, String tC){
		if (disks>0){
			doHanoi(disks-1, tA, tC, tB);
			System.out.println("Move disk " + disks + " from " + tA + " to "+ tC);
			doHanoi(disks-1, tB, tA, tC);	
			
		}
	}
	
	public static void main(String[] args) {
		Hanoi hanoi1 = new Hanoi();
		hanoi1.doHanoi(3, "tower A", "tower B", "tower C");
	}
}
