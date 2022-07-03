package Question3;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			// コメント出力
			System.out.println("整数を入力してください");

			// 文字列を数値に変換
			String num = scanner.nextLine();
			int number = Integer.parseInt(num);

			// 「＊」と「・」の出力制御
			for (int i = 0; i < number; i++) {
				for (int j = 0; j < number; j++) {
					System.out.print(i == j ? "＊" : "・");
					
				}
				// 改行
				System.out.println("");
			}
		} catch (NumberFormatException e) { // 例外処理
			System.out.println("整数以外が入力されました");
		}
		scanner.close();//リソース閉じる

	}
}
