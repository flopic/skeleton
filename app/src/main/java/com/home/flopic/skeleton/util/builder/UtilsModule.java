package com.home.flopic.skeleton.util.builder;

import android.support.annotation.NonNull;

import com.home.flopic.skeleton.util.NetworkUtils;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Author dzianis_padalitski on 7/5/17.
 */

@Module
public class UtilsModule {

    @Provides
    @Singleton
    @NonNull
    public NetworkUtils provideNetworkUtils() {
        return new NetworkUtils();
    }

}
