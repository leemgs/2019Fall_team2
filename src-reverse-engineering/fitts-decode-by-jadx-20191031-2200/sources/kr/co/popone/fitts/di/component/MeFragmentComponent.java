package kr.co.popone.fitts.di.component;

import dagger.android.AndroidInjector;
import kr.co.popone.fitts.feature.me.MeFragment;

public interface MeFragmentComponent extends AndroidInjector<MeFragment> {

    public static abstract class Builder extends dagger.android.AndroidInjector.Builder<MeFragment> {
    }
}
