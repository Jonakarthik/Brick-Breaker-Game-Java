package brickbreakergame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class NAME {

	private JFrame frmSetYourName;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NAME window = new NAME();
					window.frmSetYourName.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NAME() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSetYourName = new JFrame();
		frmSetYourName.setTitle("Set Your Name");
		frmSetYourName.setBounds(100, 100, 850, 600);
		frmSetYourName.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSetYourName.getContentPane().setLayout(null);
		frmSetYourName.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Enter Your Name:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 128, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(230, 116, 362, 57);
		frmSetYourName.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(217, 184, 408, 57);
		frmSetYourName.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(130, 425, 587, 51);
		frmSetYourName.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBackground(new Color(255, 128, 64));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new start();
				frmSetYourName.setVisible(false);
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(449, 325, 170, 57);
		frmSetYourName.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Display");
		btnNewButton_1_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				lblNewLabel_1.setText("Welcome Mr."+name);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(217, 325, 170, 57);
		frmSetYourName.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\isrch\\Downloads\\Whatsapp\\srulogo (1).jpg"));
		lblNewLabel_2.setBounds(568, 0, 258, 68);
		frmSetYourName.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\isrch\\Downloads\\394399-brick-breaker-playstation-4-front-cover.jpg"));
		lblNewLabel_3.setBounds(22, -17, 804, 580);
		frmSetYourName.getContentPane().add(lblNewLabel_3);
	}
}
