// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.IpLoadBalancing.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerOrderableZone {
    /**
     * @return The zone three letter code
     * 
     */
    private @Nullable String name;
    /**
     * @return The billing planCode for this zone
     * 
     */
    private @Nullable String planCode;

    private LoadBalancerOrderableZone() {}
    /**
     * @return The zone three letter code
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The billing planCode for this zone
     * 
     */
    public Optional<String> planCode() {
        return Optional.ofNullable(this.planCode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerOrderableZone defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String planCode;
        public Builder() {}
        public Builder(LoadBalancerOrderableZone defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.planCode = defaults.planCode;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder planCode(@Nullable String planCode) {

            this.planCode = planCode;
            return this;
        }
        public LoadBalancerOrderableZone build() {
            final var _resultValue = new LoadBalancerOrderableZone();
            _resultValue.name = name;
            _resultValue.planCode = planCode;
            return _resultValue;
        }
    }
}