package ip;

import java.net.*;


public class IpTest01 {

	public static void main(String[] args) throws UnknownHostException {
		// TODO �Զ����ɵķ������
//InetAddress i=Inet4Address.getLocalHost();
		InetAddress i=InetAddress.getLocalHost();
System.out.println(i.toString());

//InetAddress ia=InetAddress.getByName("www.baidu.com");
//System.out.println("address:"+ia.getHostAddress());
//System.out.println("name:"+ia.getHostName());
	}

}
