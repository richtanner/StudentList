package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {

    ListView languageList;  // call YOUR listView something that makes sense for YOU

    // Array of strings...
    // call YOUR array something that makes sense for YOU
    String langArray[] = {
            "Optic",
            "Faze",
            "Envy",
            "EUnited",
            "Splice",
            "Luminosity",
            "Lightning Pandas",
            "100 Thieves",
            "Midnight",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        languageList = (ListView)findViewById(R.id.language_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, langArray);
        languageList.setAdapter(arrayAdapter);
    }
}
