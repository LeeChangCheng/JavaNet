package ip;


	import java.io.IOException;
	import java.io.OutputStream;
	import java.net.Socket;
	import java.net.UnknownHostException;
	public class TcpClient {


		public static void main(String[] args) throws UnknownHostException, IOException {
			// TODO �Զ����ɵķ������
	Socket s=new Socket("10.90.95.50",10007);
	OutputStream out=s.getOutputStream();
	out.write("tcp I'm coming".getBytes());
	s.close();
		}

	}


