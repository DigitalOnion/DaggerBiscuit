package com.outerspace.daggerbiscuit.module;

import android.app.Application;

import com.outerspace.daggerbiscuit.R;
import com.outerspace.daggerbiscuit.model.BaseInformation;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class BiscuitBaseModule {
    Application application;

    public BiscuitBaseModule(Application application) {
        this.application = application;
    }

    @Singleton
    @Provides
    public BaseInformation provideBaseInformation() {
        BaseInformation base = new BaseInformation();
        base.info = application.getResources().getString(R.string.no_base_info);
        base.numeric = 0;
        return base;
    }
}
