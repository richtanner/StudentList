package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AnnaActivity extends AppCompatActivity {

    ListView movieList;

    // Array of strings...
    String movArray[] = {
            "Scott Pilgrim vs the World",
            "Thor: Ragnarok",
            "The Royal Tenenbaums",
            "The Internship",
            "Pride and Prejudice",
            "Howl's Moving Castle",
            "My Neighbor Totoro",
            "Juno",
            "Lady Bird",
            "Spider-Man: Into the Spider-Verse",
            "Pretty in Pink",
            "Deadpool",
            "Let's Be Cops",
            "Booksmart",
            "Mulan",
            "Harry Potter: Order of the Phoenix"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anna);

        movieList = (ListView)findViewById(R.id.annamovie);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, movArray);
        movieList.setAdapter(arrayAdapter);
    }
}
