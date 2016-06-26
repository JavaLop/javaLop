// java中的注释用法

/**
 * 这个类是为了告诉我们java中的几种注释怎么用
 *
 * @author CC
 * @version 1.0
 *
 * java文档注释中的用法
 *
 * 1.在命令行里输入：
 *      javadoc -d C:/myhtml CommentTest01.java
 *      
 *      javadoc				就是一个执行命令
 *      -d					就是一个固定的格式
 *		C:/myhtml			是要生成的文件保存在这个文件夹下面
 *		CommentTest01.java	这是要执行生成的文件 
 *
 * 2.创建者的文档创建(包含了版本号用创建者的名称,前面的不能为大写)
 *   javadoc -version -author -d C:/authorhtml CommentTest01.java
 *	 -version  版本号
 *	 -author   作者
 *	 -title    主题
 *	 -time    时间
 *	 C:/myhtml			是要生成的文件保存在这个文件夹下面
 *	 CommentTest01.java	这是要执行生成的文件
 *
 *
 */

public class CommentTest01{
	public static void main(String[] args){
		// 这是java程序的主线程，也可以说是java程序的入口
		System.out.println("这是单选注释！//");
	
		/*
			这是多行注释
		*/
		System.out.println("这是多行注释/*....*/");
		
		/**
		 *
		 * 这是文档注释
		 *  说明：文档注释，一般是写在类的最前面
		 */

		 System.out.println("这是文档注释/**.....*/");
	
	}

}