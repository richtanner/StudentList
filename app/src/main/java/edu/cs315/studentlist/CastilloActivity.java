package edu.cs315.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CastilloActivity extends AppCompatActivity {

    ListView quoteList;

    String[] msArray = {
            "No, I'm not going to tell them about the downsizing. " +
                    "If a patient has cancer, you don't tell them. - Season 1: Pilot",
            "It's simply beyond words. It's incalculable. - Season 1: Pilot",
            "Would I rather be feared or loved? Easy. Both. " +
                    "I want people to be afraid of how much they love me. - Season 2: The Fight",
            "I'm an early bird and I'm a night owl. So I'm wise and I have worms. - Season 2: Office Olympics",
            "Fool me once, strike one. Fool me twice, strike three. - Season 3: Traveling Salesmen",
            "Wikipedia is the best thing ever. Anyone in the world can write anything they want about " +
                    "any subject. So you know you are getting the best possible information. - Season 3: The Negotiation",
            "The worst thing about prison was the dementors. - Season 3: The Convict",
            "I am running away from my responsibilities. And it feels good. - Season 4: Money(1)",
            "Well, it's love at first sight. Actually, it was ... No, it was when I heard her voice. " +
                    "It was love at first see with my ears. - Season 4: Goodbye, Toby(1)",
            "Sometimes I'll start a sentence and I don't even know where it's going. " +
                    "I just hope i find it along the way. - Season 5: The Duel"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_castillo);

        quoteList = findViewById(R.id.quote_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_castilloview, R.id.textView, msArray);
        quoteList.setAdapter(arrayAdapter);
    }
}