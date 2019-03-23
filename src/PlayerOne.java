import java.awt.EventQueue;

import javax.swing.JFrame;

public class PlayerOne {

	private JFrame frame;
	static boolean toggleFrame = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayerOne window = new PlayerOne();
					window.frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PlayerOne() {
		initialize();
	}
	
	public static void togglePlayerOneFrame() {
		toggleFrame = !toggleFrame;
		PlayerOne window = new PlayerOne();
		window.frame.setVisible(toggleFrame);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Player 1's Hand");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
