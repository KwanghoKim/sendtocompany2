package org.schabi.newpipe.database.feed.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\'J$\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\'J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u000fH\'J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u000f2\u0006\u0010\f\u001a\u00020\rH\'J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u000fH\'J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u000f2\u0006\u0010\f\u001a\u00020\rH\'J$\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0004H\'J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\'J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0007H\'J\u0015\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001eH!\u00a2\u0006\u0002\b\u001fJ\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\'J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\f\u001a\u00020\rH\'J\u001c\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00062\u0006\u0010\f\u001a\u00020\rH\'J\u0014\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006H\'J\u0010\u0010$\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0017J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\rH\'J\u0010\u0010\'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\nH\'J\u0015\u0010)\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eH!\u00a2\u0006\u0002\b*\u00a8\u0006+"}, d2 = {"Lorg/schabi/newpipe/database/feed/dao/FeedDAO;", "", "()V", "deleteAll", "", "getAllOutdated", "Lio/reactivex/rxjava3/core/Flowable;", "", "Lorg/schabi/newpipe/database/subscription/SubscriptionEntity;", "outdatedThreshold", "Ljava/time/OffsetDateTime;", "getAllOutdatedForGroup", "groupId", "", "getAllStreams", "Lio/reactivex/rxjava3/core/Maybe;", "Lorg/schabi/newpipe/database/stream/StreamWithState;", "getAllStreamsForGroup", "getLiveOrNotPlayedStreams", "getLiveOrNotPlayedStreamsForGroup", "getOutdatedWithNotificationMode", "notificationMode", "insert", "", "feedEntity", "Lorg/schabi/newpipe/database/feed/model/FeedEntity;", "insertAll", "entities", "insertLastUpdated", "lastUpdatedEntity", "Lorg/schabi/newpipe/database/feed/model/FeedLastUpdatedEntity;", "insertLastUpdated$app_debug", "notLoadedCount", "notLoadedCountForGroup", "oldestSubscriptionUpdate", "oldestSubscriptionUpdateFromAll", "setLastUpdatedForSubscription", "unlinkOldLivestreams", "subscriptionId", "unlinkStreamsOlderThan", "offsetDateTime", "updateLastUpdated", "updateLastUpdated$app_debug", "app_debug"})
public abstract class FeedDAO {
    
    public FeedDAO() {
        super();
    }
    
    @androidx.room.Query(value = "DELETE FROM feed")
    public abstract int deleteAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT s.*, sst.progress_time\n        FROM streams s\n\n        LEFT JOIN stream_state sst\n        ON s.uid = sst.stream_id\n\n        LEFT JOIN stream_history sh\n        ON s.uid = sh.stream_id\n\n        INNER JOIN feed f\n        ON s.uid = f.stream_id\n\n        ORDER BY s.upload_date IS NULL DESC, s.upload_date DESC, s.uploader ASC\n        LIMIT 500\n        ")
    public abstract io.reactivex.rxjava3.core.Maybe<java.util.List<org.schabi.newpipe.database.stream.StreamWithState>> getAllStreams();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT s.*, sst.progress_time\n        FROM streams s\n\n        LEFT JOIN stream_state sst\n        ON s.uid = sst.stream_id\n\n        LEFT JOIN stream_history sh\n        ON s.uid = sh.stream_id\n\n        INNER JOIN feed f\n        ON s.uid = f.stream_id\n\n        INNER JOIN feed_group_subscription_join fgs\n        ON fgs.subscription_id = f.subscription_id\n\n        WHERE fgs.group_id = :groupId\n\n        ORDER BY s.upload_date IS NULL DESC, s.upload_date DESC, s.uploader ASC\n        LIMIT 500\n        ")
    public abstract io.reactivex.rxjava3.core.Maybe<java.util.List<org.schabi.newpipe.database.stream.StreamWithState>> getAllStreamsForGroup(long groupId);
    
    /**
     * @see StreamStateEntity.isFinished()
     * @see StreamStateEntity.PLAYBACK_FINISHED_END_MILLISECONDS
     * @return all of the non-live, never-played and non-finished streams in the feed
     *        (all of the cited conditions must hold for a stream to be in the returned list)
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT s.*, sst.progress_time\n        FROM streams s\n\n        LEFT JOIN stream_state sst\n        ON s.uid = sst.stream_id\n\n        LEFT JOIN stream_history sh\n        ON s.uid = sh.stream_id    \n            \n        INNER JOIN feed f\n        ON s.uid = f.stream_id\n\n        WHERE (\n            sh.stream_id IS NULL\n            OR sst.stream_id IS NULL\n            OR sst.progress_time < s.duration * 1000 - 60000\n            OR sst.progress_time < s.duration * 1000 * 3 / 4\n            OR s.stream_type = \'LIVE_STREAM\'\n            OR s.stream_type = \'AUDIO_LIVE_STREAM\'\n        )\n\n        ORDER BY s.upload_date IS NULL DESC, s.upload_date DESC, s.uploader ASC\n        LIMIT 500\n        ")
    public abstract io.reactivex.rxjava3.core.Maybe<java.util.List<org.schabi.newpipe.database.stream.StreamWithState>> getLiveOrNotPlayedStreams();
    
    /**
     * @see StreamStateEntity.isFinished()
     * @see StreamStateEntity.PLAYBACK_FINISHED_END_MILLISECONDS
     * @param groupId the group id to get streams of
     * @return all of the non-live, never-played and non-finished streams for the given feed group
     *        (all of the cited conditions must hold for a stream to be in the returned list)
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT s.*, sst.progress_time\n        FROM streams s\n\n        LEFT JOIN stream_state sst\n        ON s.uid = sst.stream_id\n        \n        LEFT JOIN stream_history sh\n        ON s.uid = sh.stream_id\n        \n        INNER JOIN feed f\n        ON s.uid = f.stream_id\n\n        INNER JOIN feed_group_subscription_join fgs\n        ON fgs.subscription_id = f.subscription_id\n\n        WHERE fgs.group_id = :groupId\n        AND (\n            sh.stream_id IS NULL\n            OR sst.stream_id IS NULL\n            OR sst.progress_time < s.duration * 1000 - 60000\n            OR sst.progress_time < s.duration * 1000 * 3 / 4\n            OR s.stream_type = \'LIVE_STREAM\'\n            OR s.stream_type = \'AUDIO_LIVE_STREAM\'\n        )\n\n        ORDER BY s.upload_date IS NULL DESC, s.upload_date DESC, s.uploader ASC\n        LIMIT 500\n        ")
    public abstract io.reactivex.rxjava3.core.Maybe<java.util.List<org.schabi.newpipe.database.stream.StreamWithState>> getLiveOrNotPlayedStreamsForGroup(long groupId);
    
    @androidx.room.Query(value = "\n        DELETE FROM feed WHERE\n\n        feed.stream_id IN (\n            SELECT s.uid FROM streams s\n\n            INNER JOIN feed f\n            ON s.uid = f.stream_id\n\n            WHERE s.upload_date < :offsetDateTime\n        )\n        ")
    public abstract void unlinkStreamsOlderThan(@org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime offsetDateTime);
    
    @androidx.room.Query(value = "\n        DELETE FROM feed\n        \n        WHERE feed.subscription_id = :subscriptionId\n\n        AND feed.stream_id IN (\n            SELECT s.uid FROM streams s\n\n            INNER JOIN feed f\n            ON s.uid = f.stream_id\n\n            WHERE s.stream_type = \"LIVE_STREAM\" OR s.stream_type = \"AUDIO_LIVE_STREAM\"\n        )\n        ")
    public abstract void unlinkOldLivestreams(long subscriptionId);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.database.feed.model.FeedEntity feedEntity);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.util.List<java.lang.Long> insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<org.schabi.newpipe.database.feed.model.FeedEntity> entities);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract long insertLastUpdated$app_debug(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.database.feed.model.FeedLastUpdatedEntity lastUpdatedEntity);
    
    @androidx.room.Update(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void updateLastUpdated$app_debug(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.database.feed.model.FeedLastUpdatedEntity lastUpdatedEntity);
    
    @androidx.room.Transaction()
    public void setLastUpdatedForSubscription(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.database.feed.model.FeedLastUpdatedEntity lastUpdatedEntity) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT MIN(lu.last_updated) FROM feed_last_updated lu\n\n        INNER JOIN feed_group_subscription_join fgs\n        ON fgs.subscription_id = lu.subscription_id AND fgs.group_id = :groupId\n        ")
    public abstract io.reactivex.rxjava3.core.Flowable<java.util.List<java.time.OffsetDateTime>> oldestSubscriptionUpdate(long groupId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT MIN(last_updated) FROM feed_last_updated")
    public abstract io.reactivex.rxjava3.core.Flowable<java.util.List<java.time.OffsetDateTime>> oldestSubscriptionUpdateFromAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT COUNT(*) FROM feed_last_updated WHERE last_updated IS NULL")
    public abstract io.reactivex.rxjava3.core.Flowable<java.lang.Long> notLoadedCount();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT COUNT(*) FROM subscriptions s\n        \n        INNER JOIN feed_group_subscription_join fgs\n        ON s.uid = fgs.subscription_id AND fgs.group_id = :groupId\n\n        LEFT JOIN feed_last_updated lu\n        ON s.uid = lu.subscription_id \n\n        WHERE lu.last_updated IS NULL\n        ")
    public abstract io.reactivex.rxjava3.core.Flowable<java.lang.Long> notLoadedCountForGroup(long groupId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT s.* FROM subscriptions s\n\n        LEFT JOIN feed_last_updated lu\n        ON s.uid = lu.subscription_id \n\n        WHERE lu.last_updated IS NULL OR lu.last_updated < :outdatedThreshold\n        ")
    public abstract io.reactivex.rxjava3.core.Flowable<java.util.List<org.schabi.newpipe.database.subscription.SubscriptionEntity>> getAllOutdated(@org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime outdatedThreshold);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT s.* FROM subscriptions s\n\n        INNER JOIN feed_group_subscription_join fgs\n        ON s.uid = fgs.subscription_id AND fgs.group_id = :groupId\n\n        LEFT JOIN feed_last_updated lu\n        ON s.uid = lu.subscription_id\n\n        WHERE lu.last_updated IS NULL OR lu.last_updated < :outdatedThreshold\n        ")
    public abstract io.reactivex.rxjava3.core.Flowable<java.util.List<org.schabi.newpipe.database.subscription.SubscriptionEntity>> getAllOutdatedForGroup(long groupId, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime outdatedThreshold);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT s.* FROM subscriptions s\n\n        LEFT JOIN feed_last_updated lu\n        ON s.uid = lu.subscription_id\n\n        WHERE \n            (lu.last_updated IS NULL OR lu.last_updated < :outdatedThreshold)\n            AND s.notification_mode = :notificationMode\n        ")
    public abstract io.reactivex.rxjava3.core.Flowable<java.util.List<org.schabi.newpipe.database.subscription.SubscriptionEntity>> getOutdatedWithNotificationMode(@org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime outdatedThreshold, @org.schabi.newpipe.database.subscription.NotificationMode()
    int notificationMode);
}