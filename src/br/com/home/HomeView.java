package br.com.home;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class HomeView extends JFrame {
	private static final long serialVersionUID = 3176554592475305567L;

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				HomeView frame = new HomeView();
				frame.setVisible(true);
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public HomeView() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}
}