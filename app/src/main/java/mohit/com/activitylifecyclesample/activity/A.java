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

public class A extends AppCompatActivity {
    @BindView(R.id.txtActionReport)
    TextView txtActionReport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        ButterKnife.bind(this);
        MyApplication.getList().add("A--------------onCreate");
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
        MyApplication.getList().add("A--------------onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        MyApplication.getList().add("A--------------onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        MyApplication.getList().add("A--------------onResume");
        printData(true);
    }

    @Override
    protected void onPause() {
        super.onPause();
        MyApplication.getList().add("A--------------onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        MyApplication.getList().add("A--------------onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MyApplication.getList().add("A--------------onDestroy");
    }


    private void printData(boolean isCleanAll) {
        if (isCleanAll) {
            txtActionReport.append("----------------------------------------");
            txtActionReport.append("\n");
            for (int i = 0; i < MyApplication.getList().size(); i++) {
                txtActionReport.append(MyApplication.getList().get(i));
                txtActionReport.append("\n");
            }
        } else {
            txtActionReport.append(MyApplication.getList().get(MyApplication.getList().size() - 1));
            txtActionReport.append("\n");
        }


    }
}
