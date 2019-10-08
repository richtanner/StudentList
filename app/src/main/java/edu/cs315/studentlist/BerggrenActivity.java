package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BerggrenActivity extends AppCompatActivity {

    ListView languageList;

    //Array of strings for listView
    String[] langArray = new String[]{
            "About Me",
            "Resume",
            "Course List",
            "Grades",
            "Clups",
            "Chapel",
            "Work",
            "Other"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berggren);

        languageList = findViewById(R.id.language_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, langArray);
        languageList.setAdapter(arrayAdapter);
    }
}
