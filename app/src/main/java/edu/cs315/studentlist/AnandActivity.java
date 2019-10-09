package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AnandActivity extends AppCompatActivity {

    ListView languageList;  // call YOUR listView something that makes sense for YOU

  // Anand's Array of Strings
    String[] AnandlangArray = {
            "qBASIC",
            "C++",
            "Java for Android (Work in Progress)",
            "R",
            "Maple",
            "Javascript (Exposed)",
            "Popular Web Markup Languages",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anand);

        languageList = findViewById(R.id.project_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, AnandlangArray);

        languageList.setAdapter(arrayAdapter);
    }
}
