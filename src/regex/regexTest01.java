package regex;

public class regexTest01 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
String str="��Ҫ...........ҪҪѧѧѧ...........ѧ������..........��";
		str=str.replaceAll("\\.", "");
		str=str.replaceAll("(.)\\1+", "$1");
		System.out.println(str);
	}

}
