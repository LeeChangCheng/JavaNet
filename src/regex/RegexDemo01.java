package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo01 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//demo();
		//demo1("c:\\�û�\\�ҵ���Ϸ","\\\\");//   ����//�и�
		//demo1("hjyygdhfdjfm000ufshfsass","(.)\\1+");//�����ظ����ִ��и�
		//demo2("fgh2342342332greqq2344444332bs2","\\d{5,}","#");//�滻
		//demo2("czzzzzzzzhobbjhfueeww","(.)\\1+","$1");//���ظ���ĸ�滻�ɵ�����ĸ
		deom3();
	}
	public static void deom3()
	{
		String str="ming tian jiu yao fang jia la";
		String reg="\\b[a-z]{3}\\b";
		System.out.println(str);
		Pattern p=Pattern.compile(reg);
		Matcher m=p.matcher(str);	
		while(m.find())
		{
			System.out.println(m.group());
		}
	}
	public static void demo2(String str,String rex,String replacement)
	{
		str=str.replaceAll(rex,replacement);
		System.out.println(str);
	
	}
	public static void demo1(String str,String reg)
	{
		//String str="fsdfsd\\fsdfsd\\dasad";
		//String reg="\\.";
		String[] arr=str.split(reg);
		for (String s : arr) {
			System.out.println(s);
		}
	}
	public static void demo()
	{
		String str="18717767816";
		//String reg="[a-zA-z]\\d*";
		String reg="1[358]\\d{9}";
		/*Greedy ������ 
		X? X��һ�λ�һ��Ҳû�� 
				X* X����λ��� 
				X+ X��һ�λ��� 
				X{n} X��ǡ�� n �� 
				X{n,} X������ n �� 
				X{n,m} X������ n �Σ����ǲ����� m �� 
				  
				Reluctant ������ 
				X?? X��һ�λ�һ��Ҳû�� 
				X*? X����λ��� 
				X+? X��һ�λ��� 
				X{n}? X��ǡ�� n �� 
				X{n,}? X������ n �� 
				X{n,m}? X������ n �Σ����ǲ����� m �� 
				  
				Possessive ������ 
				X?+ X��һ�λ�һ��Ҳû�� 
				X*+ X����λ��� 
				X++ X��һ�λ��� 
				X{n}+ X��ǡ�� n �� 
				X{n,}+ X������ n �� 
				X{n,m}+ X������ n �Σ����ǲ����� m ��  */

		boolean b=str.matches(reg);
		System.out.println(b);
	}
}
