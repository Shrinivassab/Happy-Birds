package mygame;
public class mythread  extends Thread
{
	public int x,k=0;
	public int y;
	int num=0;
public void run()
{	
	myrandom();
while(zeroshot2.time>0)
	{
		try
		{
			sleep(800);
			change();
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
main.z.last();
	
	this.stop();
	
	
}
public void change()
{
	myrandom();
	zeroshotframe.z2.setvisible(x);
}
public void myrandom()
{
	x=(int)((1000*105*Math.random()+5)%main.z.z2.number);
	if(x==y||x==y+1||x==y-1)
	{
		myrandom();
	}
		y=x;
	}
}



