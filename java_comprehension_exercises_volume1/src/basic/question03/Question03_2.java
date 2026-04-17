package basic.question03;

/**
 * 第6章 演算子
 */

public class Question03_2 {

	public static void main(String[] args) {

		int basePrice = 1200;
		int tickets = 3;
		int reducedPrice = basePrice - 200;
		int reducedTickets = tickets - 1;
		int totalPrice = reducedPrice * reducedTickets;
		double taxRate = 1.1;
		int totalWithTax = (int)(totalPrice * taxRate);
		
		System.out.println("購入可能枚数は" + reducedTickets + "枚です。");
		System.out.println("値下げ後の 1 枚あたりの料金は" + reducedPrice + "円です。");
		System.out.println("合計金額（税抜）は" + totalPrice + "です。");
		System.out.println("合計金額（税込）は" + totalWithTax + "です。");
	}
}
