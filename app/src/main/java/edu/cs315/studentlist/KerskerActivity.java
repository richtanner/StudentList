package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class KerskerActivity extends AppCompatActivity {

    ListView kerskerFacts;

    String factsArray [] = {
        "Two Older Sisters",
        "Built Computers At 13",
        "Learning Greek",
        ""
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kersker);

        kerskerFacts = (ListView)findViewById(R.id.language_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, factsArray);
        kerskerFacts.setAdapter(arrayAdapter);
    }
}
