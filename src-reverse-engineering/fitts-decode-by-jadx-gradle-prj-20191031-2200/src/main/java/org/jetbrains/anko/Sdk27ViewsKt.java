package org.jetbrains.anko;

import android.app.Activity;
import android.app.MediaRouteButton;
import android.appwidget.AppWidgetHostView;
import android.content.Context;
import android.gesture.GestureOverlayView;
import android.graphics.drawable.Drawable;
import android.inputmethodservice.ExtractEditText;
import android.media.tv.TvView;
import android.opengl.GLSurfaceView;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewManager;
import android.view.ViewStub;
import android.webkit.WebView;
import android.widget.AbsoluteLayout;
import android.widget.ActionMenuView;
import android.widget.AdapterViewFlipper;
import android.widget.AnalogClock;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.DialerFilter;
import android.widget.DigitalClock;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.Gallery;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.NumberPicker;
import android.widget.ProgressBar;
import android.widget.QuickContactBadge;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SearchView;
import android.widget.SeekBar;
import android.widget.SlidingDrawer;
import android.widget.Space;
import android.widget.Spinner;
import android.widget.StackView;
import android.widget.Switch;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextClock;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.ToggleButton;
import android.widget.Toolbar;
import android.widget.TwoLineListItem;
import android.widget.VideoView;
import android.widget.ViewAnimator;
import android.widget.ViewFlipper;
import android.widget.ViewSwitcher;
import android.widget.ZoomButton;
import android.widget.ZoomControls;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.anko.internals.AnkoInternals;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Sdk27ViewsKt {
    @NotNull
    public static final MediaRouteButton mediaRouteButton(@NotNull ViewManager viewManager, @NotNull Function1<? super MediaRouteButton, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 media_route_button = C$$Anko$Factories$Sdk27View.INSTANCE.getMEDIA_ROUTE_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) media_route_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        MediaRouteButton mediaRouteButton = (MediaRouteButton) view;
        function1.invoke(mediaRouteButton);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return mediaRouteButton;
    }

    @NotNull
    public static /* synthetic */ MediaRouteButton themedMediaRouteButton$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 media_route_button = C$$Anko$Factories$Sdk27View.INSTANCE.getMEDIA_ROUTE_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) media_route_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        MediaRouteButton mediaRouteButton = (MediaRouteButton) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return mediaRouteButton;
    }

    @NotNull
    public static /* synthetic */ MediaRouteButton themedMediaRouteButton$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 media_route_button = C$$Anko$Factories$Sdk27View.INSTANCE.getMEDIA_ROUTE_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) media_route_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        MediaRouteButton mediaRouteButton = (MediaRouteButton) view;
        function1.invoke(mediaRouteButton);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return mediaRouteButton;
    }

    @NotNull
    public static final MediaRouteButton themedMediaRouteButton(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super MediaRouteButton, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 media_route_button = C$$Anko$Factories$Sdk27View.INSTANCE.getMEDIA_ROUTE_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) media_route_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        MediaRouteButton mediaRouteButton = (MediaRouteButton) view;
        function1.invoke(mediaRouteButton);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return mediaRouteButton;
    }

    @NotNull
    public static final GestureOverlayView gestureOverlayView(@NotNull ViewManager viewManager, @NotNull Function1<? super GestureOverlayView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 gesture_overlay_view = C$$Anko$Factories$Sdk27View.INSTANCE.getGESTURE_OVERLAY_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) gesture_overlay_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        GestureOverlayView gestureOverlayView = (GestureOverlayView) view;
        function1.invoke(gestureOverlayView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return gestureOverlayView;
    }

    @NotNull
    public static /* synthetic */ GestureOverlayView themedGestureOverlayView$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 gesture_overlay_view = C$$Anko$Factories$Sdk27View.INSTANCE.getGESTURE_OVERLAY_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) gesture_overlay_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        GestureOverlayView gestureOverlayView = (GestureOverlayView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return gestureOverlayView;
    }

    @NotNull
    public static /* synthetic */ GestureOverlayView themedGestureOverlayView$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 gesture_overlay_view = C$$Anko$Factories$Sdk27View.INSTANCE.getGESTURE_OVERLAY_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) gesture_overlay_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        GestureOverlayView gestureOverlayView = (GestureOverlayView) view;
        function1.invoke(gestureOverlayView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return gestureOverlayView;
    }

    @NotNull
    public static final GestureOverlayView themedGestureOverlayView(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super GestureOverlayView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 gesture_overlay_view = C$$Anko$Factories$Sdk27View.INSTANCE.getGESTURE_OVERLAY_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) gesture_overlay_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        GestureOverlayView gestureOverlayView = (GestureOverlayView) view;
        function1.invoke(gestureOverlayView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return gestureOverlayView;
    }

    @NotNull
    public static final GestureOverlayView gestureOverlayView(@NotNull Context context, @NotNull Function1<? super GestureOverlayView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getGESTURE_OVERLAY_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        GestureOverlayView gestureOverlayView = (GestureOverlayView) view;
        function1.invoke(gestureOverlayView);
        AnkoInternals.INSTANCE.addView(context, view);
        return gestureOverlayView;
    }

    @NotNull
    public static /* synthetic */ GestureOverlayView themedGestureOverlayView$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getGESTURE_OVERLAY_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        GestureOverlayView gestureOverlayView = (GestureOverlayView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return gestureOverlayView;
    }

    @NotNull
    public static /* synthetic */ GestureOverlayView themedGestureOverlayView$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getGESTURE_OVERLAY_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        GestureOverlayView gestureOverlayView = (GestureOverlayView) view;
        function1.invoke(gestureOverlayView);
        AnkoInternals.INSTANCE.addView(context, view);
        return gestureOverlayView;
    }

    @NotNull
    public static final GestureOverlayView themedGestureOverlayView(@NotNull Context context, int i, @NotNull Function1<? super GestureOverlayView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getGESTURE_OVERLAY_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        GestureOverlayView gestureOverlayView = (GestureOverlayView) view;
        function1.invoke(gestureOverlayView);
        AnkoInternals.INSTANCE.addView(context, view);
        return gestureOverlayView;
    }

    @NotNull
    public static final GestureOverlayView gestureOverlayView(@NotNull Activity activity, @NotNull Function1<? super GestureOverlayView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getGESTURE_OVERLAY_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        GestureOverlayView gestureOverlayView = (GestureOverlayView) view;
        function1.invoke(gestureOverlayView);
        AnkoInternals.INSTANCE.addView(activity, view);
        return gestureOverlayView;
    }

    @NotNull
    public static /* synthetic */ GestureOverlayView themedGestureOverlayView$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getGESTURE_OVERLAY_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        GestureOverlayView gestureOverlayView = (GestureOverlayView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return gestureOverlayView;
    }

    @NotNull
    public static /* synthetic */ GestureOverlayView themedGestureOverlayView$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getGESTURE_OVERLAY_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        GestureOverlayView gestureOverlayView = (GestureOverlayView) view;
        function1.invoke(gestureOverlayView);
        AnkoInternals.INSTANCE.addView(activity, view);
        return gestureOverlayView;
    }

    @NotNull
    public static final GestureOverlayView themedGestureOverlayView(@NotNull Activity activity, int i, @NotNull Function1<? super GestureOverlayView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getGESTURE_OVERLAY_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        GestureOverlayView gestureOverlayView = (GestureOverlayView) view;
        function1.invoke(gestureOverlayView);
        AnkoInternals.INSTANCE.addView(activity, view);
        return gestureOverlayView;
    }

    @NotNull
    public static final ExtractEditText extractEditText(@NotNull ViewManager viewManager, @NotNull Function1<? super ExtractEditText, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 extract_edit_text = C$$Anko$Factories$Sdk27View.INSTANCE.getEXTRACT_EDIT_TEXT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) extract_edit_text.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ExtractEditText extractEditText = (ExtractEditText) view;
        function1.invoke(extractEditText);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return extractEditText;
    }

    @NotNull
    public static /* synthetic */ ExtractEditText themedExtractEditText$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 extract_edit_text = C$$Anko$Factories$Sdk27View.INSTANCE.getEXTRACT_EDIT_TEXT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) extract_edit_text.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ExtractEditText extractEditText = (ExtractEditText) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return extractEditText;
    }

    @NotNull
    public static /* synthetic */ ExtractEditText themedExtractEditText$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 extract_edit_text = C$$Anko$Factories$Sdk27View.INSTANCE.getEXTRACT_EDIT_TEXT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) extract_edit_text.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ExtractEditText extractEditText = (ExtractEditText) view;
        function1.invoke(extractEditText);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return extractEditText;
    }

    @NotNull
    public static final ExtractEditText themedExtractEditText(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super ExtractEditText, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 extract_edit_text = C$$Anko$Factories$Sdk27View.INSTANCE.getEXTRACT_EDIT_TEXT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) extract_edit_text.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ExtractEditText extractEditText = (ExtractEditText) view;
        function1.invoke(extractEditText);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return extractEditText;
    }

    @NotNull
    public static final TvView tvView(@NotNull ViewManager viewManager, @NotNull Function1<? super TvView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 tv_view = C$$Anko$Factories$Sdk27View.INSTANCE.getTV_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) tv_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        TvView tvView = (TvView) view;
        function1.invoke(tvView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return tvView;
    }

    @NotNull
    public static /* synthetic */ TvView themedTvView$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 tv_view = C$$Anko$Factories$Sdk27View.INSTANCE.getTV_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) tv_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TvView tvView = (TvView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return tvView;
    }

    @NotNull
    public static /* synthetic */ TvView themedTvView$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 tv_view = C$$Anko$Factories$Sdk27View.INSTANCE.getTV_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) tv_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TvView tvView = (TvView) view;
        function1.invoke(tvView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return tvView;
    }

    @NotNull
    public static final TvView themedTvView(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super TvView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 tv_view = C$$Anko$Factories$Sdk27View.INSTANCE.getTV_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) tv_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TvView tvView = (TvView) view;
        function1.invoke(tvView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return tvView;
    }

    @NotNull
    public static final TvView tvView(@NotNull Context context, @NotNull Function1<? super TvView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTV_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        TvView tvView = (TvView) view;
        function1.invoke(tvView);
        AnkoInternals.INSTANCE.addView(context, view);
        return tvView;
    }

    @NotNull
    public static /* synthetic */ TvView themedTvView$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTV_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        TvView tvView = (TvView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return tvView;
    }

    @NotNull
    public static /* synthetic */ TvView themedTvView$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTV_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        TvView tvView = (TvView) view;
        function1.invoke(tvView);
        AnkoInternals.INSTANCE.addView(context, view);
        return tvView;
    }

    @NotNull
    public static final TvView themedTvView(@NotNull Context context, int i, @NotNull Function1<? super TvView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTV_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        TvView tvView = (TvView) view;
        function1.invoke(tvView);
        AnkoInternals.INSTANCE.addView(context, view);
        return tvView;
    }

    @NotNull
    public static final TvView tvView(@NotNull Activity activity, @NotNull Function1<? super TvView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTV_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        TvView tvView = (TvView) view;
        function1.invoke(tvView);
        AnkoInternals.INSTANCE.addView(activity, view);
        return tvView;
    }

    @NotNull
    public static /* synthetic */ TvView themedTvView$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTV_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        TvView tvView = (TvView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return tvView;
    }

    @NotNull
    public static /* synthetic */ TvView themedTvView$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTV_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        TvView tvView = (TvView) view;
        function1.invoke(tvView);
        AnkoInternals.INSTANCE.addView(activity, view);
        return tvView;
    }

    @NotNull
    public static final TvView themedTvView(@NotNull Activity activity, int i, @NotNull Function1<? super TvView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTV_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        TvView tvView = (TvView) view;
        function1.invoke(tvView);
        AnkoInternals.INSTANCE.addView(activity, view);
        return tvView;
    }

    @NotNull
    public static final GLSurfaceView gLSurfaceView(@NotNull ViewManager viewManager, @NotNull Function1<? super GLSurfaceView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 g_l_surface_view = C$$Anko$Factories$Sdk27View.INSTANCE.getG_L_SURFACE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) g_l_surface_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        GLSurfaceView gLSurfaceView = (GLSurfaceView) view;
        function1.invoke(gLSurfaceView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return gLSurfaceView;
    }

    @NotNull
    public static /* synthetic */ GLSurfaceView themedGLSurfaceView$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 g_l_surface_view = C$$Anko$Factories$Sdk27View.INSTANCE.getG_L_SURFACE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) g_l_surface_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        GLSurfaceView gLSurfaceView = (GLSurfaceView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return gLSurfaceView;
    }

    @NotNull
    public static /* synthetic */ GLSurfaceView themedGLSurfaceView$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 g_l_surface_view = C$$Anko$Factories$Sdk27View.INSTANCE.getG_L_SURFACE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) g_l_surface_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        GLSurfaceView gLSurfaceView = (GLSurfaceView) view;
        function1.invoke(gLSurfaceView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return gLSurfaceView;
    }

    @NotNull
    public static final GLSurfaceView themedGLSurfaceView(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super GLSurfaceView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 g_l_surface_view = C$$Anko$Factories$Sdk27View.INSTANCE.getG_L_SURFACE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) g_l_surface_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        GLSurfaceView gLSurfaceView = (GLSurfaceView) view;
        function1.invoke(gLSurfaceView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return gLSurfaceView;
    }

    @NotNull
    public static final SurfaceView surfaceView(@NotNull ViewManager viewManager, @NotNull Function1<? super SurfaceView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 surface_view = C$$Anko$Factories$Sdk27View.INSTANCE.getSURFACE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) surface_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        SurfaceView surfaceView = (SurfaceView) view;
        function1.invoke(surfaceView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return surfaceView;
    }

    @NotNull
    public static /* synthetic */ SurfaceView themedSurfaceView$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 surface_view = C$$Anko$Factories$Sdk27View.INSTANCE.getSURFACE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) surface_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        SurfaceView surfaceView = (SurfaceView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return surfaceView;
    }

    @NotNull
    public static /* synthetic */ SurfaceView themedSurfaceView$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 surface_view = C$$Anko$Factories$Sdk27View.INSTANCE.getSURFACE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) surface_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        SurfaceView surfaceView = (SurfaceView) view;
        function1.invoke(surfaceView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return surfaceView;
    }

    @NotNull
    public static final SurfaceView themedSurfaceView(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super SurfaceView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 surface_view = C$$Anko$Factories$Sdk27View.INSTANCE.getSURFACE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) surface_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        SurfaceView surfaceView = (SurfaceView) view;
        function1.invoke(surfaceView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return surfaceView;
    }

    @NotNull
    public static final TextureView textureView(@NotNull ViewManager viewManager, @NotNull Function1<? super TextureView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 texture_view = C$$Anko$Factories$Sdk27View.INSTANCE.getTEXTURE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) texture_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        TextureView textureView = (TextureView) view;
        function1.invoke(textureView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return textureView;
    }

    @NotNull
    public static /* synthetic */ TextureView themedTextureView$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 texture_view = C$$Anko$Factories$Sdk27View.INSTANCE.getTEXTURE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) texture_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TextureView textureView = (TextureView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return textureView;
    }

    @NotNull
    public static /* synthetic */ TextureView themedTextureView$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 texture_view = C$$Anko$Factories$Sdk27View.INSTANCE.getTEXTURE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) texture_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TextureView textureView = (TextureView) view;
        function1.invoke(textureView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return textureView;
    }

    @NotNull
    public static final TextureView themedTextureView(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super TextureView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 texture_view = C$$Anko$Factories$Sdk27View.INSTANCE.getTEXTURE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) texture_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TextureView textureView = (TextureView) view;
        function1.invoke(textureView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return textureView;
    }

    @NotNull
    public static final View view(@NotNull ViewManager viewManager, @NotNull Function1<? super View, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 view = C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view2 = (View) view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        function1.invoke(view2);
        AnkoInternals.INSTANCE.addView(viewManager, view2);
        return view2;
    }

    @NotNull
    public static /* synthetic */ View themedView$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 view = C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view2 = (View) view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        AnkoInternals.INSTANCE.addView(viewManager, view2);
        return view2;
    }

    @NotNull
    public static /* synthetic */ View themedView$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 view = C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view2 = (View) view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke(view2);
        AnkoInternals.INSTANCE.addView(viewManager, view2);
        return view2;
    }

    @NotNull
    public static final View themedView(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super View, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 view = C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view2 = (View) view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke(view2);
        AnkoInternals.INSTANCE.addView(viewManager, view2);
        return view2;
    }

    @NotNull
    public static final ViewStub viewStub(@NotNull ViewManager viewManager, @NotNull Function1<? super ViewStub, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 view_stub = C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW_STUB();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) view_stub.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ViewStub viewStub = (ViewStub) view;
        function1.invoke(viewStub);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return viewStub;
    }

    @NotNull
    public static /* synthetic */ ViewStub themedViewStub$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 view_stub = C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW_STUB();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) view_stub.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ViewStub viewStub = (ViewStub) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return viewStub;
    }

    @NotNull
    public static /* synthetic */ ViewStub themedViewStub$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 view_stub = C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW_STUB();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) view_stub.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ViewStub viewStub = (ViewStub) view;
        function1.invoke(viewStub);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return viewStub;
    }

    @NotNull
    public static final ViewStub themedViewStub(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super ViewStub, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 view_stub = C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW_STUB();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) view_stub.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ViewStub viewStub = (ViewStub) view;
        function1.invoke(viewStub);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return viewStub;
    }

    @NotNull
    public static final WebView webView(@NotNull ViewManager viewManager, @NotNull Function1<? super WebView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 web_view = C$$Anko$Factories$Sdk27View.INSTANCE.getWEB_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) web_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        WebView webView = (WebView) view;
        function1.invoke(webView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return webView;
    }

    @NotNull
    public static /* synthetic */ WebView themedWebView$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 web_view = C$$Anko$Factories$Sdk27View.INSTANCE.getWEB_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) web_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        WebView webView = (WebView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return webView;
    }

    @NotNull
    public static /* synthetic */ WebView themedWebView$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 web_view = C$$Anko$Factories$Sdk27View.INSTANCE.getWEB_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) web_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        WebView webView = (WebView) view;
        function1.invoke(webView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return webView;
    }

    @NotNull
    public static final WebView themedWebView(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super WebView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 web_view = C$$Anko$Factories$Sdk27View.INSTANCE.getWEB_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) web_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        WebView webView = (WebView) view;
        function1.invoke(webView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return webView;
    }

    @NotNull
    public static final WebView webView(@NotNull Context context, @NotNull Function1<? super WebView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getWEB_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        WebView webView = (WebView) view;
        function1.invoke(webView);
        AnkoInternals.INSTANCE.addView(context, view);
        return webView;
    }

    @NotNull
    public static /* synthetic */ WebView themedWebView$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getWEB_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        WebView webView = (WebView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return webView;
    }

    @NotNull
    public static /* synthetic */ WebView themedWebView$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getWEB_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        WebView webView = (WebView) view;
        function1.invoke(webView);
        AnkoInternals.INSTANCE.addView(context, view);
        return webView;
    }

    @NotNull
    public static final WebView themedWebView(@NotNull Context context, int i, @NotNull Function1<? super WebView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getWEB_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        WebView webView = (WebView) view;
        function1.invoke(webView);
        AnkoInternals.INSTANCE.addView(context, view);
        return webView;
    }

    @NotNull
    public static final WebView webView(@NotNull Activity activity, @NotNull Function1<? super WebView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getWEB_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        WebView webView = (WebView) view;
        function1.invoke(webView);
        AnkoInternals.INSTANCE.addView(activity, view);
        return webView;
    }

    @NotNull
    public static /* synthetic */ WebView themedWebView$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getWEB_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        WebView webView = (WebView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return webView;
    }

    @NotNull
    public static /* synthetic */ WebView themedWebView$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getWEB_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        WebView webView = (WebView) view;
        function1.invoke(webView);
        AnkoInternals.INSTANCE.addView(activity, view);
        return webView;
    }

    @NotNull
    public static final WebView themedWebView(@NotNull Activity activity, int i, @NotNull Function1<? super WebView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getWEB_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        WebView webView = (WebView) view;
        function1.invoke(webView);
        AnkoInternals.INSTANCE.addView(activity, view);
        return webView;
    }

    @NotNull
    public static final AdapterViewFlipper adapterViewFlipper(@NotNull ViewManager viewManager, @NotNull Function1<? super AdapterViewFlipper, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 adapter_view_flipper = C$$Anko$Factories$Sdk27View.INSTANCE.getADAPTER_VIEW_FLIPPER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) adapter_view_flipper.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        AdapterViewFlipper adapterViewFlipper = (AdapterViewFlipper) view;
        function1.invoke(adapterViewFlipper);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return adapterViewFlipper;
    }

    @NotNull
    public static /* synthetic */ AdapterViewFlipper themedAdapterViewFlipper$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 adapter_view_flipper = C$$Anko$Factories$Sdk27View.INSTANCE.getADAPTER_VIEW_FLIPPER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) adapter_view_flipper.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        AdapterViewFlipper adapterViewFlipper = (AdapterViewFlipper) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return adapterViewFlipper;
    }

    @NotNull
    public static /* synthetic */ AdapterViewFlipper themedAdapterViewFlipper$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 adapter_view_flipper = C$$Anko$Factories$Sdk27View.INSTANCE.getADAPTER_VIEW_FLIPPER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) adapter_view_flipper.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        AdapterViewFlipper adapterViewFlipper = (AdapterViewFlipper) view;
        function1.invoke(adapterViewFlipper);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return adapterViewFlipper;
    }

    @NotNull
    public static final AdapterViewFlipper themedAdapterViewFlipper(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super AdapterViewFlipper, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 adapter_view_flipper = C$$Anko$Factories$Sdk27View.INSTANCE.getADAPTER_VIEW_FLIPPER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) adapter_view_flipper.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        AdapterViewFlipper adapterViewFlipper = (AdapterViewFlipper) view;
        function1.invoke(adapterViewFlipper);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return adapterViewFlipper;
    }

    @NotNull
    public static final AdapterViewFlipper adapterViewFlipper(@NotNull Context context, @NotNull Function1<? super AdapterViewFlipper, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getADAPTER_VIEW_FLIPPER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        AdapterViewFlipper adapterViewFlipper = (AdapterViewFlipper) view;
        function1.invoke(adapterViewFlipper);
        AnkoInternals.INSTANCE.addView(context, view);
        return adapterViewFlipper;
    }

    @NotNull
    public static /* synthetic */ AdapterViewFlipper themedAdapterViewFlipper$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getADAPTER_VIEW_FLIPPER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        AdapterViewFlipper adapterViewFlipper = (AdapterViewFlipper) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return adapterViewFlipper;
    }

    @NotNull
    public static /* synthetic */ AdapterViewFlipper themedAdapterViewFlipper$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getADAPTER_VIEW_FLIPPER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        AdapterViewFlipper adapterViewFlipper = (AdapterViewFlipper) view;
        function1.invoke(adapterViewFlipper);
        AnkoInternals.INSTANCE.addView(context, view);
        return adapterViewFlipper;
    }

    @NotNull
    public static final AdapterViewFlipper themedAdapterViewFlipper(@NotNull Context context, int i, @NotNull Function1<? super AdapterViewFlipper, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getADAPTER_VIEW_FLIPPER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        AdapterViewFlipper adapterViewFlipper = (AdapterViewFlipper) view;
        function1.invoke(adapterViewFlipper);
        AnkoInternals.INSTANCE.addView(context, view);
        return adapterViewFlipper;
    }

    @NotNull
    public static final AdapterViewFlipper adapterViewFlipper(@NotNull Activity activity, @NotNull Function1<? super AdapterViewFlipper, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getADAPTER_VIEW_FLIPPER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        AdapterViewFlipper adapterViewFlipper = (AdapterViewFlipper) view;
        function1.invoke(adapterViewFlipper);
        AnkoInternals.INSTANCE.addView(activity, view);
        return adapterViewFlipper;
    }

    @NotNull
    public static /* synthetic */ AdapterViewFlipper themedAdapterViewFlipper$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getADAPTER_VIEW_FLIPPER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        AdapterViewFlipper adapterViewFlipper = (AdapterViewFlipper) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return adapterViewFlipper;
    }

    @NotNull
    public static /* synthetic */ AdapterViewFlipper themedAdapterViewFlipper$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getADAPTER_VIEW_FLIPPER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        AdapterViewFlipper adapterViewFlipper = (AdapterViewFlipper) view;
        function1.invoke(adapterViewFlipper);
        AnkoInternals.INSTANCE.addView(activity, view);
        return adapterViewFlipper;
    }

    @NotNull
    public static final AdapterViewFlipper themedAdapterViewFlipper(@NotNull Activity activity, int i, @NotNull Function1<? super AdapterViewFlipper, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getADAPTER_VIEW_FLIPPER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        AdapterViewFlipper adapterViewFlipper = (AdapterViewFlipper) view;
        function1.invoke(adapterViewFlipper);
        AnkoInternals.INSTANCE.addView(activity, view);
        return adapterViewFlipper;
    }

    @NotNull
    public static final AnalogClock analogClock(@NotNull ViewManager viewManager, @NotNull Function1<? super AnalogClock, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 analog_clock = C$$Anko$Factories$Sdk27View.INSTANCE.getANALOG_CLOCK();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) analog_clock.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        AnalogClock analogClock = (AnalogClock) view;
        function1.invoke(analogClock);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return analogClock;
    }

    @NotNull
    public static /* synthetic */ AnalogClock themedAnalogClock$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 analog_clock = C$$Anko$Factories$Sdk27View.INSTANCE.getANALOG_CLOCK();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) analog_clock.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        AnalogClock analogClock = (AnalogClock) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return analogClock;
    }

    @NotNull
    public static /* synthetic */ AnalogClock themedAnalogClock$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 analog_clock = C$$Anko$Factories$Sdk27View.INSTANCE.getANALOG_CLOCK();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) analog_clock.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        AnalogClock analogClock = (AnalogClock) view;
        function1.invoke(analogClock);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return analogClock;
    }

    @NotNull
    public static final AnalogClock themedAnalogClock(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super AnalogClock, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 analog_clock = C$$Anko$Factories$Sdk27View.INSTANCE.getANALOG_CLOCK();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) analog_clock.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        AnalogClock analogClock = (AnalogClock) view;
        function1.invoke(analogClock);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return analogClock;
    }

    @NotNull
    public static final AutoCompleteTextView autoCompleteTextView(@NotNull ViewManager viewManager, @NotNull Function1<? super AutoCompleteTextView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 auto_complete_text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getAUTO_COMPLETE_TEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) auto_complete_text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) view;
        function1.invoke(autoCompleteTextView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return autoCompleteTextView;
    }

    @NotNull
    public static /* synthetic */ AutoCompleteTextView themedAutoCompleteTextView$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 auto_complete_text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getAUTO_COMPLETE_TEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) auto_complete_text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return autoCompleteTextView;
    }

    @NotNull
    public static /* synthetic */ AutoCompleteTextView themedAutoCompleteTextView$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 auto_complete_text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getAUTO_COMPLETE_TEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) auto_complete_text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) view;
        function1.invoke(autoCompleteTextView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return autoCompleteTextView;
    }

    @NotNull
    public static final AutoCompleteTextView themedAutoCompleteTextView(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super AutoCompleteTextView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 auto_complete_text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getAUTO_COMPLETE_TEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) auto_complete_text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) view;
        function1.invoke(autoCompleteTextView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return autoCompleteTextView;
    }

    @NotNull
    public static final Button button(@NotNull ViewManager viewManager, @NotNull Function1<? super Button, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 button = C$$Anko$Factories$Sdk27View.INSTANCE.getBUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        Button button2 = (Button) view;
        function1.invoke(button2);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return button2;
    }

    @NotNull
    public static /* synthetic */ Button themedButton$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 button = C$$Anko$Factories$Sdk27View.INSTANCE.getBUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        Button button2 = (Button) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return button2;
    }

    @NotNull
    public static /* synthetic */ Button themedButton$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 button = C$$Anko$Factories$Sdk27View.INSTANCE.getBUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        Button button2 = (Button) view;
        function1.invoke(button2);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return button2;
    }

    @NotNull
    public static final Button themedButton(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super Button, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 button = C$$Anko$Factories$Sdk27View.INSTANCE.getBUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        Button button2 = (Button) view;
        function1.invoke(button2);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return button2;
    }

    @NotNull
    public static final Button button(@NotNull ViewManager viewManager, @Nullable CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 button = C$$Anko$Factories$Sdk27View.INSTANCE.getBUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        Button button2 = (Button) view;
        button2.setText(charSequence);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return button2;
    }

    @NotNull
    public static final Button button(@NotNull ViewManager viewManager, @Nullable CharSequence charSequence, @NotNull Function1<? super Button, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 button = C$$Anko$Factories$Sdk27View.INSTANCE.getBUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        Button button2 = (Button) view;
        function1.invoke(button2);
        button2.setText(charSequence);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return button2;
    }

    @NotNull
    public static final Button themedButton(@NotNull ViewManager viewManager, @Nullable CharSequence charSequence, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 button = C$$Anko$Factories$Sdk27View.INSTANCE.getBUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        Button button2 = (Button) view;
        button2.setText(charSequence);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return button2;
    }

    @NotNull
    public static final Button themedButton(@NotNull ViewManager viewManager, @Nullable CharSequence charSequence, int i, @NotNull Function1<? super Button, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 button = C$$Anko$Factories$Sdk27View.INSTANCE.getBUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        Button button2 = (Button) view;
        function1.invoke(button2);
        button2.setText(charSequence);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return button2;
    }

    @NotNull
    public static final Button button(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 button = C$$Anko$Factories$Sdk27View.INSTANCE.getBUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        Button button2 = (Button) view;
        button2.setText(i);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return button2;
    }

    @NotNull
    public static final Button button(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super Button, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 button = C$$Anko$Factories$Sdk27View.INSTANCE.getBUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        Button button2 = (Button) view;
        function1.invoke(button2);
        button2.setText(i);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return button2;
    }

    @NotNull
    public static final Button themedButton(@NotNull ViewManager viewManager, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 button = C$$Anko$Factories$Sdk27View.INSTANCE.getBUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i2));
        Button button2 = (Button) view;
        button2.setText(i);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return button2;
    }

    @NotNull
    public static final Button themedButton(@NotNull ViewManager viewManager, int i, int i2, @NotNull Function1<? super Button, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 button = C$$Anko$Factories$Sdk27View.INSTANCE.getBUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i2));
        Button button2 = (Button) view;
        function1.invoke(button2);
        button2.setText(i);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return button2;
    }

    @NotNull
    public static final CalendarView calendarView(@NotNull ViewManager viewManager, @NotNull Function1<? super CalendarView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 calendar_view = C$$Anko$Factories$Sdk27View.INSTANCE.getCALENDAR_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) calendar_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        CalendarView calendarView = (CalendarView) view;
        function1.invoke(calendarView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return calendarView;
    }

    @NotNull
    public static /* synthetic */ CalendarView themedCalendarView$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 calendar_view = C$$Anko$Factories$Sdk27View.INSTANCE.getCALENDAR_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) calendar_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        CalendarView calendarView = (CalendarView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return calendarView;
    }

    @NotNull
    public static /* synthetic */ CalendarView themedCalendarView$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 calendar_view = C$$Anko$Factories$Sdk27View.INSTANCE.getCALENDAR_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) calendar_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        CalendarView calendarView = (CalendarView) view;
        function1.invoke(calendarView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return calendarView;
    }

    @NotNull
    public static final CalendarView themedCalendarView(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super CalendarView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 calendar_view = C$$Anko$Factories$Sdk27View.INSTANCE.getCALENDAR_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) calendar_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        CalendarView calendarView = (CalendarView) view;
        function1.invoke(calendarView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return calendarView;
    }

    @NotNull
    public static final CalendarView calendarView(@NotNull Context context, @NotNull Function1<? super CalendarView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getCALENDAR_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        CalendarView calendarView = (CalendarView) view;
        function1.invoke(calendarView);
        AnkoInternals.INSTANCE.addView(context, view);
        return calendarView;
    }

    @NotNull
    public static /* synthetic */ CalendarView themedCalendarView$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getCALENDAR_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        CalendarView calendarView = (CalendarView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return calendarView;
    }

    @NotNull
    public static /* synthetic */ CalendarView themedCalendarView$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getCALENDAR_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        CalendarView calendarView = (CalendarView) view;
        function1.invoke(calendarView);
        AnkoInternals.INSTANCE.addView(context, view);
        return calendarView;
    }

    @NotNull
    public static final CalendarView themedCalendarView(@NotNull Context context, int i, @NotNull Function1<? super CalendarView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getCALENDAR_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        CalendarView calendarView = (CalendarView) view;
        function1.invoke(calendarView);
        AnkoInternals.INSTANCE.addView(context, view);
        return calendarView;
    }

    @NotNull
    public static final CalendarView calendarView(@NotNull Activity activity, @NotNull Function1<? super CalendarView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getCALENDAR_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        CalendarView calendarView = (CalendarView) view;
        function1.invoke(calendarView);
        AnkoInternals.INSTANCE.addView(activity, view);
        return calendarView;
    }

    @NotNull
    public static /* synthetic */ CalendarView themedCalendarView$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getCALENDAR_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        CalendarView calendarView = (CalendarView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return calendarView;
    }

    @NotNull
    public static /* synthetic */ CalendarView themedCalendarView$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getCALENDAR_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        CalendarView calendarView = (CalendarView) view;
        function1.invoke(calendarView);
        AnkoInternals.INSTANCE.addView(activity, view);
        return calendarView;
    }

    @NotNull
    public static final CalendarView themedCalendarView(@NotNull Activity activity, int i, @NotNull Function1<? super CalendarView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getCALENDAR_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        CalendarView calendarView = (CalendarView) view;
        function1.invoke(calendarView);
        AnkoInternals.INSTANCE.addView(activity, view);
        return calendarView;
    }

    @NotNull
    public static final CheckBox checkBox(@NotNull ViewManager viewManager, @NotNull Function1<? super CheckBox, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 check_box = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECK_BOX();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) check_box.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        CheckBox checkBox = (CheckBox) view;
        function1.invoke(checkBox);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkBox;
    }

    @NotNull
    public static /* synthetic */ CheckBox themedCheckBox$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 check_box = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECK_BOX();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) check_box.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        CheckBox checkBox = (CheckBox) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkBox;
    }

    @NotNull
    public static /* synthetic */ CheckBox themedCheckBox$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 check_box = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECK_BOX();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) check_box.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        CheckBox checkBox = (CheckBox) view;
        function1.invoke(checkBox);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkBox;
    }

    @NotNull
    public static final CheckBox themedCheckBox(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super CheckBox, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 check_box = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECK_BOX();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) check_box.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        CheckBox checkBox = (CheckBox) view;
        function1.invoke(checkBox);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkBox;
    }

    @NotNull
    public static final CheckBox checkBox(@NotNull ViewManager viewManager, @Nullable CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 check_box = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECK_BOX();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) check_box.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        CheckBox checkBox = (CheckBox) view;
        checkBox.setText(charSequence);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkBox;
    }

    @NotNull
    public static final CheckBox checkBox(@NotNull ViewManager viewManager, @Nullable CharSequence charSequence, @NotNull Function1<? super CheckBox, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 check_box = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECK_BOX();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) check_box.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        CheckBox checkBox = (CheckBox) view;
        function1.invoke(checkBox);
        checkBox.setText(charSequence);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkBox;
    }

    @NotNull
    public static final CheckBox themedCheckBox(@NotNull ViewManager viewManager, @Nullable CharSequence charSequence, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 check_box = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECK_BOX();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) check_box.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        CheckBox checkBox = (CheckBox) view;
        checkBox.setText(charSequence);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkBox;
    }

    @NotNull
    public static final CheckBox themedCheckBox(@NotNull ViewManager viewManager, @Nullable CharSequence charSequence, int i, @NotNull Function1<? super CheckBox, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 check_box = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECK_BOX();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) check_box.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        CheckBox checkBox = (CheckBox) view;
        function1.invoke(checkBox);
        checkBox.setText(charSequence);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkBox;
    }

    @NotNull
    public static final CheckBox checkBox(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 check_box = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECK_BOX();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) check_box.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        CheckBox checkBox = (CheckBox) view;
        checkBox.setText(i);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkBox;
    }

    @NotNull
    public static final CheckBox checkBox(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super CheckBox, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 check_box = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECK_BOX();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) check_box.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        CheckBox checkBox = (CheckBox) view;
        function1.invoke(checkBox);
        checkBox.setText(i);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkBox;
    }

    @NotNull
    public static final CheckBox themedCheckBox(@NotNull ViewManager viewManager, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 check_box = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECK_BOX();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) check_box.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i2));
        CheckBox checkBox = (CheckBox) view;
        checkBox.setText(i);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkBox;
    }

    @NotNull
    public static final CheckBox themedCheckBox(@NotNull ViewManager viewManager, int i, int i2, @NotNull Function1<? super CheckBox, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 check_box = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECK_BOX();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) check_box.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i2));
        CheckBox checkBox = (CheckBox) view;
        function1.invoke(checkBox);
        checkBox.setText(i);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkBox;
    }

    @NotNull
    public static final CheckBox checkBox(@NotNull ViewManager viewManager, @Nullable CharSequence charSequence, boolean z) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 check_box = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECK_BOX();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) check_box.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        CheckBox checkBox = (CheckBox) view;
        checkBox.setText(charSequence);
        checkBox.setChecked(z);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkBox;
    }

    @NotNull
    public static final CheckBox checkBox(@NotNull ViewManager viewManager, @Nullable CharSequence charSequence, boolean z, @NotNull Function1<? super CheckBox, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 check_box = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECK_BOX();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) check_box.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        CheckBox checkBox = (CheckBox) view;
        function1.invoke(checkBox);
        checkBox.setText(charSequence);
        checkBox.setChecked(z);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkBox;
    }

    @NotNull
    public static final CheckBox themedCheckBox(@NotNull ViewManager viewManager, @Nullable CharSequence charSequence, boolean z, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 check_box = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECK_BOX();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) check_box.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        CheckBox checkBox = (CheckBox) view;
        checkBox.setText(charSequence);
        checkBox.setChecked(z);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkBox;
    }

    @NotNull
    public static final CheckBox themedCheckBox(@NotNull ViewManager viewManager, @Nullable CharSequence charSequence, boolean z, int i, @NotNull Function1<? super CheckBox, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 check_box = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECK_BOX();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) check_box.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        CheckBox checkBox = (CheckBox) view;
        function1.invoke(checkBox);
        checkBox.setText(charSequence);
        checkBox.setChecked(z);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkBox;
    }

    @NotNull
    public static final CheckBox checkBox(@NotNull ViewManager viewManager, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 check_box = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECK_BOX();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) check_box.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        CheckBox checkBox = (CheckBox) view;
        checkBox.setText(i);
        checkBox.setChecked(z);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkBox;
    }

    @NotNull
    public static final CheckBox checkBox(@NotNull ViewManager viewManager, int i, boolean z, @NotNull Function1<? super CheckBox, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 check_box = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECK_BOX();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) check_box.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        CheckBox checkBox = (CheckBox) view;
        function1.invoke(checkBox);
        checkBox.setText(i);
        checkBox.setChecked(z);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkBox;
    }

    @NotNull
    public static final CheckBox themedCheckBox(@NotNull ViewManager viewManager, int i, boolean z, int i2) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 check_box = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECK_BOX();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) check_box.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i2));
        CheckBox checkBox = (CheckBox) view;
        checkBox.setText(i);
        checkBox.setChecked(z);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkBox;
    }

    @NotNull
    public static final CheckBox themedCheckBox(@NotNull ViewManager viewManager, int i, boolean z, int i2, @NotNull Function1<? super CheckBox, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 check_box = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECK_BOX();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) check_box.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i2));
        CheckBox checkBox = (CheckBox) view;
        function1.invoke(checkBox);
        checkBox.setText(i);
        checkBox.setChecked(z);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkBox;
    }

    @NotNull
    public static final CheckedTextView checkedTextView(@NotNull ViewManager viewManager, @NotNull Function1<? super CheckedTextView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 checked_text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECKED_TEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) checked_text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        CheckedTextView checkedTextView = (CheckedTextView) view;
        function1.invoke(checkedTextView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkedTextView;
    }

    @NotNull
    public static /* synthetic */ CheckedTextView themedCheckedTextView$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 checked_text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECKED_TEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) checked_text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        CheckedTextView checkedTextView = (CheckedTextView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkedTextView;
    }

    @NotNull
    public static /* synthetic */ CheckedTextView themedCheckedTextView$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 checked_text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECKED_TEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) checked_text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        CheckedTextView checkedTextView = (CheckedTextView) view;
        function1.invoke(checkedTextView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkedTextView;
    }

    @NotNull
    public static final CheckedTextView themedCheckedTextView(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super CheckedTextView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 checked_text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECKED_TEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) checked_text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        CheckedTextView checkedTextView = (CheckedTextView) view;
        function1.invoke(checkedTextView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkedTextView;
    }

    @NotNull
    public static final Chronometer chronometer(@NotNull ViewManager viewManager, @NotNull Function1<? super Chronometer, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 chronometer = C$$Anko$Factories$Sdk27View.INSTANCE.getCHRONOMETER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) chronometer.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        Chronometer chronometer2 = (Chronometer) view;
        function1.invoke(chronometer2);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return chronometer2;
    }

    @NotNull
    public static /* synthetic */ Chronometer themedChronometer$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 chronometer = C$$Anko$Factories$Sdk27View.INSTANCE.getCHRONOMETER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) chronometer.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        Chronometer chronometer2 = (Chronometer) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return chronometer2;
    }

    @NotNull
    public static /* synthetic */ Chronometer themedChronometer$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 chronometer = C$$Anko$Factories$Sdk27View.INSTANCE.getCHRONOMETER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) chronometer.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        Chronometer chronometer2 = (Chronometer) view;
        function1.invoke(chronometer2);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return chronometer2;
    }

    @NotNull
    public static final Chronometer themedChronometer(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super Chronometer, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 chronometer = C$$Anko$Factories$Sdk27View.INSTANCE.getCHRONOMETER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) chronometer.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        Chronometer chronometer2 = (Chronometer) view;
        function1.invoke(chronometer2);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return chronometer2;
    }

    @NotNull
    public static final DatePicker datePicker(@NotNull ViewManager viewManager, @NotNull Function1<? super DatePicker, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 date_picker = C$$Anko$Factories$Sdk27View.INSTANCE.getDATE_PICKER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) date_picker.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        DatePicker datePicker = (DatePicker) view;
        function1.invoke(datePicker);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return datePicker;
    }

    @NotNull
    public static /* synthetic */ DatePicker themedDatePicker$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 date_picker = C$$Anko$Factories$Sdk27View.INSTANCE.getDATE_PICKER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) date_picker.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        DatePicker datePicker = (DatePicker) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return datePicker;
    }

    @NotNull
    public static /* synthetic */ DatePicker themedDatePicker$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 date_picker = C$$Anko$Factories$Sdk27View.INSTANCE.getDATE_PICKER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) date_picker.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        DatePicker datePicker = (DatePicker) view;
        function1.invoke(datePicker);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return datePicker;
    }

    @NotNull
    public static final DatePicker themedDatePicker(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super DatePicker, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 date_picker = C$$Anko$Factories$Sdk27View.INSTANCE.getDATE_PICKER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) date_picker.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        DatePicker datePicker = (DatePicker) view;
        function1.invoke(datePicker);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return datePicker;
    }

    @NotNull
    public static final DatePicker datePicker(@NotNull Context context, @NotNull Function1<? super DatePicker, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getDATE_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        DatePicker datePicker = (DatePicker) view;
        function1.invoke(datePicker);
        AnkoInternals.INSTANCE.addView(context, view);
        return datePicker;
    }

    @NotNull
    public static /* synthetic */ DatePicker themedDatePicker$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getDATE_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        DatePicker datePicker = (DatePicker) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return datePicker;
    }

    @NotNull
    public static /* synthetic */ DatePicker themedDatePicker$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getDATE_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        DatePicker datePicker = (DatePicker) view;
        function1.invoke(datePicker);
        AnkoInternals.INSTANCE.addView(context, view);
        return datePicker;
    }

    @NotNull
    public static final DatePicker themedDatePicker(@NotNull Context context, int i, @NotNull Function1<? super DatePicker, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getDATE_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        DatePicker datePicker = (DatePicker) view;
        function1.invoke(datePicker);
        AnkoInternals.INSTANCE.addView(context, view);
        return datePicker;
    }

    @NotNull
    public static final DatePicker datePicker(@NotNull Activity activity, @NotNull Function1<? super DatePicker, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getDATE_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        DatePicker datePicker = (DatePicker) view;
        function1.invoke(datePicker);
        AnkoInternals.INSTANCE.addView(activity, view);
        return datePicker;
    }

    @NotNull
    public static /* synthetic */ DatePicker themedDatePicker$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getDATE_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        DatePicker datePicker = (DatePicker) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return datePicker;
    }

    @NotNull
    public static /* synthetic */ DatePicker themedDatePicker$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getDATE_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        DatePicker datePicker = (DatePicker) view;
        function1.invoke(datePicker);
        AnkoInternals.INSTANCE.addView(activity, view);
        return datePicker;
    }

    @NotNull
    public static final DatePicker themedDatePicker(@NotNull Activity activity, int i, @NotNull Function1<? super DatePicker, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getDATE_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        DatePicker datePicker = (DatePicker) view;
        function1.invoke(datePicker);
        AnkoInternals.INSTANCE.addView(activity, view);
        return datePicker;
    }

    @NotNull
    public static final DialerFilter dialerFilter(@NotNull ViewManager viewManager, @NotNull Function1<? super DialerFilter, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 dialer_filter = C$$Anko$Factories$Sdk27View.INSTANCE.getDIALER_FILTER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) dialer_filter.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        DialerFilter dialerFilter = (DialerFilter) view;
        function1.invoke(dialerFilter);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return dialerFilter;
    }

    @NotNull
    public static /* synthetic */ DialerFilter themedDialerFilter$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 dialer_filter = C$$Anko$Factories$Sdk27View.INSTANCE.getDIALER_FILTER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) dialer_filter.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        DialerFilter dialerFilter = (DialerFilter) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return dialerFilter;
    }

    @NotNull
    public static /* synthetic */ DialerFilter themedDialerFilter$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 dialer_filter = C$$Anko$Factories$Sdk27View.INSTANCE.getDIALER_FILTER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) dialer_filter.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        DialerFilter dialerFilter = (DialerFilter) view;
        function1.invoke(dialerFilter);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return dialerFilter;
    }

    @NotNull
    public static final DialerFilter themedDialerFilter(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super DialerFilter, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 dialer_filter = C$$Anko$Factories$Sdk27View.INSTANCE.getDIALER_FILTER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) dialer_filter.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        DialerFilter dialerFilter = (DialerFilter) view;
        function1.invoke(dialerFilter);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return dialerFilter;
    }

    @NotNull
    public static final DialerFilter dialerFilter(@NotNull Context context, @NotNull Function1<? super DialerFilter, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getDIALER_FILTER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        DialerFilter dialerFilter = (DialerFilter) view;
        function1.invoke(dialerFilter);
        AnkoInternals.INSTANCE.addView(context, view);
        return dialerFilter;
    }

    @NotNull
    public static /* synthetic */ DialerFilter themedDialerFilter$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getDIALER_FILTER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        DialerFilter dialerFilter = (DialerFilter) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return dialerFilter;
    }

    @NotNull
    public static /* synthetic */ DialerFilter themedDialerFilter$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getDIALER_FILTER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        DialerFilter dialerFilter = (DialerFilter) view;
        function1.invoke(dialerFilter);
        AnkoInternals.INSTANCE.addView(context, view);
        return dialerFilter;
    }

    @NotNull
    public static final DialerFilter themedDialerFilter(@NotNull Context context, int i, @NotNull Function1<? super DialerFilter, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getDIALER_FILTER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        DialerFilter dialerFilter = (DialerFilter) view;
        function1.invoke(dialerFilter);
        AnkoInternals.INSTANCE.addView(context, view);
        return dialerFilter;
    }

    @NotNull
    public static final DialerFilter dialerFilter(@NotNull Activity activity, @NotNull Function1<? super DialerFilter, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getDIALER_FILTER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        DialerFilter dialerFilter = (DialerFilter) view;
        function1.invoke(dialerFilter);
        AnkoInternals.INSTANCE.addView(activity, view);
        return dialerFilter;
    }

    @NotNull
    public static /* synthetic */ DialerFilter themedDialerFilter$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getDIALER_FILTER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        DialerFilter dialerFilter = (DialerFilter) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return dialerFilter;
    }

    @NotNull
    public static /* synthetic */ DialerFilter themedDialerFilter$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getDIALER_FILTER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        DialerFilter dialerFilter = (DialerFilter) view;
        function1.invoke(dialerFilter);
        AnkoInternals.INSTANCE.addView(activity, view);
        return dialerFilter;
    }

    @NotNull
    public static final DialerFilter themedDialerFilter(@NotNull Activity activity, int i, @NotNull Function1<? super DialerFilter, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getDIALER_FILTER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        DialerFilter dialerFilter = (DialerFilter) view;
        function1.invoke(dialerFilter);
        AnkoInternals.INSTANCE.addView(activity, view);
        return dialerFilter;
    }

    @NotNull
    public static final DigitalClock digitalClock(@NotNull ViewManager viewManager, @NotNull Function1<? super DigitalClock, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 digital_clock = C$$Anko$Factories$Sdk27View.INSTANCE.getDIGITAL_CLOCK();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) digital_clock.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        DigitalClock digitalClock = (DigitalClock) view;
        function1.invoke(digitalClock);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return digitalClock;
    }

    @NotNull
    public static /* synthetic */ DigitalClock themedDigitalClock$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 digital_clock = C$$Anko$Factories$Sdk27View.INSTANCE.getDIGITAL_CLOCK();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) digital_clock.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        DigitalClock digitalClock = (DigitalClock) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return digitalClock;
    }

    @NotNull
    public static /* synthetic */ DigitalClock themedDigitalClock$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 digital_clock = C$$Anko$Factories$Sdk27View.INSTANCE.getDIGITAL_CLOCK();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) digital_clock.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        DigitalClock digitalClock = (DigitalClock) view;
        function1.invoke(digitalClock);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return digitalClock;
    }

    @NotNull
    public static final DigitalClock themedDigitalClock(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super DigitalClock, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 digital_clock = C$$Anko$Factories$Sdk27View.INSTANCE.getDIGITAL_CLOCK();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) digital_clock.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        DigitalClock digitalClock = (DigitalClock) view;
        function1.invoke(digitalClock);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return digitalClock;
    }

    @NotNull
    public static final EditText editText(@NotNull ViewManager viewManager, @NotNull Function1<? super EditText, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 edit_text = C$$Anko$Factories$Sdk27View.INSTANCE.getEDIT_TEXT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) edit_text.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        EditText editText = (EditText) view;
        function1.invoke(editText);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return editText;
    }

    @NotNull
    public static /* synthetic */ EditText themedEditText$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 edit_text = C$$Anko$Factories$Sdk27View.INSTANCE.getEDIT_TEXT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) edit_text.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        EditText editText = (EditText) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return editText;
    }

    @NotNull
    public static /* synthetic */ EditText themedEditText$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 edit_text = C$$Anko$Factories$Sdk27View.INSTANCE.getEDIT_TEXT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) edit_text.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        EditText editText = (EditText) view;
        function1.invoke(editText);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return editText;
    }

    @NotNull
    public static final EditText themedEditText(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super EditText, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 edit_text = C$$Anko$Factories$Sdk27View.INSTANCE.getEDIT_TEXT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) edit_text.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        EditText editText = (EditText) view;
        function1.invoke(editText);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return editText;
    }

    @NotNull
    public static final EditText editText(@NotNull ViewManager viewManager, @Nullable CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 edit_text = C$$Anko$Factories$Sdk27View.INSTANCE.getEDIT_TEXT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) edit_text.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        EditText editText = (EditText) view;
        editText.setText(charSequence);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return editText;
    }

    @NotNull
    public static final EditText editText(@NotNull ViewManager viewManager, @Nullable CharSequence charSequence, @NotNull Function1<? super EditText, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 edit_text = C$$Anko$Factories$Sdk27View.INSTANCE.getEDIT_TEXT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) edit_text.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        EditText editText = (EditText) view;
        function1.invoke(editText);
        editText.setText(charSequence);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return editText;
    }

    @NotNull
    public static final EditText themedEditText(@NotNull ViewManager viewManager, @Nullable CharSequence charSequence, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 edit_text = C$$Anko$Factories$Sdk27View.INSTANCE.getEDIT_TEXT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) edit_text.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        EditText editText = (EditText) view;
        editText.setText(charSequence);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return editText;
    }

    @NotNull
    public static final EditText themedEditText(@NotNull ViewManager viewManager, @Nullable CharSequence charSequence, int i, @NotNull Function1<? super EditText, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 edit_text = C$$Anko$Factories$Sdk27View.INSTANCE.getEDIT_TEXT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) edit_text.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        EditText editText = (EditText) view;
        function1.invoke(editText);
        editText.setText(charSequence);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return editText;
    }

    @NotNull
    public static final EditText editText(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 edit_text = C$$Anko$Factories$Sdk27View.INSTANCE.getEDIT_TEXT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) edit_text.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        EditText editText = (EditText) view;
        editText.setText(i);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return editText;
    }

    @NotNull
    public static final EditText editText(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super EditText, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 edit_text = C$$Anko$Factories$Sdk27View.INSTANCE.getEDIT_TEXT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) edit_text.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        EditText editText = (EditText) view;
        function1.invoke(editText);
        editText.setText(i);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return editText;
    }

    @NotNull
    public static final EditText themedEditText(@NotNull ViewManager viewManager, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 edit_text = C$$Anko$Factories$Sdk27View.INSTANCE.getEDIT_TEXT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) edit_text.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i2));
        EditText editText = (EditText) view;
        editText.setText(i);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return editText;
    }

    @NotNull
    public static final EditText themedEditText(@NotNull ViewManager viewManager, int i, int i2, @NotNull Function1<? super EditText, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 edit_text = C$$Anko$Factories$Sdk27View.INSTANCE.getEDIT_TEXT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) edit_text.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i2));
        EditText editText = (EditText) view;
        function1.invoke(editText);
        editText.setText(i);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return editText;
    }

    @NotNull
    public static final ExpandableListView expandableListView(@NotNull ViewManager viewManager, @NotNull Function1<? super ExpandableListView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 expandable_list_view = C$$Anko$Factories$Sdk27View.INSTANCE.getEXPANDABLE_LIST_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) expandable_list_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ExpandableListView expandableListView = (ExpandableListView) view;
        function1.invoke(expandableListView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return expandableListView;
    }

    @NotNull
    public static /* synthetic */ ExpandableListView themedExpandableListView$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 expandable_list_view = C$$Anko$Factories$Sdk27View.INSTANCE.getEXPANDABLE_LIST_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) expandable_list_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ExpandableListView expandableListView = (ExpandableListView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return expandableListView;
    }

    @NotNull
    public static /* synthetic */ ExpandableListView themedExpandableListView$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 expandable_list_view = C$$Anko$Factories$Sdk27View.INSTANCE.getEXPANDABLE_LIST_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) expandable_list_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ExpandableListView expandableListView = (ExpandableListView) view;
        function1.invoke(expandableListView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return expandableListView;
    }

    @NotNull
    public static final ExpandableListView themedExpandableListView(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super ExpandableListView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 expandable_list_view = C$$Anko$Factories$Sdk27View.INSTANCE.getEXPANDABLE_LIST_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) expandable_list_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ExpandableListView expandableListView = (ExpandableListView) view;
        function1.invoke(expandableListView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return expandableListView;
    }

    @NotNull
    public static final ExpandableListView expandableListView(@NotNull Context context, @NotNull Function1<? super ExpandableListView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getEXPANDABLE_LIST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        ExpandableListView expandableListView = (ExpandableListView) view;
        function1.invoke(expandableListView);
        AnkoInternals.INSTANCE.addView(context, view);
        return expandableListView;
    }

    @NotNull
    public static /* synthetic */ ExpandableListView themedExpandableListView$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getEXPANDABLE_LIST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        ExpandableListView expandableListView = (ExpandableListView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return expandableListView;
    }

    @NotNull
    public static /* synthetic */ ExpandableListView themedExpandableListView$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getEXPANDABLE_LIST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        ExpandableListView expandableListView = (ExpandableListView) view;
        function1.invoke(expandableListView);
        AnkoInternals.INSTANCE.addView(context, view);
        return expandableListView;
    }

    @NotNull
    public static final ExpandableListView themedExpandableListView(@NotNull Context context, int i, @NotNull Function1<? super ExpandableListView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getEXPANDABLE_LIST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        ExpandableListView expandableListView = (ExpandableListView) view;
        function1.invoke(expandableListView);
        AnkoInternals.INSTANCE.addView(context, view);
        return expandableListView;
    }

    @NotNull
    public static final ExpandableListView expandableListView(@NotNull Activity activity, @NotNull Function1<? super ExpandableListView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getEXPANDABLE_LIST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        ExpandableListView expandableListView = (ExpandableListView) view;
        function1.invoke(expandableListView);
        AnkoInternals.INSTANCE.addView(activity, view);
        return expandableListView;
    }

    @NotNull
    public static /* synthetic */ ExpandableListView themedExpandableListView$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getEXPANDABLE_LIST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        ExpandableListView expandableListView = (ExpandableListView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return expandableListView;
    }

    @NotNull
    public static /* synthetic */ ExpandableListView themedExpandableListView$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getEXPANDABLE_LIST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        ExpandableListView expandableListView = (ExpandableListView) view;
        function1.invoke(expandableListView);
        AnkoInternals.INSTANCE.addView(activity, view);
        return expandableListView;
    }

    @NotNull
    public static final ExpandableListView themedExpandableListView(@NotNull Activity activity, int i, @NotNull Function1<? super ExpandableListView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getEXPANDABLE_LIST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        ExpandableListView expandableListView = (ExpandableListView) view;
        function1.invoke(expandableListView);
        AnkoInternals.INSTANCE.addView(activity, view);
        return expandableListView;
    }

    @NotNull
    public static final ImageButton imageButton(@NotNull ViewManager viewManager, @NotNull Function1<? super ImageButton, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 image_button = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ImageButton imageButton = (ImageButton) view;
        function1.invoke(imageButton);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageButton;
    }

    @NotNull
    public static /* synthetic */ ImageButton themedImageButton$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 image_button = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ImageButton imageButton = (ImageButton) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageButton;
    }

    @NotNull
    public static /* synthetic */ ImageButton themedImageButton$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 image_button = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ImageButton imageButton = (ImageButton) view;
        function1.invoke(imageButton);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageButton;
    }

    @NotNull
    public static final ImageButton themedImageButton(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super ImageButton, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 image_button = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ImageButton imageButton = (ImageButton) view;
        function1.invoke(imageButton);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageButton;
    }

    @NotNull
    public static final ImageButton imageButton(@NotNull ViewManager viewManager, @Nullable Drawable drawable) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 image_button = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ImageButton imageButton = (ImageButton) view;
        imageButton.setImageDrawable(drawable);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageButton;
    }

    @NotNull
    public static final ImageButton imageButton(@NotNull ViewManager viewManager, @Nullable Drawable drawable, @NotNull Function1<? super ImageButton, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 image_button = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ImageButton imageButton = (ImageButton) view;
        function1.invoke(imageButton);
        imageButton.setImageDrawable(drawable);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageButton;
    }

    @NotNull
    public static final ImageButton themedImageButton(@NotNull ViewManager viewManager, @Nullable Drawable drawable, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 image_button = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ImageButton imageButton = (ImageButton) view;
        imageButton.setImageDrawable(drawable);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageButton;
    }

    @NotNull
    public static final ImageButton themedImageButton(@NotNull ViewManager viewManager, @Nullable Drawable drawable, int i, @NotNull Function1<? super ImageButton, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 image_button = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ImageButton imageButton = (ImageButton) view;
        function1.invoke(imageButton);
        imageButton.setImageDrawable(drawable);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageButton;
    }

    @NotNull
    public static final ImageButton imageButton(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 image_button = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ImageButton imageButton = (ImageButton) view;
        imageButton.setImageResource(i);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageButton;
    }

    @NotNull
    public static final ImageButton imageButton(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super ImageButton, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 image_button = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ImageButton imageButton = (ImageButton) view;
        function1.invoke(imageButton);
        imageButton.setImageResource(i);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageButton;
    }

    @NotNull
    public static final ImageButton themedImageButton(@NotNull ViewManager viewManager, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 image_button = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i2));
        ImageButton imageButton = (ImageButton) view;
        imageButton.setImageResource(i);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageButton;
    }

    @NotNull
    public static final ImageButton themedImageButton(@NotNull ViewManager viewManager, int i, int i2, @NotNull Function1<? super ImageButton, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 image_button = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i2));
        ImageButton imageButton = (ImageButton) view;
        function1.invoke(imageButton);
        imageButton.setImageResource(i);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageButton;
    }

    @NotNull
    public static final ImageView imageView(@NotNull ViewManager viewManager, @NotNull Function1<? super ImageView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 image_view = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ImageView imageView = (ImageView) view;
        function1.invoke(imageView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageView;
    }

    @NotNull
    public static /* synthetic */ ImageView themedImageView$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 image_view = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ImageView imageView = (ImageView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageView;
    }

    @NotNull
    public static /* synthetic */ ImageView themedImageView$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 image_view = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ImageView imageView = (ImageView) view;
        function1.invoke(imageView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageView;
    }

    @NotNull
    public static final ImageView themedImageView(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super ImageView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 image_view = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ImageView imageView = (ImageView) view;
        function1.invoke(imageView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageView;
    }

    @NotNull
    public static final ImageView imageView(@NotNull ViewManager viewManager, @Nullable Drawable drawable) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 image_view = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ImageView imageView = (ImageView) view;
        imageView.setImageDrawable(drawable);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageView;
    }

    @NotNull
    public static final ImageView imageView(@NotNull ViewManager viewManager, @Nullable Drawable drawable, @NotNull Function1<? super ImageView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 image_view = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ImageView imageView = (ImageView) view;
        function1.invoke(imageView);
        imageView.setImageDrawable(drawable);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageView;
    }

    @NotNull
    public static final ImageView themedImageView(@NotNull ViewManager viewManager, @Nullable Drawable drawable, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 image_view = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ImageView imageView = (ImageView) view;
        imageView.setImageDrawable(drawable);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageView;
    }

    @NotNull
    public static final ImageView themedImageView(@NotNull ViewManager viewManager, @Nullable Drawable drawable, int i, @NotNull Function1<? super ImageView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 image_view = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ImageView imageView = (ImageView) view;
        function1.invoke(imageView);
        imageView.setImageDrawable(drawable);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageView;
    }

    @NotNull
    public static final ImageView imageView(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 image_view = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(i);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageView;
    }

    @NotNull
    public static final ImageView imageView(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super ImageView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 image_view = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ImageView imageView = (ImageView) view;
        function1.invoke(imageView);
        imageView.setImageResource(i);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageView;
    }

    @NotNull
    public static final ImageView themedImageView(@NotNull ViewManager viewManager, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 image_view = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i2));
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(i);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageView;
    }

    @NotNull
    public static final ImageView themedImageView(@NotNull ViewManager viewManager, int i, int i2, @NotNull Function1<? super ImageView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 image_view = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i2));
        ImageView imageView = (ImageView) view;
        function1.invoke(imageView);
        imageView.setImageResource(i);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageView;
    }

    @NotNull
    public static final ListView listView(@NotNull ViewManager viewManager, @NotNull Function1<? super ListView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 list_view = C$$Anko$Factories$Sdk27View.INSTANCE.getLIST_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) list_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ListView listView = (ListView) view;
        function1.invoke(listView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return listView;
    }

    @NotNull
    public static /* synthetic */ ListView themedListView$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 list_view = C$$Anko$Factories$Sdk27View.INSTANCE.getLIST_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) list_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ListView listView = (ListView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return listView;
    }

    @NotNull
    public static /* synthetic */ ListView themedListView$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 list_view = C$$Anko$Factories$Sdk27View.INSTANCE.getLIST_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) list_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ListView listView = (ListView) view;
        function1.invoke(listView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return listView;
    }

    @NotNull
    public static final ListView themedListView(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super ListView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 list_view = C$$Anko$Factories$Sdk27View.INSTANCE.getLIST_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) list_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ListView listView = (ListView) view;
        function1.invoke(listView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return listView;
    }

    @NotNull
    public static final ListView listView(@NotNull Context context, @NotNull Function1<? super ListView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getLIST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        ListView listView = (ListView) view;
        function1.invoke(listView);
        AnkoInternals.INSTANCE.addView(context, view);
        return listView;
    }

    @NotNull
    public static /* synthetic */ ListView themedListView$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getLIST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        ListView listView = (ListView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return listView;
    }

    @NotNull
    public static /* synthetic */ ListView themedListView$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getLIST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        ListView listView = (ListView) view;
        function1.invoke(listView);
        AnkoInternals.INSTANCE.addView(context, view);
        return listView;
    }

    @NotNull
    public static final ListView themedListView(@NotNull Context context, int i, @NotNull Function1<? super ListView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getLIST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        ListView listView = (ListView) view;
        function1.invoke(listView);
        AnkoInternals.INSTANCE.addView(context, view);
        return listView;
    }

    @NotNull
    public static final ListView listView(@NotNull Activity activity, @NotNull Function1<? super ListView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getLIST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        ListView listView = (ListView) view;
        function1.invoke(listView);
        AnkoInternals.INSTANCE.addView(activity, view);
        return listView;
    }

    @NotNull
    public static /* synthetic */ ListView themedListView$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getLIST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        ListView listView = (ListView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return listView;
    }

    @NotNull
    public static /* synthetic */ ListView themedListView$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getLIST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        ListView listView = (ListView) view;
        function1.invoke(listView);
        AnkoInternals.INSTANCE.addView(activity, view);
        return listView;
    }

    @NotNull
    public static final ListView themedListView(@NotNull Activity activity, int i, @NotNull Function1<? super ListView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getLIST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        ListView listView = (ListView) view;
        function1.invoke(listView);
        AnkoInternals.INSTANCE.addView(activity, view);
        return listView;
    }

    @NotNull
    public static final MultiAutoCompleteTextView multiAutoCompleteTextView(@NotNull ViewManager viewManager, @NotNull Function1<? super MultiAutoCompleteTextView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 multi_auto_complete_text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getMULTI_AUTO_COMPLETE_TEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) multi_auto_complete_text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        MultiAutoCompleteTextView multiAutoCompleteTextView = (MultiAutoCompleteTextView) view;
        function1.invoke(multiAutoCompleteTextView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return multiAutoCompleteTextView;
    }

    @NotNull
    public static /* synthetic */ MultiAutoCompleteTextView themedMultiAutoCompleteTextView$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 multi_auto_complete_text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getMULTI_AUTO_COMPLETE_TEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) multi_auto_complete_text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        MultiAutoCompleteTextView multiAutoCompleteTextView = (MultiAutoCompleteTextView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return multiAutoCompleteTextView;
    }

    @NotNull
    public static /* synthetic */ MultiAutoCompleteTextView themedMultiAutoCompleteTextView$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 multi_auto_complete_text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getMULTI_AUTO_COMPLETE_TEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) multi_auto_complete_text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        MultiAutoCompleteTextView multiAutoCompleteTextView = (MultiAutoCompleteTextView) view;
        function1.invoke(multiAutoCompleteTextView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return multiAutoCompleteTextView;
    }

    @NotNull
    public static final MultiAutoCompleteTextView themedMultiAutoCompleteTextView(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super MultiAutoCompleteTextView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 multi_auto_complete_text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getMULTI_AUTO_COMPLETE_TEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) multi_auto_complete_text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        MultiAutoCompleteTextView multiAutoCompleteTextView = (MultiAutoCompleteTextView) view;
        function1.invoke(multiAutoCompleteTextView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return multiAutoCompleteTextView;
    }

    @NotNull
    public static final NumberPicker numberPicker(@NotNull ViewManager viewManager, @NotNull Function1<? super NumberPicker, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 number_picker = C$$Anko$Factories$Sdk27View.INSTANCE.getNUMBER_PICKER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) number_picker.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        NumberPicker numberPicker = (NumberPicker) view;
        function1.invoke(numberPicker);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return numberPicker;
    }

    @NotNull
    public static /* synthetic */ NumberPicker themedNumberPicker$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 number_picker = C$$Anko$Factories$Sdk27View.INSTANCE.getNUMBER_PICKER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) number_picker.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        NumberPicker numberPicker = (NumberPicker) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return numberPicker;
    }

    @NotNull
    public static /* synthetic */ NumberPicker themedNumberPicker$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 number_picker = C$$Anko$Factories$Sdk27View.INSTANCE.getNUMBER_PICKER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) number_picker.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        NumberPicker numberPicker = (NumberPicker) view;
        function1.invoke(numberPicker);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return numberPicker;
    }

    @NotNull
    public static final NumberPicker themedNumberPicker(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super NumberPicker, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 number_picker = C$$Anko$Factories$Sdk27View.INSTANCE.getNUMBER_PICKER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) number_picker.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        NumberPicker numberPicker = (NumberPicker) view;
        function1.invoke(numberPicker);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return numberPicker;
    }

    @NotNull
    public static final NumberPicker numberPicker(@NotNull Context context, @NotNull Function1<? super NumberPicker, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getNUMBER_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        NumberPicker numberPicker = (NumberPicker) view;
        function1.invoke(numberPicker);
        AnkoInternals.INSTANCE.addView(context, view);
        return numberPicker;
    }

    @NotNull
    public static /* synthetic */ NumberPicker themedNumberPicker$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getNUMBER_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        NumberPicker numberPicker = (NumberPicker) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return numberPicker;
    }

    @NotNull
    public static /* synthetic */ NumberPicker themedNumberPicker$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getNUMBER_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        NumberPicker numberPicker = (NumberPicker) view;
        function1.invoke(numberPicker);
        AnkoInternals.INSTANCE.addView(context, view);
        return numberPicker;
    }

    @NotNull
    public static final NumberPicker themedNumberPicker(@NotNull Context context, int i, @NotNull Function1<? super NumberPicker, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getNUMBER_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        NumberPicker numberPicker = (NumberPicker) view;
        function1.invoke(numberPicker);
        AnkoInternals.INSTANCE.addView(context, view);
        return numberPicker;
    }

    @NotNull
    public static final NumberPicker numberPicker(@NotNull Activity activity, @NotNull Function1<? super NumberPicker, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getNUMBER_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        NumberPicker numberPicker = (NumberPicker) view;
        function1.invoke(numberPicker);
        AnkoInternals.INSTANCE.addView(activity, view);
        return numberPicker;
    }

    @NotNull
    public static /* synthetic */ NumberPicker themedNumberPicker$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getNUMBER_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        NumberPicker numberPicker = (NumberPicker) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return numberPicker;
    }

    @NotNull
    public static /* synthetic */ NumberPicker themedNumberPicker$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getNUMBER_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        NumberPicker numberPicker = (NumberPicker) view;
        function1.invoke(numberPicker);
        AnkoInternals.INSTANCE.addView(activity, view);
        return numberPicker;
    }

    @NotNull
    public static final NumberPicker themedNumberPicker(@NotNull Activity activity, int i, @NotNull Function1<? super NumberPicker, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getNUMBER_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        NumberPicker numberPicker = (NumberPicker) view;
        function1.invoke(numberPicker);
        AnkoInternals.INSTANCE.addView(activity, view);
        return numberPicker;
    }

    @NotNull
    public static final ProgressBar progressBar(@NotNull ViewManager viewManager, @NotNull Function1<? super ProgressBar, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 progress_bar = C$$Anko$Factories$Sdk27View.INSTANCE.getPROGRESS_BAR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) progress_bar.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ProgressBar progressBar = (ProgressBar) view;
        function1.invoke(progressBar);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return progressBar;
    }

    @NotNull
    public static /* synthetic */ ProgressBar themedProgressBar$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 progress_bar = C$$Anko$Factories$Sdk27View.INSTANCE.getPROGRESS_BAR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) progress_bar.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ProgressBar progressBar = (ProgressBar) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return progressBar;
    }

    @NotNull
    public static /* synthetic */ ProgressBar themedProgressBar$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 progress_bar = C$$Anko$Factories$Sdk27View.INSTANCE.getPROGRESS_BAR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) progress_bar.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ProgressBar progressBar = (ProgressBar) view;
        function1.invoke(progressBar);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return progressBar;
    }

    @NotNull
    public static final ProgressBar themedProgressBar(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super ProgressBar, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 progress_bar = C$$Anko$Factories$Sdk27View.INSTANCE.getPROGRESS_BAR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) progress_bar.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ProgressBar progressBar = (ProgressBar) view;
        function1.invoke(progressBar);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return progressBar;
    }

    @NotNull
    public static final QuickContactBadge quickContactBadge(@NotNull ViewManager viewManager, @NotNull Function1<? super QuickContactBadge, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 quick_contact_badge = C$$Anko$Factories$Sdk27View.INSTANCE.getQUICK_CONTACT_BADGE();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) quick_contact_badge.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        QuickContactBadge quickContactBadge = (QuickContactBadge) view;
        function1.invoke(quickContactBadge);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return quickContactBadge;
    }

    @NotNull
    public static /* synthetic */ QuickContactBadge themedQuickContactBadge$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 quick_contact_badge = C$$Anko$Factories$Sdk27View.INSTANCE.getQUICK_CONTACT_BADGE();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) quick_contact_badge.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        QuickContactBadge quickContactBadge = (QuickContactBadge) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return quickContactBadge;
    }

    @NotNull
    public static /* synthetic */ QuickContactBadge themedQuickContactBadge$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 quick_contact_badge = C$$Anko$Factories$Sdk27View.INSTANCE.getQUICK_CONTACT_BADGE();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) quick_contact_badge.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        QuickContactBadge quickContactBadge = (QuickContactBadge) view;
        function1.invoke(quickContactBadge);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return quickContactBadge;
    }

    @NotNull
    public static final QuickContactBadge themedQuickContactBadge(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super QuickContactBadge, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 quick_contact_badge = C$$Anko$Factories$Sdk27View.INSTANCE.getQUICK_CONTACT_BADGE();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) quick_contact_badge.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        QuickContactBadge quickContactBadge = (QuickContactBadge) view;
        function1.invoke(quickContactBadge);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return quickContactBadge;
    }

    @NotNull
    public static final RadioButton radioButton(@NotNull ViewManager viewManager, @NotNull Function1<? super RadioButton, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 radio_button = C$$Anko$Factories$Sdk27View.INSTANCE.getRADIO_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) radio_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        RadioButton radioButton = (RadioButton) view;
        function1.invoke(radioButton);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return radioButton;
    }

    @NotNull
    public static /* synthetic */ RadioButton themedRadioButton$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 radio_button = C$$Anko$Factories$Sdk27View.INSTANCE.getRADIO_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) radio_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        RadioButton radioButton = (RadioButton) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return radioButton;
    }

    @NotNull
    public static /* synthetic */ RadioButton themedRadioButton$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 radio_button = C$$Anko$Factories$Sdk27View.INSTANCE.getRADIO_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) radio_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        RadioButton radioButton = (RadioButton) view;
        function1.invoke(radioButton);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return radioButton;
    }

    @NotNull
    public static final RadioButton themedRadioButton(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super RadioButton, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 radio_button = C$$Anko$Factories$Sdk27View.INSTANCE.getRADIO_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) radio_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        RadioButton radioButton = (RadioButton) view;
        function1.invoke(radioButton);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return radioButton;
    }

    @NotNull
    public static final RatingBar ratingBar(@NotNull ViewManager viewManager, @NotNull Function1<? super RatingBar, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 rating_bar = C$$Anko$Factories$Sdk27View.INSTANCE.getRATING_BAR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) rating_bar.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        RatingBar ratingBar = (RatingBar) view;
        function1.invoke(ratingBar);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return ratingBar;
    }

    @NotNull
    public static /* synthetic */ RatingBar themedRatingBar$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 rating_bar = C$$Anko$Factories$Sdk27View.INSTANCE.getRATING_BAR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) rating_bar.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        RatingBar ratingBar = (RatingBar) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return ratingBar;
    }

    @NotNull
    public static /* synthetic */ RatingBar themedRatingBar$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 rating_bar = C$$Anko$Factories$Sdk27View.INSTANCE.getRATING_BAR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) rating_bar.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        RatingBar ratingBar = (RatingBar) view;
        function1.invoke(ratingBar);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return ratingBar;
    }

    @NotNull
    public static final RatingBar themedRatingBar(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super RatingBar, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 rating_bar = C$$Anko$Factories$Sdk27View.INSTANCE.getRATING_BAR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) rating_bar.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        RatingBar ratingBar = (RatingBar) view;
        function1.invoke(ratingBar);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return ratingBar;
    }

    @NotNull
    public static final SearchView searchView(@NotNull ViewManager viewManager, @NotNull Function1<? super SearchView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 search_view = C$$Anko$Factories$Sdk27View.INSTANCE.getSEARCH_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) search_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        SearchView searchView = (SearchView) view;
        function1.invoke(searchView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return searchView;
    }

    @NotNull
    public static /* synthetic */ SearchView themedSearchView$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 search_view = C$$Anko$Factories$Sdk27View.INSTANCE.getSEARCH_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) search_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        SearchView searchView = (SearchView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return searchView;
    }

    @NotNull
    public static /* synthetic */ SearchView themedSearchView$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 search_view = C$$Anko$Factories$Sdk27View.INSTANCE.getSEARCH_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) search_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        SearchView searchView = (SearchView) view;
        function1.invoke(searchView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return searchView;
    }

    @NotNull
    public static final SearchView themedSearchView(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super SearchView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 search_view = C$$Anko$Factories$Sdk27View.INSTANCE.getSEARCH_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) search_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        SearchView searchView = (SearchView) view;
        function1.invoke(searchView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return searchView;
    }

    @NotNull
    public static final SearchView searchView(@NotNull Context context, @NotNull Function1<? super SearchView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSEARCH_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        SearchView searchView = (SearchView) view;
        function1.invoke(searchView);
        AnkoInternals.INSTANCE.addView(context, view);
        return searchView;
    }

    @NotNull
    public static /* synthetic */ SearchView themedSearchView$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSEARCH_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        SearchView searchView = (SearchView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return searchView;
    }

    @NotNull
    public static /* synthetic */ SearchView themedSearchView$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSEARCH_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        SearchView searchView = (SearchView) view;
        function1.invoke(searchView);
        AnkoInternals.INSTANCE.addView(context, view);
        return searchView;
    }

    @NotNull
    public static final SearchView themedSearchView(@NotNull Context context, int i, @NotNull Function1<? super SearchView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSEARCH_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        SearchView searchView = (SearchView) view;
        function1.invoke(searchView);
        AnkoInternals.INSTANCE.addView(context, view);
        return searchView;
    }

    @NotNull
    public static final SearchView searchView(@NotNull Activity activity, @NotNull Function1<? super SearchView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSEARCH_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        SearchView searchView = (SearchView) view;
        function1.invoke(searchView);
        AnkoInternals.INSTANCE.addView(activity, view);
        return searchView;
    }

    @NotNull
    public static /* synthetic */ SearchView themedSearchView$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSEARCH_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        SearchView searchView = (SearchView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return searchView;
    }

    @NotNull
    public static /* synthetic */ SearchView themedSearchView$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSEARCH_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        SearchView searchView = (SearchView) view;
        function1.invoke(searchView);
        AnkoInternals.INSTANCE.addView(activity, view);
        return searchView;
    }

    @NotNull
    public static final SearchView themedSearchView(@NotNull Activity activity, int i, @NotNull Function1<? super SearchView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSEARCH_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        SearchView searchView = (SearchView) view;
        function1.invoke(searchView);
        AnkoInternals.INSTANCE.addView(activity, view);
        return searchView;
    }

    @NotNull
    public static final SeekBar seekBar(@NotNull ViewManager viewManager, @NotNull Function1<? super SeekBar, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 seek_bar = C$$Anko$Factories$Sdk27View.INSTANCE.getSEEK_BAR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) seek_bar.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        SeekBar seekBar = (SeekBar) view;
        function1.invoke(seekBar);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return seekBar;
    }

    @NotNull
    public static /* synthetic */ SeekBar themedSeekBar$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 seek_bar = C$$Anko$Factories$Sdk27View.INSTANCE.getSEEK_BAR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) seek_bar.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        SeekBar seekBar = (SeekBar) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return seekBar;
    }

    @NotNull
    public static /* synthetic */ SeekBar themedSeekBar$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 seek_bar = C$$Anko$Factories$Sdk27View.INSTANCE.getSEEK_BAR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) seek_bar.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        SeekBar seekBar = (SeekBar) view;
        function1.invoke(seekBar);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return seekBar;
    }

    @NotNull
    public static final SeekBar themedSeekBar(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super SeekBar, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 seek_bar = C$$Anko$Factories$Sdk27View.INSTANCE.getSEEK_BAR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) seek_bar.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        SeekBar seekBar = (SeekBar) view;
        function1.invoke(seekBar);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return seekBar;
    }

    @NotNull
    public static final SlidingDrawer slidingDrawer(@NotNull ViewManager viewManager, @NotNull Function1<? super SlidingDrawer, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 sliding_drawer = C$$Anko$Factories$Sdk27View.INSTANCE.getSLIDING_DRAWER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) sliding_drawer.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        SlidingDrawer slidingDrawer = (SlidingDrawer) view;
        function1.invoke(slidingDrawer);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return slidingDrawer;
    }

    @NotNull
    public static /* synthetic */ SlidingDrawer themedSlidingDrawer$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 sliding_drawer = C$$Anko$Factories$Sdk27View.INSTANCE.getSLIDING_DRAWER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) sliding_drawer.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        SlidingDrawer slidingDrawer = (SlidingDrawer) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return slidingDrawer;
    }

    @NotNull
    public static /* synthetic */ SlidingDrawer themedSlidingDrawer$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 sliding_drawer = C$$Anko$Factories$Sdk27View.INSTANCE.getSLIDING_DRAWER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) sliding_drawer.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        SlidingDrawer slidingDrawer = (SlidingDrawer) view;
        function1.invoke(slidingDrawer);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return slidingDrawer;
    }

    @NotNull
    public static final SlidingDrawer themedSlidingDrawer(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super SlidingDrawer, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 sliding_drawer = C$$Anko$Factories$Sdk27View.INSTANCE.getSLIDING_DRAWER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) sliding_drawer.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        SlidingDrawer slidingDrawer = (SlidingDrawer) view;
        function1.invoke(slidingDrawer);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return slidingDrawer;
    }

    @NotNull
    public static final SlidingDrawer slidingDrawer(@NotNull Context context, @NotNull Function1<? super SlidingDrawer, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSLIDING_DRAWER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        SlidingDrawer slidingDrawer = (SlidingDrawer) view;
        function1.invoke(slidingDrawer);
        AnkoInternals.INSTANCE.addView(context, view);
        return slidingDrawer;
    }

    @NotNull
    public static /* synthetic */ SlidingDrawer themedSlidingDrawer$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSLIDING_DRAWER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        SlidingDrawer slidingDrawer = (SlidingDrawer) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return slidingDrawer;
    }

    @NotNull
    public static /* synthetic */ SlidingDrawer themedSlidingDrawer$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSLIDING_DRAWER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        SlidingDrawer slidingDrawer = (SlidingDrawer) view;
        function1.invoke(slidingDrawer);
        AnkoInternals.INSTANCE.addView(context, view);
        return slidingDrawer;
    }

    @NotNull
    public static final SlidingDrawer themedSlidingDrawer(@NotNull Context context, int i, @NotNull Function1<? super SlidingDrawer, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSLIDING_DRAWER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        SlidingDrawer slidingDrawer = (SlidingDrawer) view;
        function1.invoke(slidingDrawer);
        AnkoInternals.INSTANCE.addView(context, view);
        return slidingDrawer;
    }

    @NotNull
    public static final SlidingDrawer slidingDrawer(@NotNull Activity activity, @NotNull Function1<? super SlidingDrawer, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSLIDING_DRAWER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        SlidingDrawer slidingDrawer = (SlidingDrawer) view;
        function1.invoke(slidingDrawer);
        AnkoInternals.INSTANCE.addView(activity, view);
        return slidingDrawer;
    }

    @NotNull
    public static /* synthetic */ SlidingDrawer themedSlidingDrawer$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSLIDING_DRAWER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        SlidingDrawer slidingDrawer = (SlidingDrawer) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return slidingDrawer;
    }

    @NotNull
    public static /* synthetic */ SlidingDrawer themedSlidingDrawer$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSLIDING_DRAWER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        SlidingDrawer slidingDrawer = (SlidingDrawer) view;
        function1.invoke(slidingDrawer);
        AnkoInternals.INSTANCE.addView(activity, view);
        return slidingDrawer;
    }

    @NotNull
    public static final SlidingDrawer themedSlidingDrawer(@NotNull Activity activity, int i, @NotNull Function1<? super SlidingDrawer, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSLIDING_DRAWER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        SlidingDrawer slidingDrawer = (SlidingDrawer) view;
        function1.invoke(slidingDrawer);
        AnkoInternals.INSTANCE.addView(activity, view);
        return slidingDrawer;
    }

    @NotNull
    public static final Space space(@NotNull ViewManager viewManager, @NotNull Function1<? super Space, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 space = C$$Anko$Factories$Sdk27View.INSTANCE.getSPACE();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) space.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        Space space2 = (Space) view;
        function1.invoke(space2);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return space2;
    }

    @NotNull
    public static /* synthetic */ Space themedSpace$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 space = C$$Anko$Factories$Sdk27View.INSTANCE.getSPACE();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) space.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        Space space2 = (Space) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return space2;
    }

    @NotNull
    public static /* synthetic */ Space themedSpace$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 space = C$$Anko$Factories$Sdk27View.INSTANCE.getSPACE();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) space.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        Space space2 = (Space) view;
        function1.invoke(space2);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return space2;
    }

    @NotNull
    public static final Space themedSpace(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super Space, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 space = C$$Anko$Factories$Sdk27View.INSTANCE.getSPACE();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) space.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        Space space2 = (Space) view;
        function1.invoke(space2);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return space2;
    }

    @NotNull
    public static final Spinner spinner(@NotNull ViewManager viewManager, @NotNull Function1<? super Spinner, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 spinner = C$$Anko$Factories$Sdk27View.INSTANCE.getSPINNER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) spinner.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        Spinner spinner2 = (Spinner) view;
        function1.invoke(spinner2);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return spinner2;
    }

    @NotNull
    public static /* synthetic */ Spinner themedSpinner$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 spinner = C$$Anko$Factories$Sdk27View.INSTANCE.getSPINNER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) spinner.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        Spinner spinner2 = (Spinner) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return spinner2;
    }

    @NotNull
    public static /* synthetic */ Spinner themedSpinner$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 spinner = C$$Anko$Factories$Sdk27View.INSTANCE.getSPINNER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) spinner.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        Spinner spinner2 = (Spinner) view;
        function1.invoke(spinner2);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return spinner2;
    }

    @NotNull
    public static final Spinner themedSpinner(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super Spinner, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 spinner = C$$Anko$Factories$Sdk27View.INSTANCE.getSPINNER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) spinner.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        Spinner spinner2 = (Spinner) view;
        function1.invoke(spinner2);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return spinner2;
    }

    @NotNull
    public static final Spinner spinner(@NotNull Context context, @NotNull Function1<? super Spinner, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSPINNER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        Spinner spinner = (Spinner) view;
        function1.invoke(spinner);
        AnkoInternals.INSTANCE.addView(context, view);
        return spinner;
    }

    @NotNull
    public static /* synthetic */ Spinner themedSpinner$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSPINNER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        Spinner spinner = (Spinner) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return spinner;
    }

    @NotNull
    public static /* synthetic */ Spinner themedSpinner$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSPINNER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        Spinner spinner = (Spinner) view;
        function1.invoke(spinner);
        AnkoInternals.INSTANCE.addView(context, view);
        return spinner;
    }

    @NotNull
    public static final Spinner themedSpinner(@NotNull Context context, int i, @NotNull Function1<? super Spinner, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSPINNER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        Spinner spinner = (Spinner) view;
        function1.invoke(spinner);
        AnkoInternals.INSTANCE.addView(context, view);
        return spinner;
    }

    @NotNull
    public static final Spinner spinner(@NotNull Activity activity, @NotNull Function1<? super Spinner, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSPINNER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        Spinner spinner = (Spinner) view;
        function1.invoke(spinner);
        AnkoInternals.INSTANCE.addView(activity, view);
        return spinner;
    }

    @NotNull
    public static /* synthetic */ Spinner themedSpinner$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSPINNER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        Spinner spinner = (Spinner) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return spinner;
    }

    @NotNull
    public static /* synthetic */ Spinner themedSpinner$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSPINNER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        Spinner spinner = (Spinner) view;
        function1.invoke(spinner);
        AnkoInternals.INSTANCE.addView(activity, view);
        return spinner;
    }

    @NotNull
    public static final Spinner themedSpinner(@NotNull Activity activity, int i, @NotNull Function1<? super Spinner, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSPINNER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        Spinner spinner = (Spinner) view;
        function1.invoke(spinner);
        AnkoInternals.INSTANCE.addView(activity, view);
        return spinner;
    }

    @NotNull
    public static final StackView stackView(@NotNull ViewManager viewManager, @NotNull Function1<? super StackView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 stack_view = C$$Anko$Factories$Sdk27View.INSTANCE.getSTACK_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) stack_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        StackView stackView = (StackView) view;
        function1.invoke(stackView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return stackView;
    }

    @NotNull
    public static /* synthetic */ StackView themedStackView$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 stack_view = C$$Anko$Factories$Sdk27View.INSTANCE.getSTACK_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) stack_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        StackView stackView = (StackView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return stackView;
    }

    @NotNull
    public static /* synthetic */ StackView themedStackView$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 stack_view = C$$Anko$Factories$Sdk27View.INSTANCE.getSTACK_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) stack_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        StackView stackView = (StackView) view;
        function1.invoke(stackView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return stackView;
    }

    @NotNull
    public static final StackView themedStackView(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super StackView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 stack_view = C$$Anko$Factories$Sdk27View.INSTANCE.getSTACK_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) stack_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        StackView stackView = (StackView) view;
        function1.invoke(stackView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return stackView;
    }

    @NotNull
    public static final StackView stackView(@NotNull Context context, @NotNull Function1<? super StackView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSTACK_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        StackView stackView = (StackView) view;
        function1.invoke(stackView);
        AnkoInternals.INSTANCE.addView(context, view);
        return stackView;
    }

    @NotNull
    public static /* synthetic */ StackView themedStackView$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSTACK_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        StackView stackView = (StackView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return stackView;
    }

    @NotNull
    public static /* synthetic */ StackView themedStackView$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSTACK_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        StackView stackView = (StackView) view;
        function1.invoke(stackView);
        AnkoInternals.INSTANCE.addView(context, view);
        return stackView;
    }

    @NotNull
    public static final StackView themedStackView(@NotNull Context context, int i, @NotNull Function1<? super StackView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSTACK_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        StackView stackView = (StackView) view;
        function1.invoke(stackView);
        AnkoInternals.INSTANCE.addView(context, view);
        return stackView;
    }

    @NotNull
    public static final StackView stackView(@NotNull Activity activity, @NotNull Function1<? super StackView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSTACK_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        StackView stackView = (StackView) view;
        function1.invoke(stackView);
        AnkoInternals.INSTANCE.addView(activity, view);
        return stackView;
    }

    @NotNull
    public static /* synthetic */ StackView themedStackView$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSTACK_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        StackView stackView = (StackView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return stackView;
    }

    @NotNull
    public static /* synthetic */ StackView themedStackView$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSTACK_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        StackView stackView = (StackView) view;
        function1.invoke(stackView);
        AnkoInternals.INSTANCE.addView(activity, view);
        return stackView;
    }

    @NotNull
    public static final StackView themedStackView(@NotNull Activity activity, int i, @NotNull Function1<? super StackView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSTACK_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        StackView stackView = (StackView) view;
        function1.invoke(stackView);
        AnkoInternals.INSTANCE.addView(activity, view);
        return stackView;
    }

    @NotNull
    /* renamed from: switch reason: not valid java name */
    public static final Switch m155switch(@NotNull ViewManager viewManager, @NotNull Function1<? super Switch, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 function12 = C$$Anko$Factories$Sdk27View.INSTANCE.getSWITCH();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) function12.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        Switch switchR = (Switch) view;
        function1.invoke(switchR);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return switchR;
    }

    @NotNull
    public static /* synthetic */ Switch themedSwitch$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 function1 = C$$Anko$Factories$Sdk27View.INSTANCE.getSWITCH();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) function1.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        Switch switchR = (Switch) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return switchR;
    }

    @NotNull
    public static /* synthetic */ Switch themedSwitch$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 function12 = C$$Anko$Factories$Sdk27View.INSTANCE.getSWITCH();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) function12.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        Switch switchR = (Switch) view;
        function1.invoke(switchR);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return switchR;
    }

    @NotNull
    public static final Switch themedSwitch(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super Switch, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 function12 = C$$Anko$Factories$Sdk27View.INSTANCE.getSWITCH();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) function12.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        Switch switchR = (Switch) view;
        function1.invoke(switchR);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return switchR;
    }

    @NotNull
    public static final TabHost tabHost(@NotNull ViewManager viewManager, @NotNull Function1<? super TabHost, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 tab_host = C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_HOST();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) tab_host.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        TabHost tabHost = (TabHost) view;
        function1.invoke(tabHost);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return tabHost;
    }

    @NotNull
    public static /* synthetic */ TabHost themedTabHost$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 tab_host = C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_HOST();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) tab_host.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TabHost tabHost = (TabHost) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return tabHost;
    }

    @NotNull
    public static /* synthetic */ TabHost themedTabHost$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 tab_host = C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_HOST();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) tab_host.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TabHost tabHost = (TabHost) view;
        function1.invoke(tabHost);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return tabHost;
    }

    @NotNull
    public static final TabHost themedTabHost(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super TabHost, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 tab_host = C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_HOST();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) tab_host.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TabHost tabHost = (TabHost) view;
        function1.invoke(tabHost);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return tabHost;
    }

    @NotNull
    public static final TabHost tabHost(@NotNull Context context, @NotNull Function1<? super TabHost, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_HOST().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        TabHost tabHost = (TabHost) view;
        function1.invoke(tabHost);
        AnkoInternals.INSTANCE.addView(context, view);
        return tabHost;
    }

    @NotNull
    public static /* synthetic */ TabHost themedTabHost$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_HOST().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        TabHost tabHost = (TabHost) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return tabHost;
    }

    @NotNull
    public static /* synthetic */ TabHost themedTabHost$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_HOST().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        TabHost tabHost = (TabHost) view;
        function1.invoke(tabHost);
        AnkoInternals.INSTANCE.addView(context, view);
        return tabHost;
    }

    @NotNull
    public static final TabHost themedTabHost(@NotNull Context context, int i, @NotNull Function1<? super TabHost, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_HOST().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        TabHost tabHost = (TabHost) view;
        function1.invoke(tabHost);
        AnkoInternals.INSTANCE.addView(context, view);
        return tabHost;
    }

    @NotNull
    public static final TabHost tabHost(@NotNull Activity activity, @NotNull Function1<? super TabHost, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_HOST().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        TabHost tabHost = (TabHost) view;
        function1.invoke(tabHost);
        AnkoInternals.INSTANCE.addView(activity, view);
        return tabHost;
    }

    @NotNull
    public static /* synthetic */ TabHost themedTabHost$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_HOST().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        TabHost tabHost = (TabHost) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return tabHost;
    }

    @NotNull
    public static /* synthetic */ TabHost themedTabHost$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_HOST().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        TabHost tabHost = (TabHost) view;
        function1.invoke(tabHost);
        AnkoInternals.INSTANCE.addView(activity, view);
        return tabHost;
    }

    @NotNull
    public static final TabHost themedTabHost(@NotNull Activity activity, int i, @NotNull Function1<? super TabHost, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_HOST().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        TabHost tabHost = (TabHost) view;
        function1.invoke(tabHost);
        AnkoInternals.INSTANCE.addView(activity, view);
        return tabHost;
    }

    @NotNull
    public static final TabWidget tabWidget(@NotNull ViewManager viewManager, @NotNull Function1<? super TabWidget, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 tab_widget = C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_WIDGET();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) tab_widget.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        TabWidget tabWidget = (TabWidget) view;
        function1.invoke(tabWidget);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return tabWidget;
    }

    @NotNull
    public static /* synthetic */ TabWidget themedTabWidget$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 tab_widget = C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_WIDGET();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) tab_widget.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TabWidget tabWidget = (TabWidget) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return tabWidget;
    }

    @NotNull
    public static /* synthetic */ TabWidget themedTabWidget$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 tab_widget = C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_WIDGET();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) tab_widget.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TabWidget tabWidget = (TabWidget) view;
        function1.invoke(tabWidget);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return tabWidget;
    }

    @NotNull
    public static final TabWidget themedTabWidget(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super TabWidget, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 tab_widget = C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_WIDGET();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) tab_widget.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TabWidget tabWidget = (TabWidget) view;
        function1.invoke(tabWidget);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return tabWidget;
    }

    @NotNull
    public static final TabWidget tabWidget(@NotNull Context context, @NotNull Function1<? super TabWidget, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_WIDGET().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        TabWidget tabWidget = (TabWidget) view;
        function1.invoke(tabWidget);
        AnkoInternals.INSTANCE.addView(context, view);
        return tabWidget;
    }

    @NotNull
    public static /* synthetic */ TabWidget themedTabWidget$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_WIDGET().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        TabWidget tabWidget = (TabWidget) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return tabWidget;
    }

    @NotNull
    public static /* synthetic */ TabWidget themedTabWidget$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_WIDGET().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        TabWidget tabWidget = (TabWidget) view;
        function1.invoke(tabWidget);
        AnkoInternals.INSTANCE.addView(context, view);
        return tabWidget;
    }

    @NotNull
    public static final TabWidget themedTabWidget(@NotNull Context context, int i, @NotNull Function1<? super TabWidget, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_WIDGET().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        TabWidget tabWidget = (TabWidget) view;
        function1.invoke(tabWidget);
        AnkoInternals.INSTANCE.addView(context, view);
        return tabWidget;
    }

    @NotNull
    public static final TabWidget tabWidget(@NotNull Activity activity, @NotNull Function1<? super TabWidget, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_WIDGET().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        TabWidget tabWidget = (TabWidget) view;
        function1.invoke(tabWidget);
        AnkoInternals.INSTANCE.addView(activity, view);
        return tabWidget;
    }

    @NotNull
    public static /* synthetic */ TabWidget themedTabWidget$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_WIDGET().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        TabWidget tabWidget = (TabWidget) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return tabWidget;
    }

    @NotNull
    public static /* synthetic */ TabWidget themedTabWidget$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_WIDGET().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        TabWidget tabWidget = (TabWidget) view;
        function1.invoke(tabWidget);
        AnkoInternals.INSTANCE.addView(activity, view);
        return tabWidget;
    }

    @NotNull
    public static final TabWidget themedTabWidget(@NotNull Activity activity, int i, @NotNull Function1<? super TabWidget, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_WIDGET().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        TabWidget tabWidget = (TabWidget) view;
        function1.invoke(tabWidget);
        AnkoInternals.INSTANCE.addView(activity, view);
        return tabWidget;
    }

    @NotNull
    public static final TextClock textClock(@NotNull ViewManager viewManager, @NotNull Function1<? super TextClock, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 text_clock = C$$Anko$Factories$Sdk27View.INSTANCE.getTEXT_CLOCK();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) text_clock.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        TextClock textClock = (TextClock) view;
        function1.invoke(textClock);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return textClock;
    }

    @NotNull
    public static /* synthetic */ TextClock themedTextClock$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 text_clock = C$$Anko$Factories$Sdk27View.INSTANCE.getTEXT_CLOCK();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) text_clock.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TextClock textClock = (TextClock) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return textClock;
    }

    @NotNull
    public static /* synthetic */ TextClock themedTextClock$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 text_clock = C$$Anko$Factories$Sdk27View.INSTANCE.getTEXT_CLOCK();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) text_clock.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TextClock textClock = (TextClock) view;
        function1.invoke(textClock);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return textClock;
    }

    @NotNull
    public static final TextClock themedTextClock(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super TextClock, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 text_clock = C$$Anko$Factories$Sdk27View.INSTANCE.getTEXT_CLOCK();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) text_clock.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TextClock textClock = (TextClock) view;
        function1.invoke(textClock);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return textClock;
    }

    @NotNull
    public static final TextView textView(@NotNull ViewManager viewManager, @NotNull Function1<? super TextView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getTEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        TextView textView = (TextView) view;
        function1.invoke(textView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return textView;
    }

    @NotNull
    public static /* synthetic */ TextView themedTextView$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getTEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TextView textView = (TextView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return textView;
    }

    @NotNull
    public static /* synthetic */ TextView themedTextView$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getTEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TextView textView = (TextView) view;
        function1.invoke(textView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return textView;
    }

    @NotNull
    public static final TextView themedTextView(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super TextView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getTEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TextView textView = (TextView) view;
        function1.invoke(textView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return textView;
    }

    @NotNull
    public static final TextView textView(@NotNull ViewManager viewManager, @Nullable CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getTEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        TextView textView = (TextView) view;
        textView.setText(charSequence);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return textView;
    }

    @NotNull
    public static final TextView textView(@NotNull ViewManager viewManager, @Nullable CharSequence charSequence, @NotNull Function1<? super TextView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getTEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        TextView textView = (TextView) view;
        function1.invoke(textView);
        textView.setText(charSequence);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return textView;
    }

    @NotNull
    public static final TextView themedTextView(@NotNull ViewManager viewManager, @Nullable CharSequence charSequence, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getTEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TextView textView = (TextView) view;
        textView.setText(charSequence);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return textView;
    }

    @NotNull
    public static final TextView themedTextView(@NotNull ViewManager viewManager, @Nullable CharSequence charSequence, int i, @NotNull Function1<? super TextView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getTEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TextView textView = (TextView) view;
        function1.invoke(textView);
        textView.setText(charSequence);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return textView;
    }

    @NotNull
    public static final TextView textView(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getTEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        TextView textView = (TextView) view;
        textView.setText(i);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return textView;
    }

    @NotNull
    public static final TextView textView(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super TextView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getTEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        TextView textView = (TextView) view;
        function1.invoke(textView);
        textView.setText(i);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return textView;
    }

    @NotNull
    public static final TextView themedTextView(@NotNull ViewManager viewManager, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getTEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i2));
        TextView textView = (TextView) view;
        textView.setText(i);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return textView;
    }

    @NotNull
    public static final TextView themedTextView(@NotNull ViewManager viewManager, int i, int i2, @NotNull Function1<? super TextView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getTEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i2));
        TextView textView = (TextView) view;
        function1.invoke(textView);
        textView.setText(i);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return textView;
    }

    @NotNull
    public static final TimePicker timePicker(@NotNull ViewManager viewManager, @NotNull Function1<? super TimePicker, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 time_picker = C$$Anko$Factories$Sdk27View.INSTANCE.getTIME_PICKER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) time_picker.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        TimePicker timePicker = (TimePicker) view;
        function1.invoke(timePicker);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return timePicker;
    }

    @NotNull
    public static /* synthetic */ TimePicker themedTimePicker$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 time_picker = C$$Anko$Factories$Sdk27View.INSTANCE.getTIME_PICKER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) time_picker.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TimePicker timePicker = (TimePicker) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return timePicker;
    }

    @NotNull
    public static /* synthetic */ TimePicker themedTimePicker$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 time_picker = C$$Anko$Factories$Sdk27View.INSTANCE.getTIME_PICKER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) time_picker.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TimePicker timePicker = (TimePicker) view;
        function1.invoke(timePicker);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return timePicker;
    }

    @NotNull
    public static final TimePicker themedTimePicker(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super TimePicker, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 time_picker = C$$Anko$Factories$Sdk27View.INSTANCE.getTIME_PICKER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) time_picker.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TimePicker timePicker = (TimePicker) view;
        function1.invoke(timePicker);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return timePicker;
    }

    @NotNull
    public static final TimePicker timePicker(@NotNull Context context, @NotNull Function1<? super TimePicker, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTIME_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        TimePicker timePicker = (TimePicker) view;
        function1.invoke(timePicker);
        AnkoInternals.INSTANCE.addView(context, view);
        return timePicker;
    }

    @NotNull
    public static /* synthetic */ TimePicker themedTimePicker$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTIME_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        TimePicker timePicker = (TimePicker) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return timePicker;
    }

    @NotNull
    public static /* synthetic */ TimePicker themedTimePicker$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTIME_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        TimePicker timePicker = (TimePicker) view;
        function1.invoke(timePicker);
        AnkoInternals.INSTANCE.addView(context, view);
        return timePicker;
    }

    @NotNull
    public static final TimePicker themedTimePicker(@NotNull Context context, int i, @NotNull Function1<? super TimePicker, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTIME_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        TimePicker timePicker = (TimePicker) view;
        function1.invoke(timePicker);
        AnkoInternals.INSTANCE.addView(context, view);
        return timePicker;
    }

    @NotNull
    public static final TimePicker timePicker(@NotNull Activity activity, @NotNull Function1<? super TimePicker, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTIME_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        TimePicker timePicker = (TimePicker) view;
        function1.invoke(timePicker);
        AnkoInternals.INSTANCE.addView(activity, view);
        return timePicker;
    }

    @NotNull
    public static /* synthetic */ TimePicker themedTimePicker$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTIME_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        TimePicker timePicker = (TimePicker) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return timePicker;
    }

    @NotNull
    public static /* synthetic */ TimePicker themedTimePicker$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTIME_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        TimePicker timePicker = (TimePicker) view;
        function1.invoke(timePicker);
        AnkoInternals.INSTANCE.addView(activity, view);
        return timePicker;
    }

    @NotNull
    public static final TimePicker themedTimePicker(@NotNull Activity activity, int i, @NotNull Function1<? super TimePicker, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTIME_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        TimePicker timePicker = (TimePicker) view;
        function1.invoke(timePicker);
        AnkoInternals.INSTANCE.addView(activity, view);
        return timePicker;
    }

    @NotNull
    public static final ToggleButton toggleButton(@NotNull ViewManager viewManager, @NotNull Function1<? super ToggleButton, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 toggle_button = C$$Anko$Factories$Sdk27View.INSTANCE.getTOGGLE_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) toggle_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ToggleButton toggleButton = (ToggleButton) view;
        function1.invoke(toggleButton);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return toggleButton;
    }

    @NotNull
    public static /* synthetic */ ToggleButton themedToggleButton$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 toggle_button = C$$Anko$Factories$Sdk27View.INSTANCE.getTOGGLE_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) toggle_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ToggleButton toggleButton = (ToggleButton) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return toggleButton;
    }

    @NotNull
    public static /* synthetic */ ToggleButton themedToggleButton$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 toggle_button = C$$Anko$Factories$Sdk27View.INSTANCE.getTOGGLE_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) toggle_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ToggleButton toggleButton = (ToggleButton) view;
        function1.invoke(toggleButton);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return toggleButton;
    }

    @NotNull
    public static final ToggleButton themedToggleButton(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super ToggleButton, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 toggle_button = C$$Anko$Factories$Sdk27View.INSTANCE.getTOGGLE_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) toggle_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ToggleButton toggleButton = (ToggleButton) view;
        function1.invoke(toggleButton);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return toggleButton;
    }

    @NotNull
    public static final TwoLineListItem twoLineListItem(@NotNull ViewManager viewManager, @NotNull Function1<? super TwoLineListItem, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 two_line_list_item = C$$Anko$Factories$Sdk27View.INSTANCE.getTWO_LINE_LIST_ITEM();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) two_line_list_item.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        TwoLineListItem twoLineListItem = (TwoLineListItem) view;
        function1.invoke(twoLineListItem);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return twoLineListItem;
    }

    @NotNull
    public static /* synthetic */ TwoLineListItem themedTwoLineListItem$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 two_line_list_item = C$$Anko$Factories$Sdk27View.INSTANCE.getTWO_LINE_LIST_ITEM();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) two_line_list_item.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TwoLineListItem twoLineListItem = (TwoLineListItem) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return twoLineListItem;
    }

    @NotNull
    public static /* synthetic */ TwoLineListItem themedTwoLineListItem$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 two_line_list_item = C$$Anko$Factories$Sdk27View.INSTANCE.getTWO_LINE_LIST_ITEM();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) two_line_list_item.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TwoLineListItem twoLineListItem = (TwoLineListItem) view;
        function1.invoke(twoLineListItem);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return twoLineListItem;
    }

    @NotNull
    public static final TwoLineListItem themedTwoLineListItem(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super TwoLineListItem, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 two_line_list_item = C$$Anko$Factories$Sdk27View.INSTANCE.getTWO_LINE_LIST_ITEM();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) two_line_list_item.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TwoLineListItem twoLineListItem = (TwoLineListItem) view;
        function1.invoke(twoLineListItem);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return twoLineListItem;
    }

    @NotNull
    public static final TwoLineListItem twoLineListItem(@NotNull Context context, @NotNull Function1<? super TwoLineListItem, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTWO_LINE_LIST_ITEM().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        TwoLineListItem twoLineListItem = (TwoLineListItem) view;
        function1.invoke(twoLineListItem);
        AnkoInternals.INSTANCE.addView(context, view);
        return twoLineListItem;
    }

    @NotNull
    public static /* synthetic */ TwoLineListItem themedTwoLineListItem$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTWO_LINE_LIST_ITEM().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        TwoLineListItem twoLineListItem = (TwoLineListItem) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return twoLineListItem;
    }

    @NotNull
    public static /* synthetic */ TwoLineListItem themedTwoLineListItem$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTWO_LINE_LIST_ITEM().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        TwoLineListItem twoLineListItem = (TwoLineListItem) view;
        function1.invoke(twoLineListItem);
        AnkoInternals.INSTANCE.addView(context, view);
        return twoLineListItem;
    }

    @NotNull
    public static final TwoLineListItem themedTwoLineListItem(@NotNull Context context, int i, @NotNull Function1<? super TwoLineListItem, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTWO_LINE_LIST_ITEM().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        TwoLineListItem twoLineListItem = (TwoLineListItem) view;
        function1.invoke(twoLineListItem);
        AnkoInternals.INSTANCE.addView(context, view);
        return twoLineListItem;
    }

    @NotNull
    public static final TwoLineListItem twoLineListItem(@NotNull Activity activity, @NotNull Function1<? super TwoLineListItem, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTWO_LINE_LIST_ITEM().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        TwoLineListItem twoLineListItem = (TwoLineListItem) view;
        function1.invoke(twoLineListItem);
        AnkoInternals.INSTANCE.addView(activity, view);
        return twoLineListItem;
    }

    @NotNull
    public static /* synthetic */ TwoLineListItem themedTwoLineListItem$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTWO_LINE_LIST_ITEM().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        TwoLineListItem twoLineListItem = (TwoLineListItem) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return twoLineListItem;
    }

    @NotNull
    public static /* synthetic */ TwoLineListItem themedTwoLineListItem$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTWO_LINE_LIST_ITEM().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        TwoLineListItem twoLineListItem = (TwoLineListItem) view;
        function1.invoke(twoLineListItem);
        AnkoInternals.INSTANCE.addView(activity, view);
        return twoLineListItem;
    }

    @NotNull
    public static final TwoLineListItem themedTwoLineListItem(@NotNull Activity activity, int i, @NotNull Function1<? super TwoLineListItem, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTWO_LINE_LIST_ITEM().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        TwoLineListItem twoLineListItem = (TwoLineListItem) view;
        function1.invoke(twoLineListItem);
        AnkoInternals.INSTANCE.addView(activity, view);
        return twoLineListItem;
    }

    @NotNull
    public static final VideoView videoView(@NotNull ViewManager viewManager, @NotNull Function1<? super VideoView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 video_view = C$$Anko$Factories$Sdk27View.INSTANCE.getVIDEO_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) video_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        VideoView videoView = (VideoView) view;
        function1.invoke(videoView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return videoView;
    }

    @NotNull
    public static /* synthetic */ VideoView themedVideoView$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 video_view = C$$Anko$Factories$Sdk27View.INSTANCE.getVIDEO_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) video_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        VideoView videoView = (VideoView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return videoView;
    }

    @NotNull
    public static /* synthetic */ VideoView themedVideoView$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 video_view = C$$Anko$Factories$Sdk27View.INSTANCE.getVIDEO_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) video_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        VideoView videoView = (VideoView) view;
        function1.invoke(videoView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return videoView;
    }

    @NotNull
    public static final VideoView themedVideoView(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super VideoView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 video_view = C$$Anko$Factories$Sdk27View.INSTANCE.getVIDEO_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) video_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        VideoView videoView = (VideoView) view;
        function1.invoke(videoView);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return videoView;
    }

    @NotNull
    public static final ViewFlipper viewFlipper(@NotNull ViewManager viewManager, @NotNull Function1<? super ViewFlipper, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 view_flipper = C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW_FLIPPER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) view_flipper.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ViewFlipper viewFlipper = (ViewFlipper) view;
        function1.invoke(viewFlipper);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return viewFlipper;
    }

    @NotNull
    public static /* synthetic */ ViewFlipper themedViewFlipper$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 view_flipper = C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW_FLIPPER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) view_flipper.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ViewFlipper viewFlipper = (ViewFlipper) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return viewFlipper;
    }

    @NotNull
    public static /* synthetic */ ViewFlipper themedViewFlipper$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 view_flipper = C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW_FLIPPER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) view_flipper.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ViewFlipper viewFlipper = (ViewFlipper) view;
        function1.invoke(viewFlipper);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return viewFlipper;
    }

    @NotNull
    public static final ViewFlipper themedViewFlipper(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super ViewFlipper, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 view_flipper = C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW_FLIPPER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) view_flipper.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ViewFlipper viewFlipper = (ViewFlipper) view;
        function1.invoke(viewFlipper);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return viewFlipper;
    }

    @NotNull
    public static final ViewFlipper viewFlipper(@NotNull Context context, @NotNull Function1<? super ViewFlipper, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW_FLIPPER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        ViewFlipper viewFlipper = (ViewFlipper) view;
        function1.invoke(viewFlipper);
        AnkoInternals.INSTANCE.addView(context, view);
        return viewFlipper;
    }

    @NotNull
    public static /* synthetic */ ViewFlipper themedViewFlipper$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW_FLIPPER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        ViewFlipper viewFlipper = (ViewFlipper) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return viewFlipper;
    }

    @NotNull
    public static /* synthetic */ ViewFlipper themedViewFlipper$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW_FLIPPER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        ViewFlipper viewFlipper = (ViewFlipper) view;
        function1.invoke(viewFlipper);
        AnkoInternals.INSTANCE.addView(context, view);
        return viewFlipper;
    }

    @NotNull
    public static final ViewFlipper themedViewFlipper(@NotNull Context context, int i, @NotNull Function1<? super ViewFlipper, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW_FLIPPER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        ViewFlipper viewFlipper = (ViewFlipper) view;
        function1.invoke(viewFlipper);
        AnkoInternals.INSTANCE.addView(context, view);
        return viewFlipper;
    }

    @NotNull
    public static final ViewFlipper viewFlipper(@NotNull Activity activity, @NotNull Function1<? super ViewFlipper, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW_FLIPPER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        ViewFlipper viewFlipper = (ViewFlipper) view;
        function1.invoke(viewFlipper);
        AnkoInternals.INSTANCE.addView(activity, view);
        return viewFlipper;
    }

    @NotNull
    public static /* synthetic */ ViewFlipper themedViewFlipper$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW_FLIPPER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        ViewFlipper viewFlipper = (ViewFlipper) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return viewFlipper;
    }

    @NotNull
    public static /* synthetic */ ViewFlipper themedViewFlipper$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW_FLIPPER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        ViewFlipper viewFlipper = (ViewFlipper) view;
        function1.invoke(viewFlipper);
        AnkoInternals.INSTANCE.addView(activity, view);
        return viewFlipper;
    }

    @NotNull
    public static final ViewFlipper themedViewFlipper(@NotNull Activity activity, int i, @NotNull Function1<? super ViewFlipper, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW_FLIPPER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        ViewFlipper viewFlipper = (ViewFlipper) view;
        function1.invoke(viewFlipper);
        AnkoInternals.INSTANCE.addView(activity, view);
        return viewFlipper;
    }

    @NotNull
    public static final ZoomButton zoomButton(@NotNull ViewManager viewManager, @NotNull Function1<? super ZoomButton, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 zoom_button = C$$Anko$Factories$Sdk27View.INSTANCE.getZOOM_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) zoom_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ZoomButton zoomButton = (ZoomButton) view;
        function1.invoke(zoomButton);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return zoomButton;
    }

    @NotNull
    public static /* synthetic */ ZoomButton themedZoomButton$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 zoom_button = C$$Anko$Factories$Sdk27View.INSTANCE.getZOOM_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) zoom_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ZoomButton zoomButton = (ZoomButton) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return zoomButton;
    }

    @NotNull
    public static /* synthetic */ ZoomButton themedZoomButton$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 zoom_button = C$$Anko$Factories$Sdk27View.INSTANCE.getZOOM_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) zoom_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ZoomButton zoomButton = (ZoomButton) view;
        function1.invoke(zoomButton);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return zoomButton;
    }

    @NotNull
    public static final ZoomButton themedZoomButton(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super ZoomButton, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 zoom_button = C$$Anko$Factories$Sdk27View.INSTANCE.getZOOM_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) zoom_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ZoomButton zoomButton = (ZoomButton) view;
        function1.invoke(zoomButton);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return zoomButton;
    }

    @NotNull
    public static final ZoomControls zoomControls(@NotNull ViewManager viewManager, @NotNull Function1<? super ZoomControls, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 zoom_controls = C$$Anko$Factories$Sdk27View.INSTANCE.getZOOM_CONTROLS();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) zoom_controls.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ZoomControls zoomControls = (ZoomControls) view;
        function1.invoke(zoomControls);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return zoomControls;
    }

    @NotNull
    public static /* synthetic */ ZoomControls themedZoomControls$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 zoom_controls = C$$Anko$Factories$Sdk27View.INSTANCE.getZOOM_CONTROLS();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) zoom_controls.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ZoomControls zoomControls = (ZoomControls) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return zoomControls;
    }

    @NotNull
    public static /* synthetic */ ZoomControls themedZoomControls$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 zoom_controls = C$$Anko$Factories$Sdk27View.INSTANCE.getZOOM_CONTROLS();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) zoom_controls.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ZoomControls zoomControls = (ZoomControls) view;
        function1.invoke(zoomControls);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return zoomControls;
    }

    @NotNull
    public static final ZoomControls themedZoomControls(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super ZoomControls, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 zoom_controls = C$$Anko$Factories$Sdk27View.INSTANCE.getZOOM_CONTROLS();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) zoom_controls.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ZoomControls zoomControls = (ZoomControls) view;
        function1.invoke(zoomControls);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return zoomControls;
    }

    @NotNull
    public static final ZoomControls zoomControls(@NotNull Context context, @NotNull Function1<? super ZoomControls, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getZOOM_CONTROLS().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        ZoomControls zoomControls = (ZoomControls) view;
        function1.invoke(zoomControls);
        AnkoInternals.INSTANCE.addView(context, view);
        return zoomControls;
    }

    @NotNull
    public static /* synthetic */ ZoomControls themedZoomControls$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getZOOM_CONTROLS().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        ZoomControls zoomControls = (ZoomControls) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return zoomControls;
    }

    @NotNull
    public static /* synthetic */ ZoomControls themedZoomControls$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getZOOM_CONTROLS().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        ZoomControls zoomControls = (ZoomControls) view;
        function1.invoke(zoomControls);
        AnkoInternals.INSTANCE.addView(context, view);
        return zoomControls;
    }

    @NotNull
    public static final ZoomControls themedZoomControls(@NotNull Context context, int i, @NotNull Function1<? super ZoomControls, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getZOOM_CONTROLS().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        ZoomControls zoomControls = (ZoomControls) view;
        function1.invoke(zoomControls);
        AnkoInternals.INSTANCE.addView(context, view);
        return zoomControls;
    }

    @NotNull
    public static final ZoomControls zoomControls(@NotNull Activity activity, @NotNull Function1<? super ZoomControls, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getZOOM_CONTROLS().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        ZoomControls zoomControls = (ZoomControls) view;
        function1.invoke(zoomControls);
        AnkoInternals.INSTANCE.addView(activity, view);
        return zoomControls;
    }

    @NotNull
    public static /* synthetic */ ZoomControls themedZoomControls$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getZOOM_CONTROLS().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        ZoomControls zoomControls = (ZoomControls) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return zoomControls;
    }

    @NotNull
    public static /* synthetic */ ZoomControls themedZoomControls$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getZOOM_CONTROLS().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        ZoomControls zoomControls = (ZoomControls) view;
        function1.invoke(zoomControls);
        AnkoInternals.INSTANCE.addView(activity, view);
        return zoomControls;
    }

    @NotNull
    public static final ZoomControls themedZoomControls(@NotNull Activity activity, int i, @NotNull Function1<? super ZoomControls, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getZOOM_CONTROLS().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        ZoomControls zoomControls = (ZoomControls) view;
        function1.invoke(zoomControls);
        AnkoInternals.INSTANCE.addView(activity, view);
        return zoomControls;
    }

    @NotNull
    public static final AppWidgetHostView appWidgetHostView(@NotNull ViewManager viewManager, @NotNull Function1<? super _AppWidgetHostView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 app_widget_host_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getAPP_WIDGET_HOST_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) app_widget_host_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        function1.invoke((_AppWidgetHostView) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (AppWidgetHostView) view;
    }

    @NotNull
    public static /* synthetic */ AppWidgetHostView themedAppWidgetHostView$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 app_widget_host_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getAPP_WIDGET_HOST_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) app_widget_host_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _AppWidgetHostView _appwidgethostview = (_AppWidgetHostView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (AppWidgetHostView) view;
    }

    @NotNull
    public static /* synthetic */ AppWidgetHostView themedAppWidgetHostView$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 app_widget_host_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getAPP_WIDGET_HOST_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) app_widget_host_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_AppWidgetHostView) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (AppWidgetHostView) view;
    }

    @NotNull
    public static final AppWidgetHostView themedAppWidgetHostView(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super _AppWidgetHostView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 app_widget_host_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getAPP_WIDGET_HOST_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) app_widget_host_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_AppWidgetHostView) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (AppWidgetHostView) view;
    }

    @NotNull
    public static final AppWidgetHostView appWidgetHostView(@NotNull Context context, @NotNull Function1<? super _AppWidgetHostView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getAPP_WIDGET_HOST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        function1.invoke((_AppWidgetHostView) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (AppWidgetHostView) view;
    }

    @NotNull
    public static /* synthetic */ AppWidgetHostView themedAppWidgetHostView$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getAPP_WIDGET_HOST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _AppWidgetHostView _appwidgethostview = (_AppWidgetHostView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (AppWidgetHostView) view;
    }

    @NotNull
    public static /* synthetic */ AppWidgetHostView themedAppWidgetHostView$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getAPP_WIDGET_HOST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_AppWidgetHostView) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (AppWidgetHostView) view;
    }

    @NotNull
    public static final AppWidgetHostView themedAppWidgetHostView(@NotNull Context context, int i, @NotNull Function1<? super _AppWidgetHostView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getAPP_WIDGET_HOST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_AppWidgetHostView) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (AppWidgetHostView) view;
    }

    @NotNull
    public static final AppWidgetHostView appWidgetHostView(@NotNull Activity activity, @NotNull Function1<? super _AppWidgetHostView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getAPP_WIDGET_HOST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        function1.invoke((_AppWidgetHostView) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (AppWidgetHostView) view;
    }

    @NotNull
    public static /* synthetic */ AppWidgetHostView themedAppWidgetHostView$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getAPP_WIDGET_HOST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _AppWidgetHostView _appwidgethostview = (_AppWidgetHostView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (AppWidgetHostView) view;
    }

    @NotNull
    public static /* synthetic */ AppWidgetHostView themedAppWidgetHostView$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getAPP_WIDGET_HOST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_AppWidgetHostView) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (AppWidgetHostView) view;
    }

    @NotNull
    public static final AppWidgetHostView themedAppWidgetHostView(@NotNull Activity activity, int i, @NotNull Function1<? super _AppWidgetHostView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getAPP_WIDGET_HOST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_AppWidgetHostView) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (AppWidgetHostView) view;
    }

    @NotNull
    public static final AbsoluteLayout absoluteLayout(@NotNull ViewManager viewManager, @NotNull Function1<? super _AbsoluteLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 absolute_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getABSOLUTE_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) absolute_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        function1.invoke((_AbsoluteLayout) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (AbsoluteLayout) view;
    }

    @NotNull
    public static /* synthetic */ AbsoluteLayout themedAbsoluteLayout$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 absolute_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getABSOLUTE_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) absolute_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _AbsoluteLayout _absolutelayout = (_AbsoluteLayout) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (AbsoluteLayout) view;
    }

    @NotNull
    public static /* synthetic */ AbsoluteLayout themedAbsoluteLayout$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 absolute_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getABSOLUTE_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) absolute_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_AbsoluteLayout) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (AbsoluteLayout) view;
    }

    @NotNull
    public static final AbsoluteLayout themedAbsoluteLayout(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super _AbsoluteLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 absolute_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getABSOLUTE_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) absolute_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_AbsoluteLayout) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (AbsoluteLayout) view;
    }

    @NotNull
    public static final AbsoluteLayout absoluteLayout(@NotNull Context context, @NotNull Function1<? super _AbsoluteLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getABSOLUTE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        function1.invoke((_AbsoluteLayout) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (AbsoluteLayout) view;
    }

    @NotNull
    public static /* synthetic */ AbsoluteLayout themedAbsoluteLayout$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getABSOLUTE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _AbsoluteLayout _absolutelayout = (_AbsoluteLayout) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (AbsoluteLayout) view;
    }

    @NotNull
    public static /* synthetic */ AbsoluteLayout themedAbsoluteLayout$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getABSOLUTE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_AbsoluteLayout) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (AbsoluteLayout) view;
    }

    @NotNull
    public static final AbsoluteLayout themedAbsoluteLayout(@NotNull Context context, int i, @NotNull Function1<? super _AbsoluteLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getABSOLUTE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_AbsoluteLayout) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (AbsoluteLayout) view;
    }

    @NotNull
    public static final AbsoluteLayout absoluteLayout(@NotNull Activity activity, @NotNull Function1<? super _AbsoluteLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getABSOLUTE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        function1.invoke((_AbsoluteLayout) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (AbsoluteLayout) view;
    }

    @NotNull
    public static /* synthetic */ AbsoluteLayout themedAbsoluteLayout$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getABSOLUTE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _AbsoluteLayout _absolutelayout = (_AbsoluteLayout) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (AbsoluteLayout) view;
    }

    @NotNull
    public static /* synthetic */ AbsoluteLayout themedAbsoluteLayout$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getABSOLUTE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_AbsoluteLayout) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (AbsoluteLayout) view;
    }

    @NotNull
    public static final AbsoluteLayout themedAbsoluteLayout(@NotNull Activity activity, int i, @NotNull Function1<? super _AbsoluteLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getABSOLUTE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_AbsoluteLayout) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (AbsoluteLayout) view;
    }

    @NotNull
    public static final ActionMenuView actionMenuView(@NotNull ViewManager viewManager, @NotNull Function1<? super _ActionMenuView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 action_menu_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getACTION_MENU_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) action_menu_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        function1.invoke((_ActionMenuView) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ActionMenuView) view;
    }

    @NotNull
    public static /* synthetic */ ActionMenuView themedActionMenuView$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 action_menu_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getACTION_MENU_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) action_menu_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _ActionMenuView _actionmenuview = (_ActionMenuView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ActionMenuView) view;
    }

    @NotNull
    public static /* synthetic */ ActionMenuView themedActionMenuView$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 action_menu_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getACTION_MENU_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) action_menu_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_ActionMenuView) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ActionMenuView) view;
    }

    @NotNull
    public static final ActionMenuView themedActionMenuView(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super _ActionMenuView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 action_menu_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getACTION_MENU_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) action_menu_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_ActionMenuView) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ActionMenuView) view;
    }

    @NotNull
    public static final ActionMenuView actionMenuView(@NotNull Context context, @NotNull Function1<? super _ActionMenuView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getACTION_MENU_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        function1.invoke((_ActionMenuView) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (ActionMenuView) view;
    }

    @NotNull
    public static /* synthetic */ ActionMenuView themedActionMenuView$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getACTION_MENU_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _ActionMenuView _actionmenuview = (_ActionMenuView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (ActionMenuView) view;
    }

    @NotNull
    public static /* synthetic */ ActionMenuView themedActionMenuView$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getACTION_MENU_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_ActionMenuView) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (ActionMenuView) view;
    }

    @NotNull
    public static final ActionMenuView themedActionMenuView(@NotNull Context context, int i, @NotNull Function1<? super _ActionMenuView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getACTION_MENU_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_ActionMenuView) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (ActionMenuView) view;
    }

    @NotNull
    public static final ActionMenuView actionMenuView(@NotNull Activity activity, @NotNull Function1<? super _ActionMenuView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getACTION_MENU_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        function1.invoke((_ActionMenuView) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ActionMenuView) view;
    }

    @NotNull
    public static /* synthetic */ ActionMenuView themedActionMenuView$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getACTION_MENU_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _ActionMenuView _actionmenuview = (_ActionMenuView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ActionMenuView) view;
    }

    @NotNull
    public static /* synthetic */ ActionMenuView themedActionMenuView$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getACTION_MENU_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_ActionMenuView) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ActionMenuView) view;
    }

    @NotNull
    public static final ActionMenuView themedActionMenuView(@NotNull Activity activity, int i, @NotNull Function1<? super _ActionMenuView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getACTION_MENU_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_ActionMenuView) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ActionMenuView) view;
    }

    @NotNull
    public static final FrameLayout frameLayout(@NotNull ViewManager viewManager, @NotNull Function1<? super _FrameLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 frame_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getFRAME_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) frame_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        function1.invoke((_FrameLayout) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (FrameLayout) view;
    }

    @NotNull
    public static /* synthetic */ FrameLayout themedFrameLayout$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 frame_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getFRAME_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) frame_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _FrameLayout _framelayout = (_FrameLayout) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (FrameLayout) view;
    }

    @NotNull
    public static /* synthetic */ FrameLayout themedFrameLayout$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 frame_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getFRAME_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) frame_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_FrameLayout) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (FrameLayout) view;
    }

    @NotNull
    public static final FrameLayout themedFrameLayout(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super _FrameLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 frame_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getFRAME_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) frame_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_FrameLayout) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (FrameLayout) view;
    }

    @NotNull
    public static final FrameLayout frameLayout(@NotNull Context context, @NotNull Function1<? super _FrameLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getFRAME_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        function1.invoke((_FrameLayout) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (FrameLayout) view;
    }

    @NotNull
    public static /* synthetic */ FrameLayout themedFrameLayout$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getFRAME_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _FrameLayout _framelayout = (_FrameLayout) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (FrameLayout) view;
    }

    @NotNull
    public static /* synthetic */ FrameLayout themedFrameLayout$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getFRAME_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_FrameLayout) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (FrameLayout) view;
    }

    @NotNull
    public static final FrameLayout themedFrameLayout(@NotNull Context context, int i, @NotNull Function1<? super _FrameLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getFRAME_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_FrameLayout) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (FrameLayout) view;
    }

    @NotNull
    public static final FrameLayout frameLayout(@NotNull Activity activity, @NotNull Function1<? super _FrameLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getFRAME_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        function1.invoke((_FrameLayout) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (FrameLayout) view;
    }

    @NotNull
    public static /* synthetic */ FrameLayout themedFrameLayout$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getFRAME_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _FrameLayout _framelayout = (_FrameLayout) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (FrameLayout) view;
    }

    @NotNull
    public static /* synthetic */ FrameLayout themedFrameLayout$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getFRAME_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_FrameLayout) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (FrameLayout) view;
    }

    @NotNull
    public static final FrameLayout themedFrameLayout(@NotNull Activity activity, int i, @NotNull Function1<? super _FrameLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getFRAME_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_FrameLayout) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (FrameLayout) view;
    }

    @NotNull
    public static final Gallery gallery(@NotNull ViewManager viewManager, @NotNull Function1<? super _Gallery, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 gallery = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGALLERY();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) gallery.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        function1.invoke((_Gallery) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (Gallery) view;
    }

    @NotNull
    public static /* synthetic */ Gallery themedGallery$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 gallery = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGALLERY();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) gallery.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _Gallery _gallery = (_Gallery) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (Gallery) view;
    }

    @NotNull
    public static /* synthetic */ Gallery themedGallery$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 gallery = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGALLERY();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) gallery.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_Gallery) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (Gallery) view;
    }

    @NotNull
    public static final Gallery themedGallery(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super _Gallery, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 gallery = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGALLERY();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) gallery.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_Gallery) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (Gallery) view;
    }

    @NotNull
    public static final Gallery gallery(@NotNull Context context, @NotNull Function1<? super _Gallery, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGALLERY().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        function1.invoke((_Gallery) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (Gallery) view;
    }

    @NotNull
    public static /* synthetic */ Gallery themedGallery$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGALLERY().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _Gallery _gallery = (_Gallery) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (Gallery) view;
    }

    @NotNull
    public static /* synthetic */ Gallery themedGallery$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGALLERY().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_Gallery) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (Gallery) view;
    }

    @NotNull
    public static final Gallery themedGallery(@NotNull Context context, int i, @NotNull Function1<? super _Gallery, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGALLERY().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_Gallery) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (Gallery) view;
    }

    @NotNull
    public static final Gallery gallery(@NotNull Activity activity, @NotNull Function1<? super _Gallery, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGALLERY().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        function1.invoke((_Gallery) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (Gallery) view;
    }

    @NotNull
    public static /* synthetic */ Gallery themedGallery$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGALLERY().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _Gallery _gallery = (_Gallery) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (Gallery) view;
    }

    @NotNull
    public static /* synthetic */ Gallery themedGallery$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGALLERY().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_Gallery) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (Gallery) view;
    }

    @NotNull
    public static final Gallery themedGallery(@NotNull Activity activity, int i, @NotNull Function1<? super _Gallery, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGALLERY().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_Gallery) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (Gallery) view;
    }

    @NotNull
    public static final GridLayout gridLayout(@NotNull ViewManager viewManager, @NotNull Function1<? super _GridLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 grid_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) grid_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        function1.invoke((_GridLayout) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (GridLayout) view;
    }

    @NotNull
    public static /* synthetic */ GridLayout themedGridLayout$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 grid_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) grid_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _GridLayout _gridlayout = (_GridLayout) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (GridLayout) view;
    }

    @NotNull
    public static /* synthetic */ GridLayout themedGridLayout$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 grid_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) grid_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_GridLayout) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (GridLayout) view;
    }

    @NotNull
    public static final GridLayout themedGridLayout(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super _GridLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 grid_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) grid_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_GridLayout) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (GridLayout) view;
    }

    @NotNull
    public static final GridLayout gridLayout(@NotNull Context context, @NotNull Function1<? super _GridLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        function1.invoke((_GridLayout) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (GridLayout) view;
    }

    @NotNull
    public static /* synthetic */ GridLayout themedGridLayout$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _GridLayout _gridlayout = (_GridLayout) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (GridLayout) view;
    }

    @NotNull
    public static /* synthetic */ GridLayout themedGridLayout$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_GridLayout) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (GridLayout) view;
    }

    @NotNull
    public static final GridLayout themedGridLayout(@NotNull Context context, int i, @NotNull Function1<? super _GridLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_GridLayout) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (GridLayout) view;
    }

    @NotNull
    public static final GridLayout gridLayout(@NotNull Activity activity, @NotNull Function1<? super _GridLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        function1.invoke((_GridLayout) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (GridLayout) view;
    }

    @NotNull
    public static /* synthetic */ GridLayout themedGridLayout$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _GridLayout _gridlayout = (_GridLayout) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (GridLayout) view;
    }

    @NotNull
    public static /* synthetic */ GridLayout themedGridLayout$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_GridLayout) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (GridLayout) view;
    }

    @NotNull
    public static final GridLayout themedGridLayout(@NotNull Activity activity, int i, @NotNull Function1<? super _GridLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_GridLayout) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (GridLayout) view;
    }

    @NotNull
    public static final GridView gridView(@NotNull ViewManager viewManager, @NotNull Function1<? super _GridView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 grid_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) grid_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        function1.invoke((_GridView) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (GridView) view;
    }

    @NotNull
    public static /* synthetic */ GridView themedGridView$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 grid_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) grid_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _GridView _gridview = (_GridView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (GridView) view;
    }

    @NotNull
    public static /* synthetic */ GridView themedGridView$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 grid_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) grid_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_GridView) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (GridView) view;
    }

    @NotNull
    public static final GridView themedGridView(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super _GridView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 grid_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) grid_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_GridView) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (GridView) view;
    }

    @NotNull
    public static final GridView gridView(@NotNull Context context, @NotNull Function1<? super _GridView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        function1.invoke((_GridView) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (GridView) view;
    }

    @NotNull
    public static /* synthetic */ GridView themedGridView$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _GridView _gridview = (_GridView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (GridView) view;
    }

    @NotNull
    public static /* synthetic */ GridView themedGridView$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_GridView) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (GridView) view;
    }

    @NotNull
    public static final GridView themedGridView(@NotNull Context context, int i, @NotNull Function1<? super _GridView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_GridView) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (GridView) view;
    }

    @NotNull
    public static final GridView gridView(@NotNull Activity activity, @NotNull Function1<? super _GridView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        function1.invoke((_GridView) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (GridView) view;
    }

    @NotNull
    public static /* synthetic */ GridView themedGridView$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _GridView _gridview = (_GridView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (GridView) view;
    }

    @NotNull
    public static /* synthetic */ GridView themedGridView$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_GridView) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (GridView) view;
    }

    @NotNull
    public static final GridView themedGridView(@NotNull Activity activity, int i, @NotNull Function1<? super _GridView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_GridView) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (GridView) view;
    }

    @NotNull
    public static final HorizontalScrollView horizontalScrollView(@NotNull ViewManager viewManager, @NotNull Function1<? super _HorizontalScrollView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 horizontal_scroll_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getHORIZONTAL_SCROLL_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) horizontal_scroll_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        function1.invoke((_HorizontalScrollView) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (HorizontalScrollView) view;
    }

    @NotNull
    public static /* synthetic */ HorizontalScrollView themedHorizontalScrollView$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 horizontal_scroll_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getHORIZONTAL_SCROLL_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) horizontal_scroll_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _HorizontalScrollView _horizontalscrollview = (_HorizontalScrollView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (HorizontalScrollView) view;
    }

    @NotNull
    public static /* synthetic */ HorizontalScrollView themedHorizontalScrollView$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 horizontal_scroll_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getHORIZONTAL_SCROLL_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) horizontal_scroll_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_HorizontalScrollView) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (HorizontalScrollView) view;
    }

    @NotNull
    public static final HorizontalScrollView themedHorizontalScrollView(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super _HorizontalScrollView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 horizontal_scroll_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getHORIZONTAL_SCROLL_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) horizontal_scroll_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_HorizontalScrollView) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (HorizontalScrollView) view;
    }

    @NotNull
    public static final HorizontalScrollView horizontalScrollView(@NotNull Context context, @NotNull Function1<? super _HorizontalScrollView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getHORIZONTAL_SCROLL_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        function1.invoke((_HorizontalScrollView) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (HorizontalScrollView) view;
    }

    @NotNull
    public static /* synthetic */ HorizontalScrollView themedHorizontalScrollView$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getHORIZONTAL_SCROLL_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _HorizontalScrollView _horizontalscrollview = (_HorizontalScrollView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (HorizontalScrollView) view;
    }

    @NotNull
    public static /* synthetic */ HorizontalScrollView themedHorizontalScrollView$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getHORIZONTAL_SCROLL_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_HorizontalScrollView) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (HorizontalScrollView) view;
    }

    @NotNull
    public static final HorizontalScrollView themedHorizontalScrollView(@NotNull Context context, int i, @NotNull Function1<? super _HorizontalScrollView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getHORIZONTAL_SCROLL_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_HorizontalScrollView) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (HorizontalScrollView) view;
    }

    @NotNull
    public static final HorizontalScrollView horizontalScrollView(@NotNull Activity activity, @NotNull Function1<? super _HorizontalScrollView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getHORIZONTAL_SCROLL_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        function1.invoke((_HorizontalScrollView) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (HorizontalScrollView) view;
    }

    @NotNull
    public static /* synthetic */ HorizontalScrollView themedHorizontalScrollView$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getHORIZONTAL_SCROLL_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _HorizontalScrollView _horizontalscrollview = (_HorizontalScrollView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (HorizontalScrollView) view;
    }

    @NotNull
    public static /* synthetic */ HorizontalScrollView themedHorizontalScrollView$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getHORIZONTAL_SCROLL_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_HorizontalScrollView) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (HorizontalScrollView) view;
    }

    @NotNull
    public static final HorizontalScrollView themedHorizontalScrollView(@NotNull Activity activity, int i, @NotNull Function1<? super _HorizontalScrollView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getHORIZONTAL_SCROLL_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_HorizontalScrollView) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (HorizontalScrollView) view;
    }

    @NotNull
    public static final ImageSwitcher imageSwitcher(@NotNull ViewManager viewManager, @NotNull Function1<? super _ImageSwitcher, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 image_switcher = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getIMAGE_SWITCHER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_switcher.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        function1.invoke((_ImageSwitcher) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ImageSwitcher) view;
    }

    @NotNull
    public static /* synthetic */ ImageSwitcher themedImageSwitcher$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 image_switcher = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getIMAGE_SWITCHER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_switcher.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _ImageSwitcher _imageswitcher = (_ImageSwitcher) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ImageSwitcher) view;
    }

    @NotNull
    public static /* synthetic */ ImageSwitcher themedImageSwitcher$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 image_switcher = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getIMAGE_SWITCHER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_switcher.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_ImageSwitcher) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ImageSwitcher) view;
    }

    @NotNull
    public static final ImageSwitcher themedImageSwitcher(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super _ImageSwitcher, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 image_switcher = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getIMAGE_SWITCHER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_switcher.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_ImageSwitcher) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ImageSwitcher) view;
    }

    @NotNull
    public static final ImageSwitcher imageSwitcher(@NotNull Context context, @NotNull Function1<? super _ImageSwitcher, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getIMAGE_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        function1.invoke((_ImageSwitcher) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (ImageSwitcher) view;
    }

    @NotNull
    public static /* synthetic */ ImageSwitcher themedImageSwitcher$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getIMAGE_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _ImageSwitcher _imageswitcher = (_ImageSwitcher) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (ImageSwitcher) view;
    }

    @NotNull
    public static /* synthetic */ ImageSwitcher themedImageSwitcher$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getIMAGE_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_ImageSwitcher) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (ImageSwitcher) view;
    }

    @NotNull
    public static final ImageSwitcher themedImageSwitcher(@NotNull Context context, int i, @NotNull Function1<? super _ImageSwitcher, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getIMAGE_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_ImageSwitcher) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (ImageSwitcher) view;
    }

    @NotNull
    public static final ImageSwitcher imageSwitcher(@NotNull Activity activity, @NotNull Function1<? super _ImageSwitcher, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getIMAGE_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        function1.invoke((_ImageSwitcher) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ImageSwitcher) view;
    }

    @NotNull
    public static /* synthetic */ ImageSwitcher themedImageSwitcher$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getIMAGE_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _ImageSwitcher _imageswitcher = (_ImageSwitcher) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ImageSwitcher) view;
    }

    @NotNull
    public static /* synthetic */ ImageSwitcher themedImageSwitcher$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getIMAGE_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_ImageSwitcher) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ImageSwitcher) view;
    }

    @NotNull
    public static final ImageSwitcher themedImageSwitcher(@NotNull Activity activity, int i, @NotNull Function1<? super _ImageSwitcher, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getIMAGE_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_ImageSwitcher) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ImageSwitcher) view;
    }

    @NotNull
    public static final LinearLayout linearLayout(@NotNull ViewManager viewManager, @NotNull Function1<? super _LinearLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 linear_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getLINEAR_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) linear_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        function1.invoke((_LinearLayout) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (LinearLayout) view;
    }

    @NotNull
    public static /* synthetic */ LinearLayout themedLinearLayout$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 linear_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getLINEAR_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) linear_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _LinearLayout _linearlayout = (_LinearLayout) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (LinearLayout) view;
    }

    @NotNull
    public static /* synthetic */ LinearLayout themedLinearLayout$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 linear_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getLINEAR_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) linear_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_LinearLayout) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (LinearLayout) view;
    }

    @NotNull
    public static final LinearLayout themedLinearLayout(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super _LinearLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 linear_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getLINEAR_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) linear_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_LinearLayout) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (LinearLayout) view;
    }

    @NotNull
    public static final LinearLayout linearLayout(@NotNull Context context, @NotNull Function1<? super _LinearLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getLINEAR_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        function1.invoke((_LinearLayout) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (LinearLayout) view;
    }

    @NotNull
    public static /* synthetic */ LinearLayout themedLinearLayout$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getLINEAR_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _LinearLayout _linearlayout = (_LinearLayout) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (LinearLayout) view;
    }

    @NotNull
    public static /* synthetic */ LinearLayout themedLinearLayout$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getLINEAR_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_LinearLayout) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (LinearLayout) view;
    }

    @NotNull
    public static final LinearLayout themedLinearLayout(@NotNull Context context, int i, @NotNull Function1<? super _LinearLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getLINEAR_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_LinearLayout) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (LinearLayout) view;
    }

    @NotNull
    public static final LinearLayout linearLayout(@NotNull Activity activity, @NotNull Function1<? super _LinearLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getLINEAR_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        function1.invoke((_LinearLayout) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (LinearLayout) view;
    }

    @NotNull
    public static /* synthetic */ LinearLayout themedLinearLayout$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getLINEAR_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _LinearLayout _linearlayout = (_LinearLayout) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (LinearLayout) view;
    }

    @NotNull
    public static /* synthetic */ LinearLayout themedLinearLayout$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getLINEAR_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_LinearLayout) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (LinearLayout) view;
    }

    @NotNull
    public static final LinearLayout themedLinearLayout(@NotNull Activity activity, int i, @NotNull Function1<? super _LinearLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getLINEAR_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_LinearLayout) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (LinearLayout) view;
    }

    @NotNull
    public static final RadioGroup radioGroup(@NotNull ViewManager viewManager, @NotNull Function1<? super _RadioGroup, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 radio_group = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRADIO_GROUP();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) radio_group.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        function1.invoke((_RadioGroup) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (RadioGroup) view;
    }

    @NotNull
    public static /* synthetic */ RadioGroup themedRadioGroup$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 radio_group = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRADIO_GROUP();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) radio_group.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _RadioGroup _radiogroup = (_RadioGroup) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (RadioGroup) view;
    }

    @NotNull
    public static /* synthetic */ RadioGroup themedRadioGroup$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 radio_group = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRADIO_GROUP();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) radio_group.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_RadioGroup) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (RadioGroup) view;
    }

    @NotNull
    public static final RadioGroup themedRadioGroup(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super _RadioGroup, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 radio_group = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRADIO_GROUP();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) radio_group.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_RadioGroup) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (RadioGroup) view;
    }

    @NotNull
    public static final RadioGroup radioGroup(@NotNull Context context, @NotNull Function1<? super _RadioGroup, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRADIO_GROUP().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        function1.invoke((_RadioGroup) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (RadioGroup) view;
    }

    @NotNull
    public static /* synthetic */ RadioGroup themedRadioGroup$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRADIO_GROUP().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _RadioGroup _radiogroup = (_RadioGroup) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (RadioGroup) view;
    }

    @NotNull
    public static /* synthetic */ RadioGroup themedRadioGroup$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRADIO_GROUP().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_RadioGroup) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (RadioGroup) view;
    }

    @NotNull
    public static final RadioGroup themedRadioGroup(@NotNull Context context, int i, @NotNull Function1<? super _RadioGroup, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRADIO_GROUP().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_RadioGroup) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (RadioGroup) view;
    }

    @NotNull
    public static final RadioGroup radioGroup(@NotNull Activity activity, @NotNull Function1<? super _RadioGroup, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRADIO_GROUP().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        function1.invoke((_RadioGroup) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (RadioGroup) view;
    }

    @NotNull
    public static /* synthetic */ RadioGroup themedRadioGroup$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRADIO_GROUP().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _RadioGroup _radiogroup = (_RadioGroup) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (RadioGroup) view;
    }

    @NotNull
    public static /* synthetic */ RadioGroup themedRadioGroup$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRADIO_GROUP().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_RadioGroup) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (RadioGroup) view;
    }

    @NotNull
    public static final RadioGroup themedRadioGroup(@NotNull Activity activity, int i, @NotNull Function1<? super _RadioGroup, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRADIO_GROUP().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_RadioGroup) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (RadioGroup) view;
    }

    @NotNull
    public static final RelativeLayout relativeLayout(@NotNull ViewManager viewManager, @NotNull Function1<? super _RelativeLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 relative_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRELATIVE_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) relative_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        function1.invoke((_RelativeLayout) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (RelativeLayout) view;
    }

    @NotNull
    public static /* synthetic */ RelativeLayout themedRelativeLayout$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 relative_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRELATIVE_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) relative_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _RelativeLayout _relativelayout = (_RelativeLayout) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (RelativeLayout) view;
    }

    @NotNull
    public static /* synthetic */ RelativeLayout themedRelativeLayout$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 relative_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRELATIVE_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) relative_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_RelativeLayout) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (RelativeLayout) view;
    }

    @NotNull
    public static final RelativeLayout themedRelativeLayout(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super _RelativeLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 relative_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRELATIVE_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) relative_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_RelativeLayout) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (RelativeLayout) view;
    }

    @NotNull
    public static final RelativeLayout relativeLayout(@NotNull Context context, @NotNull Function1<? super _RelativeLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRELATIVE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        function1.invoke((_RelativeLayout) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (RelativeLayout) view;
    }

    @NotNull
    public static /* synthetic */ RelativeLayout themedRelativeLayout$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRELATIVE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _RelativeLayout _relativelayout = (_RelativeLayout) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (RelativeLayout) view;
    }

    @NotNull
    public static /* synthetic */ RelativeLayout themedRelativeLayout$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRELATIVE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_RelativeLayout) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (RelativeLayout) view;
    }

    @NotNull
    public static final RelativeLayout themedRelativeLayout(@NotNull Context context, int i, @NotNull Function1<? super _RelativeLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRELATIVE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_RelativeLayout) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (RelativeLayout) view;
    }

    @NotNull
    public static final RelativeLayout relativeLayout(@NotNull Activity activity, @NotNull Function1<? super _RelativeLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRELATIVE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        function1.invoke((_RelativeLayout) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (RelativeLayout) view;
    }

    @NotNull
    public static /* synthetic */ RelativeLayout themedRelativeLayout$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRELATIVE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _RelativeLayout _relativelayout = (_RelativeLayout) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (RelativeLayout) view;
    }

    @NotNull
    public static /* synthetic */ RelativeLayout themedRelativeLayout$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRELATIVE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_RelativeLayout) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (RelativeLayout) view;
    }

    @NotNull
    public static final RelativeLayout themedRelativeLayout(@NotNull Activity activity, int i, @NotNull Function1<? super _RelativeLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRELATIVE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_RelativeLayout) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (RelativeLayout) view;
    }

    @NotNull
    public static final ScrollView scrollView(@NotNull ViewManager viewManager, @NotNull Function1<? super _ScrollView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 scroll_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getSCROLL_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) scroll_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        function1.invoke((_ScrollView) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ScrollView) view;
    }

    @NotNull
    public static /* synthetic */ ScrollView themedScrollView$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 scroll_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getSCROLL_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) scroll_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _ScrollView _scrollview = (_ScrollView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ScrollView) view;
    }

    @NotNull
    public static /* synthetic */ ScrollView themedScrollView$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 scroll_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getSCROLL_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) scroll_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_ScrollView) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ScrollView) view;
    }

    @NotNull
    public static final ScrollView themedScrollView(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super _ScrollView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 scroll_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getSCROLL_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) scroll_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_ScrollView) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ScrollView) view;
    }

    @NotNull
    public static final ScrollView scrollView(@NotNull Context context, @NotNull Function1<? super _ScrollView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getSCROLL_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        function1.invoke((_ScrollView) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (ScrollView) view;
    }

    @NotNull
    public static /* synthetic */ ScrollView themedScrollView$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getSCROLL_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _ScrollView _scrollview = (_ScrollView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (ScrollView) view;
    }

    @NotNull
    public static /* synthetic */ ScrollView themedScrollView$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getSCROLL_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_ScrollView) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (ScrollView) view;
    }

    @NotNull
    public static final ScrollView themedScrollView(@NotNull Context context, int i, @NotNull Function1<? super _ScrollView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getSCROLL_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_ScrollView) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (ScrollView) view;
    }

    @NotNull
    public static final ScrollView scrollView(@NotNull Activity activity, @NotNull Function1<? super _ScrollView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getSCROLL_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        function1.invoke((_ScrollView) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ScrollView) view;
    }

    @NotNull
    public static /* synthetic */ ScrollView themedScrollView$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getSCROLL_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _ScrollView _scrollview = (_ScrollView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ScrollView) view;
    }

    @NotNull
    public static /* synthetic */ ScrollView themedScrollView$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getSCROLL_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_ScrollView) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ScrollView) view;
    }

    @NotNull
    public static final ScrollView themedScrollView(@NotNull Activity activity, int i, @NotNull Function1<? super _ScrollView, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getSCROLL_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_ScrollView) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ScrollView) view;
    }

    @NotNull
    public static final TableLayout tableLayout(@NotNull ViewManager viewManager, @NotNull Function1<? super _TableLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 table_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) table_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        function1.invoke((_TableLayout) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (TableLayout) view;
    }

    @NotNull
    public static /* synthetic */ TableLayout themedTableLayout$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 table_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) table_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _TableLayout _tablelayout = (_TableLayout) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (TableLayout) view;
    }

    @NotNull
    public static /* synthetic */ TableLayout themedTableLayout$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 table_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) table_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_TableLayout) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (TableLayout) view;
    }

    @NotNull
    public static final TableLayout themedTableLayout(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super _TableLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 table_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) table_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_TableLayout) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (TableLayout) view;
    }

    @NotNull
    public static final TableLayout tableLayout(@NotNull Context context, @NotNull Function1<? super _TableLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        function1.invoke((_TableLayout) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (TableLayout) view;
    }

    @NotNull
    public static /* synthetic */ TableLayout themedTableLayout$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _TableLayout _tablelayout = (_TableLayout) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (TableLayout) view;
    }

    @NotNull
    public static /* synthetic */ TableLayout themedTableLayout$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_TableLayout) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (TableLayout) view;
    }

    @NotNull
    public static final TableLayout themedTableLayout(@NotNull Context context, int i, @NotNull Function1<? super _TableLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_TableLayout) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (TableLayout) view;
    }

    @NotNull
    public static final TableLayout tableLayout(@NotNull Activity activity, @NotNull Function1<? super _TableLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        function1.invoke((_TableLayout) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (TableLayout) view;
    }

    @NotNull
    public static /* synthetic */ TableLayout themedTableLayout$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _TableLayout _tablelayout = (_TableLayout) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (TableLayout) view;
    }

    @NotNull
    public static /* synthetic */ TableLayout themedTableLayout$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_TableLayout) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (TableLayout) view;
    }

    @NotNull
    public static final TableLayout themedTableLayout(@NotNull Activity activity, int i, @NotNull Function1<? super _TableLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_TableLayout) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (TableLayout) view;
    }

    @NotNull
    public static final TableRow tableRow(@NotNull ViewManager viewManager, @NotNull Function1<? super _TableRow, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 table_row = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_ROW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) table_row.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        function1.invoke((_TableRow) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (TableRow) view;
    }

    @NotNull
    public static /* synthetic */ TableRow themedTableRow$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 table_row = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_ROW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) table_row.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _TableRow _tablerow = (_TableRow) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (TableRow) view;
    }

    @NotNull
    public static /* synthetic */ TableRow themedTableRow$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 table_row = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_ROW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) table_row.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_TableRow) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (TableRow) view;
    }

    @NotNull
    public static final TableRow themedTableRow(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super _TableRow, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 table_row = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_ROW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) table_row.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_TableRow) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (TableRow) view;
    }

    @NotNull
    public static final TableRow tableRow(@NotNull Context context, @NotNull Function1<? super _TableRow, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_ROW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        function1.invoke((_TableRow) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (TableRow) view;
    }

    @NotNull
    public static /* synthetic */ TableRow themedTableRow$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_ROW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _TableRow _tablerow = (_TableRow) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (TableRow) view;
    }

    @NotNull
    public static /* synthetic */ TableRow themedTableRow$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_ROW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_TableRow) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (TableRow) view;
    }

    @NotNull
    public static final TableRow themedTableRow(@NotNull Context context, int i, @NotNull Function1<? super _TableRow, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_ROW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_TableRow) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (TableRow) view;
    }

    @NotNull
    public static final TableRow tableRow(@NotNull Activity activity, @NotNull Function1<? super _TableRow, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_ROW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        function1.invoke((_TableRow) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (TableRow) view;
    }

    @NotNull
    public static /* synthetic */ TableRow themedTableRow$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_ROW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _TableRow _tablerow = (_TableRow) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (TableRow) view;
    }

    @NotNull
    public static /* synthetic */ TableRow themedTableRow$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_ROW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_TableRow) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (TableRow) view;
    }

    @NotNull
    public static final TableRow themedTableRow(@NotNull Activity activity, int i, @NotNull Function1<? super _TableRow, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_ROW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_TableRow) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (TableRow) view;
    }

    @NotNull
    public static final TextSwitcher textSwitcher(@NotNull ViewManager viewManager, @NotNull Function1<? super _TextSwitcher, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 text_switcher = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTEXT_SWITCHER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) text_switcher.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        function1.invoke((_TextSwitcher) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (TextSwitcher) view;
    }

    @NotNull
    public static /* synthetic */ TextSwitcher themedTextSwitcher$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 text_switcher = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTEXT_SWITCHER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) text_switcher.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _TextSwitcher _textswitcher = (_TextSwitcher) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (TextSwitcher) view;
    }

    @NotNull
    public static /* synthetic */ TextSwitcher themedTextSwitcher$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 text_switcher = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTEXT_SWITCHER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) text_switcher.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_TextSwitcher) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (TextSwitcher) view;
    }

    @NotNull
    public static final TextSwitcher themedTextSwitcher(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super _TextSwitcher, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 text_switcher = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTEXT_SWITCHER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) text_switcher.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_TextSwitcher) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (TextSwitcher) view;
    }

    @NotNull
    public static final TextSwitcher textSwitcher(@NotNull Context context, @NotNull Function1<? super _TextSwitcher, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTEXT_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        function1.invoke((_TextSwitcher) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (TextSwitcher) view;
    }

    @NotNull
    public static /* synthetic */ TextSwitcher themedTextSwitcher$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTEXT_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _TextSwitcher _textswitcher = (_TextSwitcher) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (TextSwitcher) view;
    }

    @NotNull
    public static /* synthetic */ TextSwitcher themedTextSwitcher$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTEXT_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_TextSwitcher) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (TextSwitcher) view;
    }

    @NotNull
    public static final TextSwitcher themedTextSwitcher(@NotNull Context context, int i, @NotNull Function1<? super _TextSwitcher, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTEXT_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_TextSwitcher) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (TextSwitcher) view;
    }

    @NotNull
    public static final TextSwitcher textSwitcher(@NotNull Activity activity, @NotNull Function1<? super _TextSwitcher, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTEXT_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        function1.invoke((_TextSwitcher) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (TextSwitcher) view;
    }

    @NotNull
    public static /* synthetic */ TextSwitcher themedTextSwitcher$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTEXT_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _TextSwitcher _textswitcher = (_TextSwitcher) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (TextSwitcher) view;
    }

    @NotNull
    public static /* synthetic */ TextSwitcher themedTextSwitcher$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTEXT_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_TextSwitcher) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (TextSwitcher) view;
    }

    @NotNull
    public static final TextSwitcher themedTextSwitcher(@NotNull Activity activity, int i, @NotNull Function1<? super _TextSwitcher, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTEXT_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_TextSwitcher) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (TextSwitcher) view;
    }

    @NotNull
    public static final Toolbar toolbar(@NotNull ViewManager viewManager, @NotNull Function1<? super _Toolbar, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 toolbar = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTOOLBAR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) toolbar.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        function1.invoke((_Toolbar) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (Toolbar) view;
    }

    @NotNull
    public static /* synthetic */ Toolbar themedToolbar$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 toolbar = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTOOLBAR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) toolbar.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _Toolbar _toolbar = (_Toolbar) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (Toolbar) view;
    }

    @NotNull
    public static /* synthetic */ Toolbar themedToolbar$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 toolbar = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTOOLBAR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) toolbar.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_Toolbar) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (Toolbar) view;
    }

    @NotNull
    public static final Toolbar themedToolbar(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super _Toolbar, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 toolbar = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTOOLBAR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) toolbar.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_Toolbar) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (Toolbar) view;
    }

    @NotNull
    public static final Toolbar toolbar(@NotNull Context context, @NotNull Function1<? super _Toolbar, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTOOLBAR().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        function1.invoke((_Toolbar) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (Toolbar) view;
    }

    @NotNull
    public static /* synthetic */ Toolbar themedToolbar$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTOOLBAR().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _Toolbar _toolbar = (_Toolbar) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (Toolbar) view;
    }

    @NotNull
    public static /* synthetic */ Toolbar themedToolbar$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTOOLBAR().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_Toolbar) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (Toolbar) view;
    }

    @NotNull
    public static final Toolbar themedToolbar(@NotNull Context context, int i, @NotNull Function1<? super _Toolbar, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTOOLBAR().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_Toolbar) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (Toolbar) view;
    }

    @NotNull
    public static final Toolbar toolbar(@NotNull Activity activity, @NotNull Function1<? super _Toolbar, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTOOLBAR().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        function1.invoke((_Toolbar) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (Toolbar) view;
    }

    @NotNull
    public static /* synthetic */ Toolbar themedToolbar$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTOOLBAR().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _Toolbar _toolbar = (_Toolbar) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (Toolbar) view;
    }

    @NotNull
    public static /* synthetic */ Toolbar themedToolbar$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTOOLBAR().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_Toolbar) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (Toolbar) view;
    }

    @NotNull
    public static final Toolbar themedToolbar(@NotNull Activity activity, int i, @NotNull Function1<? super _Toolbar, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTOOLBAR().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_Toolbar) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (Toolbar) view;
    }

    @NotNull
    public static final ViewAnimator viewAnimator(@NotNull ViewManager viewManager, @NotNull Function1<? super _ViewAnimator, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 view_animator = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_ANIMATOR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) view_animator.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        function1.invoke((_ViewAnimator) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ViewAnimator) view;
    }

    @NotNull
    public static /* synthetic */ ViewAnimator themedViewAnimator$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 view_animator = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_ANIMATOR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) view_animator.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _ViewAnimator _viewanimator = (_ViewAnimator) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ViewAnimator) view;
    }

    @NotNull
    public static /* synthetic */ ViewAnimator themedViewAnimator$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 view_animator = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_ANIMATOR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) view_animator.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_ViewAnimator) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ViewAnimator) view;
    }

    @NotNull
    public static final ViewAnimator themedViewAnimator(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super _ViewAnimator, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 view_animator = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_ANIMATOR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) view_animator.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_ViewAnimator) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ViewAnimator) view;
    }

    @NotNull
    public static final ViewAnimator viewAnimator(@NotNull Context context, @NotNull Function1<? super _ViewAnimator, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_ANIMATOR().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        function1.invoke((_ViewAnimator) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (ViewAnimator) view;
    }

    @NotNull
    public static /* synthetic */ ViewAnimator themedViewAnimator$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_ANIMATOR().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _ViewAnimator _viewanimator = (_ViewAnimator) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (ViewAnimator) view;
    }

    @NotNull
    public static /* synthetic */ ViewAnimator themedViewAnimator$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_ANIMATOR().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_ViewAnimator) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (ViewAnimator) view;
    }

    @NotNull
    public static final ViewAnimator themedViewAnimator(@NotNull Context context, int i, @NotNull Function1<? super _ViewAnimator, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_ANIMATOR().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_ViewAnimator) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (ViewAnimator) view;
    }

    @NotNull
    public static final ViewAnimator viewAnimator(@NotNull Activity activity, @NotNull Function1<? super _ViewAnimator, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_ANIMATOR().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        function1.invoke((_ViewAnimator) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ViewAnimator) view;
    }

    @NotNull
    public static /* synthetic */ ViewAnimator themedViewAnimator$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_ANIMATOR().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _ViewAnimator _viewanimator = (_ViewAnimator) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ViewAnimator) view;
    }

    @NotNull
    public static /* synthetic */ ViewAnimator themedViewAnimator$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_ANIMATOR().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_ViewAnimator) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ViewAnimator) view;
    }

    @NotNull
    public static final ViewAnimator themedViewAnimator(@NotNull Activity activity, int i, @NotNull Function1<? super _ViewAnimator, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_ANIMATOR().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_ViewAnimator) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ViewAnimator) view;
    }

    @NotNull
    public static final ViewSwitcher viewSwitcher(@NotNull ViewManager viewManager, @NotNull Function1<? super _ViewSwitcher, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 view_switcher = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_SWITCHER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) view_switcher.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        function1.invoke((_ViewSwitcher) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ViewSwitcher) view;
    }

    @NotNull
    public static /* synthetic */ ViewSwitcher themedViewSwitcher$default(ViewManager viewManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 view_switcher = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_SWITCHER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) view_switcher.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _ViewSwitcher _viewswitcher = (_ViewSwitcher) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ViewSwitcher) view;
    }

    @NotNull
    public static /* synthetic */ ViewSwitcher themedViewSwitcher$default(ViewManager viewManager, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 view_switcher = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_SWITCHER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) view_switcher.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_ViewSwitcher) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ViewSwitcher) view;
    }

    @NotNull
    public static final ViewSwitcher themedViewSwitcher(@NotNull ViewManager viewManager, int i, @NotNull Function1<? super _ViewSwitcher, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        Function1 view_switcher = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_SWITCHER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) view_switcher.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        function1.invoke((_ViewSwitcher) view);
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ViewSwitcher) view;
    }

    @NotNull
    public static final ViewSwitcher viewSwitcher(@NotNull Context context, @NotNull Function1<? super _ViewSwitcher, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        function1.invoke((_ViewSwitcher) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (ViewSwitcher) view;
    }

    @NotNull
    public static /* synthetic */ ViewSwitcher themedViewSwitcher$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _ViewSwitcher _viewswitcher = (_ViewSwitcher) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (ViewSwitcher) view;
    }

    @NotNull
    public static /* synthetic */ ViewSwitcher themedViewSwitcher$default(Context context, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_ViewSwitcher) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (ViewSwitcher) view;
    }

    @NotNull
    public static final ViewSwitcher themedViewSwitcher(@NotNull Context context, int i, @NotNull Function1<? super _ViewSwitcher, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        function1.invoke((_ViewSwitcher) view);
        AnkoInternals.INSTANCE.addView(context, view);
        return (ViewSwitcher) view;
    }

    @NotNull
    public static final ViewSwitcher viewSwitcher(@NotNull Activity activity, @NotNull Function1<? super _ViewSwitcher, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        function1.invoke((_ViewSwitcher) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ViewSwitcher) view;
    }

    @NotNull
    public static /* synthetic */ ViewSwitcher themedViewSwitcher$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _ViewSwitcher _viewswitcher = (_ViewSwitcher) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ViewSwitcher) view;
    }

    @NotNull
    public static /* synthetic */ ViewSwitcher themedViewSwitcher$default(Activity activity, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_ViewSwitcher) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ViewSwitcher) view;
    }

    @NotNull
    public static final ViewSwitcher themedViewSwitcher(@NotNull Activity activity, int i, @NotNull Function1<? super _ViewSwitcher, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "init");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        function1.invoke((_ViewSwitcher) view);
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ViewSwitcher) view;
    }

    @NotNull
    public static final MediaRouteButton mediaRouteButton(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 media_route_button = C$$Anko$Factories$Sdk27View.INSTANCE.getMEDIA_ROUTE_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) media_route_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        MediaRouteButton mediaRouteButton = (MediaRouteButton) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return mediaRouteButton;
    }

    @NotNull
    public static final MediaRouteButton themedMediaRouteButton(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 media_route_button = C$$Anko$Factories$Sdk27View.INSTANCE.getMEDIA_ROUTE_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) media_route_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        MediaRouteButton mediaRouteButton = (MediaRouteButton) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return mediaRouteButton;
    }

    @NotNull
    public static final GestureOverlayView gestureOverlayView(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 gesture_overlay_view = C$$Anko$Factories$Sdk27View.INSTANCE.getGESTURE_OVERLAY_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) gesture_overlay_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        GestureOverlayView gestureOverlayView = (GestureOverlayView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return gestureOverlayView;
    }

    @NotNull
    public static final GestureOverlayView themedGestureOverlayView(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 gesture_overlay_view = C$$Anko$Factories$Sdk27View.INSTANCE.getGESTURE_OVERLAY_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) gesture_overlay_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        GestureOverlayView gestureOverlayView = (GestureOverlayView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return gestureOverlayView;
    }

    @NotNull
    public static final GestureOverlayView gestureOverlayView(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getGESTURE_OVERLAY_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        GestureOverlayView gestureOverlayView = (GestureOverlayView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return gestureOverlayView;
    }

    @NotNull
    public static final GestureOverlayView themedGestureOverlayView(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getGESTURE_OVERLAY_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        GestureOverlayView gestureOverlayView = (GestureOverlayView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return gestureOverlayView;
    }

    @NotNull
    public static final GestureOverlayView gestureOverlayView(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getGESTURE_OVERLAY_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        GestureOverlayView gestureOverlayView = (GestureOverlayView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return gestureOverlayView;
    }

    @NotNull
    public static final GestureOverlayView themedGestureOverlayView(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getGESTURE_OVERLAY_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        GestureOverlayView gestureOverlayView = (GestureOverlayView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return gestureOverlayView;
    }

    @NotNull
    public static final ExtractEditText extractEditText(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 extract_edit_text = C$$Anko$Factories$Sdk27View.INSTANCE.getEXTRACT_EDIT_TEXT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) extract_edit_text.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ExtractEditText extractEditText = (ExtractEditText) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return extractEditText;
    }

    @NotNull
    public static final ExtractEditText themedExtractEditText(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 extract_edit_text = C$$Anko$Factories$Sdk27View.INSTANCE.getEXTRACT_EDIT_TEXT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) extract_edit_text.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ExtractEditText extractEditText = (ExtractEditText) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return extractEditText;
    }

    @NotNull
    public static final TvView tvView(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 tv_view = C$$Anko$Factories$Sdk27View.INSTANCE.getTV_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) tv_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        TvView tvView = (TvView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return tvView;
    }

    @NotNull
    public static final TvView themedTvView(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 tv_view = C$$Anko$Factories$Sdk27View.INSTANCE.getTV_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) tv_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TvView tvView = (TvView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return tvView;
    }

    @NotNull
    public static final TvView tvView(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTV_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        TvView tvView = (TvView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return tvView;
    }

    @NotNull
    public static final TvView themedTvView(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTV_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        TvView tvView = (TvView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return tvView;
    }

    @NotNull
    public static final TvView tvView(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTV_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        TvView tvView = (TvView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return tvView;
    }

    @NotNull
    public static final TvView themedTvView(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTV_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        TvView tvView = (TvView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return tvView;
    }

    @NotNull
    public static final GLSurfaceView gLSurfaceView(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 g_l_surface_view = C$$Anko$Factories$Sdk27View.INSTANCE.getG_L_SURFACE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) g_l_surface_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        GLSurfaceView gLSurfaceView = (GLSurfaceView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return gLSurfaceView;
    }

    @NotNull
    public static final GLSurfaceView themedGLSurfaceView(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 g_l_surface_view = C$$Anko$Factories$Sdk27View.INSTANCE.getG_L_SURFACE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) g_l_surface_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        GLSurfaceView gLSurfaceView = (GLSurfaceView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return gLSurfaceView;
    }

    @NotNull
    public static final SurfaceView surfaceView(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 surface_view = C$$Anko$Factories$Sdk27View.INSTANCE.getSURFACE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) surface_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        SurfaceView surfaceView = (SurfaceView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return surfaceView;
    }

    @NotNull
    public static final SurfaceView themedSurfaceView(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 surface_view = C$$Anko$Factories$Sdk27View.INSTANCE.getSURFACE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) surface_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        SurfaceView surfaceView = (SurfaceView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return surfaceView;
    }

    @NotNull
    public static final TextureView textureView(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 texture_view = C$$Anko$Factories$Sdk27View.INSTANCE.getTEXTURE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) texture_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        TextureView textureView = (TextureView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return textureView;
    }

    @NotNull
    public static final TextureView themedTextureView(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 texture_view = C$$Anko$Factories$Sdk27View.INSTANCE.getTEXTURE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) texture_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TextureView textureView = (TextureView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return textureView;
    }

    @NotNull
    public static final View view(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 view = C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view2 = (View) view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        AnkoInternals.INSTANCE.addView(viewManager, view2);
        return view2;
    }

    @NotNull
    public static final View themedView(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 view = C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view2 = (View) view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        AnkoInternals.INSTANCE.addView(viewManager, view2);
        return view2;
    }

    @NotNull
    public static final ViewStub viewStub(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 view_stub = C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW_STUB();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) view_stub.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ViewStub viewStub = (ViewStub) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return viewStub;
    }

    @NotNull
    public static final ViewStub themedViewStub(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 view_stub = C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW_STUB();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) view_stub.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ViewStub viewStub = (ViewStub) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return viewStub;
    }

    @NotNull
    public static final WebView webView(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 web_view = C$$Anko$Factories$Sdk27View.INSTANCE.getWEB_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) web_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        WebView webView = (WebView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return webView;
    }

    @NotNull
    public static final WebView themedWebView(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 web_view = C$$Anko$Factories$Sdk27View.INSTANCE.getWEB_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) web_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        WebView webView = (WebView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return webView;
    }

    @NotNull
    public static final WebView webView(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getWEB_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        WebView webView = (WebView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return webView;
    }

    @NotNull
    public static final WebView themedWebView(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getWEB_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        WebView webView = (WebView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return webView;
    }

    @NotNull
    public static final WebView webView(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getWEB_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        WebView webView = (WebView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return webView;
    }

    @NotNull
    public static final WebView themedWebView(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getWEB_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        WebView webView = (WebView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return webView;
    }

    @NotNull
    public static final AdapterViewFlipper adapterViewFlipper(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 adapter_view_flipper = C$$Anko$Factories$Sdk27View.INSTANCE.getADAPTER_VIEW_FLIPPER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) adapter_view_flipper.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        AdapterViewFlipper adapterViewFlipper = (AdapterViewFlipper) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return adapterViewFlipper;
    }

    @NotNull
    public static final AdapterViewFlipper themedAdapterViewFlipper(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 adapter_view_flipper = C$$Anko$Factories$Sdk27View.INSTANCE.getADAPTER_VIEW_FLIPPER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) adapter_view_flipper.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        AdapterViewFlipper adapterViewFlipper = (AdapterViewFlipper) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return adapterViewFlipper;
    }

    @NotNull
    public static final AdapterViewFlipper adapterViewFlipper(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getADAPTER_VIEW_FLIPPER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        AdapterViewFlipper adapterViewFlipper = (AdapterViewFlipper) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return adapterViewFlipper;
    }

    @NotNull
    public static final AdapterViewFlipper themedAdapterViewFlipper(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getADAPTER_VIEW_FLIPPER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        AdapterViewFlipper adapterViewFlipper = (AdapterViewFlipper) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return adapterViewFlipper;
    }

    @NotNull
    public static final AdapterViewFlipper adapterViewFlipper(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getADAPTER_VIEW_FLIPPER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        AdapterViewFlipper adapterViewFlipper = (AdapterViewFlipper) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return adapterViewFlipper;
    }

    @NotNull
    public static final AdapterViewFlipper themedAdapterViewFlipper(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getADAPTER_VIEW_FLIPPER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        AdapterViewFlipper adapterViewFlipper = (AdapterViewFlipper) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return adapterViewFlipper;
    }

    @NotNull
    public static final AnalogClock analogClock(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 analog_clock = C$$Anko$Factories$Sdk27View.INSTANCE.getANALOG_CLOCK();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) analog_clock.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        AnalogClock analogClock = (AnalogClock) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return analogClock;
    }

    @NotNull
    public static final AnalogClock themedAnalogClock(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 analog_clock = C$$Anko$Factories$Sdk27View.INSTANCE.getANALOG_CLOCK();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) analog_clock.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        AnalogClock analogClock = (AnalogClock) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return analogClock;
    }

    @NotNull
    public static final AutoCompleteTextView autoCompleteTextView(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 auto_complete_text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getAUTO_COMPLETE_TEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) auto_complete_text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return autoCompleteTextView;
    }

    @NotNull
    public static final AutoCompleteTextView themedAutoCompleteTextView(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 auto_complete_text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getAUTO_COMPLETE_TEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) auto_complete_text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return autoCompleteTextView;
    }

    @NotNull
    public static final Button button(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 button = C$$Anko$Factories$Sdk27View.INSTANCE.getBUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        Button button2 = (Button) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return button2;
    }

    @NotNull
    public static final Button themedButton(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 button = C$$Anko$Factories$Sdk27View.INSTANCE.getBUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        Button button2 = (Button) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return button2;
    }

    @NotNull
    public static final CalendarView calendarView(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 calendar_view = C$$Anko$Factories$Sdk27View.INSTANCE.getCALENDAR_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) calendar_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        CalendarView calendarView = (CalendarView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return calendarView;
    }

    @NotNull
    public static final CalendarView themedCalendarView(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 calendar_view = C$$Anko$Factories$Sdk27View.INSTANCE.getCALENDAR_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) calendar_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        CalendarView calendarView = (CalendarView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return calendarView;
    }

    @NotNull
    public static final CalendarView calendarView(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getCALENDAR_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        CalendarView calendarView = (CalendarView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return calendarView;
    }

    @NotNull
    public static final CalendarView themedCalendarView(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getCALENDAR_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        CalendarView calendarView = (CalendarView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return calendarView;
    }

    @NotNull
    public static final CalendarView calendarView(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getCALENDAR_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        CalendarView calendarView = (CalendarView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return calendarView;
    }

    @NotNull
    public static final CalendarView themedCalendarView(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getCALENDAR_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        CalendarView calendarView = (CalendarView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return calendarView;
    }

    @NotNull
    public static final CheckBox checkBox(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 check_box = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECK_BOX();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) check_box.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        CheckBox checkBox = (CheckBox) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkBox;
    }

    @NotNull
    public static final CheckBox themedCheckBox(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 check_box = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECK_BOX();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) check_box.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        CheckBox checkBox = (CheckBox) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkBox;
    }

    @NotNull
    public static final CheckedTextView checkedTextView(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 checked_text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECKED_TEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) checked_text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        CheckedTextView checkedTextView = (CheckedTextView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkedTextView;
    }

    @NotNull
    public static final CheckedTextView themedCheckedTextView(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 checked_text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getCHECKED_TEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) checked_text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        CheckedTextView checkedTextView = (CheckedTextView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return checkedTextView;
    }

    @NotNull
    public static final Chronometer chronometer(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 chronometer = C$$Anko$Factories$Sdk27View.INSTANCE.getCHRONOMETER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) chronometer.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        Chronometer chronometer2 = (Chronometer) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return chronometer2;
    }

    @NotNull
    public static final Chronometer themedChronometer(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 chronometer = C$$Anko$Factories$Sdk27View.INSTANCE.getCHRONOMETER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) chronometer.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        Chronometer chronometer2 = (Chronometer) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return chronometer2;
    }

    @NotNull
    public static final DatePicker datePicker(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 date_picker = C$$Anko$Factories$Sdk27View.INSTANCE.getDATE_PICKER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) date_picker.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        DatePicker datePicker = (DatePicker) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return datePicker;
    }

    @NotNull
    public static final DatePicker themedDatePicker(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 date_picker = C$$Anko$Factories$Sdk27View.INSTANCE.getDATE_PICKER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) date_picker.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        DatePicker datePicker = (DatePicker) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return datePicker;
    }

    @NotNull
    public static final DatePicker datePicker(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getDATE_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        DatePicker datePicker = (DatePicker) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return datePicker;
    }

    @NotNull
    public static final DatePicker themedDatePicker(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getDATE_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        DatePicker datePicker = (DatePicker) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return datePicker;
    }

    @NotNull
    public static final DatePicker datePicker(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getDATE_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        DatePicker datePicker = (DatePicker) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return datePicker;
    }

    @NotNull
    public static final DatePicker themedDatePicker(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getDATE_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        DatePicker datePicker = (DatePicker) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return datePicker;
    }

    @NotNull
    public static final DialerFilter dialerFilter(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 dialer_filter = C$$Anko$Factories$Sdk27View.INSTANCE.getDIALER_FILTER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) dialer_filter.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        DialerFilter dialerFilter = (DialerFilter) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return dialerFilter;
    }

    @NotNull
    public static final DialerFilter themedDialerFilter(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 dialer_filter = C$$Anko$Factories$Sdk27View.INSTANCE.getDIALER_FILTER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) dialer_filter.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        DialerFilter dialerFilter = (DialerFilter) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return dialerFilter;
    }

    @NotNull
    public static final DialerFilter dialerFilter(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getDIALER_FILTER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        DialerFilter dialerFilter = (DialerFilter) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return dialerFilter;
    }

    @NotNull
    public static final DialerFilter themedDialerFilter(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getDIALER_FILTER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        DialerFilter dialerFilter = (DialerFilter) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return dialerFilter;
    }

    @NotNull
    public static final DialerFilter dialerFilter(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getDIALER_FILTER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        DialerFilter dialerFilter = (DialerFilter) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return dialerFilter;
    }

    @NotNull
    public static final DialerFilter themedDialerFilter(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getDIALER_FILTER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        DialerFilter dialerFilter = (DialerFilter) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return dialerFilter;
    }

    @NotNull
    public static final DigitalClock digitalClock(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 digital_clock = C$$Anko$Factories$Sdk27View.INSTANCE.getDIGITAL_CLOCK();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) digital_clock.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        DigitalClock digitalClock = (DigitalClock) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return digitalClock;
    }

    @NotNull
    public static final DigitalClock themedDigitalClock(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 digital_clock = C$$Anko$Factories$Sdk27View.INSTANCE.getDIGITAL_CLOCK();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) digital_clock.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        DigitalClock digitalClock = (DigitalClock) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return digitalClock;
    }

    @NotNull
    public static final EditText editText(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 edit_text = C$$Anko$Factories$Sdk27View.INSTANCE.getEDIT_TEXT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) edit_text.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        EditText editText = (EditText) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return editText;
    }

    @NotNull
    public static final EditText themedEditText(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 edit_text = C$$Anko$Factories$Sdk27View.INSTANCE.getEDIT_TEXT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) edit_text.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        EditText editText = (EditText) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return editText;
    }

    @NotNull
    public static final ExpandableListView expandableListView(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 expandable_list_view = C$$Anko$Factories$Sdk27View.INSTANCE.getEXPANDABLE_LIST_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) expandable_list_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ExpandableListView expandableListView = (ExpandableListView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return expandableListView;
    }

    @NotNull
    public static final ExpandableListView themedExpandableListView(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 expandable_list_view = C$$Anko$Factories$Sdk27View.INSTANCE.getEXPANDABLE_LIST_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) expandable_list_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ExpandableListView expandableListView = (ExpandableListView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return expandableListView;
    }

    @NotNull
    public static final ExpandableListView expandableListView(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getEXPANDABLE_LIST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        ExpandableListView expandableListView = (ExpandableListView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return expandableListView;
    }

    @NotNull
    public static final ExpandableListView themedExpandableListView(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getEXPANDABLE_LIST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        ExpandableListView expandableListView = (ExpandableListView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return expandableListView;
    }

    @NotNull
    public static final ExpandableListView expandableListView(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getEXPANDABLE_LIST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        ExpandableListView expandableListView = (ExpandableListView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return expandableListView;
    }

    @NotNull
    public static final ExpandableListView themedExpandableListView(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getEXPANDABLE_LIST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        ExpandableListView expandableListView = (ExpandableListView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return expandableListView;
    }

    @NotNull
    public static final ImageButton imageButton(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 image_button = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ImageButton imageButton = (ImageButton) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageButton;
    }

    @NotNull
    public static final ImageButton themedImageButton(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 image_button = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ImageButton imageButton = (ImageButton) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageButton;
    }

    @NotNull
    public static final ImageView imageView(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 image_view = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ImageView imageView = (ImageView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageView;
    }

    @NotNull
    public static final ImageView themedImageView(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 image_view = C$$Anko$Factories$Sdk27View.INSTANCE.getIMAGE_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ImageView imageView = (ImageView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return imageView;
    }

    @NotNull
    public static final ListView listView(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 list_view = C$$Anko$Factories$Sdk27View.INSTANCE.getLIST_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) list_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ListView listView = (ListView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return listView;
    }

    @NotNull
    public static final ListView themedListView(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 list_view = C$$Anko$Factories$Sdk27View.INSTANCE.getLIST_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) list_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ListView listView = (ListView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return listView;
    }

    @NotNull
    public static final ListView listView(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getLIST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        ListView listView = (ListView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return listView;
    }

    @NotNull
    public static final ListView themedListView(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getLIST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        ListView listView = (ListView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return listView;
    }

    @NotNull
    public static final ListView listView(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getLIST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        ListView listView = (ListView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return listView;
    }

    @NotNull
    public static final ListView themedListView(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getLIST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        ListView listView = (ListView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return listView;
    }

    @NotNull
    public static final MultiAutoCompleteTextView multiAutoCompleteTextView(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 multi_auto_complete_text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getMULTI_AUTO_COMPLETE_TEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) multi_auto_complete_text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        MultiAutoCompleteTextView multiAutoCompleteTextView = (MultiAutoCompleteTextView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return multiAutoCompleteTextView;
    }

    @NotNull
    public static final MultiAutoCompleteTextView themedMultiAutoCompleteTextView(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 multi_auto_complete_text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getMULTI_AUTO_COMPLETE_TEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) multi_auto_complete_text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        MultiAutoCompleteTextView multiAutoCompleteTextView = (MultiAutoCompleteTextView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return multiAutoCompleteTextView;
    }

    @NotNull
    public static final NumberPicker numberPicker(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 number_picker = C$$Anko$Factories$Sdk27View.INSTANCE.getNUMBER_PICKER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) number_picker.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        NumberPicker numberPicker = (NumberPicker) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return numberPicker;
    }

    @NotNull
    public static final NumberPicker themedNumberPicker(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 number_picker = C$$Anko$Factories$Sdk27View.INSTANCE.getNUMBER_PICKER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) number_picker.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        NumberPicker numberPicker = (NumberPicker) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return numberPicker;
    }

    @NotNull
    public static final NumberPicker numberPicker(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getNUMBER_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        NumberPicker numberPicker = (NumberPicker) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return numberPicker;
    }

    @NotNull
    public static final NumberPicker themedNumberPicker(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getNUMBER_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        NumberPicker numberPicker = (NumberPicker) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return numberPicker;
    }

    @NotNull
    public static final NumberPicker numberPicker(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getNUMBER_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        NumberPicker numberPicker = (NumberPicker) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return numberPicker;
    }

    @NotNull
    public static final NumberPicker themedNumberPicker(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getNUMBER_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        NumberPicker numberPicker = (NumberPicker) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return numberPicker;
    }

    @NotNull
    public static final ProgressBar progressBar(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 progress_bar = C$$Anko$Factories$Sdk27View.INSTANCE.getPROGRESS_BAR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) progress_bar.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ProgressBar progressBar = (ProgressBar) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return progressBar;
    }

    @NotNull
    public static final ProgressBar themedProgressBar(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 progress_bar = C$$Anko$Factories$Sdk27View.INSTANCE.getPROGRESS_BAR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) progress_bar.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ProgressBar progressBar = (ProgressBar) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return progressBar;
    }

    @NotNull
    public static final QuickContactBadge quickContactBadge(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 quick_contact_badge = C$$Anko$Factories$Sdk27View.INSTANCE.getQUICK_CONTACT_BADGE();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) quick_contact_badge.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        QuickContactBadge quickContactBadge = (QuickContactBadge) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return quickContactBadge;
    }

    @NotNull
    public static final QuickContactBadge themedQuickContactBadge(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 quick_contact_badge = C$$Anko$Factories$Sdk27View.INSTANCE.getQUICK_CONTACT_BADGE();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) quick_contact_badge.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        QuickContactBadge quickContactBadge = (QuickContactBadge) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return quickContactBadge;
    }

    @NotNull
    public static final RadioButton radioButton(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 radio_button = C$$Anko$Factories$Sdk27View.INSTANCE.getRADIO_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) radio_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        RadioButton radioButton = (RadioButton) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return radioButton;
    }

    @NotNull
    public static final RadioButton themedRadioButton(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 radio_button = C$$Anko$Factories$Sdk27View.INSTANCE.getRADIO_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) radio_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        RadioButton radioButton = (RadioButton) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return radioButton;
    }

    @NotNull
    public static final RatingBar ratingBar(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 rating_bar = C$$Anko$Factories$Sdk27View.INSTANCE.getRATING_BAR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) rating_bar.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        RatingBar ratingBar = (RatingBar) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return ratingBar;
    }

    @NotNull
    public static final RatingBar themedRatingBar(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 rating_bar = C$$Anko$Factories$Sdk27View.INSTANCE.getRATING_BAR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) rating_bar.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        RatingBar ratingBar = (RatingBar) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return ratingBar;
    }

    @NotNull
    public static final SearchView searchView(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 search_view = C$$Anko$Factories$Sdk27View.INSTANCE.getSEARCH_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) search_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        SearchView searchView = (SearchView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return searchView;
    }

    @NotNull
    public static final SearchView themedSearchView(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 search_view = C$$Anko$Factories$Sdk27View.INSTANCE.getSEARCH_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) search_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        SearchView searchView = (SearchView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return searchView;
    }

    @NotNull
    public static final SearchView searchView(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSEARCH_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        SearchView searchView = (SearchView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return searchView;
    }

    @NotNull
    public static final SearchView themedSearchView(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSEARCH_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        SearchView searchView = (SearchView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return searchView;
    }

    @NotNull
    public static final SearchView searchView(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSEARCH_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        SearchView searchView = (SearchView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return searchView;
    }

    @NotNull
    public static final SearchView themedSearchView(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSEARCH_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        SearchView searchView = (SearchView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return searchView;
    }

    @NotNull
    public static final SeekBar seekBar(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 seek_bar = C$$Anko$Factories$Sdk27View.INSTANCE.getSEEK_BAR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) seek_bar.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        SeekBar seekBar = (SeekBar) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return seekBar;
    }

    @NotNull
    public static final SeekBar themedSeekBar(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 seek_bar = C$$Anko$Factories$Sdk27View.INSTANCE.getSEEK_BAR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) seek_bar.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        SeekBar seekBar = (SeekBar) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return seekBar;
    }

    @NotNull
    public static final SlidingDrawer slidingDrawer(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 sliding_drawer = C$$Anko$Factories$Sdk27View.INSTANCE.getSLIDING_DRAWER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) sliding_drawer.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        SlidingDrawer slidingDrawer = (SlidingDrawer) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return slidingDrawer;
    }

    @NotNull
    public static final SlidingDrawer themedSlidingDrawer(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 sliding_drawer = C$$Anko$Factories$Sdk27View.INSTANCE.getSLIDING_DRAWER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) sliding_drawer.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        SlidingDrawer slidingDrawer = (SlidingDrawer) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return slidingDrawer;
    }

    @NotNull
    public static final SlidingDrawer slidingDrawer(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSLIDING_DRAWER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        SlidingDrawer slidingDrawer = (SlidingDrawer) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return slidingDrawer;
    }

    @NotNull
    public static final SlidingDrawer themedSlidingDrawer(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSLIDING_DRAWER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        SlidingDrawer slidingDrawer = (SlidingDrawer) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return slidingDrawer;
    }

    @NotNull
    public static final SlidingDrawer slidingDrawer(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSLIDING_DRAWER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        SlidingDrawer slidingDrawer = (SlidingDrawer) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return slidingDrawer;
    }

    @NotNull
    public static final SlidingDrawer themedSlidingDrawer(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSLIDING_DRAWER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        SlidingDrawer slidingDrawer = (SlidingDrawer) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return slidingDrawer;
    }

    @NotNull
    public static final Space space(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 space = C$$Anko$Factories$Sdk27View.INSTANCE.getSPACE();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) space.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        Space space2 = (Space) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return space2;
    }

    @NotNull
    public static final Space themedSpace(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 space = C$$Anko$Factories$Sdk27View.INSTANCE.getSPACE();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) space.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        Space space2 = (Space) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return space2;
    }

    @NotNull
    public static final Spinner spinner(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 spinner = C$$Anko$Factories$Sdk27View.INSTANCE.getSPINNER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) spinner.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        Spinner spinner2 = (Spinner) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return spinner2;
    }

    @NotNull
    public static final Spinner themedSpinner(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 spinner = C$$Anko$Factories$Sdk27View.INSTANCE.getSPINNER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) spinner.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        Spinner spinner2 = (Spinner) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return spinner2;
    }

    @NotNull
    public static final Spinner spinner(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSPINNER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        Spinner spinner = (Spinner) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return spinner;
    }

    @NotNull
    public static final Spinner themedSpinner(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSPINNER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        Spinner spinner = (Spinner) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return spinner;
    }

    @NotNull
    public static final Spinner spinner(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSPINNER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        Spinner spinner = (Spinner) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return spinner;
    }

    @NotNull
    public static final Spinner themedSpinner(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSPINNER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        Spinner spinner = (Spinner) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return spinner;
    }

    @NotNull
    public static final StackView stackView(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 stack_view = C$$Anko$Factories$Sdk27View.INSTANCE.getSTACK_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) stack_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        StackView stackView = (StackView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return stackView;
    }

    @NotNull
    public static final StackView themedStackView(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 stack_view = C$$Anko$Factories$Sdk27View.INSTANCE.getSTACK_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) stack_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        StackView stackView = (StackView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return stackView;
    }

    @NotNull
    public static final StackView stackView(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSTACK_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        StackView stackView = (StackView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return stackView;
    }

    @NotNull
    public static final StackView themedStackView(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSTACK_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        StackView stackView = (StackView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return stackView;
    }

    @NotNull
    public static final StackView stackView(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSTACK_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        StackView stackView = (StackView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return stackView;
    }

    @NotNull
    public static final StackView themedStackView(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getSTACK_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        StackView stackView = (StackView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return stackView;
    }

    @NotNull
    /* renamed from: switch reason: not valid java name */
    public static final Switch m154switch(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 function1 = C$$Anko$Factories$Sdk27View.INSTANCE.getSWITCH();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) function1.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        Switch switchR = (Switch) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return switchR;
    }

    @NotNull
    public static final Switch themedSwitch(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 function1 = C$$Anko$Factories$Sdk27View.INSTANCE.getSWITCH();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) function1.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        Switch switchR = (Switch) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return switchR;
    }

    @NotNull
    public static final TabHost tabHost(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 tab_host = C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_HOST();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) tab_host.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        TabHost tabHost = (TabHost) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return tabHost;
    }

    @NotNull
    public static final TabHost themedTabHost(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 tab_host = C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_HOST();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) tab_host.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TabHost tabHost = (TabHost) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return tabHost;
    }

    @NotNull
    public static final TabHost tabHost(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_HOST().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        TabHost tabHost = (TabHost) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return tabHost;
    }

    @NotNull
    public static final TabHost themedTabHost(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_HOST().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        TabHost tabHost = (TabHost) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return tabHost;
    }

    @NotNull
    public static final TabHost tabHost(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_HOST().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        TabHost tabHost = (TabHost) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return tabHost;
    }

    @NotNull
    public static final TabHost themedTabHost(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_HOST().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        TabHost tabHost = (TabHost) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return tabHost;
    }

    @NotNull
    public static final TabWidget tabWidget(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 tab_widget = C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_WIDGET();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) tab_widget.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        TabWidget tabWidget = (TabWidget) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return tabWidget;
    }

    @NotNull
    public static final TabWidget themedTabWidget(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 tab_widget = C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_WIDGET();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) tab_widget.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TabWidget tabWidget = (TabWidget) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return tabWidget;
    }

    @NotNull
    public static final TabWidget tabWidget(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_WIDGET().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        TabWidget tabWidget = (TabWidget) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return tabWidget;
    }

    @NotNull
    public static final TabWidget themedTabWidget(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_WIDGET().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        TabWidget tabWidget = (TabWidget) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return tabWidget;
    }

    @NotNull
    public static final TabWidget tabWidget(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_WIDGET().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        TabWidget tabWidget = (TabWidget) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return tabWidget;
    }

    @NotNull
    public static final TabWidget themedTabWidget(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTAB_WIDGET().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        TabWidget tabWidget = (TabWidget) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return tabWidget;
    }

    @NotNull
    public static final TextClock textClock(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 text_clock = C$$Anko$Factories$Sdk27View.INSTANCE.getTEXT_CLOCK();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) text_clock.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        TextClock textClock = (TextClock) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return textClock;
    }

    @NotNull
    public static final TextClock themedTextClock(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 text_clock = C$$Anko$Factories$Sdk27View.INSTANCE.getTEXT_CLOCK();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) text_clock.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TextClock textClock = (TextClock) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return textClock;
    }

    @NotNull
    public static final TextView textView(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getTEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        TextView textView = (TextView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return textView;
    }

    @NotNull
    public static final TextView themedTextView(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 text_view = C$$Anko$Factories$Sdk27View.INSTANCE.getTEXT_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) text_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TextView textView = (TextView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return textView;
    }

    @NotNull
    public static final TimePicker timePicker(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 time_picker = C$$Anko$Factories$Sdk27View.INSTANCE.getTIME_PICKER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) time_picker.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        TimePicker timePicker = (TimePicker) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return timePicker;
    }

    @NotNull
    public static final TimePicker themedTimePicker(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 time_picker = C$$Anko$Factories$Sdk27View.INSTANCE.getTIME_PICKER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) time_picker.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TimePicker timePicker = (TimePicker) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return timePicker;
    }

    @NotNull
    public static final TimePicker timePicker(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTIME_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        TimePicker timePicker = (TimePicker) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return timePicker;
    }

    @NotNull
    public static final TimePicker themedTimePicker(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTIME_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        TimePicker timePicker = (TimePicker) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return timePicker;
    }

    @NotNull
    public static final TimePicker timePicker(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTIME_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        TimePicker timePicker = (TimePicker) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return timePicker;
    }

    @NotNull
    public static final TimePicker themedTimePicker(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTIME_PICKER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        TimePicker timePicker = (TimePicker) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return timePicker;
    }

    @NotNull
    public static final ToggleButton toggleButton(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 toggle_button = C$$Anko$Factories$Sdk27View.INSTANCE.getTOGGLE_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) toggle_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ToggleButton toggleButton = (ToggleButton) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return toggleButton;
    }

    @NotNull
    public static final ToggleButton themedToggleButton(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 toggle_button = C$$Anko$Factories$Sdk27View.INSTANCE.getTOGGLE_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) toggle_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ToggleButton toggleButton = (ToggleButton) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return toggleButton;
    }

    @NotNull
    public static final TwoLineListItem twoLineListItem(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 two_line_list_item = C$$Anko$Factories$Sdk27View.INSTANCE.getTWO_LINE_LIST_ITEM();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) two_line_list_item.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        TwoLineListItem twoLineListItem = (TwoLineListItem) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return twoLineListItem;
    }

    @NotNull
    public static final TwoLineListItem themedTwoLineListItem(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 two_line_list_item = C$$Anko$Factories$Sdk27View.INSTANCE.getTWO_LINE_LIST_ITEM();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) two_line_list_item.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        TwoLineListItem twoLineListItem = (TwoLineListItem) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return twoLineListItem;
    }

    @NotNull
    public static final TwoLineListItem twoLineListItem(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTWO_LINE_LIST_ITEM().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        TwoLineListItem twoLineListItem = (TwoLineListItem) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return twoLineListItem;
    }

    @NotNull
    public static final TwoLineListItem themedTwoLineListItem(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTWO_LINE_LIST_ITEM().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        TwoLineListItem twoLineListItem = (TwoLineListItem) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return twoLineListItem;
    }

    @NotNull
    public static final TwoLineListItem twoLineListItem(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTWO_LINE_LIST_ITEM().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        TwoLineListItem twoLineListItem = (TwoLineListItem) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return twoLineListItem;
    }

    @NotNull
    public static final TwoLineListItem themedTwoLineListItem(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getTWO_LINE_LIST_ITEM().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        TwoLineListItem twoLineListItem = (TwoLineListItem) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return twoLineListItem;
    }

    @NotNull
    public static final VideoView videoView(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 video_view = C$$Anko$Factories$Sdk27View.INSTANCE.getVIDEO_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) video_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        VideoView videoView = (VideoView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return videoView;
    }

    @NotNull
    public static final VideoView themedVideoView(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 video_view = C$$Anko$Factories$Sdk27View.INSTANCE.getVIDEO_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) video_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        VideoView videoView = (VideoView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return videoView;
    }

    @NotNull
    public static final ViewFlipper viewFlipper(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 view_flipper = C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW_FLIPPER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) view_flipper.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ViewFlipper viewFlipper = (ViewFlipper) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return viewFlipper;
    }

    @NotNull
    public static final ViewFlipper themedViewFlipper(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 view_flipper = C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW_FLIPPER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) view_flipper.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ViewFlipper viewFlipper = (ViewFlipper) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return viewFlipper;
    }

    @NotNull
    public static final ViewFlipper viewFlipper(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW_FLIPPER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        ViewFlipper viewFlipper = (ViewFlipper) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return viewFlipper;
    }

    @NotNull
    public static final ViewFlipper themedViewFlipper(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW_FLIPPER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        ViewFlipper viewFlipper = (ViewFlipper) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return viewFlipper;
    }

    @NotNull
    public static final ViewFlipper viewFlipper(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW_FLIPPER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        ViewFlipper viewFlipper = (ViewFlipper) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return viewFlipper;
    }

    @NotNull
    public static final ViewFlipper themedViewFlipper(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getVIEW_FLIPPER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        ViewFlipper viewFlipper = (ViewFlipper) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return viewFlipper;
    }

    @NotNull
    public static final ZoomButton zoomButton(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 zoom_button = C$$Anko$Factories$Sdk27View.INSTANCE.getZOOM_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) zoom_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ZoomButton zoomButton = (ZoomButton) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return zoomButton;
    }

    @NotNull
    public static final ZoomButton themedZoomButton(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 zoom_button = C$$Anko$Factories$Sdk27View.INSTANCE.getZOOM_BUTTON();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) zoom_button.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ZoomButton zoomButton = (ZoomButton) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return zoomButton;
    }

    @NotNull
    public static final ZoomControls zoomControls(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 zoom_controls = C$$Anko$Factories$Sdk27View.INSTANCE.getZOOM_CONTROLS();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) zoom_controls.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        ZoomControls zoomControls = (ZoomControls) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return zoomControls;
    }

    @NotNull
    public static final ZoomControls themedZoomControls(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 zoom_controls = C$$Anko$Factories$Sdk27View.INSTANCE.getZOOM_CONTROLS();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) zoom_controls.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        ZoomControls zoomControls = (ZoomControls) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return zoomControls;
    }

    @NotNull
    public static final ZoomControls zoomControls(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getZOOM_CONTROLS().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        ZoomControls zoomControls = (ZoomControls) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return zoomControls;
    }

    @NotNull
    public static final ZoomControls themedZoomControls(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getZOOM_CONTROLS().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        ZoomControls zoomControls = (ZoomControls) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return zoomControls;
    }

    @NotNull
    public static final ZoomControls zoomControls(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getZOOM_CONTROLS().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        ZoomControls zoomControls = (ZoomControls) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return zoomControls;
    }

    @NotNull
    public static final ZoomControls themedZoomControls(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27View.INSTANCE.getZOOM_CONTROLS().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        ZoomControls zoomControls = (ZoomControls) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return zoomControls;
    }

    @NotNull
    public static final AppWidgetHostView appWidgetHostView(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 app_widget_host_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getAPP_WIDGET_HOST_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) app_widget_host_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        _AppWidgetHostView _appwidgethostview = (_AppWidgetHostView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (AppWidgetHostView) view;
    }

    @NotNull
    public static final AppWidgetHostView themedAppWidgetHostView(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 app_widget_host_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getAPP_WIDGET_HOST_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) app_widget_host_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _AppWidgetHostView _appwidgethostview = (_AppWidgetHostView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (AppWidgetHostView) view;
    }

    @NotNull
    public static final AppWidgetHostView appWidgetHostView(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getAPP_WIDGET_HOST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        _AppWidgetHostView _appwidgethostview = (_AppWidgetHostView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (AppWidgetHostView) view;
    }

    @NotNull
    public static final AppWidgetHostView themedAppWidgetHostView(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getAPP_WIDGET_HOST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _AppWidgetHostView _appwidgethostview = (_AppWidgetHostView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (AppWidgetHostView) view;
    }

    @NotNull
    public static final AppWidgetHostView appWidgetHostView(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getAPP_WIDGET_HOST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        _AppWidgetHostView _appwidgethostview = (_AppWidgetHostView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (AppWidgetHostView) view;
    }

    @NotNull
    public static final AppWidgetHostView themedAppWidgetHostView(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getAPP_WIDGET_HOST_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _AppWidgetHostView _appwidgethostview = (_AppWidgetHostView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (AppWidgetHostView) view;
    }

    @NotNull
    public static final AbsoluteLayout absoluteLayout(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 absolute_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getABSOLUTE_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) absolute_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        _AbsoluteLayout _absolutelayout = (_AbsoluteLayout) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (AbsoluteLayout) view;
    }

    @NotNull
    public static final AbsoluteLayout themedAbsoluteLayout(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 absolute_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getABSOLUTE_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) absolute_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _AbsoluteLayout _absolutelayout = (_AbsoluteLayout) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (AbsoluteLayout) view;
    }

    @NotNull
    public static final AbsoluteLayout absoluteLayout(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getABSOLUTE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        _AbsoluteLayout _absolutelayout = (_AbsoluteLayout) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (AbsoluteLayout) view;
    }

    @NotNull
    public static final AbsoluteLayout themedAbsoluteLayout(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getABSOLUTE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _AbsoluteLayout _absolutelayout = (_AbsoluteLayout) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (AbsoluteLayout) view;
    }

    @NotNull
    public static final AbsoluteLayout absoluteLayout(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getABSOLUTE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        _AbsoluteLayout _absolutelayout = (_AbsoluteLayout) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (AbsoluteLayout) view;
    }

    @NotNull
    public static final AbsoluteLayout themedAbsoluteLayout(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getABSOLUTE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _AbsoluteLayout _absolutelayout = (_AbsoluteLayout) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (AbsoluteLayout) view;
    }

    @NotNull
    public static final ActionMenuView actionMenuView(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 action_menu_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getACTION_MENU_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) action_menu_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        _ActionMenuView _actionmenuview = (_ActionMenuView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ActionMenuView) view;
    }

    @NotNull
    public static final ActionMenuView themedActionMenuView(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 action_menu_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getACTION_MENU_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) action_menu_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _ActionMenuView _actionmenuview = (_ActionMenuView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ActionMenuView) view;
    }

    @NotNull
    public static final ActionMenuView actionMenuView(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getACTION_MENU_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        _ActionMenuView _actionmenuview = (_ActionMenuView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (ActionMenuView) view;
    }

    @NotNull
    public static final ActionMenuView themedActionMenuView(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getACTION_MENU_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _ActionMenuView _actionmenuview = (_ActionMenuView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (ActionMenuView) view;
    }

    @NotNull
    public static final ActionMenuView actionMenuView(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getACTION_MENU_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        _ActionMenuView _actionmenuview = (_ActionMenuView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ActionMenuView) view;
    }

    @NotNull
    public static final ActionMenuView themedActionMenuView(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getACTION_MENU_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _ActionMenuView _actionmenuview = (_ActionMenuView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ActionMenuView) view;
    }

    @NotNull
    public static final FrameLayout frameLayout(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 frame_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getFRAME_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) frame_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        _FrameLayout _framelayout = (_FrameLayout) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (FrameLayout) view;
    }

    @NotNull
    public static final FrameLayout themedFrameLayout(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 frame_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getFRAME_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) frame_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _FrameLayout _framelayout = (_FrameLayout) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (FrameLayout) view;
    }

    @NotNull
    public static final FrameLayout frameLayout(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getFRAME_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        _FrameLayout _framelayout = (_FrameLayout) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (FrameLayout) view;
    }

    @NotNull
    public static final FrameLayout themedFrameLayout(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getFRAME_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _FrameLayout _framelayout = (_FrameLayout) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (FrameLayout) view;
    }

    @NotNull
    public static final FrameLayout frameLayout(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getFRAME_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        _FrameLayout _framelayout = (_FrameLayout) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (FrameLayout) view;
    }

    @NotNull
    public static final FrameLayout themedFrameLayout(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getFRAME_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _FrameLayout _framelayout = (_FrameLayout) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (FrameLayout) view;
    }

    @NotNull
    public static final Gallery gallery(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 gallery = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGALLERY();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) gallery.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        _Gallery _gallery = (_Gallery) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (Gallery) view;
    }

    @NotNull
    public static final Gallery themedGallery(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 gallery = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGALLERY();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) gallery.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _Gallery _gallery = (_Gallery) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (Gallery) view;
    }

    @NotNull
    public static final Gallery gallery(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGALLERY().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        _Gallery _gallery = (_Gallery) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (Gallery) view;
    }

    @NotNull
    public static final Gallery themedGallery(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGALLERY().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _Gallery _gallery = (_Gallery) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (Gallery) view;
    }

    @NotNull
    public static final Gallery gallery(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGALLERY().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        _Gallery _gallery = (_Gallery) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (Gallery) view;
    }

    @NotNull
    public static final Gallery themedGallery(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGALLERY().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _Gallery _gallery = (_Gallery) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (Gallery) view;
    }

    @NotNull
    public static final GridLayout gridLayout(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 grid_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) grid_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        _GridLayout _gridlayout = (_GridLayout) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (GridLayout) view;
    }

    @NotNull
    public static final GridLayout themedGridLayout(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 grid_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) grid_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _GridLayout _gridlayout = (_GridLayout) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (GridLayout) view;
    }

    @NotNull
    public static final GridLayout gridLayout(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        _GridLayout _gridlayout = (_GridLayout) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (GridLayout) view;
    }

    @NotNull
    public static final GridLayout themedGridLayout(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _GridLayout _gridlayout = (_GridLayout) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (GridLayout) view;
    }

    @NotNull
    public static final GridLayout gridLayout(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        _GridLayout _gridlayout = (_GridLayout) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (GridLayout) view;
    }

    @NotNull
    public static final GridLayout themedGridLayout(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _GridLayout _gridlayout = (_GridLayout) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (GridLayout) view;
    }

    @NotNull
    public static final GridView gridView(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 grid_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) grid_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        _GridView _gridview = (_GridView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (GridView) view;
    }

    @NotNull
    public static final GridView themedGridView(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 grid_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) grid_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _GridView _gridview = (_GridView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (GridView) view;
    }

    @NotNull
    public static final GridView gridView(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        _GridView _gridview = (_GridView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (GridView) view;
    }

    @NotNull
    public static final GridView themedGridView(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _GridView _gridview = (_GridView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (GridView) view;
    }

    @NotNull
    public static final GridView gridView(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        _GridView _gridview = (_GridView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (GridView) view;
    }

    @NotNull
    public static final GridView themedGridView(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getGRID_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _GridView _gridview = (_GridView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (GridView) view;
    }

    @NotNull
    public static final HorizontalScrollView horizontalScrollView(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 horizontal_scroll_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getHORIZONTAL_SCROLL_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) horizontal_scroll_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        _HorizontalScrollView _horizontalscrollview = (_HorizontalScrollView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (HorizontalScrollView) view;
    }

    @NotNull
    public static final HorizontalScrollView themedHorizontalScrollView(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 horizontal_scroll_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getHORIZONTAL_SCROLL_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) horizontal_scroll_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _HorizontalScrollView _horizontalscrollview = (_HorizontalScrollView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (HorizontalScrollView) view;
    }

    @NotNull
    public static final HorizontalScrollView horizontalScrollView(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getHORIZONTAL_SCROLL_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        _HorizontalScrollView _horizontalscrollview = (_HorizontalScrollView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (HorizontalScrollView) view;
    }

    @NotNull
    public static final HorizontalScrollView themedHorizontalScrollView(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getHORIZONTAL_SCROLL_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _HorizontalScrollView _horizontalscrollview = (_HorizontalScrollView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (HorizontalScrollView) view;
    }

    @NotNull
    public static final HorizontalScrollView horizontalScrollView(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getHORIZONTAL_SCROLL_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        _HorizontalScrollView _horizontalscrollview = (_HorizontalScrollView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (HorizontalScrollView) view;
    }

    @NotNull
    public static final HorizontalScrollView themedHorizontalScrollView(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getHORIZONTAL_SCROLL_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _HorizontalScrollView _horizontalscrollview = (_HorizontalScrollView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (HorizontalScrollView) view;
    }

    @NotNull
    public static final ImageSwitcher imageSwitcher(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 image_switcher = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getIMAGE_SWITCHER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_switcher.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        _ImageSwitcher _imageswitcher = (_ImageSwitcher) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ImageSwitcher) view;
    }

    @NotNull
    public static final ImageSwitcher themedImageSwitcher(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 image_switcher = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getIMAGE_SWITCHER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) image_switcher.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _ImageSwitcher _imageswitcher = (_ImageSwitcher) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ImageSwitcher) view;
    }

    @NotNull
    public static final ImageSwitcher imageSwitcher(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getIMAGE_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        _ImageSwitcher _imageswitcher = (_ImageSwitcher) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (ImageSwitcher) view;
    }

    @NotNull
    public static final ImageSwitcher themedImageSwitcher(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getIMAGE_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _ImageSwitcher _imageswitcher = (_ImageSwitcher) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (ImageSwitcher) view;
    }

    @NotNull
    public static final ImageSwitcher imageSwitcher(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getIMAGE_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        _ImageSwitcher _imageswitcher = (_ImageSwitcher) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ImageSwitcher) view;
    }

    @NotNull
    public static final ImageSwitcher themedImageSwitcher(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getIMAGE_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _ImageSwitcher _imageswitcher = (_ImageSwitcher) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ImageSwitcher) view;
    }

    @NotNull
    public static final LinearLayout linearLayout(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 linear_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getLINEAR_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) linear_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        _LinearLayout _linearlayout = (_LinearLayout) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (LinearLayout) view;
    }

    @NotNull
    public static final LinearLayout themedLinearLayout(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 linear_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getLINEAR_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) linear_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _LinearLayout _linearlayout = (_LinearLayout) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (LinearLayout) view;
    }

    @NotNull
    public static final LinearLayout linearLayout(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getLINEAR_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        _LinearLayout _linearlayout = (_LinearLayout) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (LinearLayout) view;
    }

    @NotNull
    public static final LinearLayout themedLinearLayout(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getLINEAR_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _LinearLayout _linearlayout = (_LinearLayout) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (LinearLayout) view;
    }

    @NotNull
    public static final LinearLayout linearLayout(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getLINEAR_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        _LinearLayout _linearlayout = (_LinearLayout) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (LinearLayout) view;
    }

    @NotNull
    public static final LinearLayout themedLinearLayout(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getLINEAR_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _LinearLayout _linearlayout = (_LinearLayout) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (LinearLayout) view;
    }

    @NotNull
    public static final RadioGroup radioGroup(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 radio_group = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRADIO_GROUP();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) radio_group.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        _RadioGroup _radiogroup = (_RadioGroup) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (RadioGroup) view;
    }

    @NotNull
    public static final RadioGroup themedRadioGroup(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 radio_group = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRADIO_GROUP();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) radio_group.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _RadioGroup _radiogroup = (_RadioGroup) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (RadioGroup) view;
    }

    @NotNull
    public static final RadioGroup radioGroup(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRADIO_GROUP().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        _RadioGroup _radiogroup = (_RadioGroup) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (RadioGroup) view;
    }

    @NotNull
    public static final RadioGroup themedRadioGroup(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRADIO_GROUP().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _RadioGroup _radiogroup = (_RadioGroup) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (RadioGroup) view;
    }

    @NotNull
    public static final RadioGroup radioGroup(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRADIO_GROUP().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        _RadioGroup _radiogroup = (_RadioGroup) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (RadioGroup) view;
    }

    @NotNull
    public static final RadioGroup themedRadioGroup(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRADIO_GROUP().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _RadioGroup _radiogroup = (_RadioGroup) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (RadioGroup) view;
    }

    @NotNull
    public static final RelativeLayout relativeLayout(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 relative_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRELATIVE_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) relative_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        _RelativeLayout _relativelayout = (_RelativeLayout) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (RelativeLayout) view;
    }

    @NotNull
    public static final RelativeLayout themedRelativeLayout(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 relative_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRELATIVE_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) relative_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _RelativeLayout _relativelayout = (_RelativeLayout) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (RelativeLayout) view;
    }

    @NotNull
    public static final RelativeLayout relativeLayout(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRELATIVE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        _RelativeLayout _relativelayout = (_RelativeLayout) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (RelativeLayout) view;
    }

    @NotNull
    public static final RelativeLayout themedRelativeLayout(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRELATIVE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _RelativeLayout _relativelayout = (_RelativeLayout) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (RelativeLayout) view;
    }

    @NotNull
    public static final RelativeLayout relativeLayout(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRELATIVE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        _RelativeLayout _relativelayout = (_RelativeLayout) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (RelativeLayout) view;
    }

    @NotNull
    public static final RelativeLayout themedRelativeLayout(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getRELATIVE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _RelativeLayout _relativelayout = (_RelativeLayout) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (RelativeLayout) view;
    }

    @NotNull
    public static final ScrollView scrollView(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 scroll_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getSCROLL_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) scroll_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        _ScrollView _scrollview = (_ScrollView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ScrollView) view;
    }

    @NotNull
    public static final ScrollView themedScrollView(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 scroll_view = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getSCROLL_VIEW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) scroll_view.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _ScrollView _scrollview = (_ScrollView) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ScrollView) view;
    }

    @NotNull
    public static final ScrollView scrollView(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getSCROLL_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        _ScrollView _scrollview = (_ScrollView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (ScrollView) view;
    }

    @NotNull
    public static final ScrollView themedScrollView(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getSCROLL_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _ScrollView _scrollview = (_ScrollView) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (ScrollView) view;
    }

    @NotNull
    public static final ScrollView scrollView(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getSCROLL_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        _ScrollView _scrollview = (_ScrollView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ScrollView) view;
    }

    @NotNull
    public static final ScrollView themedScrollView(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getSCROLL_VIEW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _ScrollView _scrollview = (_ScrollView) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ScrollView) view;
    }

    @NotNull
    public static final TableLayout tableLayout(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 table_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) table_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        _TableLayout _tablelayout = (_TableLayout) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (TableLayout) view;
    }

    @NotNull
    public static final TableLayout themedTableLayout(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 table_layout = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_LAYOUT();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) table_layout.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _TableLayout _tablelayout = (_TableLayout) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (TableLayout) view;
    }

    @NotNull
    public static final TableLayout tableLayout(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        _TableLayout _tablelayout = (_TableLayout) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (TableLayout) view;
    }

    @NotNull
    public static final TableLayout themedTableLayout(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _TableLayout _tablelayout = (_TableLayout) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (TableLayout) view;
    }

    @NotNull
    public static final TableLayout tableLayout(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        _TableLayout _tablelayout = (_TableLayout) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (TableLayout) view;
    }

    @NotNull
    public static final TableLayout themedTableLayout(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_LAYOUT().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _TableLayout _tablelayout = (_TableLayout) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (TableLayout) view;
    }

    @NotNull
    public static final TableRow tableRow(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 table_row = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_ROW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) table_row.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        _TableRow _tablerow = (_TableRow) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (TableRow) view;
    }

    @NotNull
    public static final TableRow themedTableRow(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 table_row = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_ROW();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) table_row.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _TableRow _tablerow = (_TableRow) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (TableRow) view;
    }

    @NotNull
    public static final TableRow tableRow(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_ROW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        _TableRow _tablerow = (_TableRow) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (TableRow) view;
    }

    @NotNull
    public static final TableRow themedTableRow(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_ROW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _TableRow _tablerow = (_TableRow) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (TableRow) view;
    }

    @NotNull
    public static final TableRow tableRow(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_ROW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        _TableRow _tablerow = (_TableRow) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (TableRow) view;
    }

    @NotNull
    public static final TableRow themedTableRow(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTABLE_ROW().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _TableRow _tablerow = (_TableRow) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (TableRow) view;
    }

    @NotNull
    public static final TextSwitcher textSwitcher(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 text_switcher = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTEXT_SWITCHER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) text_switcher.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        _TextSwitcher _textswitcher = (_TextSwitcher) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (TextSwitcher) view;
    }

    @NotNull
    public static final TextSwitcher themedTextSwitcher(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 text_switcher = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTEXT_SWITCHER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) text_switcher.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _TextSwitcher _textswitcher = (_TextSwitcher) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (TextSwitcher) view;
    }

    @NotNull
    public static final TextSwitcher textSwitcher(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTEXT_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        _TextSwitcher _textswitcher = (_TextSwitcher) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (TextSwitcher) view;
    }

    @NotNull
    public static final TextSwitcher themedTextSwitcher(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTEXT_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _TextSwitcher _textswitcher = (_TextSwitcher) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (TextSwitcher) view;
    }

    @NotNull
    public static final TextSwitcher textSwitcher(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTEXT_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        _TextSwitcher _textswitcher = (_TextSwitcher) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (TextSwitcher) view;
    }

    @NotNull
    public static final TextSwitcher themedTextSwitcher(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTEXT_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _TextSwitcher _textswitcher = (_TextSwitcher) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (TextSwitcher) view;
    }

    @NotNull
    public static final Toolbar toolbar(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 toolbar = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTOOLBAR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) toolbar.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        _Toolbar _toolbar = (_Toolbar) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (Toolbar) view;
    }

    @NotNull
    public static final Toolbar themedToolbar(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 toolbar = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTOOLBAR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) toolbar.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _Toolbar _toolbar = (_Toolbar) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (Toolbar) view;
    }

    @NotNull
    public static final Toolbar toolbar(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTOOLBAR().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        _Toolbar _toolbar = (_Toolbar) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (Toolbar) view;
    }

    @NotNull
    public static final Toolbar themedToolbar(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTOOLBAR().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _Toolbar _toolbar = (_Toolbar) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (Toolbar) view;
    }

    @NotNull
    public static final Toolbar toolbar(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTOOLBAR().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        _Toolbar _toolbar = (_Toolbar) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (Toolbar) view;
    }

    @NotNull
    public static final Toolbar themedToolbar(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getTOOLBAR().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _Toolbar _toolbar = (_Toolbar) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (Toolbar) view;
    }

    @NotNull
    public static final ViewAnimator viewAnimator(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 view_animator = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_ANIMATOR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) view_animator.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        _ViewAnimator _viewanimator = (_ViewAnimator) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ViewAnimator) view;
    }

    @NotNull
    public static final ViewAnimator themedViewAnimator(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 view_animator = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_ANIMATOR();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) view_animator.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _ViewAnimator _viewanimator = (_ViewAnimator) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ViewAnimator) view;
    }

    @NotNull
    public static final ViewAnimator viewAnimator(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_ANIMATOR().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        _ViewAnimator _viewanimator = (_ViewAnimator) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (ViewAnimator) view;
    }

    @NotNull
    public static final ViewAnimator themedViewAnimator(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_ANIMATOR().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _ViewAnimator _viewanimator = (_ViewAnimator) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (ViewAnimator) view;
    }

    @NotNull
    public static final ViewAnimator viewAnimator(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_ANIMATOR().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        _ViewAnimator _viewanimator = (_ViewAnimator) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ViewAnimator) view;
    }

    @NotNull
    public static final ViewAnimator themedViewAnimator(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_ANIMATOR().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _ViewAnimator _viewanimator = (_ViewAnimator) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ViewAnimator) view;
    }

    @NotNull
    public static final ViewSwitcher viewSwitcher(@NotNull ViewManager viewManager) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 view_switcher = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_SWITCHER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) view_switcher.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), 0));
        _ViewSwitcher _viewswitcher = (_ViewSwitcher) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ViewSwitcher) view;
    }

    @NotNull
    public static final ViewSwitcher themedViewSwitcher(@NotNull ViewManager viewManager, int i) {
        Intrinsics.checkParameterIsNotNull(viewManager, "receiver$0");
        Function1 view_switcher = C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_SWITCHER();
        AnkoInternals ankoInternals = AnkoInternals.INSTANCE;
        View view = (View) view_switcher.invoke(ankoInternals.wrapContextIfNeeded(ankoInternals.getContext(viewManager), i));
        _ViewSwitcher _viewswitcher = (_ViewSwitcher) view;
        AnkoInternals.INSTANCE.addView(viewManager, view);
        return (ViewSwitcher) view;
    }

    @NotNull
    public static final ViewSwitcher viewSwitcher(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, 0));
        _ViewSwitcher _viewswitcher = (_ViewSwitcher) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (ViewSwitcher) view;
    }

    @NotNull
    public static final ViewSwitcher themedViewSwitcher(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(context, i));
        _ViewSwitcher _viewswitcher = (_ViewSwitcher) view;
        AnkoInternals.INSTANCE.addView(context, view);
        return (ViewSwitcher) view;
    }

    @NotNull
    public static final ViewSwitcher viewSwitcher(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, 0));
        _ViewSwitcher _viewswitcher = (_ViewSwitcher) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ViewSwitcher) view;
    }

    @NotNull
    public static final ViewSwitcher themedViewSwitcher(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "receiver$0");
        View view = (View) C$$Anko$Factories$Sdk27ViewGroup.INSTANCE.getVIEW_SWITCHER().invoke(AnkoInternals.INSTANCE.wrapContextIfNeeded(activity, i));
        _ViewSwitcher _viewswitcher = (_ViewSwitcher) view;
        AnkoInternals.INSTANCE.addView(activity, view);
        return (ViewSwitcher) view;
    }
}
