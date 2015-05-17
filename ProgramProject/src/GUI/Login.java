package GUI;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login 
{

	JFrame login;
	private JTextField idtxt;
	private JPasswordField pwtxt;

	public Login(JFrame f) 
	{
		initialize(f);
	}
	private void initialize(JFrame f) 
	{
		login = new JFrame();
		login.setResizable(false);
		login.setBounds(153, 270, 350, 250);
		login.setVisible(true);
		login.setTitle("∑Œ±◊¿Œ");
		login.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		login.getContentPane().setLayout(null);
		
		idtxt = new JTextField();
		idtxt.setFont(new Font("HYµø≥ËM", Font.PLAIN, 13));
		idtxt.setBounds(93, 67, 107, 30);
		login.getContentPane().add(idtxt);
		idtxt.setColumns(15);
		
		JLabel idLabel = new JLabel("ID");
		idLabel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		idLabel.setVerticalTextPosition(SwingConstants.TOP);
		idLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idLabel.setBounds(22, 70, 64, 23);
		login.getContentPane().add(idLabel);
		
		JLabel pwLabel = new JLabel("P/W");
		pwLabel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		pwLabel.setVerticalTextPosition(SwingConstants.TOP);
		pwLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pwLabel.setBounds(22, 115, 64, 23);
		login.getContentPane().add(pwLabel);
		
		JButton button = new JButton("∑Œ±◊¿Œ");
		button.setFont(new Font("HYµø≥ËM", Font.PLAIN, 13));
		button.setBounds(212, 66, 91, 30);
		login.getContentPane().add(button);
		
		JButton button2 = new JButton("»∏ø¯∞°¿‘");
		button2.setFont(new Font("HYµø≥ËM", Font.PLAIN, 13));
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				new Register(login);
			}
		});
		button2.setBounds(212, 111, 91, 30);
		login.getContentPane().add(button2);
		
		pwtxt = new JPasswordField();
		pwtxt.setEchoChar('*');
		pwtxt.setFont(new Font("HYµø≥ËM", Font.PLAIN, 13));
		pwtxt.setBounds(93, 113, 107, 30);
		login.getContentPane().add(pwtxt);
		
		login.addWindowListener(new WindowListener(){

			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				f.setEnabled(true);
				f.toFront();
			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				f.setEnabled(false);
			}
			
		});
	}
}
