package dalin;

public class SubClass {
	public SubClass() {
		Try try1 = new Try();
		int[][] b = new int[3][10];
		b = try1.Try();
			for (int i = 0; i < b[0].length; i++) {
				System.out.println((i + 1) + "번째 문제의 답 : " + b[0][i]);
			}

			System.out.println("내가 맞춘 문제의 수 : " + b[2][0]);
			System.out.println("내가 틀린 문제의 수 : " + (b[0].length - b[2][0]));
	}
}
