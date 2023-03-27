package com.txtnet.txtnetdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //central database app to accept txtnet-related queries
        //runs as a service, separate from txtnet browser

        //example incoming text to handle from a txtnet server: register country-code 1 [recipient number] server

        //example outgoing sms to txtnet server: ping TxtNet Server vLATEST
        //example incoming response text to handle from a txtnet server: TxtNet Server v54 alive (possibly include requests per hour?)
        // run periodic ping checks. after a certain timeout, assume server is dead and remove from database.


        //example incoming text to handle from a txtnet client: list servers region 1
        /*
         //example outgoing sms to txtnet client (may be sent as a multipart message, and avoid sending code as it is implied):
         3213215555
         5820505555
         ...
         */
    }
}