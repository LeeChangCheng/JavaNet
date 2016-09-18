package ip;

import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ServerDemo01 extends JFrame{
private JTextArea jta=new JTextArea();
public static void main(String[] args) {
	new ServerDemo01();
}
public ServerDemo01() 
{
	setLayout(new BorderLayout());
	add(new JScrollPane(jta),BorderLayout.CENTER);
	setTitle("Server");
	setSize(500,300);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	try {
		//Create a server socket
		ServerSocket serverSocket=new ServerSocket(8000);
			jta.append("Server stared at "+new Date()+"\n");
			//Listen for a connection request
			Socket socket=serverSocket.accept();
			//Create data i/o streams
			DataInputStream inputFromClient=new DataInputStream(socket.getInputStream());
			DataOutputStream outputToClient=new DataOutputStream(socket.getOutputStream());
			while(true)
			{
				//Receive radius from the client
				double radius = inputFromClient.readDouble();
				double area =radius*radius*Math.PI;
				//Send area back to the client
				outputToClient.writeDouble(area);
				jta.append("Radius receive from client: "+radius+'\n');
				jta.append("Area found: "+area+'\n');
			}
			}
	catch (IOException e) {
		e.printStackTrace();
	}


}

}
