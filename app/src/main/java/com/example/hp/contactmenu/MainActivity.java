package com.example.hp.contactmenu;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button; // Creating Button Object
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button); //It takes button id from the activity_main.xml
        button.setOnClickListener(new View.OnClickListener() { // Implement the OnClickListener callback
            @Override
            public void onClick(View v) { //Perform  click function when the button is clicked
                /**
                 * Creating Intent object .
                 * Intent is use to pass message .
                 * ACTION_PICK is used to pick contacts from the phone.
                 * Content_URI is use to retrieve a contact by ID and return the user profile's contacts .
                 */
                Intent intent= new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
                startActivity(intent); //Starts the activity
            }
        });
    }
}
