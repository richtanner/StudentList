package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {

    ListView RubensList;  // call YOUR listView something that makes sense for YOU
    //push two
    // Array of strings...
    // call YOUR array something that makes sense for YOU
    String Teamsarray[] = {



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

        RubensList = (ListView)findViewById(R.id.Rubens_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, Teamsarray);
        RubensList.setAdapter(arrayAdapter);
    }
}
