// java�е�ע���÷�

/**
 * �������Ϊ�˸�������java�еļ���ע����ô��
 *
 * @author CC
 * @version 1.0
 *
 * java�ĵ�ע���е��÷�
 *
 * 1.�������������룺
 *      javadoc -d C:/myhtml CommentTest01.java
 *      
 *      javadoc				����һ��ִ������
 *      -d					����һ���̶��ĸ�ʽ
 *		C:/myhtml			��Ҫ���ɵ��ļ�����������ļ�������
 *		CommentTest01.java	����Ҫִ�����ɵ��ļ� 
 *
 * 2.�����ߵ��ĵ�����(�����˰汾���ô����ߵ�����,ǰ��Ĳ���Ϊ��д)
 *   javadoc -version -author -d C:/authorhtml CommentTest01.java
 *	 -version  �汾��
 *	 -author   ����
 *	 -title    ����
 *	 -time    ʱ��
 *	 C:/myhtml			��Ҫ���ɵ��ļ�����������ļ�������
 *	 CommentTest01.java	����Ҫִ�����ɵ��ļ�
 *
 *
 */

public class CommentTest01{
	public static void main(String[] args){
		// ����java��������̣߳�Ҳ����˵��java��������
		System.out.println("���ǵ�ѡע�ͣ�//");
	
		/*
			���Ƕ���ע��
		*/
		System.out.println("���Ƕ���ע��/*....*/");
		
		/**
		 *
		 * �����ĵ�ע��
		 *  ˵�����ĵ�ע�ͣ�һ����д�������ǰ��
		 */

		 System.out.println("�����ĵ�ע��/**.....*/");
	
	}

}