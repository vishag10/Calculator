import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Project implements ActionListener {

	boolean isoperatorclicked = false;
	String oldvalue;
    char operator;
    float result;

	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton zeroButton;
	JButton addButton;
	JButton subButton;
	JButton mulButton;
	JButton divButton;
	JButton dotButton;
	JButton equalButton,clearButton;
public Project() {
jf=new JFrame("calculator");
jf.setLayout(null);
jf.setSize(600,600);
jf.setLocation(800,150);

displayLabel=new JLabel("");
displayLabel.setBounds(30,50,540,40);
displayLabel.setBackground(Color.gray);
displayLabel.setOpaque(true);
displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
displayLabel.setForeground(Color.white);
displayLabel.setFont(new Font("Serif", Font.PLAIN, 35));
jf.add(displayLabel);

sevenButton=new JButton("7");
sevenButton.setBounds(30, 130, 80, 80);
sevenButton.addActionListener(this);
sevenButton.setFont(new Font("Arial",Font.PLAIN,48 ));
jf.add(sevenButton);


 eightButton=new JButton("8");
eightButton.setBounds(130, 130, 80, 80);
eightButton.addActionListener(this);
eightButton.setFont(new Font("Arial",Font.PLAIN,48 ));
jf.add(eightButton);

 nineButton=new JButton("9");
nineButton.setBounds(230, 130, 80, 80);
nineButton.addActionListener(this);
nineButton.setFont(new Font("Arial",Font.PLAIN,48 ));
jf.add(nineButton);


fourButton=new JButton("4");
fourButton.setBounds(30, 230, 80, 80);
fourButton.addActionListener(this);
fourButton.setFont(new Font("Arial",Font.PLAIN,48 ));
jf.add(fourButton);


fiveButton=new JButton("5");
fiveButton.setBounds(130, 230, 80, 80);
fiveButton.addActionListener(this);
fiveButton.setFont(new Font("Arial",Font.PLAIN,48 ));
jf.add(fiveButton);

sixButton=new JButton("6");
sixButton.setBounds(230, 230, 80, 80);
sixButton.addActionListener(this);
sixButton.setFont(new Font("Arial",Font.PLAIN,48 ));
jf.add(sixButton);

 oneButton=new JButton("1");
oneButton.setBounds(30, 330, 80, 80);
oneButton.addActionListener(this);
oneButton.setFont(new Font("Arial",Font.PLAIN,48 ));
jf.add(oneButton);


 twoButton=new JButton("2");
twoButton.setBounds(130, 330, 80, 80);
twoButton.addActionListener(this);
twoButton.setFont(new Font("Arial",Font.PLAIN,48 ));
jf.add(twoButton);

threeButton=new JButton("3");
threeButton.setBounds(230, 330, 80, 80);
threeButton.addActionListener(this);
threeButton.setFont(new Font("Arial",Font.PLAIN,48 ));
jf.add(threeButton);

 dotButton=new JButton(".");
dotButton.setBounds(30, 430, 80, 80);
dotButton.addActionListener(this);
dotButton.setFont(new Font("Arial",Font.PLAIN,48 ));
jf.add(dotButton);


 zeroButton=new JButton("0");
zeroButton.setBounds(130, 430, 80, 80);
    zeroButton.addActionListener(this);
zeroButton.setFont(new Font("Arial",Font.PLAIN,48 ));
jf.add(zeroButton);

 equalButton=new JButton("=");
equalButton.setBounds(230, 430, 80, 80);
equalButton.addActionListener(this);
equalButton.setFont(new Font("Arial",Font.PLAIN,48 ));
jf.add(equalButton);

 divButton=new JButton("/");
divButton.setBounds(330, 130, 80, 80);
divButton.addActionListener(this);
divButton.setFont(new Font("Arial",Font.PLAIN,48 ));
jf.add(divButton);

 mulButton=new JButton("X");
mulButton.setBounds(330, 230, 80, 80);
mulButton.addActionListener(this);
mulButton.setFont(new Font("Arial",Font.PLAIN,48 ));
jf.add(mulButton);

subButton=new JButton("-");
subButton.setBounds(330, 330, 80, 80);
 subButton.addActionListener(this);
subButton.setFont(new Font("Arial",Font.PLAIN,50 ));
jf.add(subButton);

 addButton=new JButton("+");
addButton.setBounds(330, 430, 80, 80);
    addButton.addActionListener(this);
addButton.setFont(new Font("Arial",Font.PLAIN,48 ));
jf.add(addButton);

clearButton=new JButton("clear");
clearButton.setBounds(430, 430, 80, 80);
clearButton.addActionListener(this);
clearButton.setFont(new Font("Serif",Font.PLAIN,48 ));
jf.add(clearButton);


jf.setVisible(true);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	public static void main(String args[]) {
		new Project();
	}

    @Override
    public void actionPerformed(ActionEvent e) {
	if(e.getSource()==sevenButton) {
		if(isoperatorclicked){
			displayLabel.setText("7");
            isoperatorclicked = false;
		}else{	
		displayLabel.setText(displayLabel.getText()+"7");
		}
	}else if(e.getSource()==eightButton){
		if(isoperatorclicked){
			displayLabel.setText("8");
			isoperatorclicked=false;
		}else{	   
		displayLabel.setText(displayLabel.getText()+"8");
		}
	}else if(e.getSource()==nineButton){
		if(isoperatorclicked){
			displayLabel.setText("9");
			isoperatorclicked=false;
		}else{	   
		displayLabel.setText(displayLabel.getText()+"9");
		}
	}else if(e.getSource()==fourButton){
		if(isoperatorclicked){
			displayLabel.setText("4");
			isoperatorclicked=false;
		}else{	   
		displayLabel.setText(displayLabel.getText()+"4");
		}
	}else if(e.getSource()==fiveButton){
		if(isoperatorclicked){
			displayLabel.setText("5");
			isoperatorclicked=false;
		}else{	   
		displayLabel.setText(displayLabel.getText()+"5");
		}
	}else if(e.getSource()==sixButton){
		if(isoperatorclicked){
			displayLabel.setText("6");
			isoperatorclicked=false;
		}else{	   
		displayLabel.setText(displayLabel.getText()+"6");
		}
	}else if(e.getSource()==threeButton){
		if(isoperatorclicked){
			displayLabel.setText("3");
			isoperatorclicked=false;
		}else{	   
		displayLabel.setText(displayLabel.getText()+"3");
		}
	}else if(e.getSource()==twoButton){
		if(isoperatorclicked){
			displayLabel.setText("2");
			isoperatorclicked=false;
		}else{	   
		displayLabel.setText(displayLabel.getText()+"2");
		}
	}else if(e.getSource()==oneButton){
		if(isoperatorclicked){
			displayLabel.setText("1");
			isoperatorclicked=false;
		}else{	   
		displayLabel.setText(displayLabel.getText()+"1");
		}
	}else if(e.getSource()==dotButton){
		if(isoperatorclicked){
			displayLabel.setText(".");
			isoperatorclicked=false;
		}else{	   
		displayLabel.setText(displayLabel.getText()+".");
		}
	}else if(e.getSource()==zeroButton){
		if(isoperatorclicked){
			displayLabel.setText("0");
			isoperatorclicked=false;
		}else{	   
		displayLabel.setText(displayLabel.getText()+"0");
		}
	}else if(e.getSource()==clearButton){
		displayLabel.setText("");
	}else if(e.getSource()==addButton){
		isoperatorclicked=true;
        oldvalue=displayLabel.getText();
		operator='+';
	}else if(e.getSource()==equalButton){
		String newValue=displayLabel.getText();
		float oldValue=Float.parseFloat(oldvalue);
	    float newValuef=Float.parseFloat(newValue);
		switch(operator){
			case'+':
					result=0;
		            result=oldValue+newValuef;
                    displayLabel.setText(result+"");
					break;
			case'-':
					result=0;
		             result=oldValue-newValuef;
                    displayLabel.setText(result+"");
					break;
			case'/':
					result=0;
		             result=oldValue/newValuef;
                    displayLabel.setText(result+"");
					break;	
			case'*':
					result=0;
		             result=oldValue*newValuef;
                    displayLabel.setText(result+"");
					break;			
		}
	}else if(e.getSource()==mulButton){
		isoperatorclicked=true;
        oldvalue=displayLabel.getText();
		operator='*';

	}else if(e.getSource()==divButton){
		isoperatorclicked=true;
        oldvalue=displayLabel.getText();
		operator='/';

	}else if(e.getSource()==subButton){
		isoperatorclicked=true;
        oldvalue=displayLabel.getText();
		operator='-';

	}









    }
}