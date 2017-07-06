package com.home.flopic.skeleton.ui.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.home.flopic.skeleton.app.App;
import com.home.flopic.skeleton.app.builder.AppComponent;
import com.home.flopic.skeleton.ui.IBaseFragmentConnector;
import com.home.flopic.skeleton.ui.activity.BaseActivity;

/**
 * Created by dzianis_padalitski on 3/13/17.
 */

public abstract class BaseFragment extends Fragment implements IBaseFragmentFunctionality {

    protected IBaseFragmentConnector baseFragmentConnector;

    @Override
    public void onAttach(final Context context) {
        super.onAttach(context);

        try {
            baseFragmentConnector = (BaseActivity) context;
        } catch (final ClassCastException e) {
            throw new ClassCastException(context.toString() + " must implement IBaseFragmentConnector");
        }
    }

    @Override
    public AppComponent appComponent() {
        return App.get(getContext()).appComponent();
    }
}
