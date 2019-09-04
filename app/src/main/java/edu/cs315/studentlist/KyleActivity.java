package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class KyleActivity extends AppCompatActivity {

    ListView kylesList;

    // Array of strings...
    String langArray[] = {
            "Objective-C",
            "Swift",
            "C#",
            "Java (Android)",
            "Kotlin (soon...)",
            "Java (standard)",
            "C",
            "C++",
            "HTML",
            "CSS",
            "PHP",
            "JavaScript (some)",
            "ActionScript",
            "BASIC (4evr ago)"
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
