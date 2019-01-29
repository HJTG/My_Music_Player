import java.awt.*;
import javazoom.*;
import java.io.*;
import javazoom.jl.player.Player;
public class start_start implements Runnable 
{
	private Player player;
	
	public void run()  //复写Runnable接口中的run（）方法
	{
		File musicFile = new File("D:\\网易云音乐\\CG孙昱成 - 关于你.mp3");
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
