package ip;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		//����ServerSocket���񣬲�����һ���˿�
ServerSocket ss=new ServerSocket(10007);
//��ȡ����˶���
Socket s=ss.accept();
//ʹ�ÿͻ��˶����ȡ����ȡ����
InputStream in=s.getInputStream();
byte[] buf=new byte[1024];
int len=in.read(buf);
System.out.println(new String(buf,0,len));
String ip=s.getInetAddress().getHostAddress();//��ʾip��ַ
System.out.println(ip+".......connected");
	}

}
