package com.home.flopic.skeleton.app.builder;

import android.content.Context;
import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Author dzianis_padalitski on 7/5/17.
 */

@Module
public class AppModule {

    private final Context appContext;

    public AppModule(@NonNull final Context appContext) {
        this.appContext = appContext;
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return appContext;
    }
}
