package kr.co.popone.fitts.feature.showroom;

import android.view.View;
import android.view.View.OnClickListener;

final class ShowRoomAdapter$onBindViewHolder$2 implements OnClickListener {
    final /* synthetic */ ShowRoomAdapter this$0;

    ShowRoomAdapter$onBindViewHolder$2(ShowRoomAdapter showRoomAdapter) {
        this.this$0 = showRoomAdapter;
    }

    public final void onClick(View view) {
        this.this$0.delegate.onModifyProfileImageClicked();
    }
}