// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovhcloud.pulumi.ovh.Order.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCartArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCartArgs Empty = new GetCartArgs();

    /**
     * Assign a shopping cart to a logged in client. Values can be `true` or `false`.
     * 
     */
    @Import(name="assign")
    private @Nullable Output<Boolean> assign;

    /**
     * @return Assign a shopping cart to a logged in client. Values can be `true` or `false`.
     * 
     */
    public Optional<Output<Boolean>> assign() {
        return Optional.ofNullable(this.assign);
    }

    /**
     * Description of your cart
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of your cart
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Expiration time (format: 2006-01-02T15:04:05+00:00)
     * 
     */
    @Import(name="expire")
    private @Nullable Output<String> expire;

    /**
     * @return Expiration time (format: 2006-01-02T15:04:05+00:00)
     * 
     */
    public Optional<Output<String>> expire() {
        return Optional.ofNullable(this.expire);
    }

    /**
     * OVHcloud Subsidiary. Country of OVHcloud legal entity you&#39;ll be billed by. List of supported subsidiaries available on API at [/1.0/me.json under `models.nichandle.OvhSubsidiaryEnum`](https://eu.api.ovh.com/1.0/me.json)
     * 
     */
    @Import(name="ovhSubsidiary", required=true)
    private Output<String> ovhSubsidiary;

    /**
     * @return OVHcloud Subsidiary. Country of OVHcloud legal entity you&#39;ll be billed by. List of supported subsidiaries available on API at [/1.0/me.json under `models.nichandle.OvhSubsidiaryEnum`](https://eu.api.ovh.com/1.0/me.json)
     * 
     */
    public Output<String> ovhSubsidiary() {
        return this.ovhSubsidiary;
    }

    private GetCartArgs() {}

    private GetCartArgs(GetCartArgs $) {
        this.assign = $.assign;
        this.description = $.description;
        this.expire = $.expire;
        this.ovhSubsidiary = $.ovhSubsidiary;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCartArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCartArgs $;

        public Builder() {
            $ = new GetCartArgs();
        }

        public Builder(GetCartArgs defaults) {
            $ = new GetCartArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assign Assign a shopping cart to a logged in client. Values can be `true` or `false`.
         * 
         * @return builder
         * 
         */
        public Builder assign(@Nullable Output<Boolean> assign) {
            $.assign = assign;
            return this;
        }

        /**
         * @param assign Assign a shopping cart to a logged in client. Values can be `true` or `false`.
         * 
         * @return builder
         * 
         */
        public Builder assign(Boolean assign) {
            return assign(Output.of(assign));
        }

        /**
         * @param description Description of your cart
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of your cart
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param expire Expiration time (format: 2006-01-02T15:04:05+00:00)
         * 
         * @return builder
         * 
         */
        public Builder expire(@Nullable Output<String> expire) {
            $.expire = expire;
            return this;
        }

        /**
         * @param expire Expiration time (format: 2006-01-02T15:04:05+00:00)
         * 
         * @return builder
         * 
         */
        public Builder expire(String expire) {
            return expire(Output.of(expire));
        }

        /**
         * @param ovhSubsidiary OVHcloud Subsidiary. Country of OVHcloud legal entity you&#39;ll be billed by. List of supported subsidiaries available on API at [/1.0/me.json under `models.nichandle.OvhSubsidiaryEnum`](https://eu.api.ovh.com/1.0/me.json)
         * 
         * @return builder
         * 
         */
        public Builder ovhSubsidiary(Output<String> ovhSubsidiary) {
            $.ovhSubsidiary = ovhSubsidiary;
            return this;
        }

        /**
         * @param ovhSubsidiary OVHcloud Subsidiary. Country of OVHcloud legal entity you&#39;ll be billed by. List of supported subsidiaries available on API at [/1.0/me.json under `models.nichandle.OvhSubsidiaryEnum`](https://eu.api.ovh.com/1.0/me.json)
         * 
         * @return builder
         * 
         */
        public Builder ovhSubsidiary(String ovhSubsidiary) {
            return ovhSubsidiary(Output.of(ovhSubsidiary));
        }

        public GetCartArgs build() {
            if ($.ovhSubsidiary == null) {
                throw new MissingRequiredPropertyException("GetCartArgs", "ovhSubsidiary");
            }
            return $;
        }
    }

}