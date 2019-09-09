package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class JadesActivity extends AppCompatActivity {

    ListView jadesList;

    // Array of strings...
    String jadeArray[] = {
            "Alabama",
            "Arizona",
            "Arkansas",
            "California",
            "Colorado",
            "Connecticut",
            "Delaware",
            "Florida",
            "Georgia",
            "Louisiana",
            "Maryland",
            "Mississippi",
            "Montana",
            "Nevada",
            "New Jersey",
            "New Mexico",
            "New York",
            "Ohio",
            "Oklahoma",
            "Pennsylvania",
            "Rhode Island",
            "Texas",
            "Vermont",
            "Virginia",
            "Washington",
            "West Virginia",
            "Wyoming"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jades);

        jadesList = (ListView)findViewById(R.id.jade_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, jadeArray);
        jadesList.setAdapter(arrayAdapter);
    }
}
