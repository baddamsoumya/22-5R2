import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
e
classA extends JFrame implements ActionListener
{
JLabel L1,L2,L3;
JTextField tf1,tf2,tf3;

JButton b1;
A()
{
Set Default Close Operation(JFrame.EXIT_ON_CLOSE);
SetLayout(new FlowLayout());
L1=new JLabel