// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovhcloud.pulumi.ovh.Dedicated.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServerSpecificationsNetworkTrafficInputQuotaSize {
    private String unit;
    private Double value;

    private GetServerSpecificationsNetworkTrafficInputQuotaSize() {}
    public String unit() {
        return this.unit;
    }
    public Double value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerSpecificationsNetworkTrafficInputQuotaSize defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String unit;
        private Double value;
        public Builder() {}
        public Builder(GetServerSpecificationsNetworkTrafficInputQuotaSize defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder unit(String unit) {
            if (unit == null) {
              throw new MissingRequiredPropertyException("GetServerSpecificationsNetworkTrafficInputQuotaSize", "unit");
            }
            this.unit = unit;
            return this;
        }
        @CustomType.Setter
        public Builder value(Double value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetServerSpecificationsNetworkTrafficInputQuotaSize", "value");
            }
            this.value = value;
            return this;
        }
        public GetServerSpecificationsNetworkTrafficInputQuotaSize build() {
            final var _resultValue = new GetServerSpecificationsNetworkTrafficInputQuotaSize();
            _resultValue.unit = unit;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}