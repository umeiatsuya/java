package Question8;

import java.util.ArrayList;
import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in);) {
			// コメント出力
			System.out.println("整数を入力してください");

			String numStr = scanner.nextLine();// キーボード入力
			int num = Integer.parseInt(numStr);

			int sum = 0;// sumを初期化

			if (num <= 0) {// ０以下の整数が入力された場合の処置
				System.out.println("整数は０より大きい値を入力してください");
				return;
			}

			System.out.println("整数の各値を入力してください");// コメント出力

			ArrayList<Integer> list = new ArrayList<Integer>();// 配列を生成

			for (int i = 0; i < num; i++) {
				System.out.print((i + 1) + "個目 :");// 値の出力
				String numStr2 = scanner.nextLine();// キーボード入力
				int num2 = Integer.parseInt(numStr2);
				list.add(num2);// リストに値を追加
				sum += (num2);// 値の合計
			}
			System.out.print("入力された値は");// コメント出力
			for (int value : list) {
				System.out.print(value + " ");// 値の出力
			}
			System.out.println("です");// コメント出力
			System.out.println("入力された値の平均値は" + sum / list.size() + "です");// 平均値の計算

		} catch (NumberFormatException e) {// 整数以外が入力された時の例外処理
			System.out.println("整数以外が入力されました");
		}
	}
}
