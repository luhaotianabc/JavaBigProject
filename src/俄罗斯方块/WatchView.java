package 俄罗斯方块;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WatchView extends JPanel{

	/**
	 * �۲���Ϸ�÷֣����Ƶ���ģʽ��ʼ��ͣ����
	 */
	private static final long serialVersionUID = 3L;
	private JButton start,pause;
	private JLabel[][] nextUnit;
	private JPanel nextUnitPanel;
	private JLabel s,l;
	private FlowLayout layout;
	
	public int level,score;
	
	WatchView()
	{
		start = new JButton("��ʼ");
		pause = new JButton("��ͣ");
		s = new JLabel("����:0",JLabel.CENTER);
		l = new JLabel("�ؿ�:1",JLabel.CENTER);
		s.setPreferredSize(new Dimension(100,50));
		l.setPreferredSize(new Dimension(100,50));
		resetData();
		nextUnitPanel = new JPanel(new GridLayout(4,4));
		nextUnit = new JLabel[4][4];
		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
			{
				nextUnit[i][j] = new JLabel();
				nextUnit[i][j].setPreferredSize(new Dimension(20,20));
				nextUnit[i][j].setBackground(Color.YELLOW);
				nextUnitPanel.add(nextUnit[i][j]);
			}
		
		layout = new FlowLayout();
		layout.setVgap(30);
		this.setLayout(layout);
		this.add(nextUnitPanel);
		this.add(l);
		this.add(s);
		this.add(start);
		this.add(pause);
		this.setPreferredSize(new Dimension(100,500));
	}
	
	//��ʼ���ؿ���������Ϣ
	public void resetData()
	{
		score = 0;
		s.setText("����:"+score);
		level = 1;
		l.setText("�ؿ�:"+level);
	}
	
	//�ṩΪ��ť����ⲿ�������ķ���
	public void addStartListener(MouseListener m,KeyListener k)
	{
		start.addMouseListener(m);
		start.addKeyListener(k);
	}
	public void addPauseListener(MouseListener l)
	{
		pause.addMouseListener(l);
	}
	
	//��������ϵķ�����Ϣ
	public void updateData(int c,Unit p)
	{
		score += c*100;
		s.setText("����:"+score);
		level = score/1000 + 1;
		l.setText("�ؿ�:"+level);
		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
				nextUnit[i][j].setOpaque(false);
		for(Point u:p.getShape())
			nextUnit[u.x][u.y].setOpaque(true);
		nextUnitPanel.updateUI();
	}
	
	public int getLevel()
	{
		return level;
	}
}
