package kr.co.popone.fitts.feature.push.order;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import kotlin.jvm.internal.Intrinsics;
import kr.co.popone.fitts.C0010R$id;
import kr.co.popone.fitts.viewmodel.push.OrderPushRendingViewModel;

final class OrderAllCancelFragment$updateUiByPaymentMethod$$inlined$run$lambda$5 implements OnClickListener {
    final /* synthetic */ OrderAllCancelFragment this$0;

    OrderAllCancelFragment$updateUiByPaymentMethod$$inlined$run$lambda$5(OrderAllCancelFragment orderAllCancelFragment) {
        this.this$0 = orderAllCancelFragment;
    }

    public final void onClick(View view) {
        OrderPushRendingViewModel viewModel = this.this$0.getViewModel();
        EditText editText = (EditText) this.this$0._$_findCachedViewById(C0010R$id.editAccountHolder);
        Intrinsics.checkExpressionValueIsNotNull(editText, "editAccountHolder");
        String obj = editText.getText().toString();
        EditText editText2 = (EditText) this.this$0._$_findCachedViewById(C0010R$id.editAccountNumber);
        Intrinsics.checkExpressionValueIsNotNull(editText2, "editAccountNumber");
        String obj2 = editText2.getText().toString();
        EditText editText3 = (EditText) this.this$0._$_findCachedViewById(C0010R$id.editBankName);
        Intrinsics.checkExpressionValueIsNotNull(editText3, "editBankName");
        viewModel.updateRefundAccountInfo(obj, obj2, editText3.getText().toString());
    }
}