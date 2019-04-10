package com.example.tabuada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText number = findViewById(R.id.number);
        Button button=findViewById(R.id.button);
        final ListView lista=findViewById(R.id.lista);

        View.OnClickListener onClickListener = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ArrayList<Integer> a=new ArrayList<>();
                for(int i=1;i<=10;i++){
                    a.add(i*Integer.valueOf(number.getText().toString()));
                }
                ArrayAdapter<Integer> adapter = new ArrayAdapter<>(MainActivity.this, R.layout.layout1, a);

                lista.setAdapter(adapter);
            }
        };

        button.setOnClickListener(onClickListener);
    }
}
