package com.home.flopic.skeleton.app;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;

import com.home.flopic.skeleton.BuildConfig;
import com.home.flopic.skeleton.log.ReleaseTree;

import timber.log.Timber;

/**
 * Created by dzianis_padalitski on 3/13/17.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initAppCompat();
        initTimber();
    }

    /**
     * Init AppCompat for VectorDrawables
     */
    private void initAppCompat() {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    /**
     * Plant proper Timber for Logging for Debug
     * or Sending Errors as Crashes for Release
     * Pretends as Fail!
     */
    private void initTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        } else {
            Timber.plant(new ReleaseTree());
        }
    }
}
