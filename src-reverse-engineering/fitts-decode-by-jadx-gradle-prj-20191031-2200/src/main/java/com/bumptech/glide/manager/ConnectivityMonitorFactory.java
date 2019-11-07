package com.bumptech.glide.manager;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener;

public interface ConnectivityMonitorFactory {
    @NonNull
    ConnectivityMonitor build(@NonNull Context context, @NonNull ConnectivityListener connectivityListener);
}
