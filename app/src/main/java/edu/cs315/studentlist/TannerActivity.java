package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TannerActivity extends AppCompatActivity {

    ListView languageList;

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
            "ActionScript"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanner);

        languageList = (ListView)findViewById(R.id.language_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, langArray);
        languageList.setAdapter(arrayAdapter);
    }
}
