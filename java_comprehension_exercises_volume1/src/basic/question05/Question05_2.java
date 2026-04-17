package basic.question05;

import java.io.IOException;

/**
 * 第8章 条件分岐
 */

public class Question05_2 {

	public static void main(String[] args) throws IOException {

		int[] numberGroup = {3, 5, 7, 9};
		
		if (numberGroup[4] == 3) {
			System.out.println("4 番目の要素の値は 3 です。");
		} else if (numberGroup[4] == 5) {
			System.out.println("4 番目の要素の値は 5 です。");
		} else if (numberGroup[4] == 7) {
			System.out.println("4 番目の要素の値は 7 です。");
		} else {
			System.out.println("4 番目の要素の値は 3、5、7 以外の値です。");
		}

	}
}
