import javax.swing.*;
import java.awt.event.*;

public class date implements ActionListener{
    JFrame f;
    JButton b1,b2,b3,b4,b5;
    JLabel l1;
    date(){

    f= new JFrame();
    
    l1=new JLabel("WILL YOU GO ON A DATE WITH ME QT");
    l1.setBounds(100,100,500,40);
    b1= new JButton("yes");
    b1.setBounds(200,300,70,30);
    
    b2= new JButton("no");
    b2.setBounds(400,300,70,30);

    b3= new JButton("no");
    b3.setBounds(400,400,70,30);

    b4= new JButton("no");
    b4.setBounds(300,500,70,30);

    b5= new JButton("no");
    b5.setBounds(200,210,70,30);
                                                                                                                                                          
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);



    f.add(b1);f.add(b2);f.add(l1);
    f.add(b3);f.add(b4);
    f.add(b5);


    b3.setVisible(false);
    b4.setVisible(false);
    b5.setVisible(false);



    
    f.setSize(900,900);
    f.setLayout(null);
    f.setVisible(true); 
    }
    public void actionPerformed(ActionEvent e){
 
     if(e.getSource()==b1){
        String msg = "hehehhehe yesssshshshshsh letsss goooooo";
        JOptionPane.showMessageDialog(f,msg); 

    }
    else if(e.getSource()==b2){
    
       
        b4.setVisible(true);
        b2.setVisible(false); 

    }
    else if(e.getSource()==b4){
    
       
        b3.setVisible(true);
        b4.setVisible(false); 

    }
    else if(e.getSource()==b3){
    
       
        b5.setVisible(true);
        b3.setVisible(false); 

    }
    

    else if(e.getSource()==b5){
    
       
        b2.setVisible(true);
        b5.setVisible(false); 

    }


    }


  public static void main(String[] args){
    new date();
  }

}




