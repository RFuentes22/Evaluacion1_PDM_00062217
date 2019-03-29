package com.example.evaluation1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class Main2Activity extends AppCompatActivity {

    private TextView mTextView_User,mTextView_Email,mTextView_Total;
    private Button mShare;

    TextView textPro1,textPro2,textPro3,textPro4,textPro5,textPro6,textPro7,textPro8,textPro9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_main);
        mTextView_User = findViewById(R.id.act2_user);
        mTextView_Email = findViewById(R.id.act2_email);
        textPro1 = findViewById(R.id.Act2_count1);
        textPro2 = findViewById(R.id.Act2_count2);
        textPro3 = findViewById(R.id.Act2_count3);
        textPro4 = findViewById(R.id.Act2_count4);
        textPro5 = findViewById(R.id.Act2_count5);
        textPro6 = findViewById(R.id.Act2_count6);
        textPro7 = findViewById(R.id.Act2_count7);
        textPro8 = findViewById(R.id.Act2_count8);
        textPro9 = findViewById(R.id.Act2_count9);
        mTextView_Total = findViewById(R.id.act2_total);
        mShare = findViewById(R.id.btnshare);
        Intent mIntent = getIntent();


        try {
            JSONObject jobj = new JSONObject(mIntent.getStringExtra("JSON"));
            System.out.println(jobj);
            if (mIntent!=null){
                mTextView_User.setText(mTextView_User.getText() + " " + jobj.get("user") );
                mTextView_Email.setText(mTextView_Email.getText() + " " + jobj.get("email"));
                mTextView_Total.setText(mTextView_Total.getText() + " " + jobj.get("sumPro"));
                textPro1.setText(jobj.getString("nPro1"));
                textPro2.setText(jobj.getString("nPro2"));
                textPro3.setText(jobj.getString("nPro3"));
                textPro4.setText(jobj.getString("nPro4"));
                textPro5.setText(jobj.getString("nPro5"));
                textPro6.setText(jobj.getString("nPro6"));
                textPro7.setText(jobj.getString("nPro7"));
                textPro8.setText(jobj.getString("nPro8"));
                textPro9.setText(jobj.getString("nPro9"));


            }
        } catch (JSONException e) {
            e.printStackTrace();
        }


        try {
            JSONObject jobj = new JSONObject(mIntent.getStringExtra("JSON"));
            mShare.setOnClickListener(v -> {

                Intent mIntent2 = new Intent();
                mIntent2.setType("text/plain");
                mIntent2.setAction(Intent.ACTION_SEND);


                mIntent2.putExtra("JSON", String.valueOf(jobj));
                startActivity(mIntent2);
            });
        } catch (JSONException e) {
            e.printStackTrace();
        }



    }


/*

    }
* */}
