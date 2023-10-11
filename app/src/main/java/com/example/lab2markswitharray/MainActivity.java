package com.example.lab2markswitharray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView main = (TextView) findViewById(R.id.TextView_Main);

        main.setText("");
        int[] marks = {56,72,19,65};

        int total = 0;

        for (int m: marks) {
            main.append(m + "\n");
            total += m;
        }
        main.append(" Total is: " + total);
        main.append("\n Average is: " + total / marks.length);
        String  names[] = {"Ella", "Jack", "Mia", "Cooper"};
        main.append("\n This is the lab2 part3: show student name with marks:");
        for (int i=0; i < names.length; i++){
            main.append("\n" + names[i] + " : " + marks[i]);
        }
    }
}