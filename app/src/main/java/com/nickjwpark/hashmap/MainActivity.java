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
    EditText editTextName, editTextHeight, editTextWeight, editTextAge;
    HashMap <String, double[]> height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        editTextName =(EditText) findViewById(R.id.editTextName);
        editTextHeight = (EditText) findViewById(R.id.editTextHeight);
        editTextWeight = (EditText) findViewById(R.id.editTextWeight);
        editTextAge = (EditText) findViewById(R.id.editTextAge);

        height = new HashMap<String, double[]>();

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = editTextName.getText().toString();
                Double height_val = Double.parseDouble(editTextHeight.getText().toString());
                Double weight_val = Double.parseDouble(editTextWeight.getText().toString());
                //나이는 원래 정수이지만 double 배열을 쓰기 때문에 double 로 사용해 주도록 하자
                Double age_val = Double.parseDouble(editTextAge.getText().toString());

                double [] values = {height_val, weight_val, age_val};
                height.put(name, values);
                for (String key : height.keySet()) {
                    Log.d("debugging", key + "의 키는 " + height.get(key)[0] + "cm,"+
                            " 몸무게는 " + height.get(key)[1] + "kg,"+
                            " 나이는 " + height.get(key)[2] + "살 입니다");
                }
            }
        });
    }
}
