package 俄罗斯方块;



import java.awt.EventQueue;

import javax.swing.JOptionPane;

public class Main {

	/**
	 * 0.����Ϸʵ������ҵ��Ҫ��ļ���ȫ�����ܣ���ϸ�������£�
	 * 
	 * 1.�����������ܣ�ͨ�����̷�������ݷ��飬���ƺ����㷨�����Լ�д��
	 * 
	 * 2.��Ϸ�����мƷ֣������ݷ��������¹ؿ����ӿ췽������ٶ�
	 * 
	 * 3.�����Ҳ����۲쵽��һ��������ֽ׶η������ؿ�
	 * 
	 * 4.��Ϸ�е���ģʽ��˫��ģʽ����Ϸ��ʼʱ������Ϣ���ѡ��ģʽ
	 * 
	 * 5.����ģʽ�¿���ʱ��ʼ����ͣ����Ϸ�������֪���յ÷�
	 * 
	 * 6.����������˫��ģʽ��Ĭ��˫��ģʽ��ip���ڱ��أ��ɸ���
	 * 
	 * 7.˫��ģʽ�¿ɿ����Է�ս������ͨ���Լ���ȥ����Ϊ�Է�������������һ��ʧ��ʱ��Ϸ��������֪ͨ˫���ɹ���ʧ��
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				Object[] options ={ "����", "˫��" };  
				int m = JOptionPane.showOptionDialog(null, "��ѡ����Ϸģʽ", "����˹����",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
				if(m==0)
					singleGame();
				else if(m==1)
					doubleGame();
				
			}
			private void singleGame()
			{
				GameFrame player = new GameFrame();
				player.setVisible(true);
			}
			private void doubleGame()
			{
				DoubleGameFrame player1 = new DoubleGameFrame("192.168.17.185",5000,4000);
				player1.setVisible(true);
			}
		});
	}

}
