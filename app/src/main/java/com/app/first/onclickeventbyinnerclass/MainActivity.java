package com.app.first.onclickeventbyinnerclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button1);

button.setOnClickListener(new Akhil());


    }
    class Akhil implements View.OnClickListener{
        @Override
        public void onClick(View v){


            Log.d("Akhil","Button clicked ");

        }

    }
}
