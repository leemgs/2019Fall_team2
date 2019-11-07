package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class CursorWindowCompat {
    private CursorWindowCompat() {
    }

    @NonNull
    public static CursorWindow create(@Nullable String str, long j) {
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            return new CursorWindow(str, j);
        }
        if (i >= 15) {
            return new CursorWindow(str);
        }
        return new CursorWindow(false);
    }
}