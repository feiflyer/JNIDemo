package fast.flyer.com.jnidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView tv_jni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_jni = (TextView) findViewById(R.id.tv_jni);
        tv_jni.setText(JNItest.getStrFromJni());
    }

}
