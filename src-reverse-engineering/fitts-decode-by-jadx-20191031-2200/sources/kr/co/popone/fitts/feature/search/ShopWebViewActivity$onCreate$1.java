package kr.co.popone.fitts.feature.search;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.core.widget.ContentLoadingProgressBar;
import com.orhanobut.logger.Logger;
import kotlin.jvm.internal.Intrinsics;
import kr.co.popone.fitts.C0010R$id;
import org.jetbrains.annotations.Nullable;

public final class ShopWebViewActivity$onCreate$1 extends WebChromeClient {
    final /* synthetic */ ShopWebViewActivity this$0;

    ShopWebViewActivity$onCreate$1(ShopWebViewActivity shopWebViewActivity) {
        this.this$0 = shopWebViewActivity;
    }

    public void onProgressChanged(@Nullable WebView webView, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("onProgressChanged   ");
        sb.append(i);
        Logger.d(sb.toString(), new Object[0]);
        ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) this.this$0._$_findCachedViewById(C0010R$id.contentLoadingProgressBar);
        String str = "contentLoadingProgressBar";
        Intrinsics.checkExpressionValueIsNotNull(contentLoadingProgressBar, str);
        contentLoadingProgressBar.setProgress(i);
        if (i >= 100) {
            ContentLoadingProgressBar contentLoadingProgressBar2 = (ContentLoadingProgressBar) this.this$0._$_findCachedViewById(C0010R$id.contentLoadingProgressBar);
            Intrinsics.checkExpressionValueIsNotNull(contentLoadingProgressBar2, str);
            contentLoadingProgressBar2.setVisibility(4);
            return;
        }
        ContentLoadingProgressBar contentLoadingProgressBar3 = (ContentLoadingProgressBar) this.this$0._$_findCachedViewById(C0010R$id.contentLoadingProgressBar);
        Intrinsics.checkExpressionValueIsNotNull(contentLoadingProgressBar3, str);
        contentLoadingProgressBar3.setVisibility(0);
    }
}
