import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
public class Calci extends JFrame implements ActionListener
{
    JButton equal, add, sub, mul, div, percent,one, two, three, four, five, six, seven, eight, nine, zero, zero_zero, c, delete, point;//Creating obj for JButton
    JTextField expression, result;//Creating obj for JTextField
    JLabel l1, l2;//Creating obj for JLabel
    float total=0;
    Calci(){
        l1=new JLabel("Calculator");//Creating the instance of JLabel with paramatar
        l1.setBounds(200,10, 300,50);//Alignment setting
        Font originalfont=l1.getFont();//Getting the size of existing font in JTextField
        Font newFont = originalfont.deriveFont(originalfont.getSize() + 10.0f);//Increasing the font size by 10pixels.
        l1.setFont(newFont);//Setting new Font size to the instance
        l2=new JLabel("Developed By Mohd Tahzeeb Khan");//Creating the instance of the JLabel with the parameter
        l2.setBounds(165, 50, 250, 20);//Alignment setting
        expression=new JTextField();//Creating the instance of JTextField
        expression.setHorizontalAlignment(SwingConstants.RIGHT);//Arranging the Cursor on the righthand size of the TextField
        Font originalfont1=expression.getFont();//Getting the size of existing font in JTextField
        Font newFont1=originalfont1.deriveFont(originalfont1.getSize()+15.0f);//Increasing the font size by 10pixels.
        expression.setFont(newFont1);//Setting new Font size to the instance
        expression.setBounds(10, 100, 470, 50);//Alignment setting
        expression.setFocusable(false);
        
        result=new JTextField();//Creating the instance of JTextField
        result.setBounds(10, 150, 470, 30);//Alignment setting
        result.setHorizontalAlignment(SwingConstants.RIGHT);//Arranging the Cursor on the righthand size of the TextField 
        result.setFocusable(false);
        //-------------------------------------------------------------------------------------------------------------------------------------------
        //--------------------------------------Button-----------------------------------------------------------------------------------------------
        c=new JButton("C");
        c.setBounds(10, 210, 70, 50);
        Font originalfontc=c.getFont();//Getting the size of existing font in JTextField
        Font newFontc=originalfontc.deriveFont(originalfontc.getSize()+10.0f);//Increasing the font size by 10pixels.
        c.setFont(newFontc);//Setting new Font size to the instance
        delete=new JButton("x");
        delete.setBounds(85, 210, 70, 50);
        Font originalfontdelete=delete.getFont();//Getting the size of existing font in JTextField
        Font newFontdelete=originalfontdelete.deriveFont(originalfontdelete.getSize()+10.0f);//Increasing the font size by 10pixels.
        delete.setFont(newFontdelete);//Setting new Font size to the instance
        percent=new JButton("%");
        percent.setBounds(160, 210, 70, 50);
        Font originalfontpercent=percent.getFont();//Getting the size of existing font in JTextField
        Font newFontpercent=originalfontpercent.deriveFont(originalfontpercent.getSize()+10.0f);//Increasing the font size by 10pixels.
        percent.setFont(newFontpercent);//Setting new Font size to the instance
        seven=new JButton("7");
        seven.setBounds(10, 265, 70, 50);
        Font originalfontseven=seven.getFont();//Getting the size of existing font in JTextField
        Font newFontseven=originalfontseven.deriveFont(originalfontseven.getSize()+10.0f);//Increasing the font size by 10pixels.
        seven.setFont(newFontseven);//Setting new Font size to the instance
        eight=new JButton("8");
        eight.setBounds(85, 265, 70, 50);
        Font originalfonteight=eight.getFont();//Getting the size of existing font in JTextField
        Font newfonteight=originalfonteight.deriveFont(originalfonteight.getSize()+10.0f);//Increasing the font size by 10pixels.
        eight.setFont(newfonteight);//Setting new Font size to the instance
        nine=new JButton("9");
        nine.setBounds(160, 265, 70, 50);
        Font originalfontnine=nine.getFont();//Getting the size of existing font in JTextField
        Font newfontnine=originalfontnine.deriveFont(originalfontnine.getSize()+10.0f);//Increasing the font size by 10pixels.
        nine.setFont(newfontnine);//Setting new Font size to the instance
        four=new JButton("4");
        four.setBounds(10, 320, 70, 50);
        Font originalfontfour=four.getFont();//Getting the size of existing font in JTextField
        Font newfontfour=originalfontfour.deriveFont(originalfontfour.getSize()+10.0f);//Increasing the font size by 10pixels.
        four.setFont(newfontfour);//Setting new Font size to the instance
        five=new JButton("5");
        five.setBounds(85, 320, 70, 50);
        Font originalfontfive=five.getFont();//Getting the size of existing font in JTextField
        Font newfontfive=originalfontfive.deriveFont(originalfontfive.getSize()+10.0f);//Increasing the font size by 10pixels.
        five.setFont(newfontfive);//Setting new Font size to the instance
        six=new JButton("6");
        six.setBounds(160, 320, 70, 50);
        Font originalfontsix=six.getFont();//Getting the size of existing font in JTextField
        Font newfontsix=originalfontsix.deriveFont(originalfontsix.getSize()+10.0f);//Increasing the font size by 10pixels.
        six.setFont(newfontsix);//Setting new Font size to the instance
        one=new JButton("1");
        one.setBounds(10, 375, 70, 50);
        Font originalfontone=one.getFont();//Getting the size of existing font in JTextField
        Font newfontone=originalfontone.deriveFont(originalfontone.getSize()+10.0f);//Increasing the font size by 10pixels.
        one.setFont(newfontone);//Setting new Font size to the instance
        two=new JButton("2");
        two.setBounds(85, 375, 70, 50);
        Font originalfonttwo=two.getFont();//Getting the size of existing font in JTextField
        Font newfonttwo=originalfonttwo.deriveFont(originalfonttwo.getSize()+10.0f);//Increasing the font size by 10pixels.
        two.setFont(newfonttwo);//Setting new Font size to the instance
        three=new JButton("3");
        three.setBounds(160, 375, 70, 50);
        Font originalfontthree=three.getFont();//Getting the size of existing font in JTextField
        Font newfontthree=originalfontthree.deriveFont(originalfontthree.getSize()+10.0f);//Increasing the font size by 10pixels.
        three.setFont(newfontthree);//Setting new Font size to the instance
        zero=new JButton("0");
        zero.setBounds(10, 430, 70, 50);
        Font originalfontzero=zero.getFont();//Getting the size of existing font in JTextField
        Font newfontzero=originalfontzero.deriveFont(originalfontzero.getSize()+10.0f);//Increasing the font size by 10pixels.
        zero.setFont(newfontzero);//Setting new Font size to the instance
        zero_zero=new JButton("00");
        zero_zero.setBounds(160, 430, 70, 50);
        Font originalfontzero_zero=zero_zero.getFont();//Getting the size of existing font in JTextField
        Font newfontzero_zero=originalfontzero_zero.deriveFont(originalfontzero_zero.getSize()+10.0f);//Increasing the font size by 10pixels.
        zero_zero.setFont(newfontzero_zero);//Setting new Font size to the instance
        point=new JButton(".");
        point.setBounds(85, 430, 70, 50);
        Font originalfontpoint=point.getFont();//Getting the size of existing font in JTextField
        Font newfontpoint=originalfontpoint.deriveFont(originalfontpoint.getSize()+10.0f);//Increasing the font size by 10pixels.
        point.setFont(newfontpoint);//Setting new Font size to the instance
        add=new JButton("+");
        add.setBounds(235, 210, 100, 50);
        Font originalfontadd=add.getFont();//Getting the size of existing font in JTextField
        Font newfontadd=originalfontadd.deriveFont(originalfontadd.getSize()+10.0f);//Increasing the font size by 10pixels.
        add.setFont(newfontadd);//Setting new Font size to the instance
        sub=new JButton("-");
        sub.setBounds(235, 265, 100, 50);
        Font originalfontsub=sub.getFont();//Getting the size of existing font in JTextField
        Font newfontsub=originalfontsub.deriveFont(originalfontsub.getSize()+10.0f);//Increasing the font size by 10pixels.
        sub.setFont(newfontsub);//Setting new Font size to the instance
        div=new JButton("/");
        div.setBounds(235, 320, 100, 50);
        Font originalfontdiv=div.getFont();//Getting the size of existing font in JTextField
        Font newfontdiv=originalfontdiv.deriveFont(originalfontdiv.getSize()+10.0f);//Increasing the font size by 10pixels.
        div.setFont(newfontdiv);//Setting new Font size to the instance
        mul=new JButton("X");
        mul.setBounds(235, 375, 100, 50);
        Font originalfontmul=mul.getFont();//Getting the size of existing font in JTextField
        Font newfontmul=originalfontmul.deriveFont(originalfontmul.getSize()+10.0f);//Increasing the font size by 10pixels.
        mul.setFont(newfontmul);//Setting new Font size to the instance
        equal=new JButton("=");
        equal.setBounds(235, 430, 100, 50);
        Font originalfontequal=equal.getFont();//Getting the size of existing font in JTextField
        Font newfontequal=originalfontequal.deriveFont(originalfontequal.getSize()+10.0f);//Increasing the font size by 10pixels.
        equal.setFont(newfontequal);//Setting new Font size to the instance
        //------------------------------------------------------------------------------------------------------------------------------------------
        add(l1); add(expression); add(result); add(l2); add(c); add(delete);//Adding all the Components on the JFrame........
        add(percent); add(seven); add(eight); add(nine); add(four); add(five);
        add(six); add(one); add(two); add(three); add(zero); add(zero_zero); add(point);
        add(add); add(mul); add(sub); add(div); add(equal);
        c.addActionListener(this);
        equal.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        percent.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        zero_zero.addActionListener(this);
        delete.addActionListener(this);
        point.addActionListener(this);
        setLayout(null);//setting the layout for the Frame
        setSize(500, 600);//Dimensions for FrameSize
        setVisible(true);//Setting the Visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);//Setting the Position of the Frame on the Screen
    }
    public void actionPerformed(ActionEvent e){
        String Expression = expression.getText();
        float no=0;
        
        int a,b,d,f,g,h,i;
        if(e.getSource()==add){
            expression.setText(Expression+"+");
            Expression=expression.getText();
            a=Expression.indexOf('+');
            String Alter=Expression.substring(0, a);
            no=Float.parseFloat(Alter);
            total=total+no;
            String totalString=Float.toString(total);
            result.setText(totalString);
        }
        if(e.getSource()==mul){
            expression.setText(Expression+"x");
        }
        if(e.getSource()==div){
            expression.setText(Expression+"/");
        }
        if(e.getSource()==sub){
            expression.setText(Expression+"-");
        }
        if(e.getSource()==one){
            expression.setText(Expression+"1");
        }
        if(e.getSource()==two){
            expression.setText(Expression+"2");
        }
        if(e.getSource()==three){
            expression.setText(Expression+"3");
        }
        if(e.getSource()==four){
            expression.setText(Expression+"4");
        }
        if(e.getSource()==five){
            expression.setText(Expression+"5");
        }
        if(e.getSource()==six){
            expression.setText(Expression+"6");
        }
        if(e.getSource()==seven){
            expression.setText(Expression+"7");
        }
        if(e.getSource()==eight){
            expression.setText(Expression+"8");
        }
        if(e.getSource()==nine){
            expression.setText(Expression+"9");
        }
        if(e.getSource()==zero){
            expression.setText(Expression+"0");
        }
        if(e.getSource()==zero_zero){
            expression.setText(Expression+"00");
        }
        if(e.getSource()==point){
            expression.setText(Expression+".");
        }
        if(e.getSource()==delete){
            expression.setText(Expression);
        }
        if(e.getSource()==c){
            expression.setText("");
        }
        

        
    }
    public static void main(String[] args) {
        Calci obj1=new Calci();//Creating the Object for the Calci class
    }
}