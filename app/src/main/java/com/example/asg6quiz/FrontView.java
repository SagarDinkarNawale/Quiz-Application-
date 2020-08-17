package com.example.asg6quiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class FrontView extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.asg6quiz.MESSAGE";

    EditText txtname;
    Button btnstarttest,btnabout;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_view);
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen


        txtname=(EditText)findViewById(R.id.txtname);
        btnabout=(Button)findViewById(R.id.btnabout);
        btnstarttest=(Button)findViewById(R.id.btnstarttest);
        builder = new AlertDialog.Builder(this);


        btnabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 builder.setMessage("Welcome  !\nThis App is Developed by \n Sagar Nawale");
                builder.setTitle("About Developer !");
                AlertDialog alert = builder.create();
                //Setting the title manually
                alert.show();
            }
        });





    }
    public void sendname(View view) {
        String name = txtname.getText().toString();
        if(!name.equals("")) {
            Intent intent = new Intent(this, MainActivity.class);

            intent.putExtra(EXTRA_MESSAGE, name);
            startActivity(intent);
        }
        else
        {

          //  txtname.setError("Enter Name  :");
            builder.setMessage("Please Enter The Name ");
            builder.setTitle("Error !");
            AlertDialog alert = builder.create();
            //Setting the title manually
            alert.show();
        }

    }

}
