package com.example.bt4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        EditText txtName = findViewById(R.id.name);
        EditText txtEmail = findViewById(R.id.email);
        EditText txtProject = findViewById(R.id.project);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iGetContactInfo = new Intent(getApplicationContext(), ContactInfo.class);
                Bundle bundle = new Bundle();
                bundle.putString("name", txtName.getText().toString());
                bundle.putString("email", txtEmail.getText().toString());
                bundle.putString("project", txtProject.getText().toString());
                iGetContactInfo.putExtras(bundle);

                startActivity(iGetContactInfo);
            }
        });
    }
}