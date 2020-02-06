package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view) {

        EditText myTextField = (EditText) findViewById(R.id.editText);
//        Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        String str = myTextField.getText().toString();
        goToActivity2(str);
    }

    public void goToActivity2(String s){
        Intent intent = new Intent(this, Lab2Activity1.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
}
