package dagger.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

public final class DaggerCollections {
    private static int calculateInitialCapacity(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <T> List<T> presizedList(int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(i);
    }

    public static boolean hasDuplicates(List<?> list) {
        boolean z = false;
        if (list.size() < 2) {
            return false;
        }
        if (list.size() != new HashSet(list).size()) {
            z = true;
        }
        return z;
    }

    static <K, V> LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int i) {
        return new LinkedHashMap<>(calculateInitialCapacity(i));
    }
}
