package brickbreakergame;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class MainGame {

	private JFrame frmBrickBreakerGame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGame window = new MainGame();
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
	public MainGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBrickBreakerGame = new JFrame();
		GAME GM = new GAME();

		frmBrickBreakerGame.setTitle("Brick Breaker Game");
		frmBrickBreakerGame.setBounds(10, 10, 700, 600);
		frmBrickBreakerGame.setResizable(false);
		frmBrickBreakerGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBrickBreakerGame.add(GM);
		frmBrickBreakerGame.setVisible(true);
	}

}
