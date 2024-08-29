// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.CloudProjectDatabase.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RedisUserState extends com.pulumi.resources.ResourceArgs {

    public static final RedisUserState Empty = new RedisUserState();

    /**
     * Categories of the user.
     * 
     */
    @Import(name="categories")
    private @Nullable Output<List<String>> categories;

    /**
     * @return Categories of the user.
     * 
     */
    public Optional<Output<List<String>>> categories() {
        return Optional.ofNullable(this.categories);
    }

    /**
     * Channels of the user.
     * 
     */
    @Import(name="channels")
    private @Nullable Output<List<String>> channels;

    /**
     * @return Channels of the user.
     * 
     */
    public Optional<Output<List<String>>> channels() {
        return Optional.ofNullable(this.channels);
    }

    /**
     * Cluster ID.
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return Cluster ID.
     * 
     */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * Commands of the user.
     * 
     */
    @Import(name="commands")
    private @Nullable Output<List<String>> commands;

    /**
     * @return Commands of the user.
     * 
     */
    public Optional<Output<List<String>>> commands() {
        return Optional.ofNullable(this.commands);
    }

    /**
     * Date of the creation of the user.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return Date of the creation of the user.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * Keys of the user.
     * 
     */
    @Import(name="keys")
    private @Nullable Output<List<String>> keys;

    /**
     * @return Keys of the user.
     * 
     */
    public Optional<Output<List<String>>> keys() {
        return Optional.ofNullable(this.keys);
    }

    /**
     * Name of the user.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the user.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * (Sensitive) Password of the user.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return (Sensitive) Password of the user.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Arbitrary string to change to trigger a password update
     * 
     */
    @Import(name="passwordReset")
    private @Nullable Output<String> passwordReset;

    /**
     * @return Arbitrary string to change to trigger a password update
     * 
     */
    public Optional<Output<String>> passwordReset() {
        return Optional.ofNullable(this.passwordReset);
    }

    /**
     * The id of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return The id of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    /**
     * Current status of the user.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Current status of the user.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private RedisUserState() {}

    private RedisUserState(RedisUserState $) {
        this.categories = $.categories;
        this.channels = $.channels;
        this.clusterId = $.clusterId;
        this.commands = $.commands;
        this.createdAt = $.createdAt;
        this.keys = $.keys;
        this.name = $.name;
        this.password = $.password;
        this.passwordReset = $.passwordReset;
        this.serviceName = $.serviceName;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RedisUserState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RedisUserState $;

        public Builder() {
            $ = new RedisUserState();
        }

        public Builder(RedisUserState defaults) {
            $ = new RedisUserState(Objects.requireNonNull(defaults));
        }

        /**
         * @param categories Categories of the user.
         * 
         * @return builder
         * 
         */
        public Builder categories(@Nullable Output<List<String>> categories) {
            $.categories = categories;
            return this;
        }

        /**
         * @param categories Categories of the user.
         * 
         * @return builder
         * 
         */
        public Builder categories(List<String> categories) {
            return categories(Output.of(categories));
        }

        /**
         * @param categories Categories of the user.
         * 
         * @return builder
         * 
         */
        public Builder categories(String... categories) {
            return categories(List.of(categories));
        }

        /**
         * @param channels Channels of the user.
         * 
         * @return builder
         * 
         */
        public Builder channels(@Nullable Output<List<String>> channels) {
            $.channels = channels;
            return this;
        }

        /**
         * @param channels Channels of the user.
         * 
         * @return builder
         * 
         */
        public Builder channels(List<String> channels) {
            return channels(Output.of(channels));
        }

        /**
         * @param channels Channels of the user.
         * 
         * @return builder
         * 
         */
        public Builder channels(String... channels) {
            return channels(List.of(channels));
        }

        /**
         * @param clusterId Cluster ID.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId Cluster ID.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param commands Commands of the user.
         * 
         * @return builder
         * 
         */
        public Builder commands(@Nullable Output<List<String>> commands) {
            $.commands = commands;
            return this;
        }

        /**
         * @param commands Commands of the user.
         * 
         * @return builder
         * 
         */
        public Builder commands(List<String> commands) {
            return commands(Output.of(commands));
        }

        /**
         * @param commands Commands of the user.
         * 
         * @return builder
         * 
         */
        public Builder commands(String... commands) {
            return commands(List.of(commands));
        }

        /**
         * @param createdAt Date of the creation of the user.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt Date of the creation of the user.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param keys Keys of the user.
         * 
         * @return builder
         * 
         */
        public Builder keys(@Nullable Output<List<String>> keys) {
            $.keys = keys;
            return this;
        }

        /**
         * @param keys Keys of the user.
         * 
         * @return builder
         * 
         */
        public Builder keys(List<String> keys) {
            return keys(Output.of(keys));
        }

        /**
         * @param keys Keys of the user.
         * 
         * @return builder
         * 
         */
        public Builder keys(String... keys) {
            return keys(List.of(keys));
        }

        /**
         * @param name Name of the user.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the user.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param password (Sensitive) Password of the user.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password (Sensitive) Password of the user.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param passwordReset Arbitrary string to change to trigger a password update
         * 
         * @return builder
         * 
         */
        public Builder passwordReset(@Nullable Output<String> passwordReset) {
            $.passwordReset = passwordReset;
            return this;
        }

        /**
         * @param passwordReset Arbitrary string to change to trigger a password update
         * 
         * @return builder
         * 
         */
        public Builder passwordReset(String passwordReset) {
            return passwordReset(Output.of(passwordReset));
        }

        /**
         * @param serviceName The id of the public cloud project. If omitted,
         * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The id of the public cloud project. If omitted,
         * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param status Current status of the user.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Current status of the user.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public RedisUserState build() {
            return $;
        }
    }

}