package ip;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPTest01 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
DatagramSocket ds=new DatagramSocket(6666);
byte buf[]="udp I'm coming in ".getBytes();
DatagramPacket dp=
new DatagramPacket(buf,buf.length,Inet4Address.getByName("10.90.53.180"),10000);
ds.send(dp);
ds.close();
	}

}
