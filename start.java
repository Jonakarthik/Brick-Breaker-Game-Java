package brickbreakergame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class start {

	private JFrame frmBrickBreakerGame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					start window = new start();
					window.frmBrickBreakerGame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBrickBreakerGame = new JFrame();
		frmBrickBreakerGame.setTitle("Brick Breaker Game");
		frmBrickBreakerGame.setBounds(100, 100, 850, 650);
		frmBrickBreakerGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBrickBreakerGame.setResizable(false);
		frmBrickBreakerGame.getContentPane().setLayout(null);
		frmBrickBreakerGame.setVisible(true);
		
		JButton btnNewButton = new JButton("New Game");
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainGame();
				frmBrickBreakerGame.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(304, 175, 203, 52);
		frmBrickBreakerGame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(359, 463, 86, 33);
		frmBrickBreakerGame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("set your name");
		btnNewButton_2.setBackground(new Color(255, 255, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new NAME();
				frmBrickBreakerGame.setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(304, 354, 203, 52);
		frmBrickBreakerGame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\isrch\\Downloads\\Whatsapp\\srulogo (1).jpg"));
		lblNewLabel_1.setBounds(555, -6, 274, 82);
		frmBrickBreakerGame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\isrch\\Downloads\\394399-brick-breaker-playstation-4-front-cover.jpg"));
		lblNewLabel_2.setBounds(22, -6, 829, 583);
		frmBrickBreakerGame.getContentPane().add(lblNewLabel_2);
	}
}
