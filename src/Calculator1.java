

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.* ;


 class GUI1  {

    // Instance variable ;
    JFrame frame;
    JTextField tf ;
    String a , b ;
    int  i = 0  , a3 ;
    double result ;
    String first , second , third ;
    String sign ;


    GUI1(){
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300 ,390);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());


        //JButton
        JButton  on = new JButton("  ON  ");
        JButton  off = new JButton(" OFF ");
        JButton  b1 = new JButton("1");
        JButton  b2 = new JButton("2");
        JButton  b3 = new JButton("3");
        JButton  b4 = new JButton("4");
        JButton  b5 = new JButton("5");
        JButton  b6 = new JButton("6");
        JButton  b7 = new JButton("7");
        JButton  b8 = new JButton("8");
        JButton  b9= new JButton("9");
        JButton  b0= new JButton("0");
        JButton  plus= new JButton("+");
        JButton  minus= new JButton("-");
        JButton  equal= new JButton("  =  ");
        JButton  mult = new JButton("×");
        JButton  divide= new JButton("÷");
        JButton  abs= new JButton("|abs|");
        JButton ans = new JButton("  Ans  ");
        JButton del = new JButton("          DELETE(⌫)          ");
        JButton sqr = new JButton("^");
        JButton root = new JButton("√");
        JButton sin = new JButton("sin");
        JButton tan = new JButton("tan");
        JButton cos = new JButton("cos");
        JButton dot = new JButton(".");
        JButton percent = new JButton("%");
        JButton pai = new JButton("π");
        JButton shift = new JButton(" Shift ");
        JButton factorial = new JButton("!");
        JButton log = new JButton("log");
        JButton reverse = new JButton("1/x");


        on.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("0.");
            }

        });

        sin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().equals("0.")){
                    tf.setText ( ("sin("+"0"+")" ) + "");
                    sign = "sin";
                }
                else {
                    tf.setText ( ("sin("+tf.getText()+")" ) + "");
                    sign = "sin";
                }
            }
        });

        cos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().equals("0.")){
                    tf.setText ( ("cos("+"0"+")" ) + "");
                    sign = "cos";
                }
                else {
                    tf.setText ( ("cos("+tf.getText()+")" ) + "");
                    sign = "cos";
                }
            }
        });

        tan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().equals("0.")){
                    tf.setText ( ("tan("+"0"+")" ) + "");
                    sign = "tan";
                }
                else {
                    tf.setText ( ("tan("+tf.getText()+")" ) + "");
                    sign = "tan";
                }
            }
        });

        log.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().equals("0.")){
                    tf.setText ( ("log("+"0"+")" ) + "");
                    sign = "log";
                }
                else {
                    tf.setText ( ("log("+tf.getText()+")" ) + "");
                    sign = "log";
                }
            }
        });

        shift.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
            }
        });

        percent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if( tf.getText().equals("0.") ) tf.setText("Math Error");
                else {
                    tf.setText(  ( tf.getText()  + "%" ) + "");
                    sign = "%";
                }
            }
        });

        pai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().equals("0.")){
                    tf.setText("3.1416");
                }
                else if(tf.getText().equals("")||tf.getText().equals("sin")){
                    tf.setText(tf.getText()+"180");
                }
                else{
                    tf.setText(tf.getText()+"3.1416");
                }
            }
        });

        ans.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText( result + "");
            }
        });

        factorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().equals("0.")){
                    tf.setText( "0"+ "" );
                }
                tf.setText(  ( tf.getText() + "!" ) + "" );
                sign = "!" ;
            }
        });

        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText( (tf.getText() + ".") + "" );
            }
        });

        reverse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().equals("0.")){
                    tf.setText( "0"+ "" );
                }
                tf.setText( ("1" + "÷"+ tf.getText() ) + "" ) ;
                sign = "1/x" ;
            }
        });

        root.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().equals("0.")){
                    tf.setText( "0"+ "" );
                }
                tf.setText( ("√" + tf.getText() ) + "" );
                sign = "√" ;
            }
        });

        off.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // tf.setText("CASIO");
                //  try{Thread.sleep(1000);} catch (InterruptedException a ){ }
                tf.setText(" ");

            }
        });

        sqr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().equals("0.")){
                    tf.setText( "0"+ "" );
                }
                tf.setText(  (tf.getText() + "^" +"") );
                sign = "^";
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(tf.getText().equals("0.")){
                    tf.setText( "1"+ "" );
                }
                else {
                    a =  tf.getText()+"1"+ "" ;
                    tf.setText( a );
                }


            }
        });

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if ( (tf.getText()).equals("0.")  ){
                    tf.setText(  ("0" + "+" ) +"");
                    sign = "+" ;
                }
                else {
                    tf.setText( (tf.getText() + "+" ) + "" );
                    sign = "+" ;
                }
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( ( tf.getText() ).equals("0.") ){
                    tf.setText( ("0"+"-") +"");
                    sign = "-" ;
                }
                else {
                    tf.setText( (tf.getText() + "-" ) + "" );
                    sign = "-" ;
                }
            }
        });

        mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( ( tf.getText() ).equals("0.") ){
                    tf.setText("×" +"");
                }
                else {
                    tf.setText( (tf.getText() + "×" ) + "" );
                    sign = "X" ;
                }
            }
        });

        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( ( tf.getText() ).equals("0.") ){
                    tf.setText("÷" +"");
                }
                else {
                    tf.setText( (tf.getText() + "÷" ) + "" );
                    sign = "/" ;
                }
            }
        });

        abs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().equals("0.")){
                    tf.setText( "0"+ "" );
                }
                tf.setText( ("|"+(tf.getText())+"|") + "" );
                sign = "| |";
            }
        });

        del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String s1 = tf.getText();
                tf.setText("");
                for ( i = 0 ; i < s1.length()-1 ; i++ ){
                    tf.setText( ( tf.getText()+ s1.charAt(i) ) + "" );
                }
            }
        });

        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String again1 = tf.getText();
                if ( again1.charAt(0) == 'X' || again1.charAt(0) == '/' || again1.charAt(1) == '|' || again1.charAt(1) == '√' || again1.charAt(1) == '^')
                    tf.setText("Syntax Error");


                if ( sign.equals("+")){
                    String again =  tf.getText ( );
                    String[] part = again.split("[+]");
                    first = part[0];
                    second= part[1];
                    double a1 = Double.parseDouble(first);
                    double a2 = Double.parseDouble(second);
                    result = a1+a2 ;
                    tf.setText(result+ "");

                }

                if(sign.equals("sin") ){
                    String again =  tf.getText ( );
                    String[] part = again.split("[(]");
                    String[] p   = part[1].split("[)]");
                    double a1 = Double.parseDouble(p[0]) ;
                    double a2 = Math.toRadians(a1);
                    result = Math.sin(a2);
                    tf.setText(result+"");
                }

                if(sign.equals("cos") ){
                    String again =  tf.getText ( );
                    String[] part = again.split("[(]");
                    String[] p   = part[1].split("[)]");
                    double a1 = Double.parseDouble(p[0]) ;
                    double a2 = Math.toRadians(a1);
                    result = Math.cos(a2);
                    tf.setText(result+"");
                }

                if(sign.equals("tan") ){
                    String again =  tf.getText ( );
                    String[] part = again.split("[(]");
                    String[] p   = part[1].split("[)]");
                    double a1 = Double.parseDouble(p[0]) ;
                    double a2 = Math.toRadians(a1);
                    result = Math.tan(a2);
                    tf.setText(result+"");
                }

                if(sign.equals("log") ){
                    String again =  tf.getText ( );
                    String[] part = again.split("[(]");
                    String[] p   = part[1].split("[)]");
                    double a1 = Double.parseDouble(p[0]) ;
                    result = Math.log(a1);
                    tf.setText(result+"");
                }

                if( sign.equals("%")){
                    String again =  tf.getText ( );
                    String[] part = again.split("[%]");
                    first = part[0];
                    second= part[1];
                    double a1 = Double.parseDouble(first);
                    double a2 = Double.parseDouble(second);
                    result = a1 * (a2/100);
                    tf.setText(result + "");
                }

                if ( sign.equals("!") ){

                    String again =  tf.getText ( );
                    String[] part = again.split("[!]");
                    String [] p  = part[0].split("-");
                    if( p[0].equals("") ){
                        first=p[1];
                        String [] s1 = first.split("[.]");
                        int a1 = Integer.parseInt(s1[0]);
                        int a3 = Integer.parseInt(s1[1]);
                        if( a3 != 0 ){
                            tf.setText("Math Error");
                        }
                        else {
                            int result = 1 ;
                            for ( int i = 1 ; i <= a1 ; i++  ){
                                result*=i;
                            }
                            tf.setText("-"+result+ "");
                        }
                    }
                    else if ( part[0].contains(".") ){

                        String [] s1 = part[0].split("[.]");
                        int a1 = Integer.parseInt(s1[0]);
                        int a3 = Integer.parseInt(s1[1]);
                        if( a3 != 0 ){
                            tf.setText("Math Error");
                        }
                        else {

                            int result = 1 ;
                            for ( int i = 1 ; i <= a1 ; i++  ){
                                result*=i;
                            }
                            tf.setText(result+ "");
                        }
                    }

                    else {
                        String first = part[0];
                        int a2 = Integer.parseInt(first);
                        int result = 1 ;
                        for ( int i = 1 ; i <= a2 ; i++  ){
                            result*=i;
                        }
                        tf.setText(result+ "");

                    }
                }

                if(sign.equals("1/x")){
                    String again =  tf.getText ( );
                    String[] part = again.split("[÷]");
                    first = part[0];
                    second= part[1];
                    double a1 = Double.parseDouble(first);
                    double a2 = Double.parseDouble(second);
                    result = a1/a2 ;
                    tf.setText(result+ "");
                }

                if ( sign.equals("√")){
                    String again =  tf.getText ( );
                    String[] part = again.split("[√]" );
                    first = part[1];
                    double a1 = Double.parseDouble(first);
                    if (a1 < 0 ) tf.setText("Math Error");
                    else {
                        result = Math.sqrt(a1);
                        tf.setText(result+ "");
                    }
                }

                if ( sign.equals("^") ){
                    String again =  tf.getText ( );
                    String[] part = again.split("\\^" );
                    first = part[0];
                    second= part[1];
                    double a1 = Double.parseDouble(first);
                    double a2 = Double.parseDouble(second);
                    if(  (first.equals("0") && second.equals("0")) ){
                        tf.setText("Math Error");
                    }
                    else {
                        result = Math.pow((a1),a2);
                        tf.setText(result+ "");
                    }


                }

                if ( sign.equals("-")){
                    String again =  tf.getText ( );
                    String[] part = again.split("[-]");

                    first = part[0];
                    second= part[1];
                    double a2 = Double.parseDouble(second);
                    if(part.length == 2 )
                    {
                        double a1 = Double.parseDouble(first);
                        result = a1-a2;
                    }
                    if(part.length == 3 )
                    {
                        third = part[2];
                        System.out.println("s : " +third);
                        double a3 = Double.parseDouble(third);
                        result = -a2-a3;
                    }
                    tf.setText(result+ "");

                }

                if ( sign.equals("X")){
                    String again =  tf.getText ( );
                    String[] part = again.split("[×]");
                    first = part[0];
                    second= part[1];
                    double a1 = Double.parseDouble(first);
                    double a2 = Double.parseDouble(second);
                    result = a1*a2 ;
                    tf.setText(result+ "");

                }

                if ( sign.equals("/")){
                    String again =  tf.getText ( );
                    String[] part = again.split("[÷]");
                    first = part[0];
                    second= part[1];
                    double a1 = Double.parseDouble(first);
                    double a2 = Double.parseDouble(second);
                    result = a1/a2 ;
                    tf.setText(result+ "");

                }

                if( sign.equals("| |")){
                    String again = tf.getText();
                    String part[] = again.split("[|]");
                    double value = Double.parseDouble(part[1]);
                    if(value < 0 ) tf.setText( ( - (value) ) + "" );
                    else tf.setText(value+"");
                }



            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().equals("0.")){
                    tf.setText( "2"+ "" );
                }
                else {
                    a = tf.getText()+"2"+ "" ;
                    tf.setText( a );
                }
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().equals("0.")){
                    tf.setText( "3"+ "" );
                }
                else {
                    a =   tf.getText()+"3"+ ""  ;
                    tf.setText(a);
                }
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().equals("0.")){
                    tf.setText( "4"+ "" );
                }
                else{
                    a =  tf.getText()+"4"+ ""  ;
                    tf.setText(a );
                }
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().equals("0.")){
                    tf.setText( "5"+ "" );
                }
                else {
                    a = tf.getText()+"5"+ "";
                    tf.setText(a );
                }
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().equals("0.")){
                    tf.setText( "6"+ "" );
                }
                else {
                    a = tf.getText()+"6"+ "";
                    tf.setText(a );
                }
            }
        });

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().equals("0.")){
                    tf.setText( "7"+ "" );
                }
                else {
                    a = tf.getText()+"7"+ "";
                    tf.setText(a );
                }
            }
        });

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().equals("0.")){
                    tf.setText( "8"+ "" );
                }
                else {
                    a = tf.getText()+"8"+ "";
                    tf.setText(a );
                }
            }
        });

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().equals("0.")){
                    tf.setText( "9"+ "" );
                }
                else {
                    a = tf.getText()+"9"+ "";
                    tf.setText(a );
                }
            }
        });

        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().equals("0.")){
                    tf.setText( "0"+ "" );
                }
                else {
                    a = tf.getText()+"0"+ "";
                    tf.setText(a );
                }
            }
        });

        // JLabel
        frame.add(new JLabel("fx-991ES") );

        //JTextFiled
        tf = new JTextField(21);
        frame.add(tf);


        //JPanel
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();


        panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel2.setLayout(new GridLayout(8,4));
        panel3.setLayout(new FlowLayout());




        panel1.add(shift); panel1.add(on);panel1.add(off);

        panel2.add(sqr); panel2.add(root);panel2.add(reverse); panel2.add(log);
        panel2.add(abs); panel2.add(sin); panel2.add(cos); panel2.add(tan);
        panel2.add(percent); panel2.add(factorial); panel2.add(pai); panel2.add(divide);
        panel2.add(b7); panel2.add(b8); panel2.add(b9); panel2.add(plus);
        panel2.add(b4); panel2.add(b5); panel2.add(b6); panel2.add(minus);
        panel2.add(b1); panel2.add(b2); panel2.add(b3); panel2.add(mult);
        panel2.add(b0); panel2.add(dot); panel2.add(equal); panel2.add(ans);

        panel3.add(del);




        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);



        on.setBackground(Color.RED);on.setForeground(Color.WHITE);off.setBackground(Color.RED);off.setForeground(Color.WHITE);
        shift.setBackground(Color.DARK_GRAY);shift.setForeground(Color.WHITE);

        root.setBackground(Color.LIGHT_GRAY);sqr.setBackground(Color.LIGHT_GRAY);log.setBackground(Color.LIGHT_GRAY);reverse.setBackground(Color.LIGHT_GRAY);
        abs.setBackground(Color.LIGHT_GRAY);sin.setBackground(Color.LIGHT_GRAY);cos.setBackground(Color.LIGHT_GRAY);tan.setBackground(Color.LIGHT_GRAY);
        percent.setBackground(Color.LIGHT_GRAY);factorial.setBackground(Color.LIGHT_GRAY);pai.setBackground(Color.LIGHT_GRAY);divide.setBackground(Color.LIGHT_GRAY);
        b7.setBackground(Color.WHITE);b8.setBackground(Color.WHITE);b9.setBackground(Color.WHITE);plus.setBackground(Color.LIGHT_GRAY);
        b4.setBackground(Color.WHITE);b5.setBackground(Color.WHITE);b6.setBackground(Color.WHITE);minus.setBackground(Color.LIGHT_GRAY);
        b1.setBackground(Color.WHITE);b2.setBackground(Color.WHITE);b3.setBackground(Color.WHITE);mult.setBackground(Color.LIGHT_GRAY);
        b0.setBackground(Color.WHITE);dot.setBackground(Color.WHITE);ans.setBackground(Color.cyan);equal.setBackground(Color.WHITE);
        del.setBackground(Color.WHITE);

    }

    public static void main(String[] args) {
        new GUI1();
    }



}

