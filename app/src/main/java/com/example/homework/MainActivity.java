package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView ;
    Button btn;
    EditText editText;

    final ArrayList<String> friendArrayList = new ArrayList<String>();
    ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.myListView);
        btn=findViewById(R.id.addToList);

        friendArrayList.add("Abdullah");
        friendArrayList.add("Azhar");
        friendArrayList.add("Babar");
        friendArrayList.add("Mushtaq");
        friendArrayList.add("Musa");
        friendArrayList.add("Salman");
        friendArrayList.add("Zahid");

        arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,friendArrayList );

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Log.i("You clicked the name of", friendArrayList.get(i));

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText=findViewById(R.id.FriendName);
                String friendName=editText.getText().toString();
                friendArrayList.add(friendName);
            }
        });

    }
}
