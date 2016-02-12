package mygame;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.InputStream;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class last extends JPanel implements MouseListener
{
	Image bg=Toolkit.getDefaultToolkit().getImage(new File("").getAbsoluteFile().getParent() +"\\ImageFiles\\end.jpg");
	Image bg2=Toolkit.getDefaultToolkit().getImage(new File("").getAbsoluteFile().getParent() +"\\ImageFiles\\highend.jpg");
	ImageIcon sg=new ImageIcon(new File("").getAbsoluteFile().getParent() +"\\ImageFiles\\buttonsmall.gif");
	JButton b1=new JButton(sg);
	JButton b2=new JButton(sg);
	JPanel p1=new JPanel();
	
	
	    
public last()
{
	b1.setOpaque(false);
	b1.setContentAreaFilled(false);
	b1.setBorderPainted(false);
	b1.setEnabled(true);
	b2.setOpaque(false);
	b2.setContentAreaFilled(false);
	b2.setBorderPainted(false);
	b2.setEnabled(true);
	p1.setOpaque(false);
	setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
	add(Box.createRigidArea(new Dimension(350,270)));
	add(p1);
	p1.add(b1);	
	p1.add(Box.createRigidArea(new Dimension(260,290)));
	p1.add(b2);
	b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
	b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
	b1.addMouseListener(this);
	b2.addMouseListener(this);
}
public void paint(Graphics g)
{
	if(zeroshot2.scorechange==true)
		g.drawImage(bg2,0,0,this);
	else
		g.drawImage(bg,0,0,this);
	g.setColor(zeroshotframe.mc);
	g.setFont(new Font("Angrybirds",Font.PLAIN,100));
	g.drawString(""+zeroshot2.score,630,250);
	
}
public void mouseClicked(MouseEvent e) 
{
if(e.getSource()==b1)
{
zeroshot2.score=0;
timethread.mytime=60;
zeroshot2.time=60;
zeroshot2.scorechange=false;
main.z.create1();	
}

if(e.getSource()==b2)
{
	main.z.highs();

}
}
public void mousePressed(MouseEvent arg0) {}
public void mouseReleased(MouseEvent arg0) {}
public void mouseEntered(MouseEvent arg0) {}
public void mouseExited(MouseEvent arg0) {}
}
