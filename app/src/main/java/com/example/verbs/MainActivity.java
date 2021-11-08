package com.example.verbs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText verb;
    private TextView result_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        verb = findViewById(R.id.verb);
        result_text = findViewById(R.id.result_text);

        verb.setOnEditorActionListener((v, actionId, event) -> {
            String verb = v.getText().toString().trim();

            if (verb.isEmpty())
                return false;

            if (verb.split(" ").length > 2){
                Toast.makeText(MainActivity.this, R.string.also_one_verb, Toast.LENGTH_SHORT).show();
                return false;
            }

            return true;
        });
    }

    private List<String> getForms(String verb){


    }


}