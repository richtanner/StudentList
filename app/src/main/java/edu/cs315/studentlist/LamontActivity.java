package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LamontActivity extends AppCompatActivity {

    ListView stuffList;

    // Array of strings...
    String[] stuffArray = {
            "Favorite Movies",
            "Favorite Games",
            "Programming Languages",
            "Foods that are Technically Considered Sandwiches",
            "Foods that are Technically Considered Soup",
            "Current Games I Am Playing",
            "Fun Facts",
            "Bad Jokes",
            "Riddles",
            "Useless Facts",
            "Games I am above average at",
            "Games I am terrible at",
            "Genres that the move The Princess Bride fits under",
            "Ideas For a List"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lamont);

        stuffList = findViewById(R.id.language_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, stuffArray);
        stuffList.setAdapter(arrayAdapter);
    }
}
