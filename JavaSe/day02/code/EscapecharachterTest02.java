/**
 * 1.ת���ַ���ʹ�ã���������ת���ַ���
 *     ���ܹ�"\"�ı����ֻ��߷���ԭ�еĺ���
 *
 * @author CC
 * @version 1.0
 *
 */
public class EscapecharachterTest02{
	public static void main(String[] args){
		// 1.ת��˽���ת������:\+ 1��3λ�˽������֣���Χ"\000"~ "\337"
		System.out.println("377");  // �����ת�����377
		System.out.println("\377"); // �����ת�����377
		System.out.println("\7");   // ת��һ��ϵͳ������
		
		// 2. unicodeת���ַ���u + �ĸ�ʮ���������֣�0-65535
		   /*
			unicode ��ת���ʱ��һ��Ҫ��u
		   */
		System.out.println("\u2605");
		
		// 3.�����ַ� ��3��
			/*
			":˫����
			':������
			\:��б��
			*/
		System.out.println("\"");
		System.out.println("\'");
		System.out.println("\\");


		// 4.�����ַ�����3��
			/*
				r:�س�
				n:����
				t:��������			
			*/

		System.out.print("��");
		System.out.print("��");
		System.out.print("��\n��");
		System.out.println("��\r��");
		System.out.println("��ac\t��");
		System.out.println("��abcd\t��");
		System.out.println("��abcde\t��"); 
		/*
			��ac    ��
			��abcd  ��
			��abcde ��
		*/


	}
}
