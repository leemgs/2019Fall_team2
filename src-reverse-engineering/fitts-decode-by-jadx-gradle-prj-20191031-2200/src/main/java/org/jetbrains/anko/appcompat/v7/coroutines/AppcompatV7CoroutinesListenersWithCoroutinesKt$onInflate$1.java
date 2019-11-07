package org.jetbrains.anko.appcompat.v7.coroutines;

import android.view.View;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.ViewStubCompat.OnInflateListener;
import kotlin.Result.Failure;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class AppcompatV7CoroutinesListenersWithCoroutinesKt$onInflate$1 implements OnInflateListener {
    final /* synthetic */ CoroutineContext $context;
    final /* synthetic */ Function4 $handler;

    @DebugMetadata(c = "org/jetbrains/anko/appcompat/v7/coroutines/AppcompatV7CoroutinesListenersWithCoroutinesKt$onInflate$1$1", f = "ListenersWithCoroutines.kt", i = {}, l = {198, 200}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: org.jetbrains.anko.appcompat.v7.coroutines.AppcompatV7CoroutinesListenersWithCoroutinesKt$onInflate$1$1 reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        private CoroutineScope p$;
        final /* synthetic */ AppcompatV7CoroutinesListenersWithCoroutinesKt$onInflate$1 this$0;

        {
            this.this$0 = r1;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            Intrinsics.checkParameterIsNotNull(continuation, "completion");
            AnonymousClass1 r0 = new AnonymousClass1(this.this$0, viewStubCompat, view, continuation);
            r0.p$ = (CoroutineScope) obj;
            return r0;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else if (obj instanceof Failure) {
                    throw ((Failure) obj).exception;
                }
            } else if (!(obj instanceof Failure)) {
                CoroutineScope coroutineScope = this.p$;
                Function4 function4 = this.this$0.$handler;
                ViewStubCompat viewStubCompat = viewStubCompat;
                View view = view;
                this.label = 1;
                if (function4.invoke(coroutineScope, viewStubCompat, view, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw ((Failure) obj).exception;
            }
            return Unit.INSTANCE;
        }
    }

    AppcompatV7CoroutinesListenersWithCoroutinesKt$onInflate$1(CoroutineContext coroutineContext, Function4 function4) {
        this.$context = coroutineContext;
        this.$handler = function4;
    }

    public final void onInflate(final ViewStubCompat viewStubCompat, final View view) {
        BuildersKt.launch(GlobalScope.INSTANCE, this.$context, CoroutineStart.DEFAULT, new AnonymousClass1(this, null));
    }
}
