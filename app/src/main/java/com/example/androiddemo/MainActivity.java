package com.example.androiddemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "YXCMainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        infiniteParameterMethod("测试1", "1", "2", "3", "4");

        infiniteParameterMethod("测试 2", "1");
    }

    private void infiniteParameterMethod(@NonNull String name, @NonNull Object... values) {

        Log.d(TAG, name);
        for (Object value : values) {
            Log.d(TAG, value.toString());
        }
    }
}