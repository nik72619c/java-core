package GUIdemo;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.Timer;

import gameUtils.gameConstants;

public class Board extends JPanel implements gameConstants {
	
	private Timer timer;
	int SPEED=15;
	int x=100;
	int y=100;
	int ySPEED=SPEED;
	
	public Board(){
		
		
		setSize(GAME_WIDTH,GAME_HEIGHT);
		setBackground(Color.CYAN);
		gameloop();
		
	}

	@Override
	public void paintComponent(Graphics g) {
		
	
		
		super.paintComponent(g);
		
		
		g.setColor(Color.RED);
		g.fillOval(x,y,50,50);
		g.setColor(Color.WHITE);
		g.fillOval(99,99,20,20);
		
		
	}
	
	public void gameloop() {
		
		Timer timer1 = new Timer(SPEED,(e)-> {
			
			repaint();
			move();
			changeDirection();
		});
		
		
		Timer timer2= new Timer(SPEED,(e)-> {
			
			repaint();
			move();
			changeDirection();
			
			
		});
		timer1.start();
		timer2.start();
	}
	
	
	
	public void move() {
		
		x+=SPEED;
		y+=ySPEED;
		
	}
	
	public void changeDirection() {
		
		if(x>=(GAME_WIDTH-50)) {
			
			SPEED-=15;
		}
		
		if(x<=0) {
			
			SPEED+=15;
		}
		
		if(y>=(GAME_HEIGHT-50)) {
			
			ySPEED-=15;
		}
		
		if(y<=0) {
			
			ySPEED+=15;
		}
	}
}
