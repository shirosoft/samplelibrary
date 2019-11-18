package com.shirosoft.samplelibrary;

import android.app.Application;
import android.util.Log;

import com.shirosoft.samplelibrary.sampleconstant.sampleconstant;

import zcncore.Zcncore;


public class MyApplication extends Application implements sampleconstant {


    static {

            System.loadLibrary("c++_shared");
            System.loadLibrary("libbls384_256");

    }

    @Override
    public void onCreate() {
        super.onCreate();
        try {
            //zcncore init
            Zcncore.init(chainConfig);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
