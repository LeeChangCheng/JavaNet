package ip;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		//建立ServerSocket服务，并监听一个端口
ServerSocket ss=new ServerSocket(10007);
//获取服务端对象
Socket s=ss.accept();
//使用客户端对象读取流读取数据
InputStream in=s.getInputStream();
byte[] buf=new byte[1024];
int len=in.read(buf);
System.out.println(new String(buf,0,len));
String ip=s.getInetAddress().getHostAddress();//显示ip地址
System.out.println(ip+".......connected");
	}

}
