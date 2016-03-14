package examplew.midopc.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Double num1;
    Double num2;
    Double rs;
    String op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final  TextView txt ;
        final  Button bt1;
        final  Button bt2;
        final  Button bt3;
        final  Button bt4;
        final  Button bt5;
        final  Button bt6;
        final  Button bt7;
        final  Button bt8;
        final  Button bt9;
        final  Button bt0;
        final  Button bt00;
        final  Button btsum;
        final  Button btsub;
        final  Button btmul;
        final  Button btdiv;
        final  Button btclr;
        final  Button btoff;
        final  Button bteql;



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=(Button)findViewById(R.id.bt1);
        bt2=(Button)findViewById(R.id.bt2);
        bt3=(Button)findViewById(R.id.bt3);
        bt4=(Button)findViewById(R.id.bt4);
        bt5=(Button)findViewById(R.id.bt5);
        bt6=(Button)findViewById(R.id.bt6);
        bt7=(Button)findViewById(R.id.bt7);
        bt8=(Button)findViewById(R.id.bt8);
        bt9=(Button)findViewById(R.id.bt9);
        bt0=(Button)findViewById(R.id.bt0);

        bt00=(Button)findViewById(R.id.bt00);
        btsum=(Button)findViewById(R.id.btplus);
        btsub=(Button)findViewById(R.id.ptmin);
        btmul=(Button)findViewById(R.id.btmul);
        btdiv=(Button)findViewById(R.id.ptdiv);
        btclr=(Button)findViewById(R.id.btclr);
        btoff=(Button)findViewById(R.id.btoff);
        bteql=(Button)findViewById(R.id.bteql);
        txt=(TextView)findViewById(R.id.txt2);




        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Take;
                Take = txt.getText() + bt1.getText().toString();
                txt.setText(Take);

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Take;
                Take = txt.getText() + bt2.getText().toString();
                txt.setText(Take);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Take;
                Take = txt.getText() + bt3.getText().toString();
                txt.setText(Take);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Take;
                Take = txt.getText() + bt4.getText().toString();
                txt.setText(Take);
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Take;
                Take = txt.getText() + bt5.getText().toString();
                txt.setText(Take);
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Take;
                Take = txt.getText() + bt6.getText().toString();
                txt.setText(Take);
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Take;
                Take = txt.getText() + bt7.getText().toString();
                txt.setText(Take);
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Take;
                Take = txt.getText() + bt8.getText().toString();
                txt.setText(Take);
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Take;
                Take = txt.getText() + bt9.getText().toString();
                txt.setText(Take);
            }
        });

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Take;
                Take = txt.getText() + bt0.getText().toString();
                txt.setText(Take);
            }
        });

        bt00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Take;
                Take = txt.getText() + bt00.getText().toString();
                txt.setText(Take);
            }
        });



       //Operators


        btsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                num1 = Double.parseDouble(txt.getText().toString());
                txt.setText("");
                op = "+";}
                catch(Exception e){


                }
            }
        });

        btsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                num1 = Double.parseDouble(txt.getText().toString());
                txt.setText("");
                op = "-";}
                catch (Exception e){

                }

            }
        });

        btmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                num1 = Double.parseDouble(txt.getText().toString());
                txt.setText("");
                op = "*";}
                catch (Exception e){}
            }
        });

        btdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                num1 = Double.parseDouble(txt.getText().toString());
                txt.setText("");
                op = "/";}
                catch (Exception e){

                }
            }
        });




        bteql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               try{
                num2 = Double.parseDouble(txt.getText().toString());
                String Answer;

                switch (op) {

                    case ("+"):
                        rs = num1 + num2;
                        Answer = rs.toString();
                        txt.setText(Answer);

                        break;

                    case ("-"):
                        rs = num1-num2;
                        Answer = rs.toString();
                        txt.setText(Answer);
                          break;
                    case ("/"):
                        if(!(num2==0)) {
                            rs = num1 / num2;
                            Answer = rs.toString();
                            txt.setText(Answer);
                        }else{

                            txt.setText("Can not Div By 0");
                        }
                        break;

                    case ("*"):
                        rs = num1 * num2;
                        Answer = rs.toString();
                        txt.setText(Answer);
                }}catch (Exception e){}
            }
        });

        btclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  txt.setText("");
            }
        });

        btoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  finish();
            }
        });






    }
}
