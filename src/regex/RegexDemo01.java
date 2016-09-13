package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//demo();
		//demo1("c:\\用户\\我的游戏","\\\\");//   按照//切割
		//demo1("hjyygdhfdjfm000ufshfsass","(.)\\1+");//按照重复出现词切割
		//demo2("fgh2342342332greqq2344444332bs2","\\d{5,}","#");//替换
		//demo2("czzzzzzzzhobbjhfueeww","(.)\\1+","$1");//将重复字母替换成单个字母
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
		/*Greedy 数量词 
		X? X，一次或一次也没有 
				X* X，零次或多次 
				X+ X，一次或多次 
				X{n} X，恰好 n 次 
				X{n,} X，至少 n 次 
				X{n,m} X，至少 n 次，但是不超过 m 次 
				  
				Reluctant 数量词 
				X?? X，一次或一次也没有 
				X*? X，零次或多次 
				X+? X，一次或多次 
				X{n}? X，恰好 n 次 
				X{n,}? X，至少 n 次 
				X{n,m}? X，至少 n 次，但是不超过 m 次 
				  
				Possessive 数量词 
				X?+ X，一次或一次也没有 
				X*+ X，零次或多次 
				X++ X，一次或多次 
				X{n}+ X，恰好 n 次 
				X{n,}+ X，至少 n 次 
				X{n,m}+ X，至少 n 次，但是不超过 m 次  */

		boolean b=str.matches(reg);
		System.out.println(b);
	}
}
