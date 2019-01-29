import java.awt.*;
import java.awt.event.*;



import javax.swing.*;

public class Frame_try{

	public Frame_try()
	{
		 //建立一个窗口
	    JFrame frame = new JFrame("MY_Music_Player");
	 	frame.setSize(400,400);
	 	frame.setBounds(350,140,1300,800);
	 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	
		JSplitPane vSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		vSplitPane.setDividerLocation(100);
		vSplitPane.setDividerSize(1);
		vSplitPane.setEnabled(true);

	 	//加载图片
	 	ImageIcon middleone = new ImageIcon(Image.class.getResource("/Picture/bofang.png")); 
	 	ImageIcon leftone = new ImageIcon(Image.class.getResource("/Picture/left-circle.png")); 
	 	ImageIcon rightone = new ImageIcon(Image.class.getResource("/Picture/right-circle.png"));
	 	ImageIcon stopone = new ImageIcon(Image.class.getResource("/Picture/stop.png"));
		//创建label对象
		JLabel play = new JLabel();
		JLabel previous = new JLabel();
		JLabel stop = new JLabel();
		JLabel nextone = new JLabel();
		
		
		//将图片放在Label中 
		play.setIcon(middleone);
		//建立点击事件
		play.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				start_start newTh = new start_start();
				new Thread(newTh).start();
			}
		});
		
		
		

		previous.setIcon(leftone);
		nextone.setIcon(rightone);
		stop.setIcon(stopone);
		
		
		//将label放入panel中
		JPanel panel = new JPanel();
		panel.add(previous);
		panel.add(play);
		panel.add(stop);
		panel.add(nextone);
		
		//设置panel的大小与位置
		panel.setBounds(5,5,4,4);
		frame.add(panel,BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT,1,1));
         
		
		//界面可视化
		frame.setVisible(true);
		
	}

	}


