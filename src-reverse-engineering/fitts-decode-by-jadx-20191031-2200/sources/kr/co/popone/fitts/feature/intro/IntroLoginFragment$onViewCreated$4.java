package kr.co.popone.fitts.feature.intro;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.core.app.ActivityOptionsCompat;
import androidx.fragment.app.FragmentActivity;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kr.co.popone.fitts.C0001R$anim;
import kr.co.popone.fitts.feature.intro.login.LoginActivity;
import org.jetbrains.anko.internals.AnkoInternals;

final class IntroLoginFragment$onViewCreated$4 implements OnClickListener {
    final /* synthetic */ IntroLoginFragment this$0;

    IntroLoginFragment$onViewCreated$4(IntroLoginFragment introLoginFragment) {
        this.this$0 = introLoginFragment;
    }

    public final void onClick(View view) {
        Context context = this.this$0.getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        ActivityOptionsCompat makeCustomAnimation = ActivityOptionsCompat.makeCustomAnimation(context, C0001R$anim.slide_up, C0001R$anim.fade_out);
        Intrinsics.checkExpressionValueIsNotNull(makeCustomAnimation, "ActivityOptionsCompat.ma…lide_up, R.anim.fade_out)");
        IntroLoginFragment introLoginFragment = this.this$0;
        Pair[] pairArr = new Pair[0];
        FragmentActivity requireActivity = introLoginFragment.requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
        introLoginFragment.startActivity(AnkoInternals.createIntent(requireActivity, LoginActivity.class, pairArr), makeCustomAnimation.toBundle());
    }
}