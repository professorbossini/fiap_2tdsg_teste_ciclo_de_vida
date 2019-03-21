package br.com.bossini.fiap_2tdsg_teste_ciclo_de_vida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SegundaActivity extends AppCompatActivity {
    private static final String TAG = "fiap_2tdsg_log";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Log.i(TAG, "SegundaActivity.onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "SegundaActivity.onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "SegundaActivity.onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "SegundaActivity.onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "SegundaActivity.onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "SegundaActivity.onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "SegundaActivity.onRestart");
    }
}
