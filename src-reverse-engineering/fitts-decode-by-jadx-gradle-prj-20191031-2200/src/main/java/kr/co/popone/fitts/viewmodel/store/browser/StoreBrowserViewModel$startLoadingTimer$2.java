package kr.co.popone.fitts.viewmodel.store.browser;

import io.reactivex.functions.Consumer;

final class StoreBrowserViewModel$startLoadingTimer$2<T> implements Consumer<Throwable> {
    final /* synthetic */ StoreBrowserViewModel this$0;

    StoreBrowserViewModel$startLoadingTimer$2(StoreBrowserViewModel storeBrowserViewModel) {
        this.this$0 = storeBrowserViewModel;
    }

    public final void accept(Throwable th) {
        this.this$0.loadingTimerSubject.onNext(Boolean.valueOf(true));
    }
}
