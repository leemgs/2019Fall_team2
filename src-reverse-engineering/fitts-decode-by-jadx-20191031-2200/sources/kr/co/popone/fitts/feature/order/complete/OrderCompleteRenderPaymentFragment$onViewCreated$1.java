package kr.co.popone.fitts.feature.order.complete;

import android.view.View;
import android.view.View.OnClickListener;

final class OrderCompleteRenderPaymentFragment$onViewCreated$1 implements OnClickListener {
    final /* synthetic */ OrderCompleteRenderPaymentFragment this$0;

    OrderCompleteRenderPaymentFragment$onViewCreated$1(OrderCompleteRenderPaymentFragment orderCompleteRenderPaymentFragment) {
        this.this$0 = orderCompleteRenderPaymentFragment;
    }

    public final void onClick(View view) {
        this.this$0.getViewModel().handleScheme(this.this$0.getActivity(), "fitts://storeHome?tabName=home");
    }
}