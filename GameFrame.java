package GUIdemo;

import javax.swing.JFrame;

import gameUtils.gameConstants;

public class GameFrame extends JFrame implements gameConstants{
	
	
	public GameFrame() {
		
		
		setTitle(GAME_TITLE);
		setSize(GAME_WIDTH,GAME_HEIGHT);
		setLocationRelativeTo(null);
		//setLocation(100,50);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		Board board = new Board();
		add(board);
		setVisible(true);
		
	}

	

	public static void main(String[] args) {
		
		GameFrame gameframe = new GameFrame();            //CONSTRUCTOR called when object created
		
		
	}

}
