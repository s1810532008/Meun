package com.example.user.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.example.user.myapplication.R.id.money;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout getActivityMain;

    int b1, c1, d1, e1, f1;
    int b2,c2,d2,e2,f2;
    @BindView(R.id.checkBox2)
    CheckBox checkBox2;
    @BindView(R.id.checkBox4)
    CheckBox checkBox4;
    @BindView(R.id.checkBox3)
    CheckBox checkBox3;
    @BindView(R.id.checkBox5)
    CheckBox checkBox5;
    @BindView(R.id.editText2)
    EditText editText2;
    @BindView(R.id.editText3)
    EditText editText3;
    @BindView(R.id.editText4)
    EditText editText4;
    @BindView(R.id.editText5)
    EditText editText5;
    @BindView(R.id.editText6)
    EditText editText6;
    @BindView(R.id.checkBox)
    CheckBox checkBox;
    @BindView(R.id.textView2)
    TextView textView2;
    @BindView(R.id.textView3)
    TextView textView3;
    @BindView(R.id.textView4)
    TextView textView4;
    @BindView(R.id.textView5)
    TextView textView5;
    @BindView(R.id.textView6)
    TextView textView6;
    @BindView(R.id.imageView2)
    ImageView imageView2;
    @BindView(R.id.imageView3)
    ImageView imageView3;
    @BindView(R.id.imageView4)
    ImageView imageView4;
    @BindView(R.id.imageView5)
    ImageView imageView5;
    @BindView(R.id.button)
    Button button;
    @BindView(R.id.imageView6)
    ImageView imageView6;
    //TextView textView;
    @BindView(R.id.activity_main)
    ConstraintLayout activityMain;
    int total,total2;

    String answer,answer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.button)
    public void onViewClicked() {
        if (checkBox.isChecked()) {

            int b;          //滷肉飯數量
            b = Integer.parseInt(editText2.getText().toString());  //數量
            b1 = b * 30;//滷肉飯的數量乘於金額
            b2 = b * 440;//數量*熱量

        }

        if (checkBox2.isChecked() == true) {
            int c;         //水餃數量
            c = Integer.parseInt(editText3.getText().toString());
            c1 = c * 50;            //水餃的數量乘於金額
            c2 = c * 170; //數量*熱量
        }

        if (checkBox3.isChecked() == true) {
            //checkbox[2]=true;
            int d;          //炒麵數量
            d = Integer.parseInt(editText4.getText().toString());
            d1 = d * 35;        //炒麵的數量乘於金額
            d2 = d * 300; //數量*熱量
        }

        if (checkBox4.isChecked() == true) {
            // checkbox[3]=true;
            int e;       //貢丸湯數量
            e = Integer.parseInt(editText5.getText().toString());
            e1 = e * 20;   //貢丸湯的數量乘於金額
            e2 = e * 165;   //數量*熱量
        }

        if (checkBox5.isChecked() == true) {
            //checkbox[4]=true;
            int f;      //  陽春麵
            f = Integer.parseInt(editText6.getText().toString());
            f1 = f * 40;   //陽春麵的數量乘於金額
            f2 = f * 325;  //數量*熱量
        }
        total = b1+c1+d1+e1+f1;
        total2 =b2+c2+d2+e2+f2;
        answer = String.valueOf(total);
        answer2 = String.valueOf(total2);

        Intent intent=new Intent(MainActivity.this,DeskActivity.class);
        Bundle bundle = new Bundle();
        Bundle bundle1 = new Bundle();
        bundle.putString("answer", answer);
        bundle1.putString("answer2",answer2);
        intent.putExtras(bundle);
        intent.putExtras(bundle1);
        startActivity(intent);
        MainActivity.this.finish();


    }

}








