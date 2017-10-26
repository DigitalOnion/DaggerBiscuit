package com.outerspace.daggerbiscuit.component;

import com.outerspace.daggerbiscuit.MainActivity;
import com.outerspace.daggerbiscuit.model.BaseInformation;
import com.outerspace.daggerbiscuit.module.BiscuitBaseModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {BiscuitBaseModule.class})
public interface BiscuitBaseComponent {

    public BaseInformation provideBaseInformation();

    public void inject(MainActivity mainActivity);
}
