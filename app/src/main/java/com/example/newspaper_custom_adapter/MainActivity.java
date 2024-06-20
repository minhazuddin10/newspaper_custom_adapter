package com.example.newspaper_custom_adapter;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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


//    String[] details ={"Australia, officially the Commonwealth of Australia",
//    "Australia, officially the Commonwealth of Australia,",
//    "Australia, officially the Commonwealth of Australia,",
//    "Australia, officially the Commonwealth of Australia,",
//    "Australia, officially the Commonwealth of Australia,",
//    "Australia, officially the Commonwealth of Australia,",
//    "Australia, officially the Commonwealth of Australia,",
//    "Australia, officially the Commonwealth of Australia,",
//    "Australia, officially the Commonwealth of Australia,",
//    "Australia, officially the Commonwealth of Australia,",
//    "Australia, officially the Commonwealth of Australia,",
//    "Australia, officially the Commonwealth of Australia,",
//    "Australia, officially the Commonwealth of Australia,"};

    String [] del;

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

        Resources Res =getResources();
        del=Res.getStringArray(R.array.details);


        custom_adapter custom_adapter =new custom_adapter(images,array,descrip,this,del);
        l1.setAdapter(custom_adapter);

        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent ii = new Intent(MainActivity.this, country_details.class);

                ii.putExtra("key1",array[position]);
                ii.putExtra("key2",images[position]);
                ii.putExtra("key3",del[position]);

                startActivity(ii);

            }
        });
    }
}
