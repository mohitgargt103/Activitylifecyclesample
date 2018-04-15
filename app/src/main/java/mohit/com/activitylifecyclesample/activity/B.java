package mohit.com.activitylifecyclesample.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import mohit.com.activitylifecyclesample.R;
import mohit.com.activitylifecyclesample.app.MyApplication;

public class B extends AppCompatActivity {
    @BindView(R.id.txtActionReport)
    TextView txtActionReport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        ButterKnife.bind(this);
        MyApplication.getList().add("B--------------onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        MyApplication.getList().add("B--------------onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        MyApplication.getList().add("B--------------onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        MyApplication.getList().add("B--------------onResume");
        printData(true);
    }

    @Override
    protected void onPause() {
        super.onPause();
        MyApplication.getList().add("B--------------onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        MyApplication.getList().add("B--------------onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MyApplication.getList().add("B--------------onDestroy");
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
