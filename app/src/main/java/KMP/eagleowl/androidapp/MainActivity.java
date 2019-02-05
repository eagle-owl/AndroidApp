package KMP.eagleowl.androidapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.crashlytics.android.Crashlytics;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

import io.fabric.sdk.android.Fabric;




public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);

        AppCenter.start(getApplication(), "47184f3d-64f0-40dd-aca4-f287bc6614eb",
                Analytics.class, Crashes.class);


        TextView link = (TextView) findViewById(R.id.textView2);
        if (link != null) {
            link.setMovementMethod(LinkMovementMethod.getInstance());
        }

    }


}
