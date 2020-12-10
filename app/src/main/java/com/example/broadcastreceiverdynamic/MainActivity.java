package com.example.broadcastreceiverdynamic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    BroadcastReceiverDynamic broadcastReceiverDynamic= new BroadcastReceiverDynamic();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        protected void onStart() {
            super.onStart();
            IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
            registerReceiver(broadcastReceiverDynamic, filter);
        }

    @Override
        protected void onStop() {
            super.onStop();
            unregisterReceiver(broadcastReceiverDynamic);
        }
    }


