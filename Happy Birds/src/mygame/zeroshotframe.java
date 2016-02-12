package mygame;
import java.awt.*;
import javax.swing.JFrame;
public class zeroshotframe extends JFrame 
{
	public static zeroshot2 z2=new zeroshot2();
	public static zeroshot1 z1=new zeroshot1();
	public static htpscreen h1=new htpscreen();
	public static highscores hi=new highscores();
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	public static last l1=new last(); 
	
	Fileop fileop=new Fileop();
	static Color mc=new Color(3,45,140);
	
public zeroshotframe(){
	super("Happy Birds");
}
	
	
	public void create1()
{
	l1.setVisible(false);
	add(z1);
	setSize(dim.width,dim.height);	
	setVisible(true);
	
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	z1.setVisible(true); 
}
public void create2()
{
	add(h1);
	z1.setVisible(false);
	h1.setVisible(true);
}
public void exe()
{
	z1.setVisible(false);
	add(z2);
	z2.setVisible(true);
	mythread m= new mythread();
	timethread t=new timethread();
	m.start();
	t.start();
}
public void last()
{
	zeroshot2.checkscores();
	Fileop.writetofile();
	z2.setVisible(false);
	add(l1);
	l1.setVisible(true);
}

public void highs()
{
	l1.setVisible(false);
	add(hi);
	hi.setVisible(true);
}
}