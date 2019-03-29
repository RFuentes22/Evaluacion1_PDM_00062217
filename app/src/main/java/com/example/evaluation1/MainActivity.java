package com.example.evaluation1;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private int p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0, p6 = 0, p7 = 0, p8 = 0, p9 = 0;
    TextView textPro1,textPro2,textPro3,textPro4,textPro5,textPro6,textPro7,textPro8,textPro9;
    Button btnSend;
    EditText mUser,mEmail;
    LinearLayout product1,product2,product3,product4,product5,product6,product7,product8,product9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        product1 = findViewById(R.id.product1);
        product2 = findViewById(R.id.product2);
        product3 = findViewById(R.id.product3);
        product4 = findViewById(R.id.product4);
        product5 = findViewById(R.id.product5);
        product6 = findViewById(R.id.product6);
        product7 = findViewById(R.id.product7);
        product8 = findViewById(R.id.product8);
        product9 = findViewById(R.id.product9);
        textPro1 = findViewById(R.id.count1);
        textPro2 = findViewById(R.id.count2);
        textPro3 = findViewById(R.id.count3);
        textPro4 = findViewById(R.id.count4);
        textPro5 = findViewById(R.id.count5);
        textPro6 = findViewById(R.id.count6);
        textPro7 = findViewById(R.id.count7);
        textPro8 = findViewById(R.id.count8);
        textPro9 = findViewById(R.id.count9);
        btnSend = findViewById(R.id.send);
        mUser = findViewById(R.id.user);
        mEmail = findViewById(R.id.email);

        product1.setOnClickListener(v -> {
            p1 = Integer.parseInt(textPro1.getText().toString());
            p1++;
            textPro1.setText(Integer.toString(p1));
        });
        product2.setOnClickListener(v -> {
            p2 = Integer.parseInt(textPro2.getText().toString());
            p2++;
            textPro2.setText(Integer.toString(p2));
        });
        product3.setOnClickListener(v -> {
            p3 = Integer.parseInt(textPro3.getText().toString());
            p3++;
            textPro3.setText(Integer.toString(p3));
        });
        product4.setOnClickListener(v -> {
            p4 = Integer.parseInt(textPro4.getText().toString());
            p4++;
            textPro4.setText(Integer.toString(p4));
        });
        product5.setOnClickListener(v -> {
            p5 = Integer.parseInt(textPro5.getText().toString());
            p5++;
            textPro5.setText(Integer.toString(p5));
        });

        product6.setOnClickListener(v -> {
            p6 = Integer.parseInt(textPro6.getText().toString());
            p6++;
            textPro6.setText(Integer.toString(p6));
        });
        product7.setOnClickListener(v -> {
            p7 = Integer.parseInt(textPro7.getText().toString());
            p7++;
            textPro7.setText(Integer.toString(p7));
        });
        product8.setOnClickListener(v -> {
            p8 = Integer.parseInt(textPro8.getText().toString());
            p8++;
            textPro8.setText(Integer.toString(p8));
        });
        product9.setOnClickListener(v -> {
            p9 = Integer.parseInt(textPro9.getText().toString());
            p9++;
            textPro9.setText(Integer.toString(p9));
        });




        btnSend.setOnClickListener(v -> {
            String user=mUser.getText().toString();
            String email=mEmail.getText().toString();

            int sumPro = (p1+p2+p3+p4+p5+p6+p7+p8+p9);

            JSONObject json= new JSONObject();


            try {
                json.put("user",user);
                json.put("email",email);
                json.put("sumPro",sumPro);

            }
            catch (JSONException e){

            }

            Intent mIntent=new Intent(MainActivity.this,Main2Activity.class);
            mIntent.putExtra("JSON", String.valueOf(json));
            startActivity(mIntent);


        });


    }





}
