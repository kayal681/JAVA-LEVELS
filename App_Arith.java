import java.awt.*;
import java.awt.event.*;
class App_Arith extends Frame implements ActionListener
{
	public static void main(String arg[])
	{
		App_Arith f=new App_Arith();
		f.setTitle("ARITHEMATIC");
		f.setSize(500,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	TextField t1,t2,t3;
	Button b1,b2,b3,b4;
	App_Arith()
	{
		FlowLayout f1=new FlowLayout();
		this.setLayout(f1);
		
		Panel p1=new Panel();
		Label l0=new Label("ARITHEMETIC OPERATION");
		p1.setBackground(Color.PINK);
		Font f0=new Font("Arial",Font.BOLD,20);
		l0.setFont(f0);
		p1.add(l0);
		p1.setBounds(0,30,500,50);
		this.add(p1);
		
		Label l1= new Label("Frist Number");
		l1.setForeground(Color.BLUE);
		Label l2= new Label("Second Number");
		l2.setForeground(Color.BLUE);
		Label l3= new Label("Result");
		l3.setForeground(Color.BLUE);
		
		 t1=new TextField(20);
		 t2=new TextField(20);
		 t3=new TextField(20);
		
	    b1=new Button("ADD");
		b1.setBackground(Color.ORANGE);
		b1.addActionListener(this);
		
	    b2=new Button("SUB");
		b2.addActionListener(this);
		b2.setBackground(Color.YELLOW);
		
	    b3=new Button("MULT");
		b3.setBackground(Color.RED);
		b3.addActionListener(this);
		
	    b4=new Button("DIV");
		b4.setBackground(Color.PINK);
		b4.addActionListener(this);
		
		this.add(l1);
		this.add(t1);
		this.add(l2);
		this.add(t2);
		this.add(l3);
		this.add(t3);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		l0.setBounds(100,50,250,30);
		l1.setBounds(50,100,150,30);
		l2.setBounds(50,150,150,30);
		l3.setBounds(50,200,150,30);
		t1.setBounds(200,100,150,30);
		t2.setBounds(200,150,150,30);
		t3.setBounds(200,200,150,30);
		b1.setBounds(50,250,80,30);
		b2.setBounds(150,250,80,30);
		b3.setBounds(250,250,80,30);
		b4.setBounds(350,250,80,30);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() ==b1)
		{
			String s1 = t1.getText();
			String s2 = t2.getText();
			int a = Integer.parseInt(s1);
			int b = Integer.parseInt(s2);
			int c = a+b;
			t3.setText(""+c);
		}
		if(ae.getSource() ==b2)
		{
			String s1 = t1.getText();
			String s2 = t2.getText();
			int a = Integer.parseInt(s1);
			int b = Integer.parseInt(s2);
			int c = a-b;
			t3.setText(""+c);
		}
		if(ae.getSource() ==b3)
		{
			String s1 = t1.getText();
			String s2 = t2.getText();
			int a = Integer.parseInt(s1);
			int b = Integer.parseInt(s2);
			int c = a*b;
			t3.setText(""+c);
		}
		if(ae.getSource() ==b4)
		{
			String s1 = t1.getText();
			String s2 = t2.getText();
			int a = Integer.parseInt(s1);
			int b = Integer.parseInt(s2);
			int c = a*b;
			t3.setText(""+c);
	}
	}
	
}

		
		
		
		
