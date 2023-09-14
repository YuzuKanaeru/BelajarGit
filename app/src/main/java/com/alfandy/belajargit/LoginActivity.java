package com.alfandy.belajargit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText edtEmail,edtUsn;
    private EditText edtPassword;
    Button btnLogin,btnkeReg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtUsn = findViewById(R.id.edt_usn);
        edtEmail = findViewById(R.id.edt_email);
        edtPassword = findViewById(R.id.edt_password);
        btnLogin = findViewById(R.id.btn_login);
        btnkeReg = findViewById(R.id.btn_kereg);

        btnkeReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkereg = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(pindahkereg);
            }
        });
    }

    public void actionSubmit(View view) {
        String Usn = edtUsn.getText().toString();
        String email = edtEmail.getText().toString();
        String password = edtPassword.getText().toString();
        Toast.makeText(this, "Halo, nama saya "+Usn+"\nEmail saya "+email, Toast.LENGTH_LONG).show();
    }
}