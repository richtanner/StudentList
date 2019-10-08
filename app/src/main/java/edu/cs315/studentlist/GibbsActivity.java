package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GibbsActivity extends AppCompatActivity {

    ListView gameList;

    // Array of strings...
    String[] gameArray = {
            "Fallout: New Vegas",
            "Demon\'s Souls",
            "Terraria",
            "The End is Nigh",
            "Divinity: Original Sin 2"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gibbs);

        gameList = findViewById(R.id.game_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, gameArray);
        gameList.setAdapter(arrayAdapter);
    }
}
