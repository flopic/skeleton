package com.home.flopic.skeleton.log;

import android.util.Log;

import timber.log.Timber;

/**
 * Created by dzianis_padalitski on 3/13/17.
 */

public class ReleaseTree extends Timber.DebugTree {

    public ReleaseTree() {
        super();
    }

    @Override
    protected void log(int priority, String tag, String message, Throwable t) {
        if (priority >= Log.ERROR || priority == Log.INFO) {
            if (t == null) {
//                Crashlytics.log(message);
            } else {
//                Crashlytics.log(message + t);
            }
        }
    }
}
