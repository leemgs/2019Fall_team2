package org.jetbrains.anko;

import android.content.Context;
import android.widget.EditText;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* renamed from: org.jetbrains.anko.$$Anko$Factories$CustomViews$EDIT_TEXT$1 reason: invalid class name */
final class C$$Anko$Factories$CustomViews$EDIT_TEXT$1 extends Lambda implements Function1<Context, EditText> {
    public static final C$$Anko$Factories$CustomViews$EDIT_TEXT$1 INSTANCE = new C$$Anko$Factories$CustomViews$EDIT_TEXT$1();

    C$$Anko$Factories$CustomViews$EDIT_TEXT$1() {
        super(1);
    }

    @NotNull
    public final EditText invoke(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "ctx");
        return new EditText(context);
    }
}
