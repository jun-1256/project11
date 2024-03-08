
public class Sample {

	public static void main(String[] args) {
		// for文(ループ処理)の応用
		// ネスト(=入れ子)の書き方
		
		// fot文とif文のネスト
		// for(初期値; 条件式; 増減式) {
		//	if(条件) { if文の処理内容;
		//	}
		//	for文の処理内容; 
		// }
		
		// for文と剰余のネスト
		// ある数(i)が、初期値1から10以下の間で、
		// ある数( i )が 偶数の場合は、ある数( i )を表示する。
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}		

	}

}
