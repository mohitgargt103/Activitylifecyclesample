package mohit.com.activitylifecyclesample.app;

import android.app.Application;

import java.util.ArrayList;

/**
 * Created by mohit on 14-Apr-18.
 */

public class MyApplication extends Application {
    MyApplication myApplication;
    static ArrayList<String> functionList;

    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;
        functionList = new ArrayList<>();
    }

    public static ArrayList<String> getList() {
        return functionList;
    }
}
