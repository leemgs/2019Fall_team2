package kr.co.popone.fitts.feature.reward;

import io.reactivex.functions.Consumer;

final class RewardPointUseActivity$onCreate$9<T> implements Consumer<CharSequence> {
    final /* synthetic */ RewardPointUseActivity this$0;

    RewardPointUseActivity$onCreate$9(RewardPointUseActivity rewardPointUseActivity) {
        this.this$0 = rewardPointUseActivity;
    }

    public final void accept(CharSequence charSequence) {
        try {
            this.this$0.productPriceSubject.onNext(Integer.valueOf(Integer.parseInt(charSequence.toString())));
        } catch (NumberFormatException unused) {
            this.this$0.productPriceSubject.onNext(Integer.valueOf(0));
        }
    }
}
