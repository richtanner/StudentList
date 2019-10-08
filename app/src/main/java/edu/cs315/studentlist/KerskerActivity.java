package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class KerskerActivity extends AppCompatActivity {

    ListView kerskerFacts;

    String[] factsArray = {
            "Two Older Sisters",
            "Built Computers At 13",
            "Learning Greek",
            "I like Pokemon",
            "Πάτερ ἠμῶν",
            "I can balance chairs",
            "Flash or Spider-Man?",
            "Dogs and Cats are great",
            "Music is awesome",
            "I like Taco Bell",
            "Who wants Adventure?",
            "I'm still learning Java",
            "I am taking 7 classes",
            "Colors are hard"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kersker);

        kerskerFacts = findViewById(R.id.kersker_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, factsArray);
        kerskerFacts.setAdapter(arrayAdapter);
    }
}
