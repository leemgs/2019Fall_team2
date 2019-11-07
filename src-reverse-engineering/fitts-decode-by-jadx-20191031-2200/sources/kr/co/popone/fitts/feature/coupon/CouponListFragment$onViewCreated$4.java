package kr.co.popone.fitts.feature.coupon;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class CouponListFragment$onViewCreated$4 extends OnScrollListener {
    final /* synthetic */ CouponListFragment this$0;

    CouponListFragment$onViewCreated$4(CouponListFragment couponListFragment) {
        this.this$0 = couponListFragment;
    }

    public void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
        int i3;
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            int childCount = layoutManager.getChildCount();
            int itemCount = layoutManager.getItemCount();
            if (layoutManager instanceof LinearLayoutManager) {
                i3 = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
            } else if (layoutManager instanceof GridLayoutManager) {
                i3 = ((GridLayoutManager) layoutManager).findFirstVisibleItemPosition();
            } else {
                throw new IllegalAccessException();
            }
            if (childCount + i3 >= itemCount && this.this$0.couponInfoListRequest == null && this.this$0.hasMoreCouponList) {
                this.this$0.loadCouponList(true);
            }
        }
    }
}