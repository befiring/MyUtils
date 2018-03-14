package com.befiring.myutils;

import android.app.Application;

import com.befiring.library.MyUtils;
import com.befiring.library.MyUtilsConfiguration;

/**
 * Created by WangMeng on 2018/3/14.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MyUtilsConfiguration configuration=new MyUtilsConfiguration.Builder(this)
                .crashLogPath("")
                .ideLogEnabled(BuildConfig.DEBUG)
                .fileLogEnabled(true)
                .build();
        MyUtils.init(configuration);
    }
}
