package ip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpSend02 {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		DatagramSocket ds=new DatagramSocket();//����Socket
		BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
		String line=null;
		while((line=bufr.readLine())!=null)
		{
			if("886".equals(line))
				break;
			byte buf[]=line.getBytes();
			DatagramPacket dp=
	new DatagramPacket(buf,buf.length,InetAddress.getByName("10.90.95.50"),10045);//�������
			ds.send(dp);//��������
			}
		ds.close();//�ر���Դ
	}

}
