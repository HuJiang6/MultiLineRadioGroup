package com.lhj.multilineradiogroup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MultiChooseActivity extends AppCompatActivity implements MultiLineRadioGroup.OnCheckedChangedListener {
    private MultiLineRadioGroup multiLineRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_choose);
        multiLineRadioGroup = findViewById(R.id.mlrg);
        multiLineRadioGroup.setOnCheckChangedListener(this);
    }

    @Override
    public void onItemChecked(MultiLineRadioGroup group, int position, boolean checked) {
        //一个布局中有多个时先判断点击的是哪个MultiLineRadioGroup
        if (group == multiLineRadioGroup)
            Toast.makeText(MultiChooseActivity.this, "position:" + position + "/choose state:" + checked, Toast.LENGTH_SHORT).show();
    }
}
