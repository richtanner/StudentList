package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GarciaActivity extends AppCompatActivity {

    ListView languageList;

    // Array of strings...
    String langArray[] = {
            "Swift",
            "Java (Android)",
            "Kotlin (soon...)",
            "Java (standard)",
            "C++",
            "Python",
            "JavaScript (some)",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garcia);

        languageList = (ListView)findViewById(R.id.language_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, langArray);
        languageList.setAdapter(arrayAdapter);
    }
}
