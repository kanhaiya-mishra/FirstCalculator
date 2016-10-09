
import java.awt.GridLayout;
import java.lang.Math.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.*;
import javax.swing.*;
public class calculator {
	int change;
	JFrame frame;
	JButton o1,o2,o3,o4,o5,o6,o7,o8,o9,o10,o11,o12,eqb;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	JPanel panel1, panel11, panel12,panel2,panel3,panel4;
	String s,op;
	JTextArea ta;
	JRadioButton jr1, jr2;
	ButtonGroup group;
	static double a, b ,calc=0, result,rad;
	static int operator;
	public static void main(String[] args) {
		calculator play = new calculator();
		play.go();

	}
public void go(){
	frame= new JFrame();
	panel1 = new JPanel();
	panel2 = new JPanel();
	panel3 = new JPanel();
	panel4 = new JPanel();
	panel11 = new JPanel();
	panel12 = new JPanel();
	frame.setResizable(false);
	frame.setTitle("My First Calculator");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocationRelativeTo(null);
	
	
	ta = new JTextArea(2,20);
	ta.setEditable(false);
	panel11.add(ta);
	
	 
	 jr1 = new JRadioButton("Degree");
     jr2 = new JRadioButton("Radian");
     group = new ButtonGroup();
     group.add(jr1);
     group.add(jr2);
     jr1.setSelected(true);
     jr1.setActionCommand("Degree");
     jr2.setActionCommand("Radian");
     jr1.addActionListener(new clicked());
     jr2.addActionListener(new clicked());
     panel12.add(jr1);
     panel12.add(jr2);
	 

 	 panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
 	 panel1.add(panel11);
 	 panel1.add(panel12);
 	
 	
     b0 = new JButton("0");
	 b1 = new JButton("1");
     b2 = new JButton("2");
     b3 = new JButton("3");
     b4 = new JButton("4");
     b5 = new JButton("5");
     b6 = new JButton("6");
     b7 = new JButton("7");
     b8 = new JButton("8");
     b9 = new JButton("9");
     b0 = new JButton("0");
     o4 = new JButton("clear");
     o5 = new JButton("/");
     o6 = new JButton("sin");
     o7 = new JButton("cos");
     o8 = new JButton("tan");
     o9 = new JButton("log");
     eqb = new JButton("=");
     
     
     b0.addActionListener(new clicked());
     b1.addActionListener(new clicked());
     b2.addActionListener(new clicked());
     b3.addActionListener(new clicked());
     b4.addActionListener(new clicked());
     b5.addActionListener(new clicked());
     b6.addActionListener(new clicked());
     b7.addActionListener(new clicked());
     b8.addActionListener(new clicked());
     b9.addActionListener(new clicked());
     o4.addActionListener(new clicked());
 	 o5.addActionListener(new clicked());
 	 o6.addActionListener(new clicked());
 	 o7.addActionListener(new clicked());
 	 o8.addActionListener(new clicked());
 	 o9.addActionListener(new clicked());
     eqb.addActionListener(new clicked());
    
   
    panel2.setLayout(new GridLayout(4,4));
 	
    panel2.add(o6);
	panel2.add(o7);
	panel2.add(o8);
	panel2.add(o9);
    panel2.add(b1);
	panel2.add(b2);
	panel2.add(b3);
	panel2.add(b4);
	panel2.add(b5);
	panel2.add(b6);
	panel2.add(b7);
	panel2.add(b8);
	panel2.add(b9);
	panel2.add(b0);
	panel2.add(o5);
	panel2.add(o4);
	
	
	
	o1 = new JButton("+");
	o2 = new JButton("-");
	o3 = new JButton("x");
	
	o1.addActionListener(new clicked());
	o2.addActionListener(new clicked());
	o3.addActionListener(new clicked());
	
	
	panel3.setLayout(new GridLayout(4,1));
	
	panel3.add(o1);
	panel3.add(o2);
	panel3.add(o3);
	panel3.add(eqb);
	
	frame.getContentPane().add(BorderLayout.NORTH,panel1);
	frame.getContentPane().add(BorderLayout.EAST,panel3);
	frame.getContentPane().add(BorderLayout.CENTER, panel2);
	frame.setSize(300,400);
	frame.setVisible(true);
	
}
class clicked implements ActionListener{
	public void actionPerformed(ActionEvent event) {
		
		 if(event.getSource()==b1)
	            ta.setText(ta.getText().concat("1"));
	        
	        if(event.getSource()==b2)
	            ta.setText(ta.getText().concat("2"));
	        
	        if(event.getSource()==b3)
	            ta.setText(ta.getText().concat("3"));
	        
	        if(event.getSource()==b4)
	            ta.setText(ta.getText().concat("4"));
	        
	        if(event.getSource()==b5)
	            ta.setText(ta.getText().concat("5"));
	        
	        if(event.getSource()==b6)
	            ta.setText(ta.getText().concat("6"));
	        
	        if(event.getSource()==b7)
	            ta.setText(ta.getText().concat("7"));
	        
	        if(event.getSource()==b8)
	            ta.setText(ta.getText().concat("8"));
	        
	        if(event.getSource()==b9)
	            ta.setText(ta.getText().concat("9"));
	        
	        if(event.getSource()==b0)
	            ta.setText(ta.getText().concat("0"));
	   
	        if(event.getSource()==o1)
		{
			a=Double.parseDouble(ta.getText());
			operator = 1;
			ta.setText("");
		}
		if(event.getSource()==o2)
		{
			a=Double.parseDouble(ta.getText());
			operator = 2;
			ta.setText("");
		}
		if(event.getSource()==o3)
		{
			a=Double.parseDouble(ta.getText());
			operator = 3;
			ta.setText("");
		}
		if(event.getSource()==o4)
		{
			ta.setText("");
			a=0;
			b=0;
			change=0;
			rad=0;
		}
		if(event.getSource()==o5)
		{
			a=Double.parseDouble(ta.getText());
			operator = 4;
			ta.setText("");
		}
		if(event.getActionCommand()=="DEGREE"){ta.setText("Degree selected hai");}
		if(event.getSource()==o6)
		{
			if(!ta.getText().isEmpty())
			{
			ta.setText("Syntax Error");
			}
			else
			{
				operator = 5;
			}
		}
		if(event.getSource()==o7)
		{
			if(!ta.getText().isEmpty())
			{
			ta.setText("Syntax Error");
			}
			else
			{
				operator = 6;
			}
		}
		if(event.getSource()==o8)
		{
			if(!ta.getText().isEmpty())
			{
			ta.setText("Syntax Error");
			}
			else
			{
				operator = 7;
			}
		}
		if(event.getSource()==o9)
		{
			if(!ta.getText().isEmpty())
			{
			ta.setText("Syntax Error");
			}
			else
			{
				operator = 8;
			}
		}
	    if(event.getSource()==eqb){
	         if(ta.getText().isEmpty())
	         {
	        	 ta.setText("Enter Value.. Try Again");
	         }
	         
	         else
	         { b=Double.parseDouble(ta.getText());
	        	 switch(operator)
	            {
	                case 1: result=a+b;op=" + ";change=1;
	                    break;
	 
	                case 2: result=a-b;op=" - ";change=1;
	                    break;
	        
	                case 3: result=a*b;op=" * ";change=1;
	                    break;
	        
	                case 4: result=a/b;op=" / ";change=1;
	                    break;
	                case 5: 
	                	
	                	if(group.getSelection().getActionCommand()=="Degree")
	                	{
	                		rad = b*Math.PI/180;
	                	}
	                	else{rad=b;}
	                	result =Math.sin(rad);op="sin ";change=2;
                    break;
                
	                case 6: 
	                	if(group.getSelection().getActionCommand()=="Degree")
	                	{
	                		rad = b*Math.PI/180;
	                	}
	                	else{rad=b;}
	                	result = Math.cos(rad);op="cos ";change=2;
                    break;
                
	                case 7: 
	                	if(group.getSelection().getActionCommand()=="Degree")
	                	{
	                		rad = b*Math.PI/180;
	                	}
	                	else{rad=b;}
	                	result = Math.tan(rad);op="tan ";change=2;
                    break;
                
	                case 8: result = Math.log(b);op="log ";change=2;
                    break;
                
                    
	            }
	            if(change==1)
	            {ta.setText(Double.toString(a)+op+Double.toString(b)+"\t = " +Double.toString(result));}
	            if(change==2){
	              	ta.setText(op+Double.toString(b)+"   = " +Double.toString(result));
	            }
	    }
	    } 
	   }
	        
	}

}