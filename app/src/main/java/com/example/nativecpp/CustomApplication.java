package com.example.nativecpp;

import android.app.Application;
import android.util.Log;


import com.example.lib_sillyboy.DynamicSo;

import java.io.File;

public class CustomApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //String absolutePath = getFilesDir().getAbsolutePath();

        String tmpDir ="/data/data/com.example.nativecpp/";
        Log.e("darren:", "file===:"+ tmpDir);
        // 在合适的时候将自定义路径插入so检索路径
        DynamicSo.insertPathToNativeSystem(this,new File(tmpDir));
        
    }


}
