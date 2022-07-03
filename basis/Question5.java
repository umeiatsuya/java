package Question5;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			// コメント出力
			System.out.println("整数100を入力された値で割り算します");
			// 整数の入力
			System.out.println("割り算する整数を入力してください");

			// 文字列を数値に変換
			String num = scanner.nextLine();
			int number = Integer.parseInt(num);

			// 整数100の割り算
			int div = 100 / number;
			System.out.println("割り算結果は" + div + "です");

		} catch (NumberFormatException e) { // 例外処理
			System.out.println("整数以外が入力されました");
		} catch (ArithmeticException e) { // 例外処理
			System.out.println("0では割り算できません");
		} finally { // 必ず出力
			System.out.println("終了");
			scanner.close();// リソース閉じる
		}
	
	}
}
