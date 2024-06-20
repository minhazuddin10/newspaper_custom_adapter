package com.example.newspaper_custom_adapter;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class country_details extends AppCompatActivity {


    TextView t1,t2;
    ImageView images1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_country_details);

        t1=findViewById(R.id.heading);
        t2=findViewById(R.id.details);
        images1=findViewById(R.id.images);

        String a=getIntent().getExtras().getString("key1");
        t1.setText(a);
        Integer b=getIntent().getIntExtra("key2",1);
        images1.setImageResource(b);
        String c=getIntent().getExtras().getString("key3");
        t2.setText(c);

    }
}