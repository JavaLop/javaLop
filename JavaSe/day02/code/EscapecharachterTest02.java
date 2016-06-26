/**
 * 1.转义字符的使用，佳作以是转义字符？
 *     是能过"\"改变文字或者符号原有的含义
 *
 * @author CC
 * @version 1.0
 *
 */
public class EscapecharachterTest02{
	public static void main(String[] args){
		// 1.转义八进制转义序列:\+ 1到3位八进制数字；范围"\000"~ "\337"
		System.out.println("377");  // 如果不转义就是377
		System.out.println("\377"); // 如果不转义就是377
		System.out.println("\7");   // 转义一个系统的声音
		
		// 2. unicode转义字符：u + 四个十六进制数字：0-65535
		   /*
			unicode 地转码的时候一定要在u
		   */
		System.out.println("\u2605");
		
		// 3.特殊字符 就3个
			/*
			":双引号
			':单引号
			\:反斜杠
			*/
		System.out.println("\"");
		System.out.println("\'");
		System.out.println("\\");


		// 4.控制字符：有3个
			/*
				r:回车
				n:换行
				t:横向跳格			
			*/

		System.out.print("你");
		System.out.print("好");
		System.out.print("我\n你");
		System.out.println("深\r圳");
		System.out.println("深ac\t圳");
		System.out.println("深abcd\t圳");
		System.out.println("深abcde\t圳"); 
		/*
			深ac    圳
			深abcd  圳
			深abcde 圳
		*/


	}
}
