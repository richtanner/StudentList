package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MelroseActivity extends AppCompatActivity {

    ListView wmmListView;
    String[] langArray = new String[]{
            "C++",
            "Java",
            "SQL",
            "C#",
            "Powerpoint"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_melrose);

        wmmListView = findViewById(R.id.wmmList);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.activity_styleless_listviewitem, R.id.textView, langArray);
        wmmListView.setAdapter(arrayAdapter);
    }
}
