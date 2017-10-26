package com.outerspace.daggerbiscuit;

import android.app.Application;

import com.outerspace.daggerbiscuit.component.BiscuitBaseComponent;
import com.outerspace.daggerbiscuit.component.DaggerBiscuitBaseComponent;
import com.outerspace.daggerbiscuit.module.BiscuitBaseModule;

public class BiscuitApp extends Application {

    BiscuitBaseComponent biscuitBaseComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        biscuitBaseComponent = DaggerBiscuitBaseComponent
                .builder()
                .biscuitBaseModule(new BiscuitBaseModule(this))
                .build();
    }

    public BiscuitBaseComponent getBiscuitBaseComponent() {
        return biscuitBaseComponent;
    }
}
