import javax.swing.JOptionPane;

public class main {
	static gui game;
	
	public static void main(String[] args) {
		gui game = new gui();	
	}
	
	public static void gameend(int bnw) {
		String message;
		if (bnw == 1) {
			message = "White wins!!!\nPragram ends after 5 sec.";
		}
		else {
			message = "Black wins!!!\nPragram ends after 5 sec.";
		}
		JOptionPane.showMessageDialog(null,message,"End", JOptionPane.PLAIN_MESSAGE);
		try{
		    Thread.sleep(5000);
		} catch (InterruptedException e) { }
		System.exit(0);
	}
}
