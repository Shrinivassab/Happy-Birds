package mygame;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import java.io.*;
public class main extends Applet{
public static zeroshotframe z=new zeroshotframe();
static AudioClip ad;
boolean x=true;

AudioClip song[ ] = new AudioClip[3];


public void init()
{
	try
	{
	File f=new File(new File("").getAbsoluteFile().getParent() + "\\SystemFiles");
	System.out.println(f);
	URL url=new URL(f.toURL(),"");
	AudioClip ad=getAudioClip(url,"locowav.wav");
	ad.play();
	z.create1();
		
	while(true)
	{
	
	if(x){
	ad.loop();
	x=false;
	}
	}
	
}
	catch(MalformedURLException e){}
}		

}

	
	

	

