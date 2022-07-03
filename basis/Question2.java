package Question2;

import java.util.Scanner;

public class Question2 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		try {

			// コメント出力
			System.out.println("整数を入力してください");

			// 文字列を数値に変換
			String num = scanner.nextLine();
			int number = Integer.parseInt(num);

			// 偶数か奇数の条件分岐
			if (number % 2 == 0) {// 偶数の場合
				System.out.println("入力された" + number + "は偶数です");
			} else {// 奇数の場合
				System.out.println("入力された" + number + "は奇数です");
			}
			// sc = new FileReader("XXXX.txt");
		} catch (NumberFormatException e) { // 例外処理
			System.out.println("整数以外が入力されました");
		} finally {
			scanner.close();// リソース閉じる

		}
	}
}
