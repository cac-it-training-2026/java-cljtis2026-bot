package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {

		String[] itemNames = new String[5];
		int[] prices = new int[5];
		
		System.out.println("登録商品一覧");
		for (int i = 0; i < itemNames.length; i++) {
			System.out.println("[商品名]：[単価]円 ");
		}
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < itemNames.length; i++) {
			
			System.out.println("商品 " + (i + 1) + " を入力してください: >");
			String str = reader.readLine();
			itemNames[i] = str;
		}
		
		System.out.println("各商品の単価を順に入力してください: ");
		
		for (int i = 0; i < itemNames.length; i++) {
			
			System.out.println(itemNames[i] + "の単価>");
			String str = reader.readLine();
			int temp = Integer.parseInt(str);
			prices[i] = temp;
		}
		System.out.println("登録商品一覧");
		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(itemNames[i] + "："+ prices[i] +"円 ");
		}

	}

}
