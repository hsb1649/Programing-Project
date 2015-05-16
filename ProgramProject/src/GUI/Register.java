package GUI;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Register 
{

	JFrame reg;
	private JTextField idtxt;
	private JRadioButton female;
	private JLabel sexLabel;
	private JButton idCheck;
	private JButton OKButton;
	private JButton cancelButton;
	private JPasswordField passwordField;
	public Register(JFrame f) 
	{
		initialize(f);
	}
	private void initialize(JFrame f) 
	{
		reg = new JFrame();
		reg.setResizable(false);
		reg.setBounds(153, 230, 350, 350);
		reg.setVisible(true);
		reg.setTitle("»∏ø¯∞°¿‘");
		reg.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		reg.getContentPane().setLayout(null);
		
		idtxt = new JTextField();
		idtxt.setFont(new Font("HYµø≥ËM", Font.PLAIN, 13));
		idtxt.setColumns(15);
		idtxt.setBounds(94, 76, 107, 30);
		reg.getContentPane().add(idtxt);
		
		JLabel idLabel = new JLabel("ID");
		idLabel.setVerticalTextPosition(SwingConstants.TOP);
		idLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idLabel.setFont(new Font("HYµø≥ËM", Font.PLAIN, 17));
		idLabel.setBounds(23, 79, 64, 23);
		reg.getContentPane().add(idLabel);
		
		JLabel pwLabel = new JLabel("P/W");
		pwLabel.setVerticalTextPosition(SwingConstants.TOP);
		pwLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pwLabel.setFont(new Font("HYµø≥ËM", Font.PLAIN, 17));
		pwLabel.setBounds(23, 124, 64, 23);
		reg.getContentPane().add(pwLabel);
		
		JRadioButton male = new JRadioButton("≥≤¿⁄");
		male.setFont(new Font("HYµø≥ËM", Font.PLAIN, 12));
		male.setBounds(94, 172, 49, 23);
		reg.getContentPane().add(male);
		
		
		
		female = new JRadioButton("ø©¿⁄");
		female.setFont(new Font("HYµø≥ËM", Font.PLAIN, 12));
		female.setBounds(147, 172, 49, 23);
		reg.getContentPane().add(female);
		
		ButtonGroup g = new ButtonGroup();
		g.add(male);
		g.add(female);
		
		sexLabel = new JLabel("º∫∫∞");
		sexLabel.setVerticalTextPosition(SwingConstants.TOP);
		sexLabel.setHorizontalAlignment(SwingConstants.CENTER);
		sexLabel.setFont(new Font("HYµø≥ËM", Font.PLAIN, 17));
		sexLabel.setBounds(23, 172, 64, 23);
		
		reg.getContentPane().add(sexLabel);
		
		idCheck = new JButton("ID ¡ﬂ∫π»Æ¿Œ");
		idCheck.setBounds(216, 79, 107, 23);
		idCheck.setFont(new Font("HYµø≥ËM", Font.PLAIN, 13));
		reg.getContentPane().add(idCheck);
		
		OKButton = new JButton("»∏ø¯∞°¿‘");
		OKButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				reg.dispose();
			}
		});
		OKButton.setBounds(78, 260, 91, 30);
		OKButton.setFont(new Font("HYµø≥ËM", Font.PLAIN, 13));
		reg.getContentPane().add(OKButton);
		
		cancelButton = new JButton("√Îº“");
		cancelButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				reg.dispose();
			}
		});
		cancelButton.setBounds(181, 260, 91, 30);
		cancelButton.setFont(new Font("HYµø≥ËM", Font.PLAIN, 13));
		reg.getContentPane().add(cancelButton);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setFont(new Font("HYµø≥ËM", Font.PLAIN, 13));
		passwordField.setBounds(94, 121, 107, 30);
		reg.getContentPane().add(passwordField);

		
		reg.addWindowListener(new WindowListener(){

			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				f.setEnabled(true);
				f.toFront();
			}
			@Override
			public void windowClosing(WindowEvent arg0) 
			{
				// TODO Auto-generated method stub
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
			public void windowOpened(WindowEvent arg0) 
			{
				// TODO Auto-generated method stub
				f.setEnabled(false);
			}
			
		});
	}
}
