package com.example.chatwise;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ProductDetailActivity extends AppCompatActivity {

    private TextView titleTextView;
    private TextView descriptionTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        titleTextView = findViewById(R.id.product_detail_title);
        descriptionTextView = findViewById(R.id.product_detail_description);

        // Apply slide-up animation
        CardView cardView = findViewById(R.id.card);
        Animation slideUp = AnimationUtils.loadAnimation(this, R.anim.slide_up);
        cardView.startAnimation(slideUp);

        Intent intent = getIntent();
        if (intent != null) {
            String title = intent.getStringExtra("title");
            String description = intent.getStringExtra("description");

            titleTextView.setText(title);
            descriptionTextView.setText(description);
        }
    }
}
