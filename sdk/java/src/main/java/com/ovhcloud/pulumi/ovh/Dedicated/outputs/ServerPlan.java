// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovhcloud.pulumi.ovh.Dedicated.outputs;

import com.ovhcloud.pulumi.ovh.Dedicated.outputs.ServerPlanConfiguration;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServerPlan {
    private @Nullable List<ServerPlanConfiguration> configurations;
    /**
     * @return Duration selected for the purchase of the product
     * 
     */
    private String duration;
    /**
     * @return Cart item to be linked
     * 
     */
    private @Nullable Double itemId;
    /**
     * @return Identifier of the option offer
     * 
     */
    private String planCode;
    /**
     * @return Pricing mode selected for the purchase of the product
     * 
     */
    private String pricingMode;
    /**
     * @return Quantity of product desired
     * 
     */
    private @Nullable Double quantity;

    private ServerPlan() {}
    public List<ServerPlanConfiguration> configurations() {
        return this.configurations == null ? List.of() : this.configurations;
    }
    /**
     * @return Duration selected for the purchase of the product
     * 
     */
    public String duration() {
        return this.duration;
    }
    /**
     * @return Cart item to be linked
     * 
     */
    public Optional<Double> itemId() {
        return Optional.ofNullable(this.itemId);
    }
    /**
     * @return Identifier of the option offer
     * 
     */
    public String planCode() {
        return this.planCode;
    }
    /**
     * @return Pricing mode selected for the purchase of the product
     * 
     */
    public String pricingMode() {
        return this.pricingMode;
    }
    /**
     * @return Quantity of product desired
     * 
     */
    public Optional<Double> quantity() {
        return Optional.ofNullable(this.quantity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerPlan defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ServerPlanConfiguration> configurations;
        private String duration;
        private @Nullable Double itemId;
        private String planCode;
        private String pricingMode;
        private @Nullable Double quantity;
        public Builder() {}
        public Builder(ServerPlan defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurations = defaults.configurations;
    	      this.duration = defaults.duration;
    	      this.itemId = defaults.itemId;
    	      this.planCode = defaults.planCode;
    	      this.pricingMode = defaults.pricingMode;
    	      this.quantity = defaults.quantity;
        }

        @CustomType.Setter
        public Builder configurations(@Nullable List<ServerPlanConfiguration> configurations) {

            this.configurations = configurations;
            return this;
        }
        public Builder configurations(ServerPlanConfiguration... configurations) {
            return configurations(List.of(configurations));
        }
        @CustomType.Setter
        public Builder duration(String duration) {
            if (duration == null) {
              throw new MissingRequiredPropertyException("ServerPlan", "duration");
            }
            this.duration = duration;
            return this;
        }
        @CustomType.Setter
        public Builder itemId(@Nullable Double itemId) {

            this.itemId = itemId;
            return this;
        }
        @CustomType.Setter
        public Builder planCode(String planCode) {
            if (planCode == null) {
              throw new MissingRequiredPropertyException("ServerPlan", "planCode");
            }
            this.planCode = planCode;
            return this;
        }
        @CustomType.Setter
        public Builder pricingMode(String pricingMode) {
            if (pricingMode == null) {
              throw new MissingRequiredPropertyException("ServerPlan", "pricingMode");
            }
            this.pricingMode = pricingMode;
            return this;
        }
        @CustomType.Setter
        public Builder quantity(@Nullable Double quantity) {

            this.quantity = quantity;
            return this;
        }
        public ServerPlan build() {
            final var _resultValue = new ServerPlan();
            _resultValue.configurations = configurations;
            _resultValue.duration = duration;
            _resultValue.itemId = itemId;
            _resultValue.planCode = planCode;
            _resultValue.pricingMode = pricingMode;
            _resultValue.quantity = quantity;
            return _resultValue;
        }
    }
}
