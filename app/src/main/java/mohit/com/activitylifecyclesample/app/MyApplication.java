package mohit.com.activitylifecyclesample.app;

import android.app.Application;
import android.content.res.Configuration;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by mohit on 14-Apr-18.
 */

public class MyApplication extends Application {
    MyApplication myApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;
    }

    public MyApplication() {
        super();
    }


    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.e("TAG", "onTerminate");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e("TAG", "onConfigurationChanged");
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        Log.e("TAG", "onLowMemory");
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Log.e("TAG", "onTrimMemory");
    }
}
