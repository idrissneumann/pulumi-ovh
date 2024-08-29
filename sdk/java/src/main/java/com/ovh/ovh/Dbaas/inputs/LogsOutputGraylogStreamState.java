// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Dbaas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogsOutputGraylogStreamState extends com.pulumi.resources.ResourceArgs {

    public static final LogsOutputGraylogStreamState Empty = new LogsOutputGraylogStreamState();

    /**
     * Indicates if the current user can create alert on the stream
     * 
     */
    @Import(name="canAlert")
    private @Nullable Output<Boolean> canAlert;

    /**
     * @return Indicates if the current user can create alert on the stream
     * 
     */
    public Optional<Output<Boolean>> canAlert() {
        return Optional.ofNullable(this.canAlert);
    }

    /**
     * Cold storage compression method. One of &#34;LZMA&#34;, &#34;GZIP&#34;, &#34;DEFLATED&#34;, &#34;ZSTD&#34;
     * 
     */
    @Import(name="coldStorageCompression")
    private @Nullable Output<String> coldStorageCompression;

    /**
     * @return Cold storage compression method. One of &#34;LZMA&#34;, &#34;GZIP&#34;, &#34;DEFLATED&#34;, &#34;ZSTD&#34;
     * 
     */
    public Optional<Output<String>> coldStorageCompression() {
        return Optional.ofNullable(this.coldStorageCompression);
    }

    /**
     * ColdStorage content. One of &#34;ALL&#34;, &#34;GLEF&#34;, &#34;PLAIN&#34;
     * 
     */
    @Import(name="coldStorageContent")
    private @Nullable Output<String> coldStorageContent;

    /**
     * @return ColdStorage content. One of &#34;ALL&#34;, &#34;GLEF&#34;, &#34;PLAIN&#34;
     * 
     */
    public Optional<Output<String>> coldStorageContent() {
        return Optional.ofNullable(this.coldStorageContent);
    }

    /**
     * Is Cold storage enabled?
     * 
     */
    @Import(name="coldStorageEnabled")
    private @Nullable Output<Boolean> coldStorageEnabled;

    /**
     * @return Is Cold storage enabled?
     * 
     */
    public Optional<Output<Boolean>> coldStorageEnabled() {
        return Optional.ofNullable(this.coldStorageEnabled);
    }

    /**
     * Notify on new Cold storage archive
     * 
     */
    @Import(name="coldStorageNotifyEnabled")
    private @Nullable Output<Boolean> coldStorageNotifyEnabled;

    /**
     * @return Notify on new Cold storage archive
     * 
     */
    public Optional<Output<Boolean>> coldStorageNotifyEnabled() {
        return Optional.ofNullable(this.coldStorageNotifyEnabled);
    }

    /**
     * Cold storage retention in year
     * 
     */
    @Import(name="coldStorageRetention")
    private @Nullable Output<Integer> coldStorageRetention;

    /**
     * @return Cold storage retention in year
     * 
     */
    public Optional<Output<Integer>> coldStorageRetention() {
        return Optional.ofNullable(this.coldStorageRetention);
    }

    /**
     * ColdStorage destination. One of &#34;PCA&#34;, &#34;PCS&#34;
     * 
     */
    @Import(name="coldStorageTarget")
    private @Nullable Output<String> coldStorageTarget;

    /**
     * @return ColdStorage destination. One of &#34;PCA&#34;, &#34;PCS&#34;
     * 
     */
    public Optional<Output<String>> coldStorageTarget() {
        return Optional.ofNullable(this.coldStorageTarget);
    }

    /**
     * Stream creation
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return Stream creation
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * Stream description
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Stream description
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Enable ES indexing
     * 
     */
    @Import(name="indexingEnabled")
    private @Nullable Output<Boolean> indexingEnabled;

    /**
     * @return Enable ES indexing
     * 
     */
    public Optional<Output<Boolean>> indexingEnabled() {
        return Optional.ofNullable(this.indexingEnabled);
    }

    /**
     * Maximum indexing size (in GB)
     * 
     */
    @Import(name="indexingMaxSize")
    private @Nullable Output<Integer> indexingMaxSize;

    /**
     * @return Maximum indexing size (in GB)
     * 
     */
    public Optional<Output<Integer>> indexingMaxSize() {
        return Optional.ofNullable(this.indexingMaxSize);
    }

    /**
     * If set, notify when size is near 80, 90 or 100 % of the maximum configured setting
     * 
     */
    @Import(name="indexingNotifyEnabled")
    private @Nullable Output<Boolean> indexingNotifyEnabled;

    /**
     * @return If set, notify when size is near 80, 90 or 100 % of the maximum configured setting
     * 
     */
    public Optional<Output<Boolean>> indexingNotifyEnabled() {
        return Optional.ofNullable(this.indexingNotifyEnabled);
    }

    /**
     * Indicates if you are allowed to edit entry
     * 
     */
    @Import(name="isEditable")
    private @Nullable Output<Boolean> isEditable;

    /**
     * @return Indicates if you are allowed to edit entry
     * 
     */
    public Optional<Output<Boolean>> isEditable() {
        return Optional.ofNullable(this.isEditable);
    }

    /**
     * Indicates if you are allowed to share entry
     * 
     */
    @Import(name="isShareable")
    private @Nullable Output<Boolean> isShareable;

    /**
     * @return Indicates if you are allowed to share entry
     * 
     */
    public Optional<Output<Boolean>> isShareable() {
        return Optional.ofNullable(this.isShareable);
    }

    /**
     * Number of alert condition
     * 
     */
    @Import(name="nbAlertCondition")
    private @Nullable Output<Integer> nbAlertCondition;

    /**
     * @return Number of alert condition
     * 
     */
    public Optional<Output<Integer>> nbAlertCondition() {
        return Optional.ofNullable(this.nbAlertCondition);
    }

    /**
     * Number of coldstored archivesr
     * 
     */
    @Import(name="nbArchive")
    private @Nullable Output<Integer> nbArchive;

    /**
     * @return Number of coldstored archivesr
     * 
     */
    public Optional<Output<Integer>> nbArchive() {
        return Optional.ofNullable(this.nbArchive);
    }

    /**
     * Parent stream ID
     * 
     */
    @Import(name="parentStreamId")
    private @Nullable Output<String> parentStreamId;

    /**
     * @return Parent stream ID
     * 
     */
    public Optional<Output<String>> parentStreamId() {
        return Optional.ofNullable(this.parentStreamId);
    }

    /**
     * If set, pause indexing when maximum size is reach
     * 
     */
    @Import(name="pauseIndexingOnMaxSize")
    private @Nullable Output<Boolean> pauseIndexingOnMaxSize;

    /**
     * @return If set, pause indexing when maximum size is reach
     * 
     */
    public Optional<Output<Boolean>> pauseIndexingOnMaxSize() {
        return Optional.ofNullable(this.pauseIndexingOnMaxSize);
    }

    /**
     * Retention ID
     * 
     */
    @Import(name="retentionId")
    private @Nullable Output<String> retentionId;

    /**
     * @return Retention ID
     * 
     */
    public Optional<Output<String>> retentionId() {
        return Optional.ofNullable(this.retentionId);
    }

    /**
     * The service name
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return The service name
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    /**
     * Stream ID
     * 
     */
    @Import(name="streamId")
    private @Nullable Output<String> streamId;

    /**
     * @return Stream ID
     * 
     */
    public Optional<Output<String>> streamId() {
        return Optional.ofNullable(this.streamId);
    }

    /**
     * Stream description
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return Stream description
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    /**
     * Stream last updater
     * 
     */
    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    /**
     * @return Stream last updater
     * 
     */
    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    /**
     * Enable Websocket
     * 
     */
    @Import(name="webSocketEnabled")
    private @Nullable Output<Boolean> webSocketEnabled;

    /**
     * @return Enable Websocket
     * 
     */
    public Optional<Output<Boolean>> webSocketEnabled() {
        return Optional.ofNullable(this.webSocketEnabled);
    }

    /**
     * Write token of the stream (empty if the caller is not the owner of the stream)
     * 
     */
    @Import(name="writeToken")
    private @Nullable Output<String> writeToken;

    /**
     * @return Write token of the stream (empty if the caller is not the owner of the stream)
     * 
     */
    public Optional<Output<String>> writeToken() {
        return Optional.ofNullable(this.writeToken);
    }

    private LogsOutputGraylogStreamState() {}

    private LogsOutputGraylogStreamState(LogsOutputGraylogStreamState $) {
        this.canAlert = $.canAlert;
        this.coldStorageCompression = $.coldStorageCompression;
        this.coldStorageContent = $.coldStorageContent;
        this.coldStorageEnabled = $.coldStorageEnabled;
        this.coldStorageNotifyEnabled = $.coldStorageNotifyEnabled;
        this.coldStorageRetention = $.coldStorageRetention;
        this.coldStorageTarget = $.coldStorageTarget;
        this.createdAt = $.createdAt;
        this.description = $.description;
        this.indexingEnabled = $.indexingEnabled;
        this.indexingMaxSize = $.indexingMaxSize;
        this.indexingNotifyEnabled = $.indexingNotifyEnabled;
        this.isEditable = $.isEditable;
        this.isShareable = $.isShareable;
        this.nbAlertCondition = $.nbAlertCondition;
        this.nbArchive = $.nbArchive;
        this.parentStreamId = $.parentStreamId;
        this.pauseIndexingOnMaxSize = $.pauseIndexingOnMaxSize;
        this.retentionId = $.retentionId;
        this.serviceName = $.serviceName;
        this.streamId = $.streamId;
        this.title = $.title;
        this.updatedAt = $.updatedAt;
        this.webSocketEnabled = $.webSocketEnabled;
        this.writeToken = $.writeToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogsOutputGraylogStreamState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogsOutputGraylogStreamState $;

        public Builder() {
            $ = new LogsOutputGraylogStreamState();
        }

        public Builder(LogsOutputGraylogStreamState defaults) {
            $ = new LogsOutputGraylogStreamState(Objects.requireNonNull(defaults));
        }

        /**
         * @param canAlert Indicates if the current user can create alert on the stream
         * 
         * @return builder
         * 
         */
        public Builder canAlert(@Nullable Output<Boolean> canAlert) {
            $.canAlert = canAlert;
            return this;
        }

        /**
         * @param canAlert Indicates if the current user can create alert on the stream
         * 
         * @return builder
         * 
         */
        public Builder canAlert(Boolean canAlert) {
            return canAlert(Output.of(canAlert));
        }

        /**
         * @param coldStorageCompression Cold storage compression method. One of &#34;LZMA&#34;, &#34;GZIP&#34;, &#34;DEFLATED&#34;, &#34;ZSTD&#34;
         * 
         * @return builder
         * 
         */
        public Builder coldStorageCompression(@Nullable Output<String> coldStorageCompression) {
            $.coldStorageCompression = coldStorageCompression;
            return this;
        }

        /**
         * @param coldStorageCompression Cold storage compression method. One of &#34;LZMA&#34;, &#34;GZIP&#34;, &#34;DEFLATED&#34;, &#34;ZSTD&#34;
         * 
         * @return builder
         * 
         */
        public Builder coldStorageCompression(String coldStorageCompression) {
            return coldStorageCompression(Output.of(coldStorageCompression));
        }

        /**
         * @param coldStorageContent ColdStorage content. One of &#34;ALL&#34;, &#34;GLEF&#34;, &#34;PLAIN&#34;
         * 
         * @return builder
         * 
         */
        public Builder coldStorageContent(@Nullable Output<String> coldStorageContent) {
            $.coldStorageContent = coldStorageContent;
            return this;
        }

        /**
         * @param coldStorageContent ColdStorage content. One of &#34;ALL&#34;, &#34;GLEF&#34;, &#34;PLAIN&#34;
         * 
         * @return builder
         * 
         */
        public Builder coldStorageContent(String coldStorageContent) {
            return coldStorageContent(Output.of(coldStorageContent));
        }

        /**
         * @param coldStorageEnabled Is Cold storage enabled?
         * 
         * @return builder
         * 
         */
        public Builder coldStorageEnabled(@Nullable Output<Boolean> coldStorageEnabled) {
            $.coldStorageEnabled = coldStorageEnabled;
            return this;
        }

        /**
         * @param coldStorageEnabled Is Cold storage enabled?
         * 
         * @return builder
         * 
         */
        public Builder coldStorageEnabled(Boolean coldStorageEnabled) {
            return coldStorageEnabled(Output.of(coldStorageEnabled));
        }

        /**
         * @param coldStorageNotifyEnabled Notify on new Cold storage archive
         * 
         * @return builder
         * 
         */
        public Builder coldStorageNotifyEnabled(@Nullable Output<Boolean> coldStorageNotifyEnabled) {
            $.coldStorageNotifyEnabled = coldStorageNotifyEnabled;
            return this;
        }

        /**
         * @param coldStorageNotifyEnabled Notify on new Cold storage archive
         * 
         * @return builder
         * 
         */
        public Builder coldStorageNotifyEnabled(Boolean coldStorageNotifyEnabled) {
            return coldStorageNotifyEnabled(Output.of(coldStorageNotifyEnabled));
        }

        /**
         * @param coldStorageRetention Cold storage retention in year
         * 
         * @return builder
         * 
         */
        public Builder coldStorageRetention(@Nullable Output<Integer> coldStorageRetention) {
            $.coldStorageRetention = coldStorageRetention;
            return this;
        }

        /**
         * @param coldStorageRetention Cold storage retention in year
         * 
         * @return builder
         * 
         */
        public Builder coldStorageRetention(Integer coldStorageRetention) {
            return coldStorageRetention(Output.of(coldStorageRetention));
        }

        /**
         * @param coldStorageTarget ColdStorage destination. One of &#34;PCA&#34;, &#34;PCS&#34;
         * 
         * @return builder
         * 
         */
        public Builder coldStorageTarget(@Nullable Output<String> coldStorageTarget) {
            $.coldStorageTarget = coldStorageTarget;
            return this;
        }

        /**
         * @param coldStorageTarget ColdStorage destination. One of &#34;PCA&#34;, &#34;PCS&#34;
         * 
         * @return builder
         * 
         */
        public Builder coldStorageTarget(String coldStorageTarget) {
            return coldStorageTarget(Output.of(coldStorageTarget));
        }

        /**
         * @param createdAt Stream creation
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt Stream creation
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param description Stream description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Stream description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param indexingEnabled Enable ES indexing
         * 
         * @return builder
         * 
         */
        public Builder indexingEnabled(@Nullable Output<Boolean> indexingEnabled) {
            $.indexingEnabled = indexingEnabled;
            return this;
        }

        /**
         * @param indexingEnabled Enable ES indexing
         * 
         * @return builder
         * 
         */
        public Builder indexingEnabled(Boolean indexingEnabled) {
            return indexingEnabled(Output.of(indexingEnabled));
        }

        /**
         * @param indexingMaxSize Maximum indexing size (in GB)
         * 
         * @return builder
         * 
         */
        public Builder indexingMaxSize(@Nullable Output<Integer> indexingMaxSize) {
            $.indexingMaxSize = indexingMaxSize;
            return this;
        }

        /**
         * @param indexingMaxSize Maximum indexing size (in GB)
         * 
         * @return builder
         * 
         */
        public Builder indexingMaxSize(Integer indexingMaxSize) {
            return indexingMaxSize(Output.of(indexingMaxSize));
        }

        /**
         * @param indexingNotifyEnabled If set, notify when size is near 80, 90 or 100 % of the maximum configured setting
         * 
         * @return builder
         * 
         */
        public Builder indexingNotifyEnabled(@Nullable Output<Boolean> indexingNotifyEnabled) {
            $.indexingNotifyEnabled = indexingNotifyEnabled;
            return this;
        }

        /**
         * @param indexingNotifyEnabled If set, notify when size is near 80, 90 or 100 % of the maximum configured setting
         * 
         * @return builder
         * 
         */
        public Builder indexingNotifyEnabled(Boolean indexingNotifyEnabled) {
            return indexingNotifyEnabled(Output.of(indexingNotifyEnabled));
        }

        /**
         * @param isEditable Indicates if you are allowed to edit entry
         * 
         * @return builder
         * 
         */
        public Builder isEditable(@Nullable Output<Boolean> isEditable) {
            $.isEditable = isEditable;
            return this;
        }

        /**
         * @param isEditable Indicates if you are allowed to edit entry
         * 
         * @return builder
         * 
         */
        public Builder isEditable(Boolean isEditable) {
            return isEditable(Output.of(isEditable));
        }

        /**
         * @param isShareable Indicates if you are allowed to share entry
         * 
         * @return builder
         * 
         */
        public Builder isShareable(@Nullable Output<Boolean> isShareable) {
            $.isShareable = isShareable;
            return this;
        }

        /**
         * @param isShareable Indicates if you are allowed to share entry
         * 
         * @return builder
         * 
         */
        public Builder isShareable(Boolean isShareable) {
            return isShareable(Output.of(isShareable));
        }

        /**
         * @param nbAlertCondition Number of alert condition
         * 
         * @return builder
         * 
         */
        public Builder nbAlertCondition(@Nullable Output<Integer> nbAlertCondition) {
            $.nbAlertCondition = nbAlertCondition;
            return this;
        }

        /**
         * @param nbAlertCondition Number of alert condition
         * 
         * @return builder
         * 
         */
        public Builder nbAlertCondition(Integer nbAlertCondition) {
            return nbAlertCondition(Output.of(nbAlertCondition));
        }

        /**
         * @param nbArchive Number of coldstored archivesr
         * 
         * @return builder
         * 
         */
        public Builder nbArchive(@Nullable Output<Integer> nbArchive) {
            $.nbArchive = nbArchive;
            return this;
        }

        /**
         * @param nbArchive Number of coldstored archivesr
         * 
         * @return builder
         * 
         */
        public Builder nbArchive(Integer nbArchive) {
            return nbArchive(Output.of(nbArchive));
        }

        /**
         * @param parentStreamId Parent stream ID
         * 
         * @return builder
         * 
         */
        public Builder parentStreamId(@Nullable Output<String> parentStreamId) {
            $.parentStreamId = parentStreamId;
            return this;
        }

        /**
         * @param parentStreamId Parent stream ID
         * 
         * @return builder
         * 
         */
        public Builder parentStreamId(String parentStreamId) {
            return parentStreamId(Output.of(parentStreamId));
        }

        /**
         * @param pauseIndexingOnMaxSize If set, pause indexing when maximum size is reach
         * 
         * @return builder
         * 
         */
        public Builder pauseIndexingOnMaxSize(@Nullable Output<Boolean> pauseIndexingOnMaxSize) {
            $.pauseIndexingOnMaxSize = pauseIndexingOnMaxSize;
            return this;
        }

        /**
         * @param pauseIndexingOnMaxSize If set, pause indexing when maximum size is reach
         * 
         * @return builder
         * 
         */
        public Builder pauseIndexingOnMaxSize(Boolean pauseIndexingOnMaxSize) {
            return pauseIndexingOnMaxSize(Output.of(pauseIndexingOnMaxSize));
        }

        /**
         * @param retentionId Retention ID
         * 
         * @return builder
         * 
         */
        public Builder retentionId(@Nullable Output<String> retentionId) {
            $.retentionId = retentionId;
            return this;
        }

        /**
         * @param retentionId Retention ID
         * 
         * @return builder
         * 
         */
        public Builder retentionId(String retentionId) {
            return retentionId(Output.of(retentionId));
        }

        /**
         * @param serviceName The service name
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The service name
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param streamId Stream ID
         * 
         * @return builder
         * 
         */
        public Builder streamId(@Nullable Output<String> streamId) {
            $.streamId = streamId;
            return this;
        }

        /**
         * @param streamId Stream ID
         * 
         * @return builder
         * 
         */
        public Builder streamId(String streamId) {
            return streamId(Output.of(streamId));
        }

        /**
         * @param title Stream description
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title Stream description
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        /**
         * @param updatedAt Stream last updater
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        /**
         * @param updatedAt Stream last updater
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        /**
         * @param webSocketEnabled Enable Websocket
         * 
         * @return builder
         * 
         */
        public Builder webSocketEnabled(@Nullable Output<Boolean> webSocketEnabled) {
            $.webSocketEnabled = webSocketEnabled;
            return this;
        }

        /**
         * @param webSocketEnabled Enable Websocket
         * 
         * @return builder
         * 
         */
        public Builder webSocketEnabled(Boolean webSocketEnabled) {
            return webSocketEnabled(Output.of(webSocketEnabled));
        }

        /**
         * @param writeToken Write token of the stream (empty if the caller is not the owner of the stream)
         * 
         * @return builder
         * 
         */
        public Builder writeToken(@Nullable Output<String> writeToken) {
            $.writeToken = writeToken;
            return this;
        }

        /**
         * @param writeToken Write token of the stream (empty if the caller is not the owner of the stream)
         * 
         * @return builder
         * 
         */
        public Builder writeToken(String writeToken) {
            return writeToken(Output.of(writeToken));
        }

        public LogsOutputGraylogStreamState build() {
            return $;
        }
    }

}