
public class Nest_for3 {

	public static void main(String[] args) {
		// for文(ループ処理)の応用
		
		// 条件演算子(三項演算子)
		// 条件演算子は、条件によって処理内容を分けることができる演算子です。三項演算子とも呼ばれます。
		// 条件式 ? 式1 : 式2
		//「条件式が正しい(true)の場合、式1を実行する。 
		// 間違い(false)の場合、式2を実行する。」
		// という命令をする演算子
		
		// ある数(a)が0以上だった場合プラス、0未満だった場合マイナス、と表示する。
		int a = 10;
		String b = a >= 0 ? "プラス" : "マイナス";
		
		System.out.println(b + "\n");
		
		// ある数(a)が偶数か奇数かを判別して表示する。
		int c = 2;
		String d = c % 2 == 0 ? "偶数" : "奇数";
		
		System.out.println(d + "\n");
		
		// ある数(i)が偶数の場合「☆」、奇数の場合「★」を表示する。
		// これをある数(i)が0以上5以下の間、繰り返す。
		for (int i = 0; i <= 5; i++) {
			String j = i % 2 == 0 ? "☆" : "★";
			
			System.out.println(j);
		}

	}

}
