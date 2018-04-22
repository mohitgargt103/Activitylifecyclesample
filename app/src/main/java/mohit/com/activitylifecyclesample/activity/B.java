package mohit.com.activitylifecyclesample.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import mohit.com.activitylifecyclesample.R;
import mohit.com.activitylifecyclesample.app.MyApplication;
import mohit.com.activitylifecyclesample.util.Utility;

public class B extends AppCompatActivity {
    @BindView(R.id.txtActionReport)
    TextView txtActionReport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        ButterKnife.bind(this);
        Utility.print("\"B--------------onCreate\"");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Utility.print("\"B--------------onStart\"");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Utility.print("\"B--------------onRestart\"");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Utility.print("\"B--------------onResume\"");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Utility.print("\"B--------------onPause\"");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Utility.print("\"B--------------onStop\"");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Utility.print("\"B--------------onDestroy\"");
    }
}
