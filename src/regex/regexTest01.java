package regex;

public class regexTest01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
String str="我要...........要要学学学...........学编编编编程..........程";
		str=str.replaceAll("\\.", "");
		str=str.replaceAll("(.)\\1+", "$1");
		System.out.println(str);
	}

}
