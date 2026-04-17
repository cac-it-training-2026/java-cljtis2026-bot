package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_5 {

	public static void main(String[] args) throws IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 120, 80, 50, 250, 100 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		int[] stocks = new int[5];
		
		double discount = 0.1;
		double tax = 0.1;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(itemNames[i] + "の在庫数: >");
			String str = reader.readLine();
			stocks[i] = Integer.parseInt(str);
		}
		for (int i = 0; i < itemNames.length; i++) {
			boolean trueFlag = false;
			
			while (trueFlag != true) {
				System.out.println(itemNames[i] + "の購入数: >");
				String str = reader.readLine();
    			int temp = Integer.parseInt(str);
                if (stocks[i] >= temp) {
                	amounts[i] = temp;
                	trueFlag = true;
				} else {
	               	System.out.println("在庫を超えています。もう一度入力してください。");
				}
            }	
		}
		
		double sum = 0;
		
		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(itemNames[i] + "：購入 " + amounts[i]+ " 個");
			System.out.println("在庫 " + stocks[i] +" 個 ");
			sum += amounts[i] * prices[i];
		}
		
		System.out.println("購入内容一覧：");
		
		for (int i = 0; i < itemNames.length; i++) {
			
			double danka = amounts[i] * prices[i] * (1 +tax);
			String danKa = String.format("%.2f", danka);
			
			System.out.println(itemNames[i] + "：単価 " + prices[i] + " 円（税込 " + prices[i] + " 円） × " + amounts[i] + " 個 = " + danKa + " 円");
		}
		
		String inputSum = String.format("%.2f", sum);
		double disBefore = sum * (1 - discount);
		String discountBefore = String.format("%.2f", disBefore);
		double taxover = sum * (1 - discount) * (1 + tax);
		String taxOver = String.format("%.2f", taxover);
		
		if (sum > 5000) {
			System.out.println("割引前合計：" + inputSum + " 円");
			System.out.println("割引適用（10%OFF）：" + discountBefore + " 円");
			System.out.println("割引後合計（税込）：" + taxOver + " 円 ");
		} else {
			System.out.println("合計：" + inputSum + " 円");
			System.out.println("合計（税込）：" + sum * (1 + tax) + " 円 ");
		}


	}
}