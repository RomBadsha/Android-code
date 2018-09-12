package com.example.ratul_pc.listview;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ProductAdapter productAdapter;

    ListView mListView;
    List<String> mCuntryName =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView =findViewById(R.id.listViewId);

        productAdapter =new ProductAdapter(Context,mCuntryName);

        /*mCuntryName.add("USA");
        mCuntryName.add("Bangladesh");
        mCuntryName.add("India");
        mCuntryName.add("Japan");
        mCuntryName.add("Austrilia");
        mCuntryName.add("UK");
        mCuntryName.add("USA");
        mCuntryName.add("Bangladesh");
        mCuntryName.add("India");
        mCuntryName.add("Japan");
        mCuntryName.add("Austrilia");
        mCuntryName.add("UK");
        mCuntryName.add("USA");
        mCuntryName.add("Bangladesh");
        mCuntryName.add("India");
        mCuntryName.add("Japan");
        mCuntryName.add("Austrilia");
        mCuntryName.add("UK");
        mCuntryName.add("USA");
        mCuntryName.add("Bangladesh");
        mCuntryName.add("India");
        mCuntryName.add("Japan");
        mCuntryName.add("Austrilia");
        mCuntryName.add("UK");
        mCuntryName.add("USA");
        mCuntryName.add("Bangladesh");
        mCuntryName.add("India");
        mCuntryName.add("Japan");
        mCuntryName.add("Austrilia");
        mCuntryName.add("UK");


        ArrayAdapter arrayAdapter =new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,mCuntryName);
        mListView.setAdapter(arrayAdapter);  */

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String text = mCuntryName.get(i);

                Toast.makeText(MainActivity.this,text,Toast.LENGTH_SHORT).show();
            }
        });


    }
}
