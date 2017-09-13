package fr.wcs.blablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SearchItineraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_itinerary);

        final TextView editDeparture = (TextView) findViewById(R.id.edit_departure);
        final TextView editDestination = (TextView) findViewById(R.id.edit_destination);
        final TextView editDate = (TextView) findViewById(R.id.edit_date);
        Button buttonSearch = (Button) findViewById(R.id.form_search);

        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String departure = editDeparture.getText().toString();
                String destination = editDestination.getText().toString();
                String date = editDate.getText().toString();

                if (departure.isEmpty() || destination.isEmpty()) {
                    Toast formIsEmpty = Toast.makeText(getApplicationContext(), getResources().getString(R.string.form_error), Toast.LENGTH_SHORT);
                    formIsEmpty.show();
                } else {
                    // Aller sur la page des résultats
                    Intent intent = new Intent(SearchItineraryActivity.this,
                            ViewSearchItineraryResultsListActivity.class);
                    intent.putExtra("departure", departure);
                    intent.putExtra("destination", destination);
                    intent.putExtra("date", date);

                    SearchItineraryActivity.this.startActivity(intent);
                }
            }
        });
    }
}
