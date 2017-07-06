package com.home.flopic.skeleton.app.builder;

import com.home.flopic.skeleton.ui.activity.BaseActivity;
import com.home.flopic.skeleton.util.builder.UtilsModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Author dzianis_padalitski on 7/5/17.
 */
@Component(modules = {AppModule.class, UtilsModule.class})
@Singleton
public interface AppComponent {

    void inject(BaseActivity baseActivity);

}
