package kr.co.popone.fitts.feature.store.recommend;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

final class StoreFeedFragment$sam$androidx_lifecycle_Observer$0 implements Observer {
    private final /* synthetic */ Function1 function;

    StoreFeedFragment$sam$androidx_lifecycle_Observer$0(Function1 function1) {
        this.function = function1;
    }

    public final /* synthetic */ void onChanged(Object obj) {
        Intrinsics.checkExpressionValueIsNotNull(this.function.invoke(obj), "invoke(...)");
    }
}
