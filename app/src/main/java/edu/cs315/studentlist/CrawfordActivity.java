package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CrawfordActivity extends AppCompatActivity {

    ListView languageList;

    String[] langArray = {
            "Madden NFL 20",
            "Star Wars Battlefront 2",
            "Battlefield V",
            "Warframe",
            "UFC 3",
            "NBA 2K20"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crawford);

        languageList = findViewById(R.id.language_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.activity_listview, R.id.textView, langArray);
        languageList.setAdapter(arrayAdapter);
    }
}
