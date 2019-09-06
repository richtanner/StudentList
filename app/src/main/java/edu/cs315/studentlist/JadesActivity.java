package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class JadesActivity extends AppCompatActivity {

    ListView simpleList;

    // Array of strings...
    String jadesList[] = {
            "Alabama",
            "Arizona",
            "Arkansas",
            "California",
            "Colorado",
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
            "Virginia",
            "Washington",
            "West Virginia",
            "Wyoming"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jades);
    }
}
