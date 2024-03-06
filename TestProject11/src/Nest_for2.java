
public class Nest_for2 {

	public static void main(String[] args) {
		// for文(ループ処理)の応用
		
		// for文とfor文のネスト
		// for(初期値; 条件式; 増減式){
		//	for(初期値; 条件式; 増減式){ 
		//		処理を実行する
		// 	}
		// 	処理を実行する 
		// }
		
		// 変数bが 初期値1から4未満の間(1, 2, 3の計3回)、変数bを表示する。
		// 変数aが 初期値0から3未満の間、上記のfor文を繰り返す。
		for (int a = 0; a < 3; a++) {
			for (int b = 1; b < 4; b++) {
				System.out.println(b);
			}
		}

	}

}
