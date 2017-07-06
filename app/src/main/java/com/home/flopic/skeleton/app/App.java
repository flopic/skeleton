package com.home.flopic.skeleton.app;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatDelegate;

import com.home.flopic.skeleton.BuildConfig;
import com.home.flopic.skeleton.app.builder.AppComponent;
import com.home.flopic.skeleton.app.builder.AppModule;
import com.home.flopic.skeleton.app.builder.DaggerAppComponent;
import com.home.flopic.skeleton.log.ReleaseTree;
import com.home.flopic.skeleton.util.builder.UtilsModule;

import timber.log.Timber;

/**
 * Created by dzianis_padalitski on 3/13/17.
 */

public class App extends Application {

    private AppComponent appComponent;

    @NonNull
    public static App get(@NonNull final Context context) {
        return (App) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initAppCompat();
        initTimber();
        
        appComponent = buildAppComponent();
    }

    @NonNull
    public AppComponent appComponent() {
        return appComponent;
    }

    private AppComponent buildAppComponent() {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
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
