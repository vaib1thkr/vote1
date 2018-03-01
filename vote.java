import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class vote implements ActionListener
{
	JFrame a;
	JRadioButton b1,b2,b3,b4;
	JButton b,e;
	JPanel c;
	JLabel d;
	ButtonGroup g;
	int k,l,m,z1;
	vote()
	{
		a = new JFrame("!!VOTE!!");
		c = new JPanel();
		c.setLayout(null);
		g = new ButtonGroup();
		JLabel label = new JLabel("!! VOTE !! SUPPORT !! DUA !!",SwingConstants.CENTER);
        label.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 40));
		label.setOpaque(true); 
        label.setBackground(Color.GRAY); 
        label.setForeground(Color.RED);                
        label.setBounds(0,20,600,40);
        c.add(label);
        b1 = new JRadioButton("BALLOT NO. 1: Mr. MASQOOR RIAZ");
		b1.setForeground(Color.GREEN);
		b1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		b1.setBounds(60,100,600,40);
		b2 = new JRadioButton("BALLOT NO. 2: Mr. ABDUL IMAM");
		b2.setForeground(Color.GREEN);
		b2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		b2.setBounds(60,140,600,40);
		b3 = new JRadioButton("BALLOT NO. 3: Mr. FAIZUL HASAN");
		b3.setForeground(Color.GREEN);
		b3.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		b3.setBounds(60,180,600,40);
		b4 = new JRadioButton("BALLOT NO. 4: Mr. NABEEL USMANI");
		b4.setForeground(Color.GREEN);
		b4.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		b4.setBounds(60,220,600,40);
		b = new JButton("Click To Vote");
		b.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(180,300,200,30);
		d = new JLabel("For Results CLICK   ----------->");
        d.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        d.setBounds(60,400,350,20);
        e = new JButton("RESULT");
        e.setBounds(350,400,200,30);
        e.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		g.add(b1); 
		g.add(b2);
		g.add(b3); 
		g.add(b4);
		c.add(b1); 
		c.add(b2); 
		c.add(b3); 
		c.add(b4);
		c.add(b); 
		c.add(e); 
		c.add(d);
		a.add(c);
		a.setSize(600,600);
		//a.setLocationRelativeTo(null);
		a.setVisible(true);
		b.addActionListener(this);
		e.addActionListener(this);
	}
	public void actionPerformed(ActionEvent Z)
	{
		if(Z.getSource()==b)
		{
    		int dialogButton = JOptionPane.YES_NO_OPTION;
			int n = JOptionPane.showConfirmDialog(a, "CONFIRM ??", "CONFIRMATION", dialogButton);
			if(n == JOptionPane.YES_OPTION)
			{
				if(b1.isSelected())
				{
					k++;
				}
				else 
					if(b2.isSelected())
				{
					l++;
				}
				else
					if(b3.isSelected())
				{
					m++;
				}
				else
					if(b4.isSelected())
				{
					z1++;
				}
				else
					JOptionPane.showMessageDialog(null, "You have not selected any candidate!!");
			}
		}
		else 
		{
			JOptionPane.showMessageDialog(null,"Candidate 1 :"+k+" Candidate 2: "+l+"\nCandidate 3: "+m+" Candidate 4: "+z1, "Result",1);
		}	
	}
	public static void main(String[] args)
	{
		new vote();
	}
}