package mygame;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
public class zeroshot2 extends JPanel implements ActionListener
{
	Image bg2=Toolkit.getDefaultToolkit().getImage(new File("").getAbsoluteFile().getParent() +"\\ImageFiles\\second2.jpg");
	static ImageIcon pig=new ImageIcon(new File("").getAbsoluteFile().getParent() +"\\ImageFiles\\pig.jpg");
	static ImageIcon bird=new ImageIcon(new File("").getAbsoluteFile().getParent() +"\\ImageFiles\\bird3.jpg");
	public int picdis=110;
	boolean oncebird=true;
	static final int number=30;
	static int score=0,time=60;
	public int k=1;
	static boolean occur=false;
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JButton[] object=new JButton[number];
	int randomizer=1,previous;
	int a;
	boolean previcon=false;
	static boolean scorechange=false;
	
public zeroshot2()
{
	for(int i=0;i<number;i++)
	 {

		object[i]=new JButton(pig);
		object[i].addActionListener(this);
		object[i].setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		object[i].setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));	
		object[i].setVisible(false);
	
	}
	for(int i=0;i<10;i++)
	{
		 p1.add(object[i]);
		 p1.add(Box.createRigidArea(new Dimension(picdis,picdis)));
	 }
    for(int i=10;i<20;i++)
    {
		 p2.add(object[i]);
		 p2.add(Box.createRigidArea(new Dimension(picdis,picdis)));
	 }
    for(int i=20;i<30;i++)
    {
		 p3.add(object[i]);
		 p3.add(Box.createRigidArea(new Dimension(picdis,picdis)));
	 }
    setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
    
    p1.setOpaque(false);
    p2.setOpaque(false);
    p3.setOpaque(false);
    add(Box.createRigidArea(new Dimension(50,150)));
    add(p1);
    add(p2);
    add(p3);
}
public void paintComponent(Graphics g)
{
	g.drawImage(bg2,0,0,this);
	g.setColor(zeroshotframe.mc);
	g.setFont(new Font("Angrybirds",Font.PLAIN,65));
	g.drawString(""+score,1205,85);
	g.drawString(""+time,155,85);
}

public void setvisible(int x)
{
	for(int i=0;i<number;i++)
	{
		if(i!=x)
		{
		object[i].setVisible(false);
	} 
	}
	if(previcon==true)
	{
		object[previous].setIcon(pig);
		previcon=false;
	}
	if(occur==false){
	a=(int)((Math.random()*100000000)%10);
	System.out.println(a);
	if(a==1||a==7)
	{	
		object[x].setIcon(bird);
		previcon=true;
		previous=x;
		occur=true;
		
	}
	}
	object[x].setVisible(true);
	
}
public void actionPerformed(ActionEvent e) 
{
	
	if(previcon==true)
	{
		if(oncebird==true){
		if(score>50)
			score-=50;
		else 
			score=0;
	
		oncebird=false;
		
		}
	}
	else
		score+=10;
		oncebird=true;
	repaint();
}

public static void checkscores()
{
	for(int i=0;i<3;i++){
	if(score>Fileop.scores[i])
	{
		if(i==0){
		Fileop.scores[i+2]=Fileop.scores[i+1];
		Fileop.scores[i+1]=Fileop.scores[i];
		}
		
		else if(i==1)
		{
			Fileop.scores[i+1]=Fileop.scores[i];
		}
		
		Fileop.scores[i]=score;
		scorechange=true;
		break;
	
	}
}
}
}
	

