/*package ip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

class UdpSend02
{
	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket();//建立Socket
		BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
		String line=null;
		while((line=bufr.readLine())!=null)
		{
			if("886".equals(line))
				break;
			byte buf[]=line.getBytes();
			DatagramPacket dp=
	new DatagramPacket(buf,buf.length,InetAddress.getByName("10.90.53.180"),10001);//打包数据
			ds.send(dp);//发送数据
			}
		ds.close();//关闭资源
	}
}

public class UDPTest02 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
DatagramSocket ds=new DatagramSocket(10001);//监听端口
while(true)
{
	byte buf[]=new byte[1024];
	DatagramPacket dp=new DatagramPacket(buf, buf.length);
	ds.receive(dp);
	String ip=dp.getAddress().getHostAddress();
	String data =new String(dp.getData(),0,dp.getLength());
	System.out.println(ip+"..."+data);
}
	}

}
*/
