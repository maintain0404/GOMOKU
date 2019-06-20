import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Button extends JButton{
	public int x,y;
	boolean color = false;
	static boolean turn = true;	
	//true면 검정턴
	Button(int i, int j, int color) {
		this.x = i;
		this.y = j;
		this.setBackground(new Color(255,204,102));
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent click) {
				if (turn == true){
					BlackOn();
				}else {
					WhiteOn();
				}}};
		this.addActionListener(listener);
		
	}
	public void BlackOn(){
		if (this.color == false) {
			this.setBackground(new Color(0,0,0));
			Board.Black(this.x, this.y);
			this.turn = false;
			this.color = true;
		}
	}
	public void WhiteOn() {
		if (this.color == false) {
			this.setBackground(new Color(255,255,255));
			Board.White(this.x, this.y);
			this.turn = true;
			this.color = true;
		}
	}
}
