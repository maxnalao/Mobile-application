package com.example.productlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tan01.R;

public class LoginActivity extends AppCompatActivity {

    private EditText Username;
    private EditText Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity); // เปลี่ยนชื่อให้ตรงกับไฟล์ XML

        // เชื่อมต่อ UI กับ Java
        Username = findViewById(R.id.username);
        Password = findViewById(R.id.password);

        // เชื่อมต่อปุ่ม Login กับฟังก์ชัน login
        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(this::login);
    }

    // ฟังก์ชันเมื่อกดปุ่ม Login
    public void login(View view) {
        String username = Username.getText().toString();
        String password = Password.getText().toString();

        // ตรวจสอบชื่อผู้ใช้และรหัสผ่าน (ทดสอบด้วยค่าคงที่)
        if (username.equals("tanny") && password.equals("654321")) {
            // หากสำเร็จ เข้าสู่หน้าถัดไป
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        } else {
            // หากไม่สำเร็จ แสดงข้อความแจ้ง
            Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show();
        }
    }
}

