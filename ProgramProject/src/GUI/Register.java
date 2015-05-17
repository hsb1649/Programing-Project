package GUI;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

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
	private JLabel idCondition;
	private JLabel idChecklabel;
	private JLabel label;
	
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
		reg.setTitle("회원가입");
		reg.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		reg.getContentPane().setLayout(null);
		
		idtxt = new JTextField();
		idtxt.setFont(new Font("HY동녘M", Font.PLAIN, 13));
		idtxt.setColumns(15);
		idtxt.setBounds(94, 31, 107, 30);
		reg.getContentPane().add(idtxt);
		
		JLabel idLabel = new JLabel("ID");
		idLabel.setVerticalTextPosition(SwingConstants.TOP);
		idLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idLabel.setFont(new Font("HY동녘M", Font.PLAIN, 17));
		idLabel.setBounds(23, 34, 64, 23);
		reg.getContentPane().add(idLabel);
		
		JLabel pwLabel = new JLabel("P/W");
		pwLabel.setVerticalTextPosition(SwingConstants.TOP);
		pwLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pwLabel.setFont(new Font("HY동녘M", Font.PLAIN, 17));
		pwLabel.setBounds(23, 111, 64, 23);
		reg.getContentPane().add(pwLabel);
		
		JRadioButton male = new JRadioButton("남자");
		male.setFont(new Font("HY동녘M", Font.PLAIN, 12));
		male.setBounds(94, 198, 49, 23);
		reg.getContentPane().add(male);
		
		female = new JRadioButton("여자");
		female.setFont(new Font("HY동녘M", Font.PLAIN, 12));
		female.setBounds(147, 198, 49, 23);
		reg.getContentPane().add(female);
		
		ButtonGroup g = new ButtonGroup();
		g.add(male);
		g.add(female);
		
		sexLabel = new JLabel("성별");
		sexLabel.setVerticalTextPosition(SwingConstants.TOP);
		sexLabel.setHorizontalAlignment(SwingConstants.CENTER);
		sexLabel.setFont(new Font("HY동녘M", Font.PLAIN, 17));
		sexLabel.setBounds(23, 198, 64, 23);
		
		reg.getContentPane().add(sexLabel);
		
		idCheck = new JButton("ID 중복확인");
		idCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				idChecklabel.setText("아이디 사용가능");
				idChecklabel.setForeground(new Color(34, 139, 34));
				/*
				idChecklabel.setText("아이디 중복");
				idChecklabel.setForeground(Color.RED);
				*/
			}
		});
		idCheck.setBounds(216, 34, 107, 23);
		idCheck.setFont(new Font("HY동녘M", Font.PLAIN, 13));
		reg.getContentPane().add(idCheck);
		
		OKButton = new JButton("회원가입");
		OKButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				reg.dispose();
			}
		});
		OKButton.setBounds(78, 260, 91, 30);
		OKButton.setFont(new Font("HY동녘M", Font.PLAIN, 13));
		reg.getContentPane().add(OKButton);
		
		cancelButton = new JButton("취소");
		cancelButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				reg.dispose();
			}
		});
		cancelButton.setBounds(181, 260, 91, 30);
		cancelButton.setFont(new Font("HY동녘M", Font.PLAIN, 13));
		reg.getContentPane().add(cancelButton);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setFont(new Font("HY동녘M", Font.PLAIN, 13));
		passwordField.setBounds(94, 108, 107, 30);
		reg.getContentPane().add(passwordField);
		
		idCondition = new JLabel("영소문자, 영대문자, 숫자 최대 15자");
		idCondition.setHorizontalAlignment(SwingConstants.CENTER);
		idCondition.setForeground(Color.GRAY);
		idCondition.setFont(new Font("HY동녘M", Font.PLAIN, 11));
		idCondition.setBounds(23, 72, 190, 15);
		reg.getContentPane().add(idCondition);
		
		idChecklabel = new JLabel();
		idChecklabel.setHorizontalAlignment(SwingConstants.CENTER);
		idChecklabel.setBounds(226, 72, 107, 14);
		idChecklabel.setFont(new Font("HY동녘M", Font.PLAIN, 11));
		reg.getContentPane().add(idChecklabel);
		
		label = new JLabel("비밀번호 최대 15글자");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.GRAY);
		label.setFont(new Font("HY동녘M", Font.PLAIN, 11));
		label.setBounds(23, 152, 190, 15);
		reg.getContentPane().add(label);
		
		
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
