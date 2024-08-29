// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.CloudProject;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FailoverIpAttachArgs extends com.pulumi.resources.ResourceArgs {

    public static final FailoverIpAttachArgs Empty = new FailoverIpAttachArgs();

    /**
     * The IP block
     * * `continentCode` - The Ip continent
     * 
     */
    @Import(name="block")
    private @Nullable Output<String> block;

    /**
     * @return The IP block
     * * `continentCode` - The Ip continent
     * 
     */
    public Optional<Output<String>> block() {
        return Optional.ofNullable(this.block);
    }

    /**
     * Ip continent
     * 
     */
    @Import(name="continentCode")
    private @Nullable Output<String> continentCode;

    /**
     * @return Ip continent
     * 
     */
    public Optional<Output<String>> continentCode() {
        return Optional.ofNullable(this.continentCode);
    }

    /**
     * Ip location
     * 
     */
    @Import(name="geoLoc")
    private @Nullable Output<String> geoLoc;

    /**
     * @return Ip location
     * 
     */
    public Optional<Output<String>> geoLoc() {
        return Optional.ofNullable(this.geoLoc);
    }

    /**
     * The failover ip address to attach
     * 
     */
    @Import(name="ip")
    private @Nullable Output<String> ip;

    /**
     * @return The failover ip address to attach
     * 
     */
    public Optional<Output<String>> ip() {
        return Optional.ofNullable(this.ip);
    }

    /**
     * The GUID of an instance to which the failover IP address is be attached
     * 
     */
    @Import(name="routedTo")
    private @Nullable Output<String> routedTo;

    /**
     * @return The GUID of an instance to which the failover IP address is be attached
     * 
     */
    public Optional<Output<String>> routedTo() {
        return Optional.ofNullable(this.routedTo);
    }

    /**
     * The id of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The id of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private FailoverIpAttachArgs() {}

    private FailoverIpAttachArgs(FailoverIpAttachArgs $) {
        this.block = $.block;
        this.continentCode = $.continentCode;
        this.geoLoc = $.geoLoc;
        this.ip = $.ip;
        this.routedTo = $.routedTo;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FailoverIpAttachArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FailoverIpAttachArgs $;

        public Builder() {
            $ = new FailoverIpAttachArgs();
        }

        public Builder(FailoverIpAttachArgs defaults) {
            $ = new FailoverIpAttachArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param block The IP block
         * * `continentCode` - The Ip continent
         * 
         * @return builder
         * 
         */
        public Builder block(@Nullable Output<String> block) {
            $.block = block;
            return this;
        }

        /**
         * @param block The IP block
         * * `continentCode` - The Ip continent
         * 
         * @return builder
         * 
         */
        public Builder block(String block) {
            return block(Output.of(block));
        }

        /**
         * @param continentCode Ip continent
         * 
         * @return builder
         * 
         */
        public Builder continentCode(@Nullable Output<String> continentCode) {
            $.continentCode = continentCode;
            return this;
        }

        /**
         * @param continentCode Ip continent
         * 
         * @return builder
         * 
         */
        public Builder continentCode(String continentCode) {
            return continentCode(Output.of(continentCode));
        }

        /**
         * @param geoLoc Ip location
         * 
         * @return builder
         * 
         */
        public Builder geoLoc(@Nullable Output<String> geoLoc) {
            $.geoLoc = geoLoc;
            return this;
        }

        /**
         * @param geoLoc Ip location
         * 
         * @return builder
         * 
         */
        public Builder geoLoc(String geoLoc) {
            return geoLoc(Output.of(geoLoc));
        }

        /**
         * @param ip The failover ip address to attach
         * 
         * @return builder
         * 
         */
        public Builder ip(@Nullable Output<String> ip) {
            $.ip = ip;
            return this;
        }

        /**
         * @param ip The failover ip address to attach
         * 
         * @return builder
         * 
         */
        public Builder ip(String ip) {
            return ip(Output.of(ip));
        }

        /**
         * @param routedTo The GUID of an instance to which the failover IP address is be attached
         * 
         * @return builder
         * 
         */
        public Builder routedTo(@Nullable Output<String> routedTo) {
            $.routedTo = routedTo;
            return this;
        }

        /**
         * @param routedTo The GUID of an instance to which the failover IP address is be attached
         * 
         * @return builder
         * 
         */
        public Builder routedTo(String routedTo) {
            return routedTo(Output.of(routedTo));
        }

        /**
         * @param serviceName The id of the public cloud project. If omitted,
         * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
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

        public FailoverIpAttachArgs build() {
            if ($.serviceName == null) {
                throw new MissingRequiredPropertyException("FailoverIpAttachArgs", "serviceName");
            }
            return $;
        }
    }

}