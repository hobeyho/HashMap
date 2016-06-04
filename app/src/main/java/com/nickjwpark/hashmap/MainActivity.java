package com.nickjwpark.hashmap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    Button btnAdd;
    EditText editTextName, editTextHeight;
    HashMap <String, Double> height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        editTextName =(EditText) findViewById(R.id.editTextName);
        editTextHeight = (EditText) findViewById(R.id.editTextHeight);

        height = new HashMap<String, Double>();

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = editTextName.getText().toString();
                Double height_val = Double.parseDouble(editTextHeight.getText().toString());
                height.put(name, height_val);
                Log.d("debugging", name + "의 키는 " + height_val + "cm 입니다");
            }
        });
    }
}
