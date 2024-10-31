import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class STEP_10_GUI_5 implements ActionListener {
	class MyPanel extends JPanel {
		MyPanel() {
			setBackground(Color.gray);
			setPreferredSize(new Dimension(400,400));
		}
		public void paintComponent(Graphics g) {
			g.setColor(Color.red);
			g.drawRect(50,50,300,300);
			g.setColor(Color.blue);
			g.drawRect(27,27,350,350);
		}
	}
	JTextField txt;
	STEP_10_GUI_5() {
		JFrame frame = new JFrame("GUI_10_5");
		JPanel panel = new MyPanel();

		txt = new JTextField("Click count : " + 0);
		txt.setBounds(100, 100, 200, 30);

		JButton btn_yes = new JButton("Yes");
			btn_yes.setBounds(150, 150, 80, 30);

		JButton btn_no = new JButton("No");
			btn_no. setBounds(150, 200, 80, 30);
			btn_yes.addActionListener(this);
			btn_no .addActionListener(this);

		JButton btn_end = new JButton("End");
			btn_end.setBounds(150, 300, 70, 30);
			btn_end.addActionListener(new ActionListener() {
					int	i = 0;
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});
		panel.setLayout(null);

		panel.add(txt);
		panel.add(btn_yes);
		panel.add(btn_no );
		panel.add(btn_end);
	
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	int			nc1 = 0, nc2 = 0;	

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Yes"))
			txt.setText("Yes Count : " + ++nc1);
		else
			txt.setText("No  Count : " + ++nc2);			
	}

	public static void main(String[] args) {
		STEP_10_GUI_5 main_obj = new STEP_10_GUI_5();

		System.out.println("Console thread is going out !!!");
	}
}						// STEP_10/w5/STEP_10_GUI_5.java


