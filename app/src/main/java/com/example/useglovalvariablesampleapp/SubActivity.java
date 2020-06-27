package com.example.useglovalvariablesampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity implements View.OnClickListener {

    private Myapp myapp;
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        myapp = (Myapp)this.getApplication();

        String str = myapp.getTestString();

        TextView textView = findViewById(R.id.textView);
        textView.setText(str);

        editText = findViewById(R.id.editText2);

        button = findViewById(R.id.button2);
        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button2:
                String msg = editText.getText().toString();
                myapp.setTestString(msg);

                Intent intent = new Intent(SubActivity.this, MainActivity.class);
                startActivity(intent);
        }
    }
}
