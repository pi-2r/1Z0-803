package certification;

public class FlowTest {
	static int[] data = { 1, 2, 3, 4, 5 };

	public static void main(String[] args) {
		for (int i : data) {
			if (i < 2) {
				continue;
			}
			System.out.print(i);
			if (i == 3) {
				//     
			}
		}
	}
}
