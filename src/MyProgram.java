
public class MyProgram {
	public static void main(String[] args) {
		int x = startup(-4);
		System.out.println(x);
	}

	static int startup(int v) {
		if (v >= 0) {
			return 1;
		} else {
			return 0;
		}
	}
}
