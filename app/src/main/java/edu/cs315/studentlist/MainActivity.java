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

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView simpleList;

    // here is some comments

    // Array of strings...
    String peopleList[] = {
            "Zach Albrecht",
            "Paula Berggren",
            "JC Campbell",
            "Yodeli Castillo",
            "Brady Cox",
            "Kelvin Crawford",
            "Adam Garcia",
            "Will Gibbs",
            "Jerry Guo",
            "Sarah Kathryn Hall",
            "Josh Kersker",
            "Ben Lamont",
            "Kyle Lemons",
            "Wade Linder",
            "John Marsden",
            "Felix Mbikogbia",
            "Mitchell Melrose",
            //Jade is 17th on this list
            "Jade Rupley",
            "JD Schwiethale",
            "Anand Shah",
            "Rich Tanner",
            "Anna Ter Kuile",
            "Travis Towell",
            "Sam Webb",
            "Ruben Yanez"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleList = (ListView)findViewById(R.id.simpleListView);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, peopleList);
        simpleList.setAdapter(arrayAdapter);
        simpleList.setOnItemClickListener(this);  // set THIS class as the listener
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        // we got notified that something was selected!  AND we know WHICH ITEM was selected!

        // get the value of the string in the specific position of the array that was selected (tapped on)
        String personSelected = (String) simpleList.getAdapter().getItem(position);

        /**
         * There are TWO DIFFERENT EXAMPLES of how one might figure out which 'thing' was tapped below
         * BOTH work.
         * You don't NEED both, they are just both here to show that you could do it different ways
         */

        /** do something cool based on the INDEX (int) of the selected item **/
        switch (position) {

            case 7:
                Toast.makeText(this, personSelected + " did nothing wrong.", Toast.LENGTH_LONG).show();

            case 10:
                Toast.makeText(this,personSelected + " A.K.A. JFK", Toast.LENGTH_LONG).show();
                break;
            case 17:
                // by specific index
                Toast.makeText(this, personSelected + "'s Status: Camping", Toast.LENGTH_LONG).show();

                break;
            case 20:
                // by specific index
                Toast.makeText(this, personSelected + " wrote some jank code!!", Toast.LENGTH_LONG).show();
                break;

            case 8:
                // by specific index
                Toast.makeText(this, personSelected + " Falling Asleep!!!!", Toast.LENGTH_LONG).show();

            case 0:
                // by specific index
                Toast.makeText(this, personSelected + " wrote some mediocre code!!", Toast.LENGTH_LONG).show();

                break;
            default:
                // every case that wasn't specifically called out
                Toast.makeText(this, personSelected + " selected", Toast.LENGTH_LONG).show();
                break;
        }

        /** do something cool based on the VALUE (string) of the selected item **/
        if (personSelected == "Jade Rupley") {
            // go to a new activity
            Context context = simpleList.getContext();
            Intent jadeintent = new Intent(context, JadesActivity.class);
            context.startActivity(jadeintent);
        }
        else if (personSelected == "Rich Tanner") {
            // go to a new activity
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, TannerActivity.class);
            context.startActivity(intent);
        } else if (personSelected == "Will Gibbs") {
            // go to a new activity
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, GibbsActivity.class);
            context.startActivity(intent);
        }

       
        else if (personSelected == "Kelvin Crawford") {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, CrawfordActivity.class);
        }
        else if (personSelected == "Felix Mbikogbia") {
            // go to a new activity
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, FelixActivity.class);
            context.startActivity(intent);
        }

        else if (personSelected == "Josh Kersker") {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, KerskerActivity.class);
            context.startActivity(intent);
        }
        else if (personSelected == "Kyle Lemons") {
            // go to a new activity
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, KyleActivity.class);
            context.startActivity(intent);
        }
        else if (personSelected == "Zach Albrecht") {
            // go to a new activity
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, AlbrechtActivity.class);
            context.startActivity(intent);
        } 
        else if (personSelected == "Paula Berggren") {
            // go to a new activity
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, BerggrenActivity.class);
            context.startActivity(intent);
        }

        if (personSelected == "Brady Cox") {
            // go to a new activity
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, BradyActivity.class);
            context.startActivity(intent);
        }


        if (personSelected == "Jerry Guo") {
            // go to a new activity
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, JerryActivity.class);
            context.startActivity(intent);
        }

    }
}
