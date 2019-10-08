package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SchwiethaleActivity extends AppCompatActivity {

    ListView myList;


    String[] myArray = {

            "ice cream",
            "steak",
            "pizza",
            "cheese burger",
            "bacon",
            "green beans"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schwiethale);


        myList = findViewById(R.id.my_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, myArray);
        myList.setAdapter(arrayAdapter);

    }
}
