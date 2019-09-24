package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

//public class WebbActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_webb);
//    }
public class WebbActivity extends AppCompatActivity {

    ListView languageList;

    // Array of strings...
    String langArray[] = new String[]{
            "C#",
            "Java (Android)",
            "Kotlin (soon...)",
            "Python",
            "C++"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webb);

        languageList = (ListView)findViewById(R.id.language_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, langArray);
        languageList.setAdapter(arrayAdapter);
    }
}
