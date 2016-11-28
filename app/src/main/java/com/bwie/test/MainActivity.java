package com.bwie.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
/**
 * autour: 梁萌萌
 * date: 2016/11/28 20:52
 * update: 2016/11/28
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("MainActivity", "---AAAAAA------onCreate-------");

    }
    public void bt1(View v){
        startActivity(new Intent(MainActivity.this,SingleTopActivity.class));

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("MainActivity", "---AAAAAA------onStart-------");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("MainActivity", "---AAAAAA------onRestart-------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("MainActivity", "---AAAAAA------onResume-------");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("MainActivity", "----AAAAAA-----onPause-------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("MainActivity", "----AAAAAA-----onStop-------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("MainActivity", "----AAAAAA-----onDestroy-------");
    }
}
