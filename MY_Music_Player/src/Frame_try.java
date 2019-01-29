import java.awt.*;
import java.awt.event.*;



import javax.swing.*;

public class Frame_try{

	public Frame_try()
	{
		 //����һ������
	    JFrame frame = new JFrame("MY_Music_Player");
	 	frame.setSize(400,400);
	 	frame.setBounds(350,140,1300,800);
	 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	
		JSplitPane vSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		vSplitPane.setDividerLocation(100);
		vSplitPane.setDividerSize(1);
		vSplitPane.setEnabled(true);

	 	//����ͼƬ
	 	ImageIcon middleone = new ImageIcon(Image.class.getResource("/Picture/bofang.png")); 
	 	ImageIcon leftone = new ImageIcon(Image.class.getResource("/Picture/left-circle.png")); 
	 	ImageIcon rightone = new ImageIcon(Image.class.getResource("/Picture/right-circle.png"));
	 	ImageIcon stopone = new ImageIcon(Image.class.getResource("/Picture/stop.png"));
		//����label����
		JLabel play = new JLabel();
		JLabel previous = new JLabel();
		JLabel stop = new JLabel();
		JLabel nextone = new JLabel();
		
		
		//��ͼƬ����Label�� 
		play.setIcon(middleone);
		//��������¼�
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
		
		
		//��label����panel��
		JPanel panel = new JPanel();
		panel.add(previous);
		panel.add(play);
		panel.add(stop);
		panel.add(nextone);
		
		//����panel�Ĵ�С��λ��
		panel.setBounds(5,5,4,4);
		frame.add(panel,BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT,1,1));
         
		
		//������ӻ�
		frame.setVisible(true);
		
	}

	}


