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
public class SingleTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task);
        Log.e("SingleTaskActivity", "--BBBBBB-------onCreate-------");
    }
    public void bt3(View v){
        startActivity(new Intent(SingleTaskActivity.this,MainActivity.class));
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("SingleTaskActivity", "--BBBBBB-------onStart-------");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("SingleTaskActivity", "--BBBBBB-------onRestart-------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("SingleTaskActivity", "--BBBBBB-------onResume-------");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("SingleTaskActivity", "---BBBBBB------onPause-------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("SingleTaskActivity", "--CCCCCC-------onStop-------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("SingleTaskActivity", "--CCCCCC-------onDestroy-------");
    }
}
