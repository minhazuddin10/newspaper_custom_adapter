package com.example.newspaper_custom_adapter;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    ListView l1;
    String[] array ={"Bangladesh","India","Swizerland","Brazil","Pakistan","Franch","newzeland","sudan",
    "suiden","china","Europ","germany","palestine"};

    String[] descrip ={"Click Here To The Description","Click Here To The Description",
            "Click Here To The Description","Click Here To The Description","Click Here To The Description",
            "Click Here To The Description","Click Here To The Description","Click Here To The Description",
            "Click Here To The Description","Click Here To The Description","Click Here To The Description",
            "Click Here To The Description","Click Here To The Description"};

    Integer[] images={
            R.drawable.bangleadh,
            R.drawable.india,
            R.drawable.swizerland,
            R.drawable.brazil,
            R.drawable.pakistan,
            R.drawable.franch,
            R.drawable.newzelend,
            R.drawable.sudan,
            R.drawable.sudan,
            R.drawable.china,
            R.drawable.europ,
            R.drawable.germany,
            R.drawable.palestine,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        l1 =findViewById(R.id.listViewID);

        custom_adapter custom_adapter =new custom_adapter(images,array,descrip,this);

        l1.setAdapter(custom_adapter);
    }
}
