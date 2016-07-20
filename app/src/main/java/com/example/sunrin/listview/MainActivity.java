package com.example.sunrin.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new CustomAdapter();

        listView = (ListView)findViewById(R.id.listview);

        listView.setAdapter(adapter);

        adapter.add("AnA");
        adapter.add("NaN");
        adapter.add("아나");
        adapter.add("난");
    }
}
