package kr.co.popone.fitts.di.component;

import dagger.android.AndroidInjector;
import kr.co.popone.fitts.feature.main.MainActivity;

public interface MainActivityComponent extends AndroidInjector<MainActivity> {

    public static abstract class Builder extends dagger.android.AndroidInjector.Builder<MainActivity> {
    }
}