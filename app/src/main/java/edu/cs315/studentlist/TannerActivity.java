package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TannerActivity extends AppCompatActivity {

    ListView languageList;  // call YOUR listView something that makes sense for YOU

    // Array of strings...
    // call YOUR array something that makes sense for YOU
    String[] langArray = {
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
        setContentView(R.layout.activity_tanner);


        languageList = findViewById(R.id.project_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, langArray);

        languageList.setAdapter(arrayAdapter);
    }
}
