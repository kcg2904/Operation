package dalin;

import java.util.ArrayList;
import java.util.Scanner;

public class Operation {
	public int intScan(){
		Scanner scan = new Scanner(System.in);
		int intNum = scan.nextInt();
		return intNum;
	}
	public int opScan(){
		System.out.print("1. 더하기 2. 빼기 3. 곱하기 4. 나누기 0. 종료 > ");
		Scanner scan = new Scanner(System.in);
		int op = scan.nextInt();
		return op;
	}
	public int getSum() {	
		SetNum sn = new SetNum();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a = sn.setNumList();
		System.out.print(a.get(0) + " 와 " + a.get(1) + "를 더한 값은 ? > ");
		return a.get(0) + a.get(1);
	}
	public int getMul() {	
		SetNum sn = new SetNum();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a = sn.setNumList();
		System.out.print(a.get(0) + " 와 " + a.get(1) + "를 곱한 값은 ? > ");
		return a.get(0) * a.get(1);
	}
	public int getDiv() {	
		SetNum sn = new SetNum();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a = sn.setNumList();
		if (a.get(0)>a.get(1)) {
			int sum = a.get(0) / a.get(1);
			System.out.print(a.get(0) + " 와 " + a.get(1) + "를 나눈 값은 ? > ");
			return sum;
		}
		else {
			int sum = a.get(1) / a.get(0);
			System.out.print(a.get(1) + " 와 " + a.get(0) + "를 나눈 값은 ? > ");
			return sum;
		}
	}
	public int getSub() {	
		SetNum sn = new SetNum();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a = sn.setNumList();
		if (a.get(0) > a.get(1)) {
			int sum = a.get(0) - a.get(1);
			System.out.print(a.get(0) + " 와 " + a.get(1) + "를 뺀 값은 ? > ");
			return sum;
		}
		else {
			int sum = a.get(1) - a.get(0);
			System.out.print(a.get(1) + " 와 " + a.get(0) + "를 뺀 값은 ? > ");
			return sum;
		}
	}
}
