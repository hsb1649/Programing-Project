package GUI;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

public class Menu1 
{
	JFrame f;
	private SearchResult s;
	private JPanel menuPane, wherePane,searchPane;
	private JButton button, button_0, button_1, button_2, button_3,button_4,button_5,button_6,button_7,button_8, button_9;
	private JTextField snametxt;
	private JLabel mnameLabel;
	private JTextField mnametxt;
	private JButton search_mname;
	private JTextField min;
	private JTextField max;
	private JLabel label;
	private JLabel label_1;
	private JButton search_price;
	
	public Menu1()
	{
		window1();		
	}
	
	public void window1()
	{
		f=new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("ππ ∏‘¿ª ∞«¥Î?");
		f.getContentPane().setBackground(Color.WHITE);
		f.setVisible(true);
		f.setBounds(100, 100, 450 , 550);
		f.setResizable(false);
		f.getContentPane().setLayout(null);
		
		wherePane = new JPanel();
		wherePane.setVisible(false);
		
		searchPane = new JPanel();
		searchPane.setVisible(false);
		searchPane.setBounds(0, 0, 444, 525);
		f.getContentPane().add(searchPane);
		searchPane.setLayout(null);
		
		button_9 = new JButton("µ⁄∑Œ∞°±‚");
		button_9.setFont(new Font("HYµø≥ËM", Font.PLAIN, 13));
		button_9.setBounds(40, 450, 100, 29);
		searchPane.add(button_9);
		
		JPanel store_name = new JPanel();
		store_name.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		store_name.setBounds(30, 75, 380, 65);
		searchPane.add(store_name);
		store_name.setLayout(null);
		
		snametxt = new JTextField();
		snametxt.setBounds(112, 23, 136, 23);
		snametxt.setFont(new Font("HYµø≥ËM", Font.PLAIN, 13));
		store_name.add(snametxt);
		snametxt.setColumns(20);
		
		JLabel snameLabel = new JLabel("∞°∞‘ ¿Ã∏ß :");
		snameLabel.setFont(new Font("HYµø≥ËM", Font.PLAIN, 13));
		snameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		snameLabel.setBounds(34, 22, 69, 23);
		store_name.add(snameLabel);
		
		JButton serch_sname = new JButton("∞Àªˆ«œ±‚");
		serch_sname.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SearchResult s = new SearchResult();
			}
		});
		serch_sname.setFont(new Font("HYµø≥ËM", Font.PLAIN, 13));
		serch_sname.setBounds(260, 23, 97, 23);
		store_name.add(serch_sname);
		
		JPanel menu_name = new JPanel();
		menu_name.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		menu_name.setBounds(30, 190, 380, 65);
		searchPane.add(menu_name);
		menu_name.setLayout(null);
		
		mnameLabel = new JLabel("∏ﬁ¥∫ ¿Ã∏ß :");
		mnameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mnameLabel.setFont(new Font("HYµø≥ËM", Font.PLAIN, 13));
		mnameLabel.setBounds(34, 22, 69, 23);
		menu_name.add(mnameLabel);
		
		mnametxt = new JTextField();
		mnametxt.setFont(new Font("HYµø≥ËM", Font.PLAIN, 13));
		mnametxt.setColumns(20);
		mnametxt.setBounds(112, 23, 136, 23);
		menu_name.add(mnametxt);
		
		search_mname = new JButton("∞Àªˆ«œ±‚");
		search_mname.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		search_mname.setFont(new Font("HYµø≥ËM", Font.PLAIN, 13));
		search_mname.setBounds(260, 23, 97, 23);
		menu_name.add(search_mname);
		
		JPanel price_Range = new JPanel();
		price_Range.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		price_Range.setBounds(30, 307, 380, 65);
		searchPane.add(price_Range);
		price_Range.setLayout(null);
		
		min = new JTextField();
		min.setHorizontalAlignment(SwingConstants.TRAILING);
		min.setBounds(26, 23, 78, 21);
		min.setFont(new Font("HYµø≥ËM", Font.PLAIN, 13));
		price_Range.add(min);
		min.setColumns(10);
		
		max = new JTextField();
		max.setHorizontalAlignment(SwingConstants.TRAILING);
		max.setFont(new Font("HYµø≥ËM", Font.PLAIN, 13));
		max.setColumns(10);
		max.setBounds(151, 24, 78, 21);
		price_Range.add(max);
		
		label = new JLabel("ø¯ ~");
		label.setBounds(111, 23, 28, 23);
		label.setFont(new Font("HYµø≥ËM", Font.PLAIN, 13));
		price_Range.add(label);
		
		label_1 = new JLabel("ø¯");
		label_1.setFont(new Font("HYµø≥ËM", Font.PLAIN, 13));
		label_1.setBounds(234, 23, 14, 23);
		price_Range.add(label_1);
		
		search_price = new JButton("\uAC80\uC0C9\uD558\uAE30");
		search_price.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		search_price.setFont(new Font("HYµø≥ËM", Font.PLAIN, 13));
		search_price.setBounds(260, 23, 97, 23);
		price_Range.add(search_price);
		
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchPane.setVisible(false);
				menuPane.setVisible(true);
			}
		});
		
		wherePane.setBounds(0, 0, 444, 525);
		f.getContentPane().add(wherePane);
		wherePane.setLayout(null);
		
		button_4 = new JButton("¡§ πÆ");
		button_4.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.BOLD, 36));
		button_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		button_4.setBounds(40, 45, 370, 65);
		wherePane.add(button_4);
		
		button_5 = new JButton("¡ﬂ πÆ");
		button_5.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.BOLD, 36));
		button_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		button_5.setBounds(40, 147, 370, 65);
		wherePane.add(button_5);
		
		button_6 = new JButton("»ƒ πÆ");
		button_6.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.BOLD, 36));
		button_6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		button_6.setBounds(40, 246, 370, 65);
		wherePane.add(button_6);
		
		button_7 = new JButton("ºº¡æ¥Î");
		button_7.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.BOLD, 36));
		button_7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		button_7.setBounds(40, 343, 370, 65);
		wherePane.add(button_7);
		
		button_8 = new JButton("µ⁄∑Œ∞°±‚");
		button_8.setFont(new Font("HYµø≥ËM", Font.PLAIN, 13));
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
				
		button_0 = new JButton("æÓµº≠ ∏‘¡ˆ?");
		button_0.setBounds(40, 150, 370, 65);
		menuPane.add(button_0);
		button_0.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		button_0.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.BOLD, 36));
		
		button = new JButton("ππ ∏‘¿ª¡ˆ ∞Àªˆ!");
		button.setBounds(40, 240, 370, 65);
		menuPane.add(button);
		button.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		button.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.BOLD, 36));
		
		button_1 = new JButton("√ﬂ√µ πﬁæ∆ø‰");
		button_1.setBounds(40, 330, 370, 65);
		menuPane.add(button_1);
		button_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		button_1.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.BOLD, 36));
		
		button_2 = new JButton("»∏ø¯∞°¿‘");
		button_2.setBounds(304, 77, 98, 33);
		menuPane.add(button_2);
		button_2.setFont(new Font("HYµø≥ËM", Font.PLAIN, 13));
		
		button_3 = new JButton("∑Œ±◊¿Œ");
		button_3.setBounds(211, 77, 83, 33);
		menuPane.add(button_3);
		button_3.setFont(new Font("HYµø≥ËM", Font.PLAIN, 13));
		
		JPanel panel = new JPanel();
		panel.setVisible(false);
		panel.setBounds(0, 0, 444, 525);
		f.getContentPane().add(panel);
		panel.setLayout(null);
		
		
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
