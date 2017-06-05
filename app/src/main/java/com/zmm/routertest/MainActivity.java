package com.zmm.routertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.github.mzule.activityrouter.annotation.Router;

@Router("main/:value")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG","MainActivity");
        String value = getIntent().getStringExtra("value");
        Log.d("TAG","value = "+value);
    }
}
