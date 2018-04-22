package mohit.com.activitylifecyclesample.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mohit.com.activitylifecyclesample.R;
import mohit.com.activitylifecyclesample.app.MyApplication;
import mohit.com.activitylifecyclesample.util.Utility;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txtActionReport)
    TextView txtActionReport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Utility.print("\"MainActivity--------------onCreate\"");
        new MyApplication().onCreate();
    }


    @OnClick({R.id.btnNext})
    public void OnClick(View v) {
        switch (v.getId()) {
            case R.id.btnNext:
                startActivity(new Intent(this, A.class));
                break;
        }
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Utility.print("\"MainActivity--------------onStart\"");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Utility.print("\"MainActivity--------------onRestart\"");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Utility.print("\"MainActivity--------------onResume\"");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Utility.print("\"MainActivity--------------onPause\"");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Utility.print("\"MainActivity--------------onStop\"");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Utility.print("\"MainActivity--------------onDestroy\"");
    }


}
