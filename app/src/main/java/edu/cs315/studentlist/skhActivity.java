package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class skhActivity extends AppCompatActivity {

    ListView disneyWorldList;

    // Array of strings...
    String disArray[] = {
            " ",
            "Pandora",
            "The Land",
            "Hub Grass",
            "Fantasyland",
            "Dinoland, USA",
            "Andy's Backyard",
            "Mainstreet, USA",
            "Batuu, Galaxy's Edge",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skh);

        disneyWorldList = (ListView)findViewById(R.id.disneyWorld_List);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_skh_listview, R.id.textView, disArray);
        disneyWorldList.setAdapter(arrayAdapter);

    }
}
