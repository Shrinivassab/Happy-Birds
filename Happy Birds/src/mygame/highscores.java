package mygame;
import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;


public class highscores extends JPanel implements MouseListener {
	
	Image img=Toolkit.getDefaultToolkit().getImage(new File("").getAbsoluteFile().getParent() +"\\ImageFiles");
	
	public highscores()
	{
		addMouseListener(this);
		
	}
	
	public void paintComponent(Graphics g)
	{
		g.drawImage(img,0,0,this);
		g.setColor(zeroshotframe.mc);
		g.setFont(new Font("Angrybirds",Font.PLAIN,85));
		g.drawString(""+Fileop.scores[0],600,270);
		g.drawString(""+Fileop.scores[1],600,365);
		g.drawString(""+Fileop.scores[2],600,460);
	}

	public void mouseClicked(MouseEvent e) {
		
	this.setVisible(false);
	zeroshotframe.l1.setVisible(true);
	}

	public void mouseEntered(MouseEvent e) {
	}
	
	public void mouseExited(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}
	
}
