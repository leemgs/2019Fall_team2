package kr.co.popone.fitts.feature.category;

import android.view.View;
import android.widget.AdapterView;
import java.util.ArrayList;
import kotlin.Result.Failure;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.anko.sdk27.coroutines.__AdapterView_OnItemSelectedListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class CategorySearchActivity$onCreate$$inlined$apply$lambda$1 extends Lambda implements Function1<__AdapterView_OnItemSelectedListener, Unit> {
    final /* synthetic */ ArrayList $categories;
    final /* synthetic */ CategorySearchActivity this$0;

    @DebugMetadata(c = "kr.co.popone.fitts.feature.category.CategorySearchActivity$onCreate$1$1$1", f = "CategorySearchActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kr.co.popone.fitts.feature.category.CategorySearchActivity$onCreate$$inlined$apply$lambda$1$1 reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function6<CoroutineScope, AdapterView<?>, View, Integer, Long, Continuation<? super Unit>, Object> {
        int label;
        private CoroutineScope p$;
        private AdapterView p$0;
        private View p$1;
        private int p$2;
        private long p$3;
        final /* synthetic */ CategorySearchActivity$onCreate$$inlined$apply$lambda$1 this$0;

        {
            this.this$0 = r1;
        }

        @NotNull
        public final Continuation<Unit> create(@NotNull CoroutineScope coroutineScope, @Nullable AdapterView<?> adapterView, @Nullable View view, int i, long j, @NotNull Continuation<? super Unit> continuation) {
            Intrinsics.checkParameterIsNotNull(coroutineScope, "receiver$0");
            Intrinsics.checkParameterIsNotNull(continuation, "continuation");
            AnonymousClass1 r0 = new AnonymousClass1(this.this$0, continuation);
            r0.p$ = coroutineScope;
            r0.p$0 = adapterView;
            r0.p$1 = view;
            r0.p$2 = i;
            r0.p$3 = j;
            return r0;
        }

        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (AdapterView) obj2, (View) obj3, ((Number) obj4).intValue(), ((Number) obj5).longValue(), (Continuation) obj6)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else if (!(obj instanceof Failure)) {
                int i = this.p$2;
                CategorySearchAdatper access$getCategorySearchAdatper$p = this.this$0.this$0.categorySearchAdatper;
                ArrayList arrayList = this.this$0.$categories;
                Intrinsics.checkExpressionValueIsNotNull(arrayList, "categories");
                access$getCategorySearchAdatper$p.setCategoryItem(arrayList, i);
                return Unit.INSTANCE;
            } else {
                throw ((Failure) obj).exception;
            }
        }
    }

    CategorySearchActivity$onCreate$$inlined$apply$lambda$1(ArrayList arrayList, CategorySearchActivity categorySearchActivity) {
        this.$categories = arrayList;
        this.this$0 = categorySearchActivity;
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((__AdapterView_OnItemSelectedListener) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull __AdapterView_OnItemSelectedListener __adapterview_onitemselectedlistener) {
        Intrinsics.checkParameterIsNotNull(__adapterview_onitemselectedlistener, "receiver$0");
        __adapterview_onitemselectedlistener.onItemSelected(new AnonymousClass1(this, null));
    }
}