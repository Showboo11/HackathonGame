package com.example.ishansharma.hackathongame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int num;
    private TextView counterView;
    private Button incrementButton;

    public MainActivity(){
        super();
        num = 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterView = (TextView) findViewById(R.id.counterView);
        incrementButton = (Button) findViewById(R.id.incrementButton);

        incrementButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num++;
                counterView.setText("" + num);
            }
        });


    }
}
