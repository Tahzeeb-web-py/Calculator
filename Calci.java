import java.awt.Font;

import javax.swing.*;
public class Calci extends JFrame
{
    JButton equal, add, sub, mul, div, percent,one, two, three, four, five, six, seven, eight, nine, zero, zero_zero, c, delete, point;//Creating obj for JButton
    JTextField expression, result;//Creating obj for JTextField
    JLabel l1, l2;//Creating obj for JLabel
    Calci(){
        l1=new JLabel("Calculator");//Creating the instance of JLabel with paramatar
        l1.setBounds(300,10, 300,50);//Alignment setting
        Font originalfont=l1.getFont();//Getting the size of existing font in JTextField
        Font newFont = originalfont.deriveFont(originalfont.getSize() + 10.0f);//Increasing the font size by 10pixels.
        l1.setFont(newFont);//Setting new Font size to the instance
        l2=new JLabel("Developed By Mohd Tahzeeb Khan");//Creating the instance of the JLabel with the parameter
        l2.setBounds(255, 50, 250, 20);//Alignment setting
        expression=new JTextField();//Creating the instance of JTextField
        expression.setHorizontalAlignment(SwingConstants.RIGHT);//Arranging the Cursor on the righthand size of the TextField
        Font originalfont1=expression.getFont();//Getting the size of existing font in JTextField
        Font newFont1=originalfont1.deriveFont(originalfont1.getSize()+10.0f);//Increasing the font size by 10pixels.
        expression.setFont(newFont1);//Setting new Font size to the instance
        expression.setBounds(10, 150, 370, 50);//Alignment setting
        result=new JTextField();//Creating the instance of JTextField
        result.setBounds(10, 200, 370, 30);//Alignment setting
        one=new JButton("1");
        one.setBounds(10, 240, 50, 50);
        add(l1); add(expression); add(result); add(l2); add(one);//Adding all the Components on the JFrame........
        setLayout(null);//setting the layout for the Frame
        setSize(700, 400);//Dimensions for FrameSize
        setVisible(true);//Setting the Visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);//Setting the Position of the Frame on the Screen
    }
    public static void main(String[] args) {
        Calci obj1=new Calci();//Creating the Object for the Calci class
    }
}