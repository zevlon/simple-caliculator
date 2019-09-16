package com.example.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;
    Button sum;
    Button mul;
    Button div;
    Button sub;
    Button eqls;
    Button plus_or_minus;
    Button c;
    Button dot;
    Button r;
    TextView e1;
    TextView e2;
    TextView e3;
    EditText res;
    final char Addition='+';
    final char Subtraction='-';
    final char Multliplication='*';
    final char Division='/';
    char Actions;
    Double val_1,val_2,result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.b_1);
        b2=(Button)findViewById(R.id.b_2);
        b3=(Button)findViewById(R.id.b_3);
        b4=(Button)findViewById(R.id.b_4);
        b5=(Button)findViewById(R.id.b_5);
        b6=(Button)findViewById(R.id.b_6);
        b7=(Button)findViewById(R.id.b_7);
        b8=(Button)findViewById(R.id.b_8);
        b9=(Button)findViewById(R.id.b_9);
        b0=(Button)findViewById(R.id.b_0);
        sum=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);
        c=(Button)findViewById(R.id.clear);
        r=(Button)findViewById(R.id.root);
        plus_or_minus=(Button)findViewById(R.id.plus_or_minus);
        eqls=(Button)findViewById(R.id.equals);
        dot=(Button)findViewById(R.id.dot);
        e1=(TextView) findViewById(R.id.e_1);
        e2=(TextView) findViewById(R.id.e_2);
        e3=(TextView) findViewById(R.id.e_3);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText().toString()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText().toString()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText().toString()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText().toString()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText().toString()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText().toString()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText().toString()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText().toString()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText().toString()+"9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText().toString()+"0");
            }
        });
        //Deactivitate Later
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText().toString()+".");
            }
        });

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double rt= Double.parseDouble(String.valueOf(e1.getText()));
                Double res= Math.sqrt(rt);
                e1.setText(res.toString());
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
                e2.setText("");
                e3.setText("");
            }
        });

        eqls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val_1=Double.parseDouble(e1.getText().toString());
                val_2=Double.parseDouble((e3.getText().toString()));
                String op = e2.getText().toString();
                Double result = null;
                if(op.equals("+"))
                    result=val_1+val_2;
                else if(op.equals("-"))
                    result=val_2-val_1;
                else if(op.equals("*"))
                    result=val_1*val_2;
                else if(op.equals("/"))
                    result=val_2/val_1;
                e1.setText(result.toString());
            }
        });

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( ! e1.getText().toString().equals("") )
                {
                    e3.setText(e1.getText().toString());
                    e2.setText("+");
                    e1.setText("");
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( ! e1.getText().toString().equals("") )
                {
                    e3.setText(e1.getText().toString());
                    e2.setText("*");
                    e1.setText("");
                }

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( ! e1.getText().toString().equals("") )
                {
                    e3.setText(e1.getText().toString());
                    e2.setText("-");
                    e1.setText("");
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( ! e1.getText().toString().equals("") )
                {
                    e3.setText(e1.getText().toString());
                    e2.setText("/");
                    e1.setText("");
                }
            }
        });

        plus_or_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double s=Double.parseDouble(e1.getText().toString());
                Double e=s*-1;
                e1.setText(e.toString());
            }
        });



    }
}
