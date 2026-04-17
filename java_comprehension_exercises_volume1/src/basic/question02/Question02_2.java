package basic.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第5章 入出力
 */

public class Question02_2 {

	public static void main(String[] args) throws IOException {

		System.out.println("商品の名前と値段を入力してください。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String itemName = reader.readLine();
		
		int itemPrice;
		String itemPriceString  = reader.readLine();
		itemPrice = Integer.parseInt(itemPriceString);
		
		System.out.println("商品の名前は" + itemName + "です。");
		System.out.println("商品の値段は " + itemPrice + " 円です。 ");

	}
}
