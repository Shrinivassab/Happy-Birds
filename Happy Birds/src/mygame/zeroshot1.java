package mygame;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class zeroshot1 extends JPanel implements MouseListener
{
	Image bg=Toolkit.getDefaultToolkit().getImage(new File("").getAbsoluteFile().getParent() +"\\ImageFiles\\happybirds.jpg");
	ImageIcon sg=new ImageIcon(new File("").getAbsoluteFile().getParent() +"\\ImageFiles\\buttonsmall.gif");
	JButton startgame=new JButton(sg);
	JButton howtoplay=new JButton(sg);
	JPanel p1=new JPanel();
public zeroshot1()
{
	p1.setLayout(new BoxLayout(p1,BoxLayout.X_AXIS));
	startgame.setOpaque(true);
	startgame.setContentAreaFilled(false);
	startgame.setBorderPainted(false);
	howtoplay.setOpaque(true);
	howtoplay.setContentAreaFilled(false);
	howtoplay.setBorderPainted(false);
	p1.add(startgame);
	p1.add(Box.createRigidArea(new Dimension(240,290)));
	p1.add(howtoplay);
	p1.setOpaque(false);
	startgame.addMouseListener(this);
	howtoplay.addMouseListener(this);
	startgame.setCursor(new Cursor(Cursor.HAND_CURSOR));
	howtoplay.setCursor(new Cursor(Cursor.HAND_CURSOR));
	setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
	add(Box.createRigidArea(new Dimension(0,330)));
	add(p1);
}

public void mouseClicked(MouseEvent e ) 
{	if(e.getSource()==startgame)
	{
		main.z.exe();
	}
	if(e.getSource()==howtoplay)
	{
		main.z.create2();
	}
		this.setVisible(false);
}
public void mousePressed(MouseEvent arg0){}
public void mouseReleased(MouseEvent arg0){}
public void mouseEntered(MouseEvent arg0){}
public void mouseExited(MouseEvent arg0){}
public void paint(Graphics g)
{
	g.drawImage(bg,0,0,this);
}
}

