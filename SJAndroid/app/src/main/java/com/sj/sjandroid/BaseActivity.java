package com.sj.sjandroid;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by SJ on 2019/8/8.
 */
public class BaseActivity extends AppCompatActivity {

    public void SJToast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
