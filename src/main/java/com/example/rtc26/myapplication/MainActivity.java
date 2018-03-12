package com.example.rtc26.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt;
        bt = findViewById(R.id.button);
        bt.setOnClickListener(listener);
    }

    View.OnClickListener listener = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Log.i("message","Hello");
            Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT).show();
        }
    };
}
