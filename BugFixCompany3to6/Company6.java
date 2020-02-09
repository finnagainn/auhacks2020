package com.kdiproductions.explicitintents;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Company6 extends AppCompatActivity {

    Button btnAbout, btnWebsite, btnJobListings, btnminimize;
    TextView tvListing1, tvListing2, tvListing3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company6);

        btnAbout = findViewById(R.id.btnAbout);
        btnWebsite = findViewById(R.id.btnWebsite);
        btnJobListings = findViewById(R.id.btnJobListings);
        btnminimize = findViewById(R.id.btnMinimize);

        tvListing1 = findViewById(R.id.tvListing1);
        tvListing2 = findViewById(R.id.tvListing2);
        tvListing3 = findViewById(R.id.tvListing3);


        tvListing1.setVisibility(TextView.GONE);

        btnminimize.setVisibility(View.GONE);

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String listing1 =
                        "J.B. Hunt Transport Services, Inc. is a transportation and logistics" + "\n"
                                + " company company based in Lowell, Arkansas.";

                tvListing1.setText(listing1);
                tvListing1.setMovementMethod(new ScrollingMovementMethod());
                btnminimize.setVisibility(View.VISIBLE);
                tvListing1.setVisibility(View.VISIBLE);

            }
        });

        btnWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String listing2 = "https://www.jbhunt.com/";


                tvListing2.setText(listing2);
                tvListing2.setMovementMethod(new ScrollingMovementMethod());
                btnminimize.setVisibility(View.VISIBLE);
                tvListing2.setVisibility(View.VISIBLE);


            }
        });

        btnJobListings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String listing3 = "Internship - Operations\n\n"
                        + "Interns will train within our Dedicated Contract Services division at " + "\n"
                        + "one of our customer sites, where we provide transportation/logistics" + "\n"
                        + " services. They will work directly with Operations employees who are " + "\n"
                        + "utilized in management roles."
                        + "\n\n\n\n" +
                        "Internship - Transportation/Logistics\n\n" +
                        "Interns will train within our Dedicated Contract Services division at one of" + "\n"
                        + " our customer sites, where we provide transportation/logistics services." + "\n"
                        + " They will work directly with Operations employees who are utilized in" + "\n"
                        + " management roles. "
                        + "\n\n\n\n" +
                        "Internship - Application Development\n\n"
                        + "At J.B. Hunt, our IT Internship Program is designed to give students" + "\n"
                        + " the opportunity to extend their classroom learning and get real world" + "\n"
                        + " industry experience, while still completing their degree." + "\n"
                        + "The IT Internship at J.B. Hunt is different than most internships, in" + "\n"
                        + " that it is a “year-round” internship. Our IT interns work 20 hours a week" + "\n"
                        + " during the semester and up to 35 hours a week when classes are not in session." + "\n"
                        + " This allows the student to maximize the opportunity of gaining practical" + "\n"
                        + " work experience. Our interns have the opportunity to rotate between the " + "\n"
                        + "departments, as open positions become available.";



                tvListing3.setText(listing3);
                tvListing3.setMovementMethod(new ScrollingMovementMethod());
                btnminimize.setVisibility(View.VISIBLE);
                tvListing3.setVisibility(View.VISIBLE);

            }
        });

        btnminimize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvListing1.setVisibility(View.GONE);
                tvListing2.setVisibility(View.GONE);
                tvListing3.setVisibility(View.GONE);
                btnminimize.setVisibility(View.GONE);
            }
        });
    }
}



