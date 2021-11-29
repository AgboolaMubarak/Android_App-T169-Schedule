package com.example.traint169;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Toast;


public class BookingActivity extends AppCompatActivity {
    EditText nm, from, destination ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_a_seat_view);

        nm = findViewById(R.id.Name);
        from = findViewById(R.id.editTextTextPersonName);
        destination = findViewById(R.id.editTextTextPersonName2);

        Button reset = (Button) findViewById(R.id.button4);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText mytxt3 = (EditText) findViewById(R.id.Name);
                mytxt3.setText("");
                EditText mytxt = (EditText) findViewById(R.id.editTextTextPersonName2);
                mytxt.setText("");
                EditText mytxt2 = (EditText) findViewById(R.id.editTextTextPersonName);
                mytxt2.setText("");
            }


        });

    }
    public void toastMsg(String msg) {
        Toast toast = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG);
        toast.show();
    }
    public void displayToastMsg(View v) {
        if(nm.getText().toString() .equals("") || from.getText().toString() .equals("") || destination.getText().toString() .equals("")){
            toastMsg("Fields can't be empty");
        }
        else {


            toastMsg(nm.getText().toString() + ", your Seat has been booked successfully!");
            EditText mytxt3 = (EditText) findViewById(R.id.Name);
            mytxt3.setText("");
            EditText mytxt = (EditText) findViewById(R.id.editTextTextPersonName2);
            mytxt.setText("");
            EditText mytxt2 = (EditText) findViewById(R.id.editTextTextPersonName);
            mytxt2.setText("");
        }

    }

}
