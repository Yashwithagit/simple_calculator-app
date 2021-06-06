package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText result;
    boolean ressum,resmul,ressub,resdiv;
    Button b_one,b_two,b_three,b_four,b_five,b_six,b_seven,b_eight,b_nine,b_zero,b_sum,b_equ,b_sub,b_mul,b_div,b_cl;
    float first_value,second_value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=(EditText)findViewById(R.id.res);
        b_one=(Button)findViewById(R.id.one);
        b_two=(Button)findViewById(R.id.two);
        b_three=(Button)findViewById(R.id.three);
        b_four=(Button)findViewById(R.id.four);
        b_five=(Button)findViewById(R.id.five);
        b_six=(Button)findViewById(R.id.six);
        b_seven=(Button)findViewById(R.id.seven);
        b_eight=(Button)findViewById(R.id.eight);
        b_nine=(Button)findViewById(R.id.nine);
        b_zero=(Button)findViewById(R.id.zero);
        b_sum=(Button)findViewById(R.id.sum);
        b_equ=(Button)findViewById(R.id.equ);
        b_sub=(Button)findViewById(R.id.sub);
        b_mul=(Button)findViewById(R.id.mul);
        b_div=(Button)findViewById(R.id.div);
        b_cl=(Button)findViewById(R.id.clr);

        b_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("1");
            }
        });
        b_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("2");
            }
        });
        b_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("3");
            }
        });
        b_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("4");
            }
        });
        b_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("5");
            }
        });
        b_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("6");
            }
        });
        b_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("7");
            }
        });
        b_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("8");
            }
        });
        b_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("9");
            }
        });
        b_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("0");
            }
        });

        b_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(result==null){
                   result.setText("");
               }else {
                   first_value=Float.parseFloat(result.getText() + "");
                   ressum=true;
                   result.setText(null);
               }
            }
        });
       b_sub.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              first_value=Float.parseFloat(result.getText() + "");
              ressub=true;
              result.setText(null);

           }
       });
       b_mul.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               first_value=Float.parseFloat(result.getText() + "");
               resmul=true;
               result.setText(null);
           }
       });
      b_div.setOnClickListener((new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              first_value=Float.parseFloat(result.getText() + "");
              resdiv=true;
              result.setText(null);
          }
      }));
      b_equ.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              second_value=Float.parseFloat(result.getText() +"");

              if(ressum==true){
                  result.setText(first_value+second_value+ "");
                  ressum=false;
              }
              if(ressub==true){
                  result.setText(first_value-second_value+ "");
                  ressub=false;
              }
              if(resmul==true)
              {
                  result.setText(first_value*second_value+ "");
                  resmul=false;
              }
              if(resdiv==true){
                  result.setText(first_value/second_value+ "");
                  resdiv=false;
              }
          }
      });
      b_cl.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              result.setText("");
          }
      });


    }
}