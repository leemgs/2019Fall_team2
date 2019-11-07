package kr.co.popone.fitts.feature.event;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kr.co.popone.fitts.C0001R$anim;
import kr.co.popone.fitts.C0010R$id;
import kr.co.popone.fitts.feature.search.ShopWebViewActivity;
import kr.co.popone.fitts.feature.search.ShopWebViewActivity.Parameters;
import org.jetbrains.anko.internals.AnkoInternals;

final class AppliableEventApplyActivity$onCreate$5 implements OnClickListener {
    final /* synthetic */ AppliableEventApplyActivity this$0;

    AppliableEventApplyActivity$onCreate$5(AppliableEventApplyActivity appliableEventApplyActivity) {
        this.this$0 = appliableEventApplyActivity;
    }

    public final void onClick(View view) {
        AppliableEventApplyActivity appliableEventApplyActivity = this.this$0;
        EditText editText = (EditText) appliableEventApplyActivity._$_findCachedViewById(C0010R$id.productDetailPageLinkEditText);
        Intrinsics.checkExpressionValueIsNotNull(editText, "productDetailPageLinkEditText");
        Parameters parameters = new Parameters(editText.getText().toString(), "", false, null, null, null, null, 124, null);
        appliableEventApplyActivity.startActivity(AnkoInternals.createIntent(appliableEventApplyActivity, ShopWebViewActivity.class, new Pair[]{TuplesKt.to("parameters", parameters)}));
        this.this$0.overridePendingTransition(C0001R$anim.slide_up, C0001R$anim.fade_out);
    }
}