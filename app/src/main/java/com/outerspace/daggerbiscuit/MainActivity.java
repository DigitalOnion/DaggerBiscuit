package com.outerspace.daggerbiscuit;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.outerspace.daggerbiscuit.component.BiscuitBaseComponent;
import com.outerspace.daggerbiscuit.component.DaggerBiscuitBaseComponent;
import com.outerspace.daggerbiscuit.model.BaseInformation;
import com.outerspace.daggerbiscuit.module.BiscuitBaseModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private BiscuitBaseComponent baseComponent;

    @Inject
    public BaseInformation baseInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BiscuitApp biscuitApp = (BiscuitApp) getApplication();
        baseComponent = biscuitApp.getBiscuitBaseComponent();
        baseComponent.inject(this);

        baseInformation.info = biscuitApp.getResources().getString(R.string.base_info_after_injection);
        baseInformation.numeric = biscuitApp.getResources().getInteger(R.integer.base_numeric_after_injection);
    }

    @Override
    protected void onStart() {
        super.onStart();

        TextView text;
        String s = String.format(baseInformation.info, baseInformation.numeric);
        text = (TextView) findViewById(R.id.txt_base_info);
        text.setText(s);
    }
}
