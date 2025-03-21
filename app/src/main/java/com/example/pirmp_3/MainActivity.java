package com.example.pirmp_3;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        EditText editTextFirstName = findViewById( R.id.editTextFirstName );
        EditText editTextLastName = findViewById( R.id.editTextLastName );
        Button buttonSend = findViewById( R.id.buttonBack );

        buttonSend.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                String firstName = editTextFirstName.getText().toString();
                String lastName = editTextLastName.getText().toString();

                Intent intent = new Intent( MainActivity.this, SecondActivity.class );
                intent.putExtra( "form", new Form( firstName, lastName ) );
                startActivity( intent );
            }
        } );
    }

}
