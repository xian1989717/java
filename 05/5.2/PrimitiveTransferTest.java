public class PrimitiveTransferTest {
	public static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println();
	}

	public static void main(String[] args) {
		int a = 6;
		int b = 9;
		swap(a, b);
		System.out.println("交换结束后,变量a的值是:" + a + ";变量b的值是" + b);
	}
}