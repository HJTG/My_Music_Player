import java.awt.*;
import javazoom.*;
import java.io.*;
import javazoom.jl.player.Player;
public class start_start implements Runnable 
{
	private Player player;
	
	public void run()  //��дRunnable�ӿ��е�run��������
	{
		File musicFile = new File("D:\\����������\\CG���ų� - ������.mp3");
		try 
		{
			FileInputStream fis=new FileInputStream(musicFile);
			BufferedInputStream stream=new BufferedInputStream(fis);
	        player = new Player(stream);
	        player.play();
		}catch(Exception e) {
			e.printStackTrace();
		}
		 
	
	}
		
		
		
		
		
			
		
	
	
	
	
	
}
