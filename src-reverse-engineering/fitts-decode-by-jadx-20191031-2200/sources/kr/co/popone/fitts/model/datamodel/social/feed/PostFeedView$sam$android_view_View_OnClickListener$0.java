package kr.co.popone.fitts.model.datamodel.social.feed;

import android.view.View;
import android.view.View.OnClickListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

final class PostFeedView$sam$android_view_View_OnClickListener$0 implements OnClickListener {
    private final /* synthetic */ Function1 function;

    PostFeedView$sam$android_view_View_OnClickListener$0(Function1 function1) {
        this.function = function1;
    }

    public final /* synthetic */ void onClick(View view) {
        Intrinsics.checkExpressionValueIsNotNull(this.function.invoke(view), "invoke(...)");
    }
}