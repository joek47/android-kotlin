package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

// The main activity code is a Java file MainActivity.java. This is the
// actual application file which ultimately gets converted to a Dalvik executable
// and runs your application

// When your Android application is compiled, a R class gets generated, which contains
// resource IDs for all the resources available in your res/ directory. You can
// use R class to access that resource using sub-directory and resource name or
// directly resource ID.
public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount !=null)
            mShowCount.setText(Integer.toString(mCount));
    }
}
