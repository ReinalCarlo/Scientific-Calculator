package com.midmax.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ScientificCalculator extends AppCompatActivity {
    private Button button;
    //object creates
    TextView output,input;
    Button zero,one,two,three,four,five,six,seven,eight,nine,add,sub,mul,div,mod,equal,clear,
            del,point,sin,cos,tan,log,ln,sqrt,square,xfact,epower,stpower2nd,
            oneoverxbutton,sinhbutton,coshbutton, tanhbutton, cuberootbutton,
            tenexponent,exponentbutton,xcubebutton, plusbutton,piebutton,ansbuttton,varNoPower;
    String operation;
    double value,valueone,result,a,ans;
    boolean istpower2ndno,mSinH, mCosH,mAddition;
    int subs=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific_calculator);
        output=(TextView)findViewById(R.id.output);
        input=(TextView)findViewById(R.id.input);
        zero=(Button)findViewById(R.id.zerobtn);
        one=(Button)findViewById(R.id.onebtn);
        two=(Button)findViewById(R.id.twobtn);
        three=(Button)findViewById(R.id.threebtn);
        four=(Button)findViewById(R.id.fourbtn);
        five=(Button)findViewById(R.id.fivebtn);
        six=(Button)findViewById(R.id.sixbtn);
        seven=(Button)findViewById(R.id.sevenbtn);
        eight=(Button)findViewById(R.id.eightbtn);
        nine=(Button)findViewById(R.id.ninebtn);
        point=(Button)findViewById(R.id.pointbtn);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.minusbtn);
        mul=(Button)findViewById(R.id.multiplybtn);
        div=(Button)findViewById(R.id.dividebtn);
        mod=(Button)findViewById(R.id.modulousbtn);
        equal=(Button)findViewById(R.id.equalbtn);
        clear=(Button)findViewById(R.id.clearrbtn);
        del=(Button)findViewById(R.id.deletebtn);
        sin=(Button)findViewById(R.id.sinbtn);
        cos=(Button)findViewById(R.id.cosbtn);
        tan=(Button)findViewById(R.id.tanbtn);
        log=(Button)findViewById(R.id.logbtn);
        ln=(Button)findViewById(R.id.lnbtn);
        sqrt=(Button)findViewById(R.id.squarerootbtn);
        square=(Button)findViewById(R.id.squarebtn);
        xfact=(Button)findViewById(R.id.xfactorialbtn);
        epower=(Button)findViewById(R.id.epowerbtn);
        stpower2nd=(Button)findViewById(R.id.istpower2nd);
        oneoverxbutton=(Button) findViewById(R.id.onedividebtn);
        sinhbutton=(Button) findViewById(R.id.sinhbtn);
        coshbutton=(Button) findViewById(R.id.coshbtn);
        tanhbutton=(Button) findViewById(R.id.tanhbtn);
        cuberootbutton=(Button) findViewById(R.id.cuberootbtn);
        tenexponent=(Button) findViewById(R.id.tenexponent);
        exponentbutton=(Button) findViewById(R.id.expbtn);
        xcubebutton=(Button) findViewById(R.id.xcubebtn);
        plusbutton=(Button) findViewById(R.id.plusbtn);
        piebutton=(Button) findViewById(R.id.piebtn);
        ansbuttton=(Button) findViewById(R.id.ansbtn);
        varNoPower=(Button)findViewById(R.id.varpowerbtn);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAbout();
            }
        });


        varNoPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                try{
//                    mValueOne = Float.parseFloat(txtbtn.getText() + "");
//                    mNoPower = true;
//                    txtbtn.setText(null);
//                }
//                catch (Exception e) {
//                    // Handle the error/exception
//                }
                Intent intent=new Intent(ScientificCalculator.this,ScientificCalculator.class);
                startActivity(intent);

            }
        });


        xfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    a = Double.parseDouble(input.getText().toString());
                    output.setText("x!");
                    int er = 0; double i, s = 1;
                    if (a< 0) {
                        er = 20;

                    }
                    else {

                        for (i = 2; i <= a; i += 1.0)
                            s *= i;
                    }
                    input.setText("");
                    input.setText(input.getText().toString() + s);
                    output.setText(String.valueOf(a)+"!");
                }
                catch(Exception e){

                }
            }
        });
        epower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Double n= Double.parseDouble(input.getText().toString());
                    Double exp = (Double) Math.pow(2.718281828, n);
                    input.setText(exp+"");
                    output.setText("e^"+String.valueOf(n));
                }
                catch (Exception e){

                }

            }
        });
        stpower2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    value = Float.parseFloat(input.getText() + "");
                    istpower2ndno = true;
                    input.setText(null);
                    output.setText(value+"^");
                    operation="^";
                    input();

                }
                catch (Exception e) {
                    // Handle the error/exception
                }
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"9");
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().toString().contains(".")) {
                    if (input.getText().equals("")) {
                        input.setText("0.");
                    } else {
                        input.setText(input.getText() + ".");
                    }
                }
            }
        });

        plusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    if(!input.getText().equals("")) {
                        operation = "+";
                        input();

                        value = Float.parseFloat(input.getText() + "");
                        mAddition = true;
                        input.setText(null);
                        operation = "+";
                        input();
                    }

                }
                catch (Exception e) {
                    // Handle the error/exception
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!input.getText().equals("")) {
                    operation = "-";
                    input();
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!input.getText().equals("")) {
                    operation = "*";
                    input();
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!input.getText().equals("")) {
                    operation = "/";
                    input();
                }
            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!input.getText().equals("")) {
                    operation = "%";
                    input();
                }
            }
        });
        piebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if(input.getText().toString()!=null) {
                //  a=Double.parseDouble(input.getText().toString()) +Math.PI;
                // input.setText("" +a );

                // }
                // else {
                input.setText(Math.PI + "");
                // }
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int length=input.getText().length();
                String str;
                if(!(length==0)) {
                    str = input.getText().toString();
                    input.setText(str.substring(0, length - 1));
                }
            }
        });

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().equals(""))
                {
                    output.setText("sin(x)");
                    operation="sin";
                }
                else
                {
                    value=Double.parseDouble(input.getText().toString());
                    result=Math.sin(value);
                    output.setText("sin("+value+")=");
                    input.setText(String.valueOf(result));

                }
            }
        });

        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().equals(""))
                {
                    output.setText("cos(x)");
                    operation="cos";
                }
                else
                {
                    value=Double.parseDouble(input.getText().toString());
                    result=Math.cos(value);
                    output.setText("cos("+value+")=");
                    input.setText(String.valueOf(result));
                }
            }
        });

        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().equals(""))
                {
                    output.setText("tan(x)");
                    operation="tan";
                }
                else
                {
                    value=Double.parseDouble(input.getText().toString());
                    result=Math.tan(value);
                    output.setText("tan("+value+")=");
                    input.setText(String.valueOf(result));
                }
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().equals(""))
                {
                    output.setText("log(x)");
                    operation="log";
                }
                else
                {
                    value=Double.parseDouble(input.getText().toString());
                    result=Math.log10(value);
                    output.setText("log("+value+") =");
                    input.setText(String.valueOf(result));
                }
            }
        });

        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().equals(""))
                {
                    output.setText("ln(x)");
                    operation="ln";
                }
                else
                {
                    value=Double.parseDouble(input.getText().toString());
                    result=Math.log(value);
                    output.setText("ln("+value+") =");
                    input.setText(String.valueOf(result));
                }
            }
        });

        oneoverxbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    value=Double.parseDouble(input.getText().toString());
                    a = 1 / Double.parseDouble(input.getText().toString());
                    input.setText("");
                    input.setText(input.getText().toString() + a);
                    output.setText("1/"+String.valueOf(value)+" =");
                }
                catch(Exception e){
                }
            }
        });

        sinhbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().equals(""))
                {
                    output.setText("sinh(x)");
                    operation="sinh";
                }
                else
                {
                    value=Double.parseDouble(input.getText().toString());
                    double Indegree = Math.toDegrees(value);
                    result=Math.sinh(Indegree);
                    output.setText("sinh("+value+")=");
                    input.setText(String.valueOf(result));

                }
            }
        });

        coshbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().equals(""))
                {
                    output.setText("cosh(x)");
                    operation="cosh";
                }
                else
                {
                    value=Double.parseDouble(input.getText().toString());
                    result=Math.cosh(value);
                    output.setText("cosh("+value+")=");
                    input.setText(String.valueOf(result));
                }
            }
        });
        tanhbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().equals(""))
                {
                    output.setText("tanh(x)");
                    operation="tanh";
                }
                else
                {
                    value=Double.parseDouble(input.getText().toString());
                    result=Math.tanh(value);
                    output.setText("tanh("+value+")=");
                    input.setText(String.valueOf(result));
                }
            }
        });
        cuberootbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    value=Double.parseDouble(input.getText().toString());
                    a = Math.cbrt(Double.parseDouble(input.getText().toString()));
                    input.setText("");
                    input.setText(input.getText().toString() + a);
                    output.setText("∛("+value+")");
                }
                catch(Exception e){

                }
            }
        });
        tenexponent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    int n= Integer.parseInt(input.getText().toString());
                    int exp = (int) Math.pow(10, n);
                    input.setText(exp+"");
                    output.setText("10^"+(n));
                }
                catch (Exception e){

                }
            }
        });
        exponentbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    value=Double.parseDouble(input.getText().toString());
                    a = Math.exp(Double.parseDouble(input.getText().toString()));
                    input.setText("");
                    input.setText(input.getText().toString() + a);
                    output.setText("exp("+String.valueOf(value)+") =");
                }
                catch(Exception e){

                }
            }
        });
        xcubebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().equals(""))
                {
                    output.setText("X³");
                    operation="cube";
                }
                else
                {
                    value=Double.parseDouble(input.getText().toString());
                    result=value*value*value;
                    output.setText("("+String.valueOf(value)+")³ =");
                    input.setText(String.valueOf(result));
                }
            }
        });


        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().equals(""))
                {
                    output.setText("√(x)");
                    operation="sqrt";
                }
                else
                {
                    value=Double.parseDouble(input.getText().toString());
                    result=Math.sqrt(value);
                    output.setText("√("+value+") =");
                    input.setText(String.valueOf(result));
                }
            }
        });

        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().equals(""))
                {
                    output.setText("X²");
                    operation="square";
                }
                else
                {
                    value=Double.parseDouble(input.getText().toString());
                    result=value*value;
                    output.setText("("+String.valueOf(value)+")² =");
                    input.setText(String.valueOf(result));
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(output.getText().equals("")&&input.getText().equals(""))){
                    valueone=Double.parseDouble(input.getText().toString());
                    if(operation.equals("+")){
                        value=value+valueone;
                        result=value;
                        output.setText(output.getText()+String.valueOf(valueone));
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("-")){
                        value=value-valueone;
                        result=value;
                        output.setText(output.getText()+String.valueOf(valueone));
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("*")){
                        value=value*valueone;
                        result=value;
                        output.setText(output.getText()+String.valueOf(valueone));
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("/")){
                        value=value/valueone;
                        result=value;
                        output.setText(output.getText()+String.valueOf(valueone));
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("%")){
                        value=value%valueone;
                        result=value;
                        output.setText(output.getText()+String.valueOf(valueone));
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("pow")) {
                        value=Math.pow(value,valueone);
                        result=value;
                        output.setText(output.getText()+String.valueOf(valueone));
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("sin")){
                        value=Math.sin(Math.toRadians(valueone));
                        result=value;
                        output.setText("Sin("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("cos")){
                        value=Math.cos(Math.toRadians(valueone));
                        result=value;
                        output.setText("Cos("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("cosh")){
                        value=Math.cosh(Math.toRadians(valueone));
                        result=value;
                        output.setText("Cosh("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("tanh")){
                        value=Math.tanh(Math.toRadians(valueone));
                        result=value;
                        output.setText("tanh("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("tan")){
                        value=Math.tan(Math.toRadians(valueone));
                        result=value;
                        output.setText("tan("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("log")){
                        value=Math.log10(valueone);
                        result=value;
                        output.setText("log("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("ln")){
                        value=Math.log(valueone);
                        result=value;
                        output.setText("ln("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("sqrt")){
                        value=Math.sqrt(valueone);
                        result=value;
                        output.setText("√("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("square")){
                        value=valueone*valueone;
                        result=value;
                        output.setText("("+valueone+")² =");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("cube")){
                        value=valueone*valueone;
                        result=value;
                        output.setText("("+valueone+")³ =");
                        input.setText(String.valueOf(result));
                    }

                    if(operation.equals("sin")){
                        value=Math.sin(Math.toRadians(valueone));
                        result=value;
                        output.setText("sin("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("sinh")){
                        value=Math.sinh(Math.toRadians(valueone));
                        result=value;
                        output.setText("sinh("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if ( operation.equals("^")) {
                        valueone = Float.parseFloat(input.getText() + "");
                        int exp = (int) Math.pow(value, valueone);
                        input.setText(exp + "");
                        output.setText(value+"^"+valueone);
                        istpower2ndno = false;
                    }

                }
            }
        });

        ansbuttton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(output.getText().equals("")&&input.getText().equals(""))){
                    valueone=Double.parseDouble(input.getText().toString());
                    if(operation.equals("+")){
                        value=value+valueone;
                        result=value;
                        output.setText(output.getText()+String.valueOf(valueone));
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("-")){
                        value=value-valueone;
                        result=value;
                        output.setText(output.getText()+String.valueOf(valueone));
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("*")){
                        value=value*valueone;
                        result=value;
                        output.setText(output.getText()+String.valueOf(valueone));
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("/")){
                        value=value/valueone;
                        result=value;
                        output.setText(output.getText()+String.valueOf(valueone));
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("%")){
                        value=value%valueone;
                        result=value;
                        output.setText(output.getText()+String.valueOf(valueone));
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("pow")) {
                        value=Math.pow(value,valueone);
                        result=value;
                        output.setText(output.getText()+String.valueOf(valueone));
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("sin")){
                        value=Math.sin(Math.toRadians(valueone));
                        result=value;
                        output.setText("Sin("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("cos")){
                        value=Math.cos(Math.toRadians(valueone));
                        result=value;
                        output.setText("Cos("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("cosh")){
                        value=Math.cosh(Math.toRadians(valueone));
                        result=value;
                        output.setText("Cosh("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("tanh")){
                        value=Math.tanh(Math.toRadians(valueone));
                        result=value;
                        output.setText("tanh("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("tan")){
                        value=Math.tan(Math.toRadians(valueone));
                        result=value;
                        output.setText("tan("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("log")){
                        value=Math.log10(valueone);
                        result=value;
                        output.setText("log("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("ln")){
                        value=Math.log(valueone);
                        result=value;
                        output.setText("ln("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("sqrt")){
                        value=Math.sqrt(valueone);
                        result=value;
                        output.setText("√("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("square")){
                        value=valueone*valueone;
                        result=value;
                        output.setText("("+valueone+")² =");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("cube")){
                        value=valueone*valueone;
                        result=value;
                        output.setText("("+valueone+")³ =");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("sin")){
                        value=Math.sin(Math.toRadians(valueone));
                        result=value;
                        output.setText("sin("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("sinh")){
                        value=Math.sinh(Math.toRadians(valueone));
                        result=value;
                        output.setText("sinh("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if ( operation.equals("^")) {
                        valueone = Float.parseFloat(input.getText() + "");
                        int exp = (int) Math.pow(value, valueone);
                        input.setText(exp + "");
                        output.setText(value+"^"+valueone);
                        istpower2ndno = false;
                    }

                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value=0;
                valueone=0;
                result=0;
                input.setText("");
                output.setText("");
            }
        });


    }
    public void openAbout(){
        Intent intent = new Intent(this,About.class);
        startActivity(intent);
    }
    void input(){
        value=Double.parseDouble(input.getText().toString());
        input.setText("");
        output.setText(value+operation);
    }

}


