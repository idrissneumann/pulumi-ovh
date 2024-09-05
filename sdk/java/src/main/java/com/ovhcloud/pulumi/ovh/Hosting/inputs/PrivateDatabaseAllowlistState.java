// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovhcloud.pulumi.ovh.Hosting.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateDatabaseAllowlistState extends com.pulumi.resources.ResourceArgs {

    public static final PrivateDatabaseAllowlistState Empty = new PrivateDatabaseAllowlistState();

    /**
     * The whitelisted IP in your instance.
     * 
     */
    @Import(name="ip")
    private @Nullable Output<String> ip;

    /**
     * @return The whitelisted IP in your instance.
     * 
     */
    public Optional<Output<String>> ip() {
        return Optional.ofNullable(this.ip);
    }

    /**
     * Custom name for your Whitelisted IP.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Custom name for your Whitelisted IP.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Authorize this IP to access service port. Values can be `true` or `false`
     * 
     */
    @Import(name="service")
    private @Nullable Output<Boolean> service;

    /**
     * @return Authorize this IP to access service port. Values can be `true` or `false`
     * 
     */
    public Optional<Output<Boolean>> service() {
        return Optional.ofNullable(this.service);
    }

    /**
     * The internal name of your private database.
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return The internal name of your private database.
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    /**
     * Authorize this IP to access SFTP port. Values can be `true` or `false`
     * 
     */
    @Import(name="sftp")
    private @Nullable Output<Boolean> sftp;

    /**
     * @return Authorize this IP to access SFTP port. Values can be `true` or `false`
     * 
     */
    public Optional<Output<Boolean>> sftp() {
        return Optional.ofNullable(this.sftp);
    }

    private PrivateDatabaseAllowlistState() {}

    private PrivateDatabaseAllowlistState(PrivateDatabaseAllowlistState $) {
        this.ip = $.ip;
        this.name = $.name;
        this.service = $.service;
        this.serviceName = $.serviceName;
        this.sftp = $.sftp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateDatabaseAllowlistState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateDatabaseAllowlistState $;

        public Builder() {
            $ = new PrivateDatabaseAllowlistState();
        }

        public Builder(PrivateDatabaseAllowlistState defaults) {
            $ = new PrivateDatabaseAllowlistState(Objects.requireNonNull(defaults));
        }

        /**
         * @param ip The whitelisted IP in your instance.
         * 
         * @return builder
         * 
         */
        public Builder ip(@Nullable Output<String> ip) {
            $.ip = ip;
            return this;
        }

        /**
         * @param ip The whitelisted IP in your instance.
         * 
         * @return builder
         * 
         */
        public Builder ip(String ip) {
            return ip(Output.of(ip));
        }

        /**
         * @param name Custom name for your Whitelisted IP.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Custom name for your Whitelisted IP.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param service Authorize this IP to access service port. Values can be `true` or `false`
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<Boolean> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service Authorize this IP to access service port. Values can be `true` or `false`
         * 
         * @return builder
         * 
         */
        public Builder service(Boolean service) {
            return service(Output.of(service));
        }

        /**
         * @param serviceName The internal name of your private database.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The internal name of your private database.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param sftp Authorize this IP to access SFTP port. Values can be `true` or `false`
         * 
         * @return builder
         * 
         */
        public Builder sftp(@Nullable Output<Boolean> sftp) {
            $.sftp = sftp;
            return this;
        }

        /**
         * @param sftp Authorize this IP to access SFTP port. Values can be `true` or `false`
         * 
         * @return builder
         * 
         */
        public Builder sftp(Boolean sftp) {
            return sftp(Output.of(sftp));
        }

        public PrivateDatabaseAllowlistState build() {
            return $;
        }
    }

}