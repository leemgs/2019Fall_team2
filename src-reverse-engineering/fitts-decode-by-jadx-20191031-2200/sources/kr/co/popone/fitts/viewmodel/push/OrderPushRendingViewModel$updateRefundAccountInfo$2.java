package kr.co.popone.fitts.viewmodel.push;

import io.reactivex.functions.Consumer;

final class OrderPushRendingViewModel$updateRefundAccountInfo$2<T> implements Consumer<Throwable> {
    final /* synthetic */ OrderPushRendingViewModel this$0;

    OrderPushRendingViewModel$updateRefundAccountInfo$2(OrderPushRendingViewModel orderPushRendingViewModel) {
        this.this$0 = orderPushRendingViewModel;
    }

    public final void accept(Throwable th) {
        this.this$0.getErrorLiveData().setValue(th);
    }
}
