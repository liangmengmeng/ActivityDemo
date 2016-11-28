package com.bwie.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
/**
 * autour: 梁萌萌
 * date: 2016/11/28 20:52
 * update: 2016/11/28
 */
public class SingleTopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_top);
        Log.e("SingleTopActivity", "--BBBBBB-------onCreate-------");
    }
    public void bt2(View v){
       // SingleTop模式进行跳转
        //startActivity(new Intent(SingleTopActivity.this,MainActivity.class));
        //SingleTask模式进行跳转
        startActivity(new Intent(SingleTopActivity.this,MainActivity.class));
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("SingleTopActivity", "---BBBBB------onStart-------");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("SingleTopActivity", "---BBBBBB------onRestart-------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("SingleTopActivity", "--BBBBBB-------onResume-------");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("SingleTopActivity", "--BBBBBB-------onPause-------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("SingleTopActivity", "---BBBBBB------onStop-------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("SingleTopActivity", "--BBBBBB-------onDestroy-------");
    }
}
