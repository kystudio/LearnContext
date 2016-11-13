package com.kystudio.learncontext;

import android.app.Application;
import android.content.res.Configuration;

/**
 * Created by 20236320 on 2016/11/13.
 */

public class App extends Application {
    private String textData = "default";

    public String getTextData() {
        return textData;
    }

    public void setTextData(String textData) {
        this.textData = textData;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        System.out.println("App onCreate");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();

        System.out.println("App onTerminate");
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();

        System.out.println("App onLowMemory");
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);

        System.out.println("App onTrimMemory");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        System.out.println("App onConfigurationChanged");
    }
}
