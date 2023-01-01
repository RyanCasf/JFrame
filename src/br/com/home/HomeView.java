package br.com.home;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import br.com.chooser.JFileChooser;

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
		setBounds(100, 100, 300, 80);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnChooser = new JButton("Chooser");
		btnChooser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				setVisible(false);
				chooser.setVisible(true);
			}
		});
		btnChooser.setBounds(10, 11, 89, 23);
		
		contentPane.add(btnChooser);
	}
}