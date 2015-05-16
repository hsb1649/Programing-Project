package GUI;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.MatteBorder;

public class Menu1 
{
	JFrame f;
	JFrame login;
	JFrame reg;
	JPanel menuPane, wherePane,searchPane;
	JButton button, button_0, button_1, button_2, button_3,button_4,button_5,button_6,button_7,button_8, button_9;
	
	public Menu1()
	{
		window1();		
	}
	
	public void window1()
	{
		f=new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("뭐 먹을 건대?");
		f.getContentPane().setBackground(Color.WHITE);
		f.setVisible(true);
		f.setBounds(100, 100, 450 , 550);
		f.setResizable(false);
		f.getContentPane().setLayout(null);
		
		wherePane = new JPanel();
		wherePane.setVisible(false);
		
		JPanel searchPane = new JPanel();
		searchPane.setVisible(false);
		searchPane.setBounds(0, 0, 444, 525);
		f.getContentPane().add(searchPane);
		searchPane.setLayout(null);
		
		button_9 = new JButton("뒤로가기");
		button_9.setFont(new Font("HY동녘M", Font.PLAIN, 13));
		button_9.setBounds(40, 450, 100, 29);
		searchPane.add(button_9);
		
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchPane.setVisible(false);
				menuPane.setVisible(true);
			}
		});
		
		wherePane.setBounds(0, 0, 444, 525);
		f.getContentPane().add(wherePane);
		wherePane.setLayout(null);
		
		button_4 = new JButton("정 문");
		button_4.setFont(new Font("휴먼편지체", Font.BOLD, 36));
		button_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		button_4.setBounds(40, 45, 370, 65);
		wherePane.add(button_4);
		
		button_5 = new JButton("중 문");
		button_5.setFont(new Font("휴먼편지체", Font.BOLD, 36));
		button_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		button_5.setBounds(40, 147, 370, 65);
		wherePane.add(button_5);
		
		button_6 = new JButton("후 문");
		button_6.setFont(new Font("휴먼편지체", Font.BOLD, 36));
		button_6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		button_6.setBounds(40, 246, 370, 65);
		wherePane.add(button_6);
		
		button_7 = new JButton("세종대");
		button_7.setFont(new Font("휴먼편지체", Font.BOLD, 36));
		button_7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		button_7.setBounds(40, 343, 370, 65);
		wherePane.add(button_7);
		
		button_8 = new JButton("뒤로가기");
		button_8.setFont(new Font("HY동녘M", Font.PLAIN, 13));
		button_8.setBounds(40, 450, 100, 29);
		wherePane.add(button_8);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wherePane.setVisible(false);
				menuPane.setVisible(true);
			}
		});
		
		
		menuPane = new JPanel();
		menuPane.setBounds(0, 0, 444, 525);
		f.getContentPane().add(menuPane);
		menuPane.setLayout(null);
				
		button_0 = new JButton("어디서 먹지?");
		button_0.setBounds(40, 150, 370, 65);
		menuPane.add(button_0);
		button_0.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		button_0.setFont(new Font("휴먼편지체", Font.BOLD, 36));
		
		button = new JButton("뭐 먹을지 검색!");
		button.setBounds(40, 240, 370, 65);
		menuPane.add(button);
		button.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		button.setFont(new Font("휴먼편지체", Font.BOLD, 36));
		
		button_1 = new JButton("추천 받아요");
		button_1.setBounds(40, 330, 370, 65);
		menuPane.add(button_1);
		button_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		button_1.setFont(new Font("휴먼편지체", Font.BOLD, 36));
		
		button_2 = new JButton("회원가입");
		button_2.setBounds(304, 77, 98, 33);
		menuPane.add(button_2);
		button_2.setFont(new Font("HY동녘M", Font.PLAIN, 13));
		
		button_3 = new JButton("로그인");
		button_3.setBounds(211, 77, 83, 33);
		menuPane.add(button_3);
		button_3.setFont(new Font("HY동녘M", Font.PLAIN, 13));
		
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuPane.setVisible(false);
				searchPane.setVisible(true);
			}
		});
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				menuPane.setVisible(false);
				wherePane.setVisible(true);
			}
		});
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Register(f);
			}
		});
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login(f);
			}
		});
	}
}
