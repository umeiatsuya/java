package Question7;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in);) {
			// コメント出力
			System.out.println("整数の数を入力してください");

			String numStr = scanner.nextLine();// キーボード入力
			int num = Integer.parseInt(numStr);

			if (num <= 0) {// ０以下の整数が入力された場合の処置
				System.out.println("整数は０より大きい値を入力してください");
				return;
			}

			System.out.println("整数の各値を入力してください");

			int[] scores = new int[num];// 配列を生成

			int sum = 0;// sumを初期化
			for (int i = 0; i < scores.length; i++) {// 整数の数だけ要素を配列に入れるループ文

				System.out.print((i + 1) + "個目：");// 値の出力
				String numStr2 = scanner.nextLine();// キーボード入力
				scores[i] = Integer.parseInt(numStr2);
				sum += scores[i];// 要素の合計
			}

			System.out.print("入力された値は");// コメント出力
			for (int value : scores) {// 要素を取り出す
				System.out.print(value + " ");
			}
			System.out.println("です");// コメント出力
			System.out.println("入力された整数の平均は" + sum / scores.length + "です");// 平均値の計算

		} catch (NumberFormatException e) { // 整数以外の値が入力された時の例外処理
			System.out.println("整数以外が入力されました");

		}

	}
}