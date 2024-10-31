import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class STEP_10_GUI_2 {
	public static void main(String[] args) {
		class add_clickListener implements ActionListener {
			JTextField		txt;
			int			nc = 0;

			add_clickListener(JTextField txt) {
				this.txt = txt;
			}
			public void actionPerformed(ActionEvent e) {
				txt.setText("Count : " + ++nc);
			}
		}
		class sub_clickListener implements ActionListener {
			JTextField		txt;
			int			nc = 0;

			public void actionPerformed(ActionEvent e) {
				txt.setText("Count : " + --nc);
			}
		}
		class endListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			} 
		}
		JFrame frame = new JFrame("GUI_10_2");

		JPanel panel = new JPanel();
		panel.setBackground(Color.gray);
		panel.setPreferredSize(new Dimension(500,500));

		JTextField txt = new JTextField("Click count : " + 0);
		txt.setBounds(100, 100, 200, 30);
		
		JButton btn_Add_click = new JButton("Add Click");
		btn_Add_click.setBounds(150, 200, 80, 30);
		add_clickListener at1_click = new add_clickListener(txt);
		btn_Add_click.addActionListener(at1_click);

		JButton btn_Sub_click = new JButton("Sub Click");
		btn_Sub_click.setBounds(150, 300, 80, 30);
		btn_Sub_click.addActionListener(new sub_clickListener(txt));

		JButton btn_end = new JButton("End");
		btn_end.setBounds(150, 400, 80, 30);
		btn_end.addActionListener(new endListener());

		panel.setLayout(null);
		panel.add(txt);
		panel.add(btn_Add_click);
		panel.add(btn_Sub_click);
		panel.add(btn_end);

		frame.getContentPane().add(panel);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		System.out.println("Console thread is going out !!!");
	}
}						// STEP_10/w2/STEP_10_GUI_2.java