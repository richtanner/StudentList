package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AnnaActivity extends AppCompatActivity {

    ListView movieList;

    // Array of strings...
    String[] movArray = {
            "Scott Pilgrim",
            "Thor: Ragnarok",
            "The Royal Tenenbaums",
            "The Internship",
            "Pride and Prejudice",
            "Howl's Moving Castle",
            "My Neighbor Totoro",
            "Juno",
            "Lady Bird",
            "Pretty in Pink",
            "Deadpool",
            "Let's Be Cops",
            "Booksmart",
            "Mulan"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anna);

        movieList = findViewById(R.id.annamovie);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, movArray);
        movieList.setAdapter(arrayAdapter);
    }
}
