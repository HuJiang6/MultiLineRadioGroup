package com.lhj.multilineradiogroup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickSingleChoose(View view) {
        startActivity(new Intent(MainActivity.this, SingleChooseActivity.class));
    }

    public void clickMultiChoose(View view) {
        startActivity(new Intent(MainActivity.this, MultiChooseActivity.class));
    }
}
