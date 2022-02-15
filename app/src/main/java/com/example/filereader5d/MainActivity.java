package com.example.filereader5d;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText editText;

    TextView textView;

    Button read;
    Button write;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.editText = findViewById(R.id.editText);

        this.textView = findViewById(R.id.textView);

        this.read = findViewById(R.id.buttonRead);
        this.write = findViewById(R.id.buttonWrite);

        read.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String text = IO.readFile("backup");
            }
        });

        write.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                IO.writeToFile(textView.getText().toString(), getApplicationContext());
            }
        });
    }
}