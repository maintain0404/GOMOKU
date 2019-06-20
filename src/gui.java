import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*; 

public class gui extends JFrame{	
	JFrame frame;
	JPanel upper,board;
	JLabel upper_text;
	gui() {
		int i, j;
		frame = new JFrame();
		frame.setSize(500,550);
		frame.setTitle("Gomoku");
		frame.setLayout(new BorderLayout());
		
		upper = new JPanel();
		upper.setLayout(new BorderLayout());
		upper.setPreferredSize(new Dimension(500,50));
		upper_text = new JLabel("GOMOKU GAME made by Min Taein");
		upper_text.setFont(upper_text.getFont().deriveFont(20.0f));
		upper.add(upper_text, BorderLayout.LINE_START);
		Help helpbutton = new Help();
		upper.add(helpbutton, BorderLayout.LINE_END);
		
		board = new JPanel();
		GridLayout boardgrid = new GridLayout(15,15);
		board.setLayout(boardgrid);
		for(i=0;i<15;i++) {
			for(j=0;j<15;j++) {
				Button btn = new Button(i,j,0);
				board.add(btn);
			}}
		board.setBackground(new Color(255,204,102));
		board.setPreferredSize(new Dimension(450,450));
		board.setVisible(true);
		
		frame.add(upper, BorderLayout.PAGE_START);
		frame.add(board);
		frame.setResizable(false);
		frame.setVisible(true);
	}
	public void end() {
		dispose();
	}
}