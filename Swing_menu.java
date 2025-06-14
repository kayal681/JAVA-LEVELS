import javax.swing.*;
class swing_menu extends JFrame
{
public static void main(String args[])
{
swing_menu f = new swing_menu();
f.setSize(500,500);
f.setTitle("Notepade");
f.setVisible(true);
}
swing_menu()
{
JMenuBar mb = new JMenuBar();
JMenu file = new JMenu("File");
JMenu edit = new JMenu("Edit");
JMenuItem m1 = new JMenuItem ("New");
JMenuItem m2 = new JMenuItem ("Open");
JMenuItem m3 = new JMenuItem ("Cut");
JMenuItem m4 = new JMenuItem ("Copy");
file.add(m1);
file.add(m2);
edit.add(m3);
edit.add(m4);
mb.add(file);
mb.add(edit);
setJMenuBar(mb);

this.add(mb);
JTextArea ta = new JTextArea(20,50);
this.add(ta);
}
}
