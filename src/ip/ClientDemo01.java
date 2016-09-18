package ip;

import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javafx.scene.control.cell.TextFieldListCell;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientDemo01 extends JFrame{

public JTextField jtf=new JTextField();
public JTextArea jta=new JTextArea();

public DataOutputStream toServer;
public DataInputStream fromServer;

	public static void main(String[] args) throws UnknownHostException, IOException {
	new ClientDemo01();
}
	public ClientDemo01() throws UnknownHostException, IOException
	{
		JPanel p=new JPanel();
		p.setLayout(new BorderLayout());
		p.add(new JLabel("Enter radius"),BorderLayout.WEST);
		p.add(jtf,BorderLayout.CENTER);
		jtf.setHorizontalAlignment(JTextField.RIGHT);
		
		setLayout(new BorderLayout());
		add(p,BorderLayout.NORTH);
		add(new JScrollPane(jta),BorderLayout.CENTER);
		
		jtf.addActionListener(new TextFieldListener());
		
		setTitle("Client");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	
	Socket socket = new Socket("localhost",8000);
			fromServer= new DataInputStream(socket.getInputStream());
	    toServer=new DataOutputStream(socket.getOutputStream());
     }
	
class TextFieldListener implements ActionListener
{
    public void actionPerformed(ActionEvent e) {
		double radius =Double.parseDouble(jtf.getText().trim());
		try {
			toServer.writeDouble(radius);
			toServer.flush();
			double area=fromServer.readDouble();
			jta.append("Radius is "+radius+" \n");
			jta.append("Area received from the server is "+area+'\n');
			
		} catch (IOException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
			
		}
		
	}
}


