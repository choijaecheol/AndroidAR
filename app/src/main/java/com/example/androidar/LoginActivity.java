package com.example.androidar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;
    private Button emailLoginButton;
    private Button googleSignInButton;
    private Button facebookLoginButton;
    private Button twitterLoginButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailEditText = findViewById(R.id.email_edittext);
        passwordEditText = findViewById(R.id.password_edittext);
        emailLoginButton = findViewById(R.id.email_login_button);
        googleSignInButton = findViewById(R.id.google_sign_in_button);
        facebookLoginButton = findViewById(R.id.facebook_login_button);
        twitterLoginButton = findViewById(R.id.twitter_login_button);

        emailLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 이메일 로그인 버튼 클릭 시 처리
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if (isValidEmail(email) && isValidPassword(password)) {
                    // 여기에서 로그인 로직을 구현하고 성공/실패에 따라 처리합니다.
                    // 로그인 성공 시 다음 화면으로 이동 등을 수행합니다.
                    Toast.makeText(LoginActivity.this, "이메일 로그인 성공!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(LoginActivity.this, "이메일 또는 비밀번호를 확인하세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // 이메일 유효성 검사
    private boolean isValidEmail(String email) {
        // 여기에서 이메일 유효성 검사를 수행합니다. 필요에 따라 구현합니다.
        return email.contains("@");
    }

    // 비밀번호 유효성 검사
    private boolean isValidPassword(String password) {
        // 여기에서 비밀번호 유효성 검사를 수행합니다. 필요에 따라 구현합니다.
        return password.length() >= 6;
    }
}

