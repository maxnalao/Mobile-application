package com.example.productlist;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.tan01.R;

public class ProductDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        // รับข้อมูลจาก Intent
        Intent intent = getIntent();
        String productName = intent.getStringExtra("PRODUCT_NAME");
        String productImage = intent.getStringExtra("PRODUCT_IMAGE");
        int productPrice = intent.getIntExtra("PRODUCT_PRICE", 0);
        String productDescription = intent.getStringExtra("PRODUCT_DESCRIPTION"); // รับคำอธิบายสินค้า

        // แสดงข้อมูลใน UI
        TextView nameTextView = findViewById(R.id.product_name);
        TextView priceTextView = findViewById(R.id.product_price);
        TextView descriptionTextView = findViewById(R.id.product_description); // TextView สำหรับคำอธิบาย
        ImageView imageView = findViewById(R.id.product_image);

        nameTextView.setText(productName);
        priceTextView.setText(productPrice + " บาท");
        descriptionTextView.setText(productDescription); // แสดงคำอธิบายสินค้า
        Glide.with(this).load(productImage).into(imageView);
    }
}
