package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.user.myapplication.R.id.money;

public class DeskActivity extends AppCompatActivity {
    Button desk01,desk02,desk03,desk04;
    TextView money,Calories,Run;
    String a,a2,run1;
    int run ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desk);
        desk01 = (Button)findViewById(R.id.desk01);
        desk02 = (Button)findViewById(R.id.desk02);
        desk03 = (Button)findViewById(R.id.desk03);
        desk04 = (Button)findViewById(R.id.desk04);
        money = (TextView)findViewById(R.id.money);
        Calories =(TextView)findViewById(R.id.Calories);
        Run  = (TextView)findViewById(R.id.Run);
        desk01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DeskActivity.this,MainActivity.class));
            }
        });
        desk02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DeskActivity.this,MainActivity.class));
            }
        });
        desk03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DeskActivity.this,MainActivity.class));
            }
        });
        desk04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DeskActivity.this,MainActivity.class));
            }
        });



    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent intent =getIntent();
        Bundle  bundle = intent.getExtras();
        Bundle bundle1 = intent.getExtras();

        if( bundle!=null){

            a = bundle.getString("answer");
            money.setText(a+"元");
        }
        if(bundle1!=null){
            a2 =  bundle1.getString("answer2");
            Calories.setText(a2+"大卡");
            run = Integer.valueOf(a2)/222;
            run1 = String.valueOf(run);
            Run.setText("須跑"+run1+"小時");
        }
    }
}
