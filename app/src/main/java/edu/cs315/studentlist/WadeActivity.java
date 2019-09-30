package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WadeActivity extends AppCompatActivity {

    ListView sportsList;

    String sportsArray [] = {
            "Football",
            "Baseball",
            "Basketball",
            "Soccer",
            "eSports",
            "Trap shooting",
            "Cross country",
            "Track",
            "Tee ball",
            "Flag football"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wade);

        sportsList = (ListView)findViewById(R.id.sports_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, sportsArray);
        sportsList.setAdapter(arrayAdapter);
    }
}
