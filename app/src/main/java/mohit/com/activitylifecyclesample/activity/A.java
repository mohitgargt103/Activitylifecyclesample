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

public class A extends AppCompatActivity {
    @BindView(R.id.txtActionReport)
    TextView txtActionReport;
    Utility get;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        ButterKnife.bind(this);
        Utility.print("\"A--------------onCreate\"");
    }

    @OnClick({R.id.btnNext})
    public void OnClick(View v) {
        switch (v.getId()) {
            case R.id.btnNext:
                startActivity(new Intent(this, B.class));
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Utility.print("\"A--------------onStart\"");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Utility.print("\"A--------------onRestart\"");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Utility.print("\"A--------------onResume\"");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Utility.print("\"A--------------onPause\"");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Utility.print("\"A--------------onStop\"");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Utility.print("\"A--------------onDestroy\"");
    }

}
