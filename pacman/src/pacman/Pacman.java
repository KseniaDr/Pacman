package pacman;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import level.Board;

public abstract class Pacman {

	protected int lives=3;
	private String [] images;
	protected Board board;
	private int x, x1;
	private int y, y1;
	private final int speed;
	protected ImageIcon pacImage;

	public Pacman(String up, String down, String right, String left, int numofBoard, int speed){
		images=new String [4];
		images[0]=up;
		images[1]=down;
		images[2]=right;
		images[3]=left;
		board=new Board(numofBoard);
		this.speed=speed;
		x=16*15+7;
		y=18*15+4;
		x1=16;
		y1=18;
		pacImage=new ImageIcon(images[3]);
	}



	/**this function checks if the pacman can move to a certain point on the board. 
	 * @param x- the x point
	 * @param y- the y point
	 * @return true if the pacman can move to this point and false of the pacman can't move there.
	 */
	public boolean canMove(){
		if(board.getArray()[x1][y1]==1 || board.getArray()[x1][y1]==3)//check if i'ts a wall or a gate
			return false;
		return true;
	}//close canMove

	/**
	 * @param e
	 */
	public void move(KeyEvent e){
		if (e.getKeyCode() ==KeyEvent.VK_RIGHT ){
			x=(x+speed);
			pacImage=new ImageIcon(images[2]);
		}
		else if (e.getKeyCode() ==KeyEvent.VK_LEFT ){
			x=(x-speed);
			pacImage=new ImageIcon(images[3]);
		}
		else if (e.getKeyCode() ==KeyEvent.VK_UP ){
			y=(y-speed);
			pacImage=new ImageIcon(images[0]);
		}
		else if (e.getKeyCode() ==KeyEvent.VK_DOWN ){
			y=(y+speed);
			pacImage=new ImageIcon(images[1]);
		}
	}

	public void paint(Graphics g){

	}
	public String[] getImages(){
		return images;
	}
	public ImageIcon getImage(){
		return pacImage;
	}

	public String getImage(int i){
		return images[i];
	}
	
	public int getX(){
		return x;
	}
	
	public void setX(int x){
		this.x=x;
	}

	public int getY(){
		return y;
	}
	
	public void setY(int y){
		this.y=y;
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public void setImage(String s){
		pacImage=new ImageIcon(s);
	}
}


