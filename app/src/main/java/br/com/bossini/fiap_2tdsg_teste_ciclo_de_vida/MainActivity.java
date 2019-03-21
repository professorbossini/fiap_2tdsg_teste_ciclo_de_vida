package br.com.bossini.fiap_2tdsg_teste_ciclo_de_vida;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "fiap_2tdsg_log";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this, SegundaActivity.class);
                startActivity(intent);
            }
        });
        Log.i (TAG, "MainActivity.onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "MainActivity.onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "MainActivity.onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "MainActivity.onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i (TAG, "MainActivity.onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "MainActivity.onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "MainActivity.onRestart");
    }
}
