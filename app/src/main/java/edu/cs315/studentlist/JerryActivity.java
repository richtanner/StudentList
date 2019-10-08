package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class JerryActivity extends AppCompatActivity {

    ListView languageList;

    // Array of strings...
    String[] langArray = {
            "BloodBorne",
            "WarThunder",
            "WarGaming games",
            "Overwatch",
            "RainbowSix",
            "Company of Hero 2",
            "Sleep",
            "Eat",
            "Basically nothing else"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jerry);

        languageList = findViewById(R.id.language_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, langArray);
        languageList.setAdapter(arrayAdapter);
    }
}
