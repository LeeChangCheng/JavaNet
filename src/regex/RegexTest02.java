package regex;

public class RegexTest02 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
String str="53425342@qq.com";
String str1="53425342@qq.com.cn";
String str2="53425342.qq.com";

		boolean b=str.matches("[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-z]+)");
		boolean b1=str1.matches("[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-z]+)");
		boolean b2=str2.matches("[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-z]+)");
System.out.println(b);
System.out.println(b1);
System.out.println(b2);
	}

}
