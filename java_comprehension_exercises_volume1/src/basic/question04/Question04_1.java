package basic.question04;

import java.io.IOException;

/**
 * 第7章 配列
 */

public class Question04_1 {

	public static void main(String[] args) throws IOException {

		int[] ageGroup = new int[5];
		ageGroup[0] = 12;
		ageGroup[1] = 18;
		ageGroup[2] = 24;
		ageGroup[3] = 19;
		ageGroup[4] = 20;
		
		System.out.println("3 番目の人の年齢は" + ageGroup[2] + "歳です");

	}

}