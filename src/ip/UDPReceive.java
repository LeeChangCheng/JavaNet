package ip;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

import sun.security.action.GetLongAction;

public class UDPReceive {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
DatagramSocket ds=new DatagramSocket(10000);
while(true){
byte buf[]=new byte[1024];
DatagramPacket dp=new DatagramPacket(buf, buf.length);
ds.receive(dp);
String ip=dp.getAddress().getHostAddress();
String data=new String(dp.getData(),0,dp.getLength());
int port=dp.getPort();
System.out.println(ip+":"+data+":"+port);
//ds.close();
	}
	}
}
