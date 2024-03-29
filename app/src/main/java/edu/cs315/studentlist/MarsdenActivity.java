package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MarsdenActivity extends AppCompatActivity {

    ListView jmmLangListView;
    // everything shown in this language array is Turing-complete
    String[] langArray = new String[]{
            "C++",
            "Java",
            "SQL",
            "C#",
            "Kotlin (Soon...)",
            "JavaScript",
            "Python",
            "PHP",
            "HTML+CSS",
            "C",
            "LaTeX",
            "Powerpoint"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marsden);

        jmmLangListView = findViewById(R.id.jmmLangList);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.activity_styleless_listviewitem, R.id.textView, langArray);
        jmmLangListView.setAdapter(arrayAdapter);
    }

    public void onEmailClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        Uri data = Uri.parse("mailto:"
                + "jmm15f@acu.edu");
        intent.setData(data);
        startActivity(intent);
    }
}
