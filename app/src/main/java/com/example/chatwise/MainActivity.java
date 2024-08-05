package com.example.chatwise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Apply fade-in animation
        TextView tv  = findViewById(R.id.welcome);
        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.item_fade_in);
        tv.startAnimation(fadeIn);



        Button viewProduct = findViewById(R.id.viewproduct);
        viewProduct.startAnimation(fadeIn);

        viewProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ProductList.class);
                startActivity(i);
            }
        });
    }
}
