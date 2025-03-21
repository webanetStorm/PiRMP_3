package com.example.pirmp_3;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity
{

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_second );

        TextView textViewInfo = findViewById( R.id.textViewData );
        Button buttonBack = findViewById( R.id.buttonBack );

        Form form = (Form) getIntent().getSerializableExtra( "form" );
        if ( form != null )
        {
            textViewInfo.setText( "Имя: " + form.getFirstName() + "\nФамилия: " + form.getLastName() );
        }

        buttonBack.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                startActivity( new Intent( v.getContext(), MainActivity.class ) );
            }
        } );
    }

}
