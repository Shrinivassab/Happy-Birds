package mygame;

import java.awt.Color;
import java.awt.Font;

public class timethread extends Thread{
	static int mytime=60;
	
	public void run()
	{
		while(mytime>0){
		zeroshot2.time=mytime--;
		main.z.z2.repaint();
	
		try {
			sleep(1000);
			if(mytime%10==0)
				zeroshot2.occur=false;
			
			}
		 catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		}
		zeroshot2.time--;
		this.stop();
	}


}
