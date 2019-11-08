package kr.co.popone.fitts.feature.feeds;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kr.co.popone.fitts.C0010R$id;
import kr.co.popone.fitts.C0013R$layout;
import kr.co.popone.fitts.base.SessionProvider;
import kr.co.popone.fitts.model.datamodel.action.PostAction;
import kr.co.popone.fitts.model.datamodel.action.SchemeAction;
import kr.co.popone.fitts.model.datamodel.service.post.Image;
import kr.co.popone.fitts.model.datamodel.service.user.User;
import kr.co.popone.fitts.model.datamodel.social.feed.Feed;
import kr.co.popone.fitts.model.datamodel.social.feed.FeedVariantInfo;
import kr.co.popone.fitts.model.datamodel.social.feed.PostFeedView;
import kr.co.popone.fitts.ui.ImageViewExtensionKt;
import kr.co.popone.fitts.ui.ViewExtensionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class PostFeedTripleHolder extends BaseViewHolder {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    public static final Companion Companion = new Companion(null);
    private final Lazy centerPost$delegate;
    @NotNull
    private final Delegate delegate;
    private final FrameLayout headerArea;
    private final Lazy leftPost$delegate;
    private final Lazy rightPost$delegate;

    public static final class Companion {
        public final int getId() {
            return C0013R$layout.item_home_post_holder;
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PostFeedTripleHolder create(@NotNull ViewGroup viewGroup, @NotNull Delegate delegate) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            Intrinsics.checkParameterIsNotNull(delegate, "delegate");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0013R$layout.item_home_post_holder, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            return new PostFeedTripleHolder(inflate, delegate);
        }
    }

    public interface Delegate extends SessionProvider, PostAction, SchemeAction {
    }

    static {
        Class<PostFeedTripleHolder> cls = PostFeedTripleHolder.class;
        $$delegatedProperties = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "leftPost", "getLeftPost()Lkr/co/popone/fitts/model/datamodel/social/feed/PostFeedView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "centerPost", "getCenterPost()Lkr/co/popone/fitts/model/datamodel/social/feed/PostFeedView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "rightPost", "getRightPost()Lkr/co/popone/fitts/model/datamodel/social/feed/PostFeedView;"))};
    }

    private final PostFeedView getCenterPost() {
        Lazy lazy = this.centerPost$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (PostFeedView) lazy.getValue();
    }

    private final PostFeedView getLeftPost() {
        Lazy lazy = this.leftPost$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (PostFeedView) lazy.getValue();
    }

    private final PostFeedView getRightPost() {
        Lazy lazy = this.rightPost$delegate;
        KProperty kProperty = $$delegatedProperties[2];
        return (PostFeedView) lazy.getValue();
    }

    @NotNull
    public final Delegate getDelegate() {
        return this.delegate;
    }

    public PostFeedTripleHolder(@NotNull View view, @NotNull Delegate delegate2) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(delegate2, "delegate");
        super(view);
        this.delegate = delegate2;
        this.headerArea = (FrameLayout) view.findViewById(C0010R$id.layoutHeaderView);
        this.leftPost$delegate = LazyKt__LazyJVMKt.lazy(new PostFeedTripleHolder$leftPost$2(view));
        this.centerPost$delegate = LazyKt__LazyJVMKt.lazy(new PostFeedTripleHolder$centerPost$2(view));
        this.rightPost$delegate = LazyKt__LazyJVMKt.lazy(new PostFeedTripleHolder$rightPost$2(view));
    }

    public <T> void bind(@Nullable T t, @Nullable Integer num) {
        if (t instanceof Feed) {
            initView((Feed) t);
        }
    }

    private final void initView(Feed feed) {
        initTitleView(feed);
        initView(getLeftPost(), (FeedVariantInfo) CollectionsKt___CollectionsKt.getOrNull(feed.getFeeds(), 0));
        initView(getCenterPost(), (FeedVariantInfo) CollectionsKt___CollectionsKt.getOrNull(feed.getFeeds(), 1));
        initView(getRightPost(), (FeedVariantInfo) CollectionsKt___CollectionsKt.getOrNull(feed.getFeeds(), 2));
    }

    private final void initView(PostFeedView postFeedView, FeedVariantInfo feedVariantInfo) {
        if (feedVariantInfo == null || feedVariantInfo.getFeed().isEmptyPost()) {
            ViewExtensionsKt.gone(postFeedView.getPostTitleTextView());
            postFeedView.invisible();
            return;
        }
        ImageView coverImageView = postFeedView.getCoverImageView();
        Image coverImage = feedVariantInfo.getFeed().getCoverImage();
        String str = null;
        String url = coverImage != null ? coverImage.getUrl() : null;
        Image coverImage2 = feedVariantInfo.getFeed().getCoverImage();
        ImageViewExtensionKt.loadImageAsPost(coverImageView, url, coverImage2 != null ? coverImage2.getDominantColor() : null);
        ImageView profileImageView = postFeedView.getProfileImageView();
        User user = feedVariantInfo.getFeed().getUser();
        ImageViewExtensionKt.loadImageAsProfile(profileImageView, user != null ? user.getProfileImageUrl() : null);
        ViewExtensionsKt.gone(postFeedView.getPostTitleTextView());
        TextView fittieIdTextView = postFeedView.getFittieIdTextView();
        User user2 = feedVariantInfo.getFeed().getUser();
        if (user2 != null) {
            str = user2.getFittsID();
        }
        fittieIdTextView.setText(str);
        View fittieSuitView = postFeedView.getFittieSuitView();
        User user3 = feedVariantInfo.getFeed().getUser();
        fittieSuitView.setVisibility((user3 == null || !user3.isSuitable()) ? 8 : 0);
        postFeedView.setOnClickListener(new PostFeedTripleHolder$initView$$inlined$with$lambda$1(this, feedVariantInfo, postFeedView));
        postFeedView.visible();
    }

    private final void initTitleView(Feed feed) {
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        View titleHeaderView = feed.getTitleHeaderView(context, this.delegate.getSessionManager());
        if (titleHeaderView != null) {
            FrameLayout frameLayout = this.headerArea;
            ViewExtensionsKt.visible(frameLayout);
            frameLayout.removeAllViews();
            frameLayout.addView(titleHeaderView);
            frameLayout.setOnClickListener(new PostFeedTripleHolder$initTitleView$$inlined$let$lambda$1(titleHeaderView, this, feed));
            return;
        }
        FrameLayout frameLayout2 = this.headerArea;
        Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "headerArea");
        ViewExtensionsKt.gone(frameLayout2);
    }

    public void clear() {
        clearView(getLeftPost());
        clearView(getCenterPost());
        clearView(getRightPost());
        this.headerArea.removeAllViews();
    }

    private final void clearView(PostFeedView postFeedView) {
        View view = this.itemView;
        String str = "itemView";
        Intrinsics.checkExpressionValueIsNotNull(view, str);
        Glide.with(view.getContext()).clear((View) postFeedView.getCoverImageView());
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, str);
        Glide.with(view2.getContext()).clear((View) postFeedView.getProfileImageView());
        postFeedView.getFittieIdTextView().setText(null);
    }
}