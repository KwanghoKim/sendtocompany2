package org.schabi.newpipe;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\u0006H\u0016\u00a8\u0006\n"}, d2 = {"Lorg/schabi/newpipe/DebugApp;", "Lorg/schabi/newpipe/App;", "()V", "getDownloader", "Lorg/schabi/newpipe/extractor/downloader/Downloader;", "initStetho", "", "isDisposedRxExceptionsReported", "", "onCreate", "app_debug"})
public final class DebugApp extends org.schabi.newpipe.App {
    
    public DebugApp() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.schabi.newpipe.extractor.downloader.Downloader getDownloader() {
        return null;
    }
    
    private final void initStetho() {
    }
    
    @java.lang.Override()
    protected boolean isDisposedRxExceptionsReported() {
        return false;
    }
}