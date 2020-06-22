package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        //TODO: jackjack baho teten

    }
    public void onBtnClick(View view){
        TextView txtFname = findViewById(R.id.viewFname);
        TextView txtLname = findViewById(R.id.viewLname);
        TextView txtEmail = findViewById(R.id.viewemail);
        EditText edtFName=findViewById(R.id.firstName);
        EditText edtLName=findViewById(R.id.lastName);
        EditText edtEName=findViewById(R.id.email);
String fname=edtFName.getText().toString();
        String lname=edtLName.getText().toString();
        String ename=edtEName.getText().toString();
        txtFname.setText("First name:"+fname);
        txtLname.setText("Last name:"+lname);
        txtEmail.setText("Email:"+ename);
    }
}