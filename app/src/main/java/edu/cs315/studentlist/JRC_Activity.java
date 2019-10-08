package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class JRC_Activity extends AppCompatActivity {

    ListView simpleList;

    // Array of strings...
    String stateList[] = {
            "New Mexico",
            "Texas",
            "Arizona",
            "Nevada",
            "California",
            "Utah",
            "Oklahoma",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jrc_);

        simpleList = (ListView)findViewById(R.id.JC_List);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, stateList);
        simpleList.setAdapter(arrayAdapter);
    }

}
