package com.harshadachavan.contactlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;

    String[] name = {
            "Harshada Chavan",
            "Abhijeet",
            "Aditya",
            "Ajinkya",
            "Uma",
            "Rushikesh"
    } ;
    String[] number = {
            "8805997408",
            "9819196008",
            "766129619",
            "8793763671",
            "9764054594",
            "9762528328"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomList adapter = new
                CustomList(MainActivity.this, name, number);
        list=(ListView)findViewById(R.id.contactlist);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " +name[+ position], Toast.LENGTH_SHORT).show();

            }
        });
    }
}
