package menus;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import level.LevelOne;

public class SecondMenu extends JFrame implements ActionListener{

	JButton one, two, three, exit;
	private ImageIcon background;
	private String image="image/back.jpg";
	
	public SecondMenu (){
		setBounds(200, 100, 500, 350);
		background= new ImageIcon(image);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new JLabel(background));
		initButton();
		JLabel label = new JLabel("PACMAN");
		label.setFont(new Font("Chiller", Font.BOLD ,44));
		label.setBounds(170, 10, 200, 80);
		getContentPane().add(label);
	}//constructor
	
	/**this function initialize all the buttons.
	 */
	private void initButton(){
		one=new JButton("one");//board number one
		one.setBounds(20, 270, 70, 20);
		getContentPane().add(one);
		one.addActionListener(this);
		one.setFocusable(false);
		one.setVisible(true);
		two=new JButton("two");//board number two
		two.setBounds(200, 270, 70, 20);
		getContentPane().add(two);
		two.addActionListener(this);
		two.setFocusable(false);
		two.setVisible(true);
		three=new JButton("three");//board number three
		three.setBounds(380, 270, 70, 20);
		getContentPane().add(three);
		three.addActionListener(this);
		three.setFocusable(false);
		three.setVisible(true);
		exit= new JButton("Exit");
		exit.setBounds(180, 150, 100, 20);
		getContentPane().add(exit);
		exit.addActionListener(this);
		exit.setFocusable(false);
		exit.setVisible(true);
	}//close initButton
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(one)){//open board number one.
			new LevelOne(1);
			dispose();
		}
		else if (e.getSource().equals(two)){//open board number two.
			new LevelOne(2);
			dispose();
		}
		else if (e.getSource().equals(three)){//open board number three.
			new LevelOne(3);
			dispose();
		}
		else if (e.getSource().equals(exit)){//close the game when the button exit is pushed.
			dispose();
		}
	}//close actionPerformed
	
//	   public void paint(Graphics g){
//	        super.paint(g);
//	        g.drawImage(background.getImage(),0,0,this);
//	    }//paint
//	   
}
