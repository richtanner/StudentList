package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class KyleActivity extends AppCompatActivity {

    ListView kylesList;

    // Array of strings...
    String langArray[] = {
            "Astros",
            "A's",
            "Angels",
            "Yankees",
            "Red Sox",
            "Rays",
            "Orioles",
            "Blue Jays",
            "Cardinals",
            "Cubs",
            "Dodgers",
            "Reds",
            "Pirates",
            "Rangers"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kyle);

        kylesList = (ListView)findViewById(R.id.language_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, langArray);
        kylesList.setAdapter(arrayAdapter);
    }
}
