package com.example.asg6quiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton rb11,rb24,rb32,rb44,rb51,rb63,rb74,rb82,rb91,rb102;
    Button btnsubmittest,btnclear;
    AlertDialog.Builder builder;
    static int marks=0;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        builder = new AlertDialog.Builder(this);

        rb11=(RadioButton)findViewById(R.id.rb11);
        rb24=(RadioButton)findViewById(R.id.rb24);
        rb32=(RadioButton)findViewById(R.id.rb32);
        rb44=(RadioButton)findViewById(R.id.rb44);
        rb51=(RadioButton)findViewById(R.id.rb51);
        rb63=(RadioButton)findViewById(R.id.rb63);
        rb74=(RadioButton)findViewById(R.id.rb74);
        rb82=(RadioButton)findViewById(R.id.rb82);
        rb91=(RadioButton)findViewById(R.id.rb91);
        rb102=(RadioButton)findViewById(R.id.rb102);

        btnsubmittest=(Button)findViewById(R.id.btnsubmit);

        btnclear=(Button)findViewById(R.id.btnclear);
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(getIntent());
               // rb11.toggle();
            }
        });

//Hides Full Title Bar

        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen


        //end

        btnsubmittest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marks=0;
                if(rb11.isChecked())
                    marks += 1;
                if(rb24.isChecked())
                    marks += 1;
                if(rb32.isChecked())
                    marks += 1;
                if(rb44.isChecked())
                    marks += 1;
                if(rb51.isChecked())
                    marks += 1;
                if(rb63.isChecked())
                    marks += 1;
                if(rb74.isChecked())
                    marks += 1;
                if(rb82.isChecked())
                    marks += 1;
                if(rb91.isChecked())
                    marks += 1;
                if(rb102.isChecked())
                    marks += 1;


               // Toast.makeText(getApplicationContext(), "Your Marks is="+marks, Toast.LENGTH_SHORT).show();


                Intent intent = getIntent();
                String name = intent.getStringExtra(FrontView.EXTRA_MESSAGE);


                String demo1=Integer.toString(marks);
                builder.setMessage("Your total Marks out of 10 is="+demo1+"\n\tThank You...!");
                builder.setTitle("Welcome Mr."+name);
                AlertDialog alert = builder.create();
                //Setting the title manually
                alert.show();

            }
        });




    }
}
