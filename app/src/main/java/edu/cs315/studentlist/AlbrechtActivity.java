package edu.cs315.studentlist;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class AlbrechtActivity extends AppCompatActivity {

    ListView languageList;

    String langArray[] = {
            "C++",
            "PHP",
            "HTML",
            "CSS",
            "JavaScript",
            "TypeScript",
            "Java (Android)",
            "Java (standard)",
            "Assembly",
            "English"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albrecht);

        languageList = (ListView)findViewById(R.id.language_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, langArray);
        languageList.setAdapter(arrayAdapter);
    }
}
