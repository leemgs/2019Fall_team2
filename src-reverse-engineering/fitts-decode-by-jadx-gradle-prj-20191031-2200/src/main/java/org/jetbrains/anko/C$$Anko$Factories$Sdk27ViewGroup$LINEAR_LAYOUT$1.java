package org.jetbrains.anko;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* renamed from: org.jetbrains.anko.$$Anko$Factories$Sdk27ViewGroup$LINEAR_LAYOUT$1 reason: invalid class name */
final class C$$Anko$Factories$Sdk27ViewGroup$LINEAR_LAYOUT$1 extends Lambda implements Function1<Context, _LinearLayout> {
    public static final C$$Anko$Factories$Sdk27ViewGroup$LINEAR_LAYOUT$1 INSTANCE = new C$$Anko$Factories$Sdk27ViewGroup$LINEAR_LAYOUT$1();

    C$$Anko$Factories$Sdk27ViewGroup$LINEAR_LAYOUT$1() {
        super(1);
    }

    @NotNull
    public final _LinearLayout invoke(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "ctx");
        return new _LinearLayout(context);
    }
}
