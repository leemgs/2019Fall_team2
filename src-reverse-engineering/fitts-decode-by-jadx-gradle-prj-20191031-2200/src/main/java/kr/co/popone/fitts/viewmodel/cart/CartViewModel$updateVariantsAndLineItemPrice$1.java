package kr.co.popone.fitts.viewmodel.cart;

import io.reactivex.functions.BiConsumer;
import kr.co.popone.fitts.model.cart.CartLineItemsDomain;

final class CartViewModel$updateVariantsAndLineItemPrice$1<T1, T2> implements BiConsumer<CartLineItemsDomain, Throwable> {
    final /* synthetic */ CartViewModel this$0;

    CartViewModel$updateVariantsAndLineItemPrice$1(CartViewModel cartViewModel) {
        this.this$0 = cartViewModel;
    }

    public final void accept(CartLineItemsDomain cartLineItemsDomain, Throwable th) {
        if (cartLineItemsDomain != null) {
            this.this$0.getPriceCartLineItemLiveData().setValue(cartLineItemsDomain);
        } else {
            this.this$0.getErrorLiveData().setValue(th);
        }
    }
}
