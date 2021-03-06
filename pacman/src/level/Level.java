package level;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import pacman.Pacman;

public abstract class Level extends JPanel implements KeyListener,ActionListener{

	protected Board board;
	private String image="image/background.jpg";
	private JFrame window =new JFrame();
    private ImageIcon background ;
    private final int food=0;
    private final int wall=1;
    private final int gate=3;
    private final int pill=2;
    protected Pacman pacman;
    
	public Level(int numberOfBoard, Pacman pacman){
		 board = new Board(numberOfBoard);
	        background = new ImageIcon(image);
	        this.setFocusable(true);
	        
	        this.addKeyListener(this);
	        window.setBounds(100, 100, 600, 510);
	        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        window.setVisible(true);
	        window.add(this);
	        window.setResizable(false);
	        this.pacman=pacman;
	}
	
	public Level(){
		
	}
	
	public void paint(Graphics g){
        super.paint(g);
        g.drawImage(background.getImage(),0,0,600,510,null);
        draw(g);
        g.drawImage(pacman.getImage().getImage(), pacman.getX(), pacman.getY(), 15, 17, null);
    }
	
	
	  public void draw (Graphics g){
	      int count=0;
		  for (int i = 0; i <board.getArray().length ; i++) {
	            for (int j = 0; j < board.getArray()[0].length; j++) {
	                if (board.getArray()[j][i] == food) {//draw food
	                    g.setColor(Color.WHITE);
	                  count++;
	                    g.fillOval(i*15+8, j*15+8, 8, 8);
	                }
	                else  if (board.getArray()[j][i]  == wall){//draw wall
	                    g.setColor(Color.CYAN);
	                    g.fillRect(i*15+7, j*15+7, 15, 15);
	                }
	                else if(board.getArray()[j][i]  == pill){// draw pill
	                }
	                else if(board.getArray()[j][i]  == gate){//draw gate
	                	g.setColor(Color.black);
	                	g.fillRect(i*15+7, j*15+7, 15, 5);
	                }
	            }
//	            System.out.println(count);
	        }
	        System.out.println("ksntut");

	  }
	  
	  public boolean canMove(){
		  return pacman.canMove();
	  }
	  
	  public void move(KeyEvent e){
		 pacman.move(e);
		 //repaint();
		// pacman.repaint();
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
		}
}
