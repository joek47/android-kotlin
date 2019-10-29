package com.example.readfiles1;

import androidx.appcompat.app.AppCompatActivity;

import android.support.design.widget.Snackbar;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   protected void onCreate(Bundle savedInstanceState) {

//        Context context = getApplicationContext();
//        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "toast text";
//        Toast toast = Toast.makeText(context, text, duration);
//        toast.show();

//        LayoutInflater inflater = getLayoutInflater();
//        View layout = inflater.inflate(R.layout.custom_toast,
//                (ViewGroup) findViewById(R.id.custom_toast_container));
//
//        TextView text = (TextView) layout.findViewById(R.id.text);
//        text.setText("This is a custom toast");

//        Toast toast = new Toast(getApplicationContext());
//        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
//        toast.setDuration(Toast.LENGTH_LONG);
//        toast.setView(layout);
//        toast.show();

        Snackbar.make(findViewById(R.id.myCoordinatorLayout), text, Snackbar.LENGTH_SHORT).show();
    }
}
