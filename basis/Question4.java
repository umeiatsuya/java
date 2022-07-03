package Question4;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);// Scannerインスタンス生成

		// コメント出力
		System.out.println("2つの同じ文字列を入力してください");

		while (true) {// 文字列の条件分岐
			System.out.print("１個目：");
			String inputStr1 = scanner.nextLine();// キーボード入力
			System.out.print("２個目：");
			String inputStr2 = scanner.nextLine();// キーボード入力

			if (inputStr1.equals("") || inputStr2.equals("")) {
				System.out.println("空白が入力されました");// 空白が入力された時

			} else if (inputStr1.equals(inputStr2)) {// 同じ文字列の時
				System.out.println("同じ文字列です");
				break;
			} else {
				System.out.println("違う文字列です");// 違う文字列の時

			}
		}
		scanner.close();// リソース閉じる
	}
}
