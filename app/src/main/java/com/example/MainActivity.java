package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;

import com.example.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    Myviewmodel myviewmodel;
    ActivityMainBinding bing;
    public final static String SD_GT="sff";
    String TAG="mytag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        Button button1=findViewById(R.id.button3);
        bing= DataBindingUtil.setContentView(this,R.layout.activity_main);
        myviewmodel= new ViewModelProvider(this).get(Myviewmodel.class);
        bing.setData(myviewmodel);
        bing.setLifecycleOwner(this);
//        SharedPreferences sharedPreferences=getSharedPreferences("my_data",Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor=sharedPreferences.edit();
//        editor.putInt("NUMBER",10);
//        editor.apply();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
