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


    // Array of strings...
    String[] peopleList = {
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

        simpleList = findViewById(R.id.simpleListView);

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
            case 0:
                Toast.makeText(this, personSelected + " wrote some mediocre code!!", Toast.LENGTH_LONG).show();
                break;

            case 6:
                // by specific index
                Toast.makeText(this, personSelected + " is cool", Toast.LENGTH_LONG).show();
                break;

            case 7:
                Toast.makeText(this, personSelected + " did nothing wrong.", Toast.LENGTH_LONG).show();
                break;

            case 8:
                Toast.makeText(this, personSelected + " Falling Asleep!!!!", Toast.LENGTH_LONG).show();
                break;
            
            case 10:
                Toast.makeText(this,personSelected + " A.K.A. JFK", Toast.LENGTH_LONG).show();
                break;
            case 14:
                Toast.makeText(this, personSelected + " is super random.", Toast.LENGTH_LONG).show();
                break;
            case 17:
                Toast.makeText(this, personSelected + "'s Status: Camping", Toast.LENGTH_LONG).show();
                break;

            case 18:
                Toast.makeText(this, personSelected + " made a list of food.", Toast.LENGTH_LONG) .show();
                break;

            case 20:
                Toast.makeText(this, personSelected + " wrote some jank code!!", Toast.LENGTH_LONG).show();
                break;

            case 23:
                // by specific index
                Toast.makeText(this, personSelected + " wrote some steller code!!", Toast.LENGTH_LONG).show();
                break;
            
            default:
                // every case that wasn't specifically called out
                Toast.makeText(this, personSelected + " selected", Toast.LENGTH_LONG).show();
                break;
        }

        /** do something cool based on the VALUE (string) of the selected item **/
        if (personSelected == "Zach Albrecht") {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, AlbrechtActivity.class);
            context.startActivity(intent);
        }
        else if (personSelected == "Paula Berggren") {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, BerggrenActivity.class);
            context.startActivity(intent);
        }
        else if (personSelected == "JC Campbell") {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, JRC_Activity.class);
            context.startActivity(intent);
        }
        else if (personSelected == "Yodeli Castillo") {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, CastilloActivity.class);
            context.startActivity(intent);
        }
        else if (personSelected == "Brady Cox") {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, BradyActivity.class);
            context.startActivity(intent);
       }
        else if (personSelected == "Kelvin Crawford") {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, CrawfordActivity.class);
            context.startActivity(intent);
        }
        else if (personSelected == "Felix Mbikogbia") {
            // go to a new activity
            Context context = simpleList.getContext();
            Intent intent = new Intent(context,FelixActivity.class);
            context.startActivity(intent);
        }
        else if (personSelected == "Adam Garcia") {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, GarciaActivity.class);
            context.startActivity(intent);
        }
        else if (personSelected == "Will Gibbs") {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, GibbsActivity.class);
            context.startActivity(intent);
        }
        else if (personSelected == "Jerry Guo") {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, JerryActivity.class);
            context.startActivity(intent);
        }
        else if (personSelected == "Josh Kersker") {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, KerskerActivity.class);
            context.startActivity(intent);
        }
        else if (personSelected == "Ben Lamont") {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, LamontActivity.class);
            context.startActivity(intent);
        }
        else if (personSelected == "Kyle Lemons") {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, KyleActivity.class);
            context.startActivity(intent);
        }
        else if (personSelected == "Wade Linder") {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, WadeActivity.class);
            context.startActivity(intent);
        }
        else if (personSelected == "John Marsden") {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, MarsdenActivity.class);
            context.startActivity(intent);
        }
        else if (personSelected == "Felix Mbikogbia") {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, FelixActivity.class);
            context.startActivity(intent);
        }
        else if (personSelected == "Mitchell Melrose") {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, MelroseActivity.class);
            context.startActivity(intent);
        }
        else if (personSelected == "Jade Rupley") {
            Context context = simpleList.getContext();
            Intent jadeintent = new Intent(context, JadesActivity.class);
            context.startActivity(jadeintent);
        }
        else if (personSelected == "JD Schwiethale") {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, SchwiethaleActivity.class);
            context.startActivity(intent);
        }
        else if (personSelected == "Rich Tanner") {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, TannerActivity.class);
            context.startActivity(intent);
        }
        else if (personSelected == "Anna Ter Kuile") {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, AnnaActivity.class);
            context.startActivity(intent);
        }
        else if(personSelected == "Travis Towell"){
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, TowellActivity.class);
            context.startActivity(intent);
        }
        else if (personSelected == "Sam Webb") {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, WebbActivity.class);
            context.startActivity(intent);
        }
        else if (personSelected == "Ruben Yanez") {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, Main2Activity.class);
            context.startActivity(intent);
        }
        else if (personSelected == "Sarah Kathryn Hall") {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, skhActivity.class);
            context.startActivity(intent);
        }
    }
}
