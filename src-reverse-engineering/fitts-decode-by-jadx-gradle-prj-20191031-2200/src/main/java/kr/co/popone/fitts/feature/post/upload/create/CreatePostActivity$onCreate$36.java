package kr.co.popone.fitts.feature.post.upload.create;

import android.widget.EditText;
import android.widget.TextView.BufferType;
import io.reactivex.functions.Consumer;
import kr.co.popone.fitts.C0010R$id;

final class CreatePostActivity$onCreate$36<T> implements Consumer<String> {
    final /* synthetic */ CreatePostActivity this$0;

    CreatePostActivity$onCreate$36(CreatePostActivity createPostActivity) {
        this.this$0 = createPostActivity;
    }

    public final void accept(String str) {
        ((EditText) this.this$0._$_findCachedViewById(C0010R$id.post_title)).setText(str, BufferType.EDITABLE);
    }
}