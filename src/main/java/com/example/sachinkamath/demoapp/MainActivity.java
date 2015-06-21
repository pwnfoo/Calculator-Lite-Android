package com.example.sachinkamath.demoapp;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    Button add,sub,mult,div,equ,n0,n1,n2,n3,n4,n5,n6,n7,n8,n9,can;
    TextView tv,log;
    int result=0,num1,num2,flag,lock=0,equilock=0;
    String temp2;

    protected void calculate(int option){


    }

    protected void calculate(int t1, int t2, int f)
    {
        int result;
        switch(f)
        {
            case 1:
                result = t1+t2;
                temp2 = String.valueOf(result);
                tv.setText(temp2);
                lock=0;
                equilock=1;
                break;
            case 2:
                result = t1-t2;
                temp2 = String.valueOf(result);
                tv.setText(temp2);
                lock=0;
                equilock=1;
                break;
            case 3:
                result = t1*t2;
                temp2 = String.valueOf(result);
                tv.setText(temp2);
                lock=0;
                equilock=1;
                break;
            case 4:
                if(t2==0)
                {
                    tv.setText("Divide by Zero error");
                    lock=0;
                    equilock=1;
                    tv.setText("");
                    break;
                }
                result = t1/t2;
                temp2 = String.valueOf(result);
                tv.setText(temp2);
                lock=0;
                equilock=1;
                break;
        }
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (Button) findViewById(R.id.badd);
        sub = (Button) findViewById(R.id.bsub);
        mult = (Button) findViewById(R.id.bmult);
        div = (Button) findViewById(R.id.bdiv);
        n0 = (Button) findViewById(R.id.num0);
        n1 = (Button) findViewById(R.id.num1);
        n2 = (Button) findViewById(R.id.num2);
        n3 = (Button) findViewById(R.id.num3);
        n4 = (Button) findViewById(R.id.num4);
        n5 = (Button) findViewById(R.id.num5);
        n6 = (Button) findViewById(R.id.num6);
        n7 = (Button) findViewById(R.id.num7);
        n8 = (Button) findViewById(R.id.num8);
        n9 = (Button) findViewById(R.id.num9);
        tv = (TextView)findViewById(R.id.tvresult);
        can = (Button) findViewById(R.id.bcan);
        equ = (Button) findViewById(R.id.bequal);
        log = (TextView)findViewById(R.id.tvlog);


        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText() + "0");
            }
        });
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText() + "1");
            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"2");
            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"3");
            }
        });

        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"4");
            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"5");
            }
        });

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"6");
            }
        });

        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"7");
            }
        });

        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"8");
            }
        });

        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"9");
            }
        });

        can.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = tv.getText().toString();
                if (str.length() > 1) {
                    str = str.substring(0, str.length() - 1);
                    tv.setText(str);
                }
                else
                    tv.setText("");

            }
        });

        can.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                tv.setText("");
                log.setText("");
                num1=num2=0;
                tv.invalidate();
                v.invalidate();
                return true;
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lock==1)
                    tv.setText(tv.getText());
                else {
                    if (tv.getText() == "")
                        tv.setText("0");
                        tv.invalidate();
                    v.invalidate();
                    lock = 1;
                    equilock=0;
                    String temp = tv.getText().toString();
                    if (temp.charAt(0) == 0) {
                        temp = temp.substring(1, temp.length());
                    }

                    num1 = Integer.parseInt(temp);
                    flag = 1;
                    log.setText(num1 + "+");
                    tv.setText("");
                    tv.invalidate();
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lock==1)
                    tv.setText(tv.getText());
                else {
                    if (tv.getText() == "")
                        tv.setText("0");
                    tv.invalidate();
                    lock = 1;
                    equilock=0;
                    String temp = tv.getText().toString();
                    if (temp.charAt(0) == 0) {
                        temp = temp.substring(1, temp.length());
                    }

                    num1 = Integer.parseInt(temp);
                    flag = 2;
                    log.setText(num1 + "-");
                    tv.setText("");
                }
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lock==1)
                    tv.setText(tv.getText());
                else {
                    if (tv.getText() == "")
                        tv.setText("0");
                    tv.invalidate();
                    lock = 1;
                    equilock=0;
                    String temp = tv.getText().toString();
                    if (temp.charAt(0) == 0) {
                        temp = temp.substring(1, temp.length());
                    }

                    num1 = Integer.parseInt(temp);
                    flag = 3;
                    log.setText(num1 + "*");
                    tv.setText("");
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lock==1)
                    tv.setText(tv.getText());
                else {
                    if (tv.getText() == "")
                        num1 = 0;
                    tv.invalidate();
                    lock = 1;
                    equilock=0;
                    String temp = tv.getText().toString();
                    if (temp.charAt(0) == 0) {
                        temp = temp.substring(1, temp.length());
                    }

                    num1 = Integer.parseInt(temp);
                    flag = 4;
                    log.setText(num1 + "/");
                    tv.setText("");
                }
            }
        });

        equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if(equilock==1)
                    {
                        tv.setText(tv.getText());
                    }
                    else {
                        if (tv.getText() == "")
                            tv.setText("0");
                        String temp = tv.getText().toString();
                        tv.setText("");
                        if (temp.charAt(0) == 0) {
                            temp = temp.substring(1, temp.length());
                        }
                        num2 = Integer.parseInt(temp);
                        log.setText(log.getText() + temp);
                        calculate(num1, num2, flag);
                        log.setText(log.getText() + "= " + temp2);
                    }
                }

        });










    }
}
