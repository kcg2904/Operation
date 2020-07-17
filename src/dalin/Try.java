package dalin;

import java.util.ArrayList;

public class Try {
	public int[][] Try() {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		ArrayList<Integer> listb = new ArrayList<Integer>();
		ArrayList<Boolean> listc = new ArrayList<Boolean>();

		int[][] b = new int[3][10];
		Operation op = new Operation();
		int Snop = op.opScan();
		for (int i = 0; i < 10; i++) {
			if (Snop == 1) {
				lista.add(op.getSum());
				listb.add(op.intScan());
				if (op.getSum() == op.intScan()) {
					listc.add(true);
				} else {
					listc.add(false);
				}
			} else if (Snop == 2) {
				lista.add(op.getSub());
				listb.add(op.intScan());
				if (op.getSub() == op.intScan()) {
					listc.add(true);
				} else {
					listc.add(false);
				}
			} else if (Snop == 3) {
				lista.add(op.getMul());
				listb.add(op.intScan());
				if (op.getMul() == op.intScan()) {
					listc.add(true);
				} else {
					listc.add(false);
				}

			} else if (Snop == 4) {
				lista.add(op.getDiv());
				listb.add(op.intScan());
				if (op.getDiv() == op.intScan()) {
					listc.add(true);
				} else {
					listc.add(false);
				}
			} else {
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
		int hap = 0;
			for (int i = 0; i < 10; i++) {
				if (listc.get(i) == true) {
					hap = hap + 1;
					System.out.println(hap);
				}
			}
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < lista.size(); j++) {
					if (i == 0) {
						b[i][j] = lista.get(j);
					} else if (i == 1) {
						b[i][j] = listb.get(j);
					} else if (i == 2) {
						b[i][0] = hap;
						b[i][1] = hap;
					}
				}
			}
		return b;
	}
}
