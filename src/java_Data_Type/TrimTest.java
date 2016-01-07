package java_Data_Type;

public class TrimTest {

	public static void main(String[] args) {
		String blank = " ";
		System.out.println(blank);
		String line = blank + "hello" + blank + blank;
		System.out.println(line);
		line.concat("world");
		System.out.println(line);
		String newLine = line.trim();
		System.out.println(newLine);
		System.out.println((int)(line.length() + newLine.length()));
	}
}
