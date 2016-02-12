package mygame;
import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
public class htpscreen extends JPanel implements MouseListener
{
	Image img=Toolkit.getDefaultToolkit().getImage(new File("").getAbsoluteFile().getParent() +"\\ImageFiles\\howtoplayscreen.jpg");
public htpscreen()
{
	addMouseListener(this);
}
public void paint(Graphics g)
{
	g.drawImage(img,0,0,this);
}
public void mouseClicked(MouseEvent arg0) 
{
	this.setVisible(false);
	zeroshotframe.z1.setVisible(true);
}
public void mousePressed(MouseEvent arg0){}
public void mouseReleased(MouseEvent arg0){}
public void mouseEntered(MouseEvent arg0){}
public void mouseExited(MouseEvent arg0){}
}
	
	


