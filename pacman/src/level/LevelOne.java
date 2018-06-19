package level;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;

import pacman.Ypacman;

public class LevelOne extends Level{


	public LevelOne(int numberOfBoard){
		super(numberOfBoard,new Ypacman(numberOfBoard));
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void keyPressed(KeyEvent e) {	
		
		if(canMove()){//if canMove is true, move the pacman.
			if (e.getKeyCode() ==KeyEvent.VK_RIGHT ){
				if(canMove()){s
				pacman.setX(pacman.getX()+pacman.getSpeed());
				pacman.setImage(pacman.getImage(2));
				this.repaint();
				}
			}
			else if (e.getKeyCode() ==KeyEvent.VK_LEFT ){
				pacman.setX(pacman.getX()+pacman.getSpeed());
				pacman.setImage(pacman.getImage(3));
				this.repaint();
			}
			else if (e.getKeyCode() ==KeyEvent.VK_UP ){
				pacman.setY(pacman.getY()+pacman.getSpeed());
				pacman.setImage(pacman.getImage(0));
				this.repaint();
			}
			else if (e.getKeyCode() ==KeyEvent.VK_DOWN ){
				pacman.setY(pacman.getY()+pacman.getSpeed());
				pacman.setImage(pacman.getImage(1));
				this.repaint();
			}
		}
	}
}
