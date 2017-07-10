package com.bawei.liujie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * 自定义组件：购买数量，带减少增加按钮
 */
public class MainActivity extends AppCompatActivity {

    private MySelf mySelf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySelf = (MySelf) findViewById(R.id.myself);
        mySelf.setGoods_storage(50);
        mySelf.setOnAmountChangeListener(new MySelf.OnAmountChangeListener() {
            @Override
            public void onAmountChange(View view, int amount) {
                Toast.makeText(getApplicationContext(), "Amount=>  " + amount, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
