import javax.swing.*;
import java.awt.*;
public class day19{
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setLayout(new FlowLayout());
        JLabel jb=new JLabel("username");
        TextField ta=new TextField(20);
        JLabel j=new JLabel("password");
        TextField t=new TextField(20);
        JButton b= new JButton("login");
        f.add(jb);
        f.add(ta);
        f.add(j);
        f.add(t);
        f.add(b);
        b.addActionListener(e->{
            String name=ta.getText();
            if(!name.isEmpty()){
                JOptionPane.showMessageDialog(f,"hello"+name+"!");
            }
            else{
                JOptionPane.showMessageDialog(f,"please enter name");
            }
        });
        f.setSize(400,200);
        f.setVisible(true);
    }
}

