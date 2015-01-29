package recursionTest;

public class TowersOfHanoi {
	private int totalDisks;
	private int count;

	public TowersOfHanoi(int disks) {
		totalDisks = disks;
		count = 0;
	}

	public void solve() {
		moveTower(totalDisks, "A", "B", "C", -1);
	}

	private void moveTower(int numDisks, String start, String temp, String end,
			int depthCounter) {
		
		if (numDisks > 0) {
			depthCounter = countRecursionDepth(depthCounter);
			moveTower(numDisks - 1, start, end, temp, depthCounter);
			moveOneDisk(start, end, depthCounter);
			moveTower(numDisks - 1, temp, start, end, depthCounter);
		
//		if (numDisks == 1) {
//			moveOneDisk(start, end, depthCounter);
//		} else {
//			depthCounter = countRecursionDepth(depthCounter);
//			moveTower(numDisks - 1, start, end, temp, depthCounter);
//			moveOneDisk(start, end, depthCounter);
//			moveTower(numDisks - 1, temp, start, end, depthCounter);
		}
	}

	public int countRecursionDepth(int depthCounter) {
		depthCounter++;
		return depthCounter;
	}

	private void moveOneDisk(String start, String end, int depthCounter) {
		count = count + 1;

		System.out.println("Move one disk from " + start + " to " + end
				+ " - move " + count + "| Recursion level is: " + depthCounter);
	}

	public static void main(String[] args) {
		TowersOfHanoi tower = new TowersOfHanoi(3);
		tower.solve();

	}
}
