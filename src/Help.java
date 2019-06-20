import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import javax.swing.JButton;

public class Help extends JButton{
	String message = "1. Each player can play once at a turn\n "
			+ "2. Player who makes line with 5 their block wins\n"
			+ "3. Enjoy your game!";
	Help(){
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent click) {
				JOptionPane.showMessageDialog(null, message);
			}
		};
		this.addActionListener(listener);
	this.setText("Help");
	}
}
