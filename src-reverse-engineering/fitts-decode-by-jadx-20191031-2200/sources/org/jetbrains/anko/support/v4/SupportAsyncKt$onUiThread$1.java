package org.jetbrains.anko.support.v4;

import kotlin.jvm.functions.Function0;

public final class SupportAsyncKt$onUiThread$1 implements Runnable {
    final /* synthetic */ Function0 $f;

    public SupportAsyncKt$onUiThread$1(Function0 function0) {
        this.$f = function0;
    }

    public final void run() {
        this.$f.invoke();
    }
}
