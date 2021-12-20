package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.SensorAdditionalInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double input1=0,input2=0;
TextView txt;
Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,add,sub,mul,div,dot,clr,equ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0=(Button) findViewById(R.id.b0);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);
        b6=(Button) findViewById(R.id.b6);
        b7=(Button) findViewById(R.id.b7);
        b8=(Button) findViewById(R.id.b8);
        b9=(Button) findViewById(R.id.b9);
        add=(Button) findViewById(R.id.badd);
        sub=(Button) findViewById(R.id.bsub);
        div=(Button) findViewById(R.id.bdiv);
        mul=(Button) findViewById(R.id.bmul);
        dot=(Button) findViewById(R.id.bdot);
        clr=(Button) findViewById(R.id.bc);
        equ=(Button) findViewById(R.id.bequ);
        txt=(TextView) findViewById(R.id.edt1);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+"9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt.getText().length()!=0)
                {
                    input1=Float.parseFloat(txt.getText()+"");
                    boolean Addition = true;
                    boolean decimal=false;
                    txt.setText(null);
                }
            }
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt.getText().length()!=0)
                {
                    input1=Float.parseFloat(txt.getText()+"");
                    boolean Subtract = true;
                    boolean decimal=false;
                    txt.setText(null);
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt.getText().length()!=0)
                {
                    input1=Float.parseFloat(txt.getText()+"");
                    boolean Multiplication = true;
                    boolean decimal=false;
                    txt.setText(null);
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt.getText().length()!=0)
                {
                    input1=Float.parseFloat(txt.getText()+"");
                    boolean Division= true;
                    boolean decimal=false;
                    txt.setText(null);
                }
            }
        });

        equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean Addition = true;
                boolean Substract=true;
                boolean Multiplication=true;
                boolean Division=true;

                if(Addition || Substract || Multiplication || Division )
                {
                    input2=Float.parseFloat(txt.getText()+"")  ;

                }
                if(Addition)
                {
                    txt.setText(input1 + input2+"");
                    Addition=false;

                }
                if(Substract)
                {
                    txt.setText(input1 - input2+"");
                    Substract=false;

                }
                if(Multiplication)
                {
                    txt.setText(input1 * input2+"");
                    Multiplication=false;

                }
                if(Division)
                {
                    txt.setText(input1 / input2+"");
                    Division=false;

                }
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText("");
                input1=0.0;
                input2=0.0;
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean decimal = false;
                if (decimal) {
                } else {
                    txt.setText(txt.getText() + ".");

                    decimal = true;
                }
            }

        });











    }
}