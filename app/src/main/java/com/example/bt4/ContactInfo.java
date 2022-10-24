package com.example.bt4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContactInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_info);

        TextView txtName = findViewById(R.id.name);
        TextView txtEmail = findViewById(R.id.email);
        TextView txtProject = findViewById(R.id.project);

        Button btnFinish = findViewById(R.id.btnFinish);
        btnFinish.setOnClickListener(finishListener);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        String email = bundle.getString("email");
        String project = bundle.getString("project");

        txtName.setText(name);
        txtEmail.setText(email);
        txtProject.setText(project);
    }

    private final View.OnClickListener finishListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    };

}