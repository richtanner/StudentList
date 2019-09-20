package edu.cs315.studentlist;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;



public class TowellActivity extends AppCompatActivity {

    ListView CountryListView;

    String countryArray[] = {
            "Mexico",
            "Canada",
            "Honduras",
            "England",
            "Wales",
            "Czech Republic",
            "Austria",
            "Switzerland",
            "Spain",
            "Italy",
            "Greece",
            "Turkey",
            "France",
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_towell);

        CountryListView = (ListView) findViewById(R.id.country_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.activity_listview, R.id.textView, countryArray);
        CountryListView.setAdapter(arrayAdapter);

    }
}
