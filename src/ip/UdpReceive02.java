package ip;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceive02 {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		DatagramSocket ds=new DatagramSocket(10045);//�����˿�
		while(true)
		{
			byte buf[]=new byte[1024];
			DatagramPacket dp=new DatagramPacket(buf, buf.length);
			ds.receive(dp);
			String ip=dp.getAddress().getHostAddress();//���ip;
			String data =new String(dp.getData(),0,dp.getLength());
			System.out.println(ip+"..."+data);
		}
	}

}
