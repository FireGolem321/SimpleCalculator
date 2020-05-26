import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame{

	private static final long serialVersionUID = -1415422854830572413L;
	
	private JMenuBar menuBar;
	private JMenu file;
	private JMenuItem close;
	
	public static void main(String[] args) {
		
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				JFrame.setDefaultLookAndFeelDecorated(true);
			} catch (Exception e) {
				System.out.println("Could not load system look");
			}
		new Calculator();
	}
	
	public Calculator() {
		super("Calculator");
		sendMenuBar();
		sendUI(this);
	}

	private void sendMenuBar() {
		menuBar = new JMenuBar();
		file = new JMenu(" File ");
		close = new JMenuItem ("Close");
		setJMenuBar(menuBar);
		menuBar.add(file);
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
				{System.exit(0);
				 }
		});
		
		file.add(close);
	}

	private void sendUI(Calculator app) {
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(550, 600);
		app.setResizable(false);
		app.setLayout(null);
		app.setLocationRelativeTo(null);
		app.setVisible(true);
	}
}
