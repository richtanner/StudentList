package edu.cs315.studentlist;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FelixActivity extends AppCompatActivity {

    ListView languageList;
    ActionBar actionBar;

    // Array of strings...
    String[] langArray = {
            "HTML",
            "CSS",
            "JavaScript",
            "Java (some)",
            "C++ (some)"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_felix);

        //back button here
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        languageList = findViewById(R.id.language_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, langArray);
        languageList.setAdapter(arrayAdapter);

//        actionBar = getSupportActionBar();
//        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#286e9b")));
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item){
//        int id = item.getItemId();
//
//        //his ends the FelixActivity page when the back button is clicked
//        if (id == android.R.id.home){
//            this.finish();
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}

