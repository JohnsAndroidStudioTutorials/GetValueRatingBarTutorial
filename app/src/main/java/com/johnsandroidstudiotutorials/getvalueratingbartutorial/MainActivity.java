package com.johnsandroidstudiotutorials.getvalueratingbartutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Float ratingValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RatingBar ratingRatingBar = (RatingBar) findViewById(R.id.rating_rating_bar);
        Button submitButton = (Button) findViewById(R.id.submit_button);
        final TextView ratingDisplayTextView = (TextView) findViewById(R.id.rating_display_text_View);

        ratingRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                ratingValue = rating;
            }
        });
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ratingDisplayTextView.setText(ratingValue.toString());
            }
        });
    }
}
