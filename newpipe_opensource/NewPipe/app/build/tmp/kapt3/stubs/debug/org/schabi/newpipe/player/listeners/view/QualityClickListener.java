package org.schabi.newpipe.player.listeners.view;

import java.lang.System;

/**
 * Click listener for the qualityTextView of the player
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/schabi/newpipe/player/listeners/view/QualityClickListener;", "Landroid/view/View$OnClickListener;", "player", "Lorg/schabi/newpipe/player/Player;", "qualityPopupMenu", "Landroidx/appcompat/widget/PopupMenu;", "(Lorg/schabi/newpipe/player/Player;Landroidx/appcompat/widget/PopupMenu;)V", "onClick", "", "v", "Landroid/view/View;", "Companion", "app_debug"})
public final class QualityClickListener implements android.view.View.OnClickListener {
    private final org.schabi.newpipe.player.Player player = null;
    private final androidx.appcompat.widget.PopupMenu qualityPopupMenu = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipe.player.listeners.view.QualityClickListener.Companion Companion = null;
    private static final java.lang.String TAG = "QualityClickListener";
    
    public QualityClickListener(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.player.Player player, @org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.PopupMenu qualityPopupMenu) {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/schabi/newpipe/player/listeners/view/QualityClickListener$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}