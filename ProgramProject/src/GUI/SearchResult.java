package GUI;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JScrollPane;

public class SearchResult {

	JFrame f;

	public SearchResult() {
		initialize();
	}

	private void initialize() {
		f = new JFrame("검색 결과");
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.setBackground(Color.LIGHT_GRAY);
		f.setBounds(555, 95, 450, 570);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 68, 367, 387);
		f.getContentPane().add(scrollPane);
		f.setVisible(true);
	}
}
