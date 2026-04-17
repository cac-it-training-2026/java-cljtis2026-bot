package basic.question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第7章 配列
 */

public class Question04_2 {

	public static void main(String[] args) throws IOException {

		int[] ageGroup = {23, 33, 26, 21, 25, 22};
		
		System.out.println("4 番目の人の年齢を入力してください。 ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int temporaryAge = Integer.parseInt(str);
		
		ageGroup[3] = temporaryAge;
		
		System.out.println("4 番目の人の年齢は" + ageGroup[3] + "歳です。");
		System.out.println("人数は " + ageGroup.length + "人です。");
		
	}

}
