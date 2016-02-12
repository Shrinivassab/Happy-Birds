package mygame;

import java.io.*;

public class Fileop {
	static File file=new File(new File("").getAbsoluteFile().getParent() +"\\SystemFiles\\highscores.txt");
	int num=0;
	static int[] scores=new int[3];
	static String finalvalue;
		
	public Fileop(){
	
	try{
	FileReader fr=new FileReader(file);
	BufferedReader br=new BufferedReader(fr);
	while(num<3){
		scores[num]=(int)Double.parseDouble(br.readLine());
		num++;
	}
	}catch(IOException e)
	{}
	}
	public static void writetofile()
	{
		try{	
			FileWriter write = new FileWriter(file);
			PrintWriter print= new PrintWriter(write);
			
			for(int i=0;i<3;i++){
			print.println(scores[i]);
			}
			print.close();
			write.close();
		}
		catch(IOException e)
		{}
	}
}
