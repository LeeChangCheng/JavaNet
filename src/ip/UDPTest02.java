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
		DatagramSocket ds=new DatagramSocket();//����Socket
		BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
		String line=null;
		while((line=bufr.readLine())!=null)
		{
			if("886".equals(line))
				break;
			byte buf[]=line.getBytes();
			DatagramPacket dp=
	new DatagramPacket(buf,buf.length,InetAddress.getByName("10.90.53.180"),10001);//�������
			ds.send(dp);//��������
			}
		ds.close();//�ر���Դ
	}
}

public class UDPTest02 {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
DatagramSocket ds=new DatagramSocket(10001);//�����˿�
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
