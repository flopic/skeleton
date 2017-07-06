package com.home.flopic.skeleton.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.home.flopic.skeleton.app.App;
import com.home.flopic.skeleton.app.builder.AppComponent;
import com.home.flopic.skeleton.ui.IBaseFragmentConnector;

import timber.log.Timber;

/**
 * Created by dzianis_padalitski on 3/13/17.
 */

public abstract class BaseActivity extends AppCompatActivity implements IBaseActivityFunctionality, IBaseFragmentConnector {

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Timber.v("onCreate(%s)", savedInstanceState);

        appComponent().inject(this);

        setContentView(getLayoutResID());
    }

    @Override
    public AppComponent appComponent() {
        return App.get(this).appComponent();
    }
}
