package org.jetbrains.anko.db;

import android.database.sqlite.SQLiteException;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class SQLiteParserHelpersKt__SqlParserHelpersKt$rowParser$15 implements RowParser<R> {
    final /* synthetic */ Function15 $parser;

    SQLiteParserHelpersKt__SqlParserHelpersKt$rowParser$15(Function15 function15) {
        this.$parser = function15;
    }

    public R parseRow(@NotNull Object[] objArr) {
        Object[] objArr2 = objArr;
        Intrinsics.checkParameterIsNotNull(objArr2, "columns");
        if (objArr2.length == 15) {
            return this.$parser.invoke(objArr2[0], objArr2[1], objArr2[2], objArr2[3], objArr2[4], objArr2[5], objArr2[6], objArr2[7], objArr2[8], objArr2[9], objArr2[10], objArr2[11], objArr2[12], objArr2[13], objArr2[14]);
        }
        throw new SQLiteException("Invalid row: 15 columns required");
    }
}
