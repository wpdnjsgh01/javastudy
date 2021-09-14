package prob02;

import java.util.*;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		for(int i = 0; i < COUNT_GOODS; i++) {
			goods[i] = new Goods(scanner.next(), scanner.nextInt(), scanner.nextInt());
		}
		
		for(int i = 0; i < COUNT_GOODS; i++) {
			System.out.println(goods[i].getProduct() + "( 가격 : " + goods[i].getPrice() + "원 )이" + goods[i].getStock() + "개 입고되었습니다.");
		}
		
		scanner.close();
		
	}
}
