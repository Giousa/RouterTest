package com.zmm.routertest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.github.mzule.activityrouter.router.Routers;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2017/6/5
 * Time:下午5:00
 */

public class SplashActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        init();
    }

    private void init() {
        try {
            Log.d("TAG","Splash");
            Thread.sleep(2000);
            Routers.open(SplashActivity.this,"mzule://main/twsz");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
