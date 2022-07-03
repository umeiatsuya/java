
package Question6;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in);) {
			// コメント出力
			System.out.println("本日の曜日番号を入力してください");

			// 整数入力
			String weekdayStr = scanner.nextLine();
			int weekdayInt = Integer.parseInt(weekdayStr);

			switch (weekdayInt) {// 曜日番号
			case 0:
				System.out.println("本日は日曜日です");
				break;
			case 1:
				System.out.println("本日は月曜日です");
				break;
			case 2:
				System.out.println("本日は火曜日です");
				break;
			case 3:
				System.out.println("本日は水曜日です");
				break;
			case 4:
				System.out.println("本日は木曜日です");
				break;
			case 5:
				System.out.println("本日は金曜日です");
				break;
			case 6:
				System.out.println("本日は土曜日です");
				break;
			default:// 数字入力の制限
				System.out.println("0～6の範囲で入力してください");
			
			}
		} catch (NumberFormatException e) {// 例外処理
			System.out.println("整数以外が入力されました");
		}

	}

}
