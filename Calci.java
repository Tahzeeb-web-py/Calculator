import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Calci extends JFrame implements ActionListener
{   
    JButton equal, add, sub, mul, div, percent,one, two, three, four, five, six, seven, eight, nine, zero, zero_zero, c, delete, point, Exit;//Creating obj for JButton
    JTextField Number_1, Number_2,sign, result;//Creating obj for JTextField
    JLabel l1, l2;//Creating obj for JLabel
    float total=0, no=0, no1=0;
    Calci(){
        setTitle("Calculator");
        ImageIcon icon = new ImageIcon("pictures/Logo.png");
        setIconImage(icon.getImage());
        l1=new JLabel("Calculator");//Creating the instance of JLabel with paramatar
        l1.setBounds(125,10, 300,50);//Alignment setting
        Font originalfont=l1.getFont();//Getting the size of existing font in JTextField
        Font newFont = originalfont.deriveFont(originalfont.getSize() + 10.0f);//Increasing the font size by 10pixels.
        l1.setFont(newFont);//Setting new Font size to the instance
        l2=new JLabel("Developed By Mohd Tahzeeb Khan");//Creating the instance of the JLabel with the parameter
        l2.setBounds(85, 50, 250, 20);//Alignment setting
        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setBackground(Color.black);
        // separator.setPreferredSize(new Dimension(200, 50));
        separator.setBounds(0, 80, 380, 20);
        Number_1=new JTextField();//Creating the instance of JTextField
        Number_1.setHorizontalAlignment(SwingConstants.RIGHT);//Arranging the Cursor on the righthand size of the TextField
        Font originalfont1=Number_1.getFont();//Getting the size of existing font in JTextField
        Font newFont1=originalfont1.deriveFont(originalfont1.getSize()+15.0f);//Increasing the font size by 10pixels.
        Number_1.setFont(newFont1);//Setting new Font size to the instance
        Number_1.setBounds(10, 100, 150, 50);//Alignment setting
        Number_1.setFocusable(false);
        Number_2=new JTextField();//Creating the instance of JTextField
        Number_2.setHorizontalAlignment(SwingConstants.RIGHT);//Arranging the Cursor on the righthand size of the TextField
        Font originalfont2=Number_2.getFont();//Getting the size of existing font in JTextField
        Font newFont2=originalfont2.deriveFont(originalfont2.getSize()+15.0f);//Increasing the font size by 10pixels.
        Number_2.setFont(newFont2);//Setting new Font size to the instance
        Number_2.setBounds(210, 100, 150, 50);//Alignment setting
        Number_2.setFocusable(true);
        sign=new JTextField();//Creating the instance of JTextField
        sign.setHorizontalAlignment(SwingConstants.RIGHT);//Arranging the Cursor on the righthand size of the TextField
        Font originalFont3=sign.getFont();//Getting the size of existing font in JTextField
        Font newFont3=originalFont3.deriveFont(originalFont3.getSize()+15.0f);//Increasing the font size by 10pixels.
        sign.setFont(newFont3);//Setting new Font size to the instance
        sign.setBounds(170, 100, 30, 50);//Alignment setting
        sign.setFocusable(false);
        
        result=new JTextField();//Creating the instance of JTextField
        result.setBounds(10, 150, 350, 50);//Alignment setting
        result.setHorizontalAlignment(SwingConstants.RIGHT);//Arranging the Cursor on the righthand size of the TextField 
        Font originalFont4=sign.getFont();//Getting the size of existing font in JTextField
        Font newFont4=originalFont4.deriveFont(originalFont4.getSize()+15.0f);//Increasing the font size by 10pixels.
        result.setFont(newFont4);//Setting new Font size to the instance
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
        add.setBounds(235, 210, 125, 50);
        Font originalfontadd=add.getFont();//Getting the size of existing font in JTextField
        Font newfontadd=originalfontadd.deriveFont(originalfontadd.getSize()+10.0f);//Increasing the font size by 10pixels.
        add.setFont(newfontadd);//Setting new Font size to the instance
        sub=new JButton("-");
        sub.setBounds(235, 265, 125, 50);
        Font originalfontsub=sub.getFont();//Getting the size of existing font in JTextField
        Font newfontsub=originalfontsub.deriveFont(originalfontsub.getSize()+10.0f);//Increasing the font size by 10pixels.
        sub.setFont(newfontsub);//Setting new Font size to the instance
        div=new JButton("/");
        div.setBounds(235, 320, 125, 50);
        Font originalfontdiv=div.getFont();//Getting the size of existing font in JTextField
        Font newfontdiv=originalfontdiv.deriveFont(originalfontdiv.getSize()+10.0f);//Increasing the font size by 10pixels.
        div.setFont(newfontdiv);//Setting new Font size to the instance
        mul=new JButton("X");
        mul.setBounds(235, 375, 125, 50);
        Font originalfontmul=mul.getFont();//Getting the size of existing font in JTextField
        Font newfontmul=originalfontmul.deriveFont(originalfontmul.getSize()+10.0f);//Increasing the font size by 10pixels.
        mul.setFont(newfontmul);//Setting new Font size to the instance
        equal=new JButton("=");
        equal.setBounds(235, 430, 125, 50);
        Font originalfontequal=equal.getFont();//Getting the size of existing font in JTextField
        Font newfontequal=originalfontequal.deriveFont(originalfontequal.getSize()+10.0f);//Increasing the font size by 10pixels.
        equal.setFont(newfontequal);//Setting new Font size to the instance
        Exit=new JButton("EXIT");
        Exit.setBackground(Color.red);
        Exit.setForeground(Color.white);
        Exit.setBounds(10, 500, 350, 50);
        Font originalfontexit=equal.getFont();//Getting the size of existing font in JTextField
        Font newfontexit=originalfontexit.deriveFont(originalfontexit.getSize()+10.0f);//Increasing the font size by 10pixels.
        Exit.setFont(newfontexit);//Setting new Font size to the instance
        //------------------------------------------------------------------------------------------------------------------------------------------
        add(l1); add(Number_1); add(Number_2); add(sign); add(result); add(l2); add(c); add(delete);//Adding all the Components on the JFrame........
        add(percent); add(seven); add(eight); add(nine); add(four); add(five);
        add(six); add(one); add(two); add(three); add(zero); add(zero_zero); add(point);
        add(add); add(mul); add(sub); add(div); add(equal); add(Exit);add(separator);
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
        Exit.addActionListener(this);
        setLayout(null);//setting the layout for the Frame
        setSize(380, 600);//Dimensions for FrameSize
        setVisible(true);//Setting the Visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);//Setting the Position of the Frame on the Screen
    }
    public void actionPerformed(ActionEvent e){
        String Number1 = Number_1.getText();
        String Number2 = Number_2.getText();
        if(e.getSource()==Exit){
            dispose();
        }
        if(e.getSource()==add){
            sign.setText(" + ");

        }
        if(e.getSource()==mul){
            sign.setText(" x ");
            
        }
        if(e.getSource()==div){
            sign.setText("/ ");
            
        }
        if(e.getSource()==sub){
            sign.setText("- ");
           
        }
        if(e.getSource()==percent){
            if(sign.getText().equals(" + ")){
                float a=Float.parseFloat(Number1);
                float b=Float.parseFloat(Number2);
                float divisionno=a/100;
                float mulno=divisionno*b;
                float answer=a+mulno;
                String StringAnswer=Float.toString(answer);
                result.setText(StringAnswer);
            }
            if(sign.getText().equals("- ")){
                float a=Float.parseFloat(Number1);
                float b=Float.parseFloat(Number2);
                float divisionno=a/100;
                float mulno=divisionno*b;
                float answer=a-mulno;
                String StringAnswer=Float.toString(answer);
                result.setText(StringAnswer);
            }
            if(sign.getText().equals(" x ")){
                float a=Float.parseFloat(Number1);
                float b=Float.parseFloat(Number2);
                float divisionno=a/100;
                float mulno=divisionno*b;
                float answer=mulno;
                String StringAnswer=Float.toString(answer);
                result.setText(StringAnswer);
            }
            if(sign.getText().equals("/ ")){
                float a=Float.parseFloat(Number1);
                float b=Float.parseFloat(Number2);
                float divisionno=a/b;
                float mulno=divisionno*100;
                float answer=mulno;
                String StringAnswer=Float.toString(answer);
                result.setText(StringAnswer +"%");
            }
            

        }
        if(e.getSource()==equal){
            if(sign.getText().equals(" + ")){
                float a=Float.parseFloat(Number1);
                float b=Float.parseFloat(Number2);
                float answer=a+b;
                String StringAnswer=Float.toString(answer);
                result.setText(StringAnswer);
            }
            if(sign.getText().equals("- ")){
                float a=Float.parseFloat(Number1);
                float b=Float.parseFloat(Number2);
                float answer=a-b;
                String StringAnswer=Float.toString(answer);
                result.setText(StringAnswer);
            }
            if(sign.getText().equals(" x ")){
                float a=Float.parseFloat(Number1);
                float b=Float.parseFloat(Number2);
                float answer=a*b;
                String StringAnswer=Float.toString(answer);
                result.setText(StringAnswer);
            }
            if(sign.getText().equals("/ ")){
                float a=Float.parseFloat(Number1);
                float b=Float.parseFloat(Number2);
                float answer=a/b;
                String StringAnswer=Float.toString(answer);
                result.setText(StringAnswer);
            }
        }
        if(e.getSource()==one){
            String Sign=sign.getText();
            String ADD=" + ";
            String subtract="- ";
            String DIV="/ ";
            String MUL=" x ";
            String Per="%";

            if(Sign.equals(ADD)|| Sign.equals(MUL)|| Sign.equals(DIV) || Sign.equals(subtract) ||Sign.equals(Per)){
                Number_2.setText(Number2+"1");
            }
            else{
                Number_1.setText(Number1+"1");
            }
        }
        if(e.getSource()==two){
            String Sign=sign.getText();
            String ADD=" + ";
            String subtract="- ";
            String DIV="/ ";
            String MUL=" x ";
            String Per="%";

            if(Sign.equals(ADD)|| Sign.equals(MUL)|| Sign.equals(DIV) || Sign.equals(subtract) ||Sign.equals(Per)){
                Number_2.setText(Number2+"2");
            }
            else{
                Number_1.setText(Number1+"2");
            }
        }
        if(e.getSource()==three){
         String Sign=sign.getText();
            String ADD=" + ";
            String subtract="- ";
            String DIV="/ ";
            String MUL=" x ";
            String Per="%";

            if(Sign.equals(ADD)|| Sign.equals(MUL)|| Sign.equals(DIV) || Sign.equals(subtract) ||Sign.equals(Per)){
                Number_2.setText(Number2+"3");
            }
            else{
                Number_1.setText(Number1+"3");
            }
        }
        if(e.getSource()==four){
            String Sign=sign.getText();
            String ADD=" + ";
            String subtract="- ";
            String DIV="/ ";
            String MUL=" x ";
            String Per="%";

            if(Sign.equals(ADD)|| Sign.equals(MUL)|| Sign.equals(DIV) || Sign.equals(subtract) ||Sign.equals(Per)){
                Number_2.setText(Number2+"4");
            }
            else{
                Number_1.setText(Number1+"4");
            }
        }
        if(e.getSource()==five){
             String Sign=sign.getText();
            String ADD=" + ";
            String subtract="- ";
            String DIV="/ ";
            String MUL=" x ";
            String Per="%";

            if(Sign.equals(ADD)|| Sign.equals(MUL)|| Sign.equals(DIV) || Sign.equals(subtract) ||Sign.equals(Per)){
                Number_2.setText(Number2+"5");
            }
            else{
                Number_1.setText(Number1+"5");
            }
        }
        if(e.getSource()==six){
             String Sign=sign.getText();
            String ADD=" + ";
            String subtract="- ";
            String DIV="/ ";
            String Per="%";
            String MUL=" x ";

            if(Sign.equals(ADD)|| Sign.equals(MUL)|| Sign.equals(DIV) || Sign.equals(subtract) ||Sign.equals(Per)){
                Number_2.setText(Number2+"6");
            }
            else{
                Number_1.setText(Number1+"6");
            }
        }
        if(e.getSource()==seven){
             String Sign=sign.getText();
            String ADD=" + ";
            String subtract="- ";
            String DIV="/ ";
            String Per="%";
            String MUL=" x ";

            if(Sign.equals(ADD)|| Sign.equals(MUL)|| Sign.equals(DIV) || Sign.equals(subtract)||Sign.equals(Per)){
                Number_2.setText(Number2+"7");
            }
            else{
                Number_1.setText(Number1+"7");
            }
        }
        if(e.getSource()==eight){
             String Sign=sign.getText();
            String ADD=" + ";
            String subtract="- ";
            String DIV="/ ";
            String MUL=" x ";
            String Per="%";

            if(Sign.equals(ADD)|| Sign.equals(MUL)|| Sign.equals(DIV) || Sign.equals(subtract) ||Sign.equals(Per)){
                Number_2.setText(Number2+"8");
            }
            else{
                Number_1.setText(Number1+"8");
            }
        }
        if(e.getSource()==nine){
            String Sign=sign.getText();
            String ADD=" + ";
            String subtract="- ";
            String DIV="/ ";
            String MUL=" x ";
            String Per="%";

            if(Sign.equals(ADD)|| Sign.equals(MUL)|| Sign.equals(DIV) || Sign.equals(subtract) ||Sign.equals(Per)){
                Number_2.setText(Number2+"9");
            }
            else{
                Number_1.setText(Number1+"9");
            }
        }
        if(e.getSource()==zero){
            String Sign=sign.getText();
            String ADD=" + ";
            String subtract="- ";
            String DIV="/ ";
            String MUL=" x ";
            String Per="%";
            if(Sign.equals(ADD)|| Sign.equals(MUL)|| Sign.equals(DIV) || Sign.equals(subtract) ||Sign.equals(Per)){
                Number_2.setText(Number2+"0");
            }
            else{
                Number_1.setText(Number1+"0");
            }
        }
        if(e.getSource()==zero_zero){
            String Sign=sign.getText();
            String ADD=" + ";
            String subtract="- ";
            String DIV="/ ";
            String MUL=" x ";
            String Per="%";

            if(Sign.equals(ADD)|| Sign.equals(MUL)|| Sign.equals(DIV) || Sign.equals(subtract)||Sign.equals(Per)){
                Number_2.setText(Number2+"00");
            }
            else{
                Number_1.setText(Number1+"00");
            }
        }
        if(e.getSource()==point){
            String Sign=sign.getText();
            String ADD=" + ";
            String subtract="- ";
            String DIV="/ ";
            String MUL=" x ";
            String Per="%";

            if(Sign.equals(ADD)|| Sign.equals(MUL)|| Sign.equals(DIV) || Sign.equals(subtract) ||Sign.equals(Per)){
                Number_2.setText(Number2+".");
            }
            else{
                Number_1.setText(Number1+".");
            }
        }
        // if(e.getSource()==delete){
        //     expression.setText(Expression);
        // }
        if(e.getSource()==c){
            Number_1.setText("");
            Number_2.setText("");
            sign.setText("");
            result.setText("");
        }
        
        

        
    }
    public static void main(String[] args) {
        Calci obj1=new Calci();//Creating the Object for the Calci class
    }
}