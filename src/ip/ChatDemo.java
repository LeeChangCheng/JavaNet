/*package ip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import sun.security.action.GetLongAction;
class Send implements Runnable
{
	private DatagramSocket ds;
   public Send(DatagramSocket ds)
   {
	   this.ds=ds;
   }
			public void run() {
			BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
			String line=null;
			try {
				while((line=bufr.readLine())!=null)
				{
					byte buf[]=line.getBytes();
					DatagramPacket dp=
					new DatagramPacket(buf,buf.length,InetAddress.getByName("10.90.53.180"),10002);
					ds.send(dp);
					
				}
			} catch (IOException e) {
				
				throw new RuntimeException("∑¢ÀÕ∂À ß∞‹");
			}
			}
	
}
class Receive implements Runnable
{
	private DatagramSocket ds;
	   public Receive(DatagramSocket ds)
	   {
		   this.ds=ds;
	   }
	
	public void run() {
	while(true)
	{
		try {
			byte[] buf=new byte[1024];
			DatagramPacket dp=new DatagramPacket(buf,buf.length);
			ds.receive(dp);
			String ip=dp.getAddress().getHostAddress();
			String data=new String(dp.getData(),0,dp.getLength());
			System.out.println(ip+":"+data);
			
		} catch (IOException e) {
			throw new RuntimeException("Ω” ‹∂À ß∞‹");
		}
	}
	}	
	}
	

public class ChatDemo {

	public static void main(String[] args) throws SocketException
	{
	DatagramSocket sendSocket=new	DatagramSocket();
	DatagramSocket receSocket=new DatagramSocket(10002);
	new Thread(new Send(sendSocket)).start();
	new Thread(new Receive(receSocket)).start();
	
	}

}
*/
