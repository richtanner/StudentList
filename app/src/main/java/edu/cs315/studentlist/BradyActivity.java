package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class BradyActivity extends AppCompatActivity {

    ListView gameList;

    // Array of strings...
    String[] gameArray = {
            "Chess",
            "Text Adventure",
            "Zombie Squirrel",
            "Cloud Jumper",
            "Space Freighter",
            "Knights Quest",
            "VR Project(In Progress)",
            "Endless Runner",
            "3D Modeling",
            "Test"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brady);

        gameList = findViewById(R.id.project_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, gameArray);
        gameList.setAdapter(arrayAdapter);
    }
}
