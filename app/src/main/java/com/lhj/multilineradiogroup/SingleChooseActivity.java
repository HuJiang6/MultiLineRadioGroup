package com.lhj.multilineradiogroup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class SingleChooseActivity extends AppCompatActivity implements MultiLineRadioGroup.OnCheckedChangedListener {

    private MultiLineRadioGroup multiLineRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_choose);
        multiLineRadioGroup = findViewById(R.id.mlrg);
        multiLineRadioGroup.setOnCheckChangedListener(this);
    }

    @Override
    public void onItemChecked(MultiLineRadioGroup group, int position, boolean checked) {
        //一个布局中有多个时先判断点击的是哪个MultiLineRadioGroup
        if (group == multiLineRadioGroup)
            Toast.makeText(SingleChooseActivity.this, "position:" + position + "/choose state:" + checked, Toast.LENGTH_SHORT).show();
    }

    public void clickAddItem(View view) {
        multiLineRadioGroup.append("新加的");
    }

    public void clickRemoveItem(View view) {
        multiLineRadioGroup.remove(0);
    }
}
