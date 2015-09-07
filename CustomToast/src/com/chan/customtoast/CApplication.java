package com.chan.customtoast;

import android.app.Application;
import android.content.Context;

public class CApplication extends Application
{
    public static Context applicationContext;
    
    @Override
    public void onCreate() 
    {
        super.onCreate();
        applicationContext = getApplicationContext();
    };

}
