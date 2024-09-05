// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovhcloud.pulumi.ovh.CloudProject.outputs;

import com.ovhcloud.pulumi.ovh.CloudProject.outputs.ProjectPlanConfiguration;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectPlan {
    /**
     * @return Catalog name
     * 
     */
    private @Nullable String catalogName;
    /**
     * @return Representation of a configuration item for personalizing product
     * 
     */
    private @Nullable List<ProjectPlanConfiguration> configurations;
    /**
     * @return duration
     * 
     */
    private String duration;
    /**
     * @return Plan code. This value must be adapted depending on your `OVH_ENDPOINT` value. It&#39;s `project.2018` for `ovh-{eu,ca}` and `project` when using `ovh-us`.
     * 
     */
    private String planCode;
    /**
     * @return Pricing model identifier
     * 
     */
    private String pricingMode;

    private ProjectPlan() {}
    /**
     * @return Catalog name
     * 
     */
    public Optional<String> catalogName() {
        return Optional.ofNullable(this.catalogName);
    }
    /**
     * @return Representation of a configuration item for personalizing product
     * 
     */
    public List<ProjectPlanConfiguration> configurations() {
        return this.configurations == null ? List.of() : this.configurations;
    }
    /**
     * @return duration
     * 
     */
    public String duration() {
        return this.duration;
    }
    /**
     * @return Plan code. This value must be adapted depending on your `OVH_ENDPOINT` value. It&#39;s `project.2018` for `ovh-{eu,ca}` and `project` when using `ovh-us`.
     * 
     */
    public String planCode() {
        return this.planCode;
    }
    /**
     * @return Pricing model identifier
     * 
     */
    public String pricingMode() {
        return this.pricingMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectPlan defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String catalogName;
        private @Nullable List<ProjectPlanConfiguration> configurations;
        private String duration;
        private String planCode;
        private String pricingMode;
        public Builder() {}
        public Builder(ProjectPlan defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogName = defaults.catalogName;
    	      this.configurations = defaults.configurations;
    	      this.duration = defaults.duration;
    	      this.planCode = defaults.planCode;
    	      this.pricingMode = defaults.pricingMode;
        }

        @CustomType.Setter
        public Builder catalogName(@Nullable String catalogName) {

            this.catalogName = catalogName;
            return this;
        }
        @CustomType.Setter
        public Builder configurations(@Nullable List<ProjectPlanConfiguration> configurations) {

            this.configurations = configurations;
            return this;
        }
        public Builder configurations(ProjectPlanConfiguration... configurations) {
            return configurations(List.of(configurations));
        }
        @CustomType.Setter
        public Builder duration(String duration) {
            if (duration == null) {
              throw new MissingRequiredPropertyException("ProjectPlan", "duration");
            }
            this.duration = duration;
            return this;
        }
        @CustomType.Setter
        public Builder planCode(String planCode) {
            if (planCode == null) {
              throw new MissingRequiredPropertyException("ProjectPlan", "planCode");
            }
            this.planCode = planCode;
            return this;
        }
        @CustomType.Setter
        public Builder pricingMode(String pricingMode) {
            if (pricingMode == null) {
              throw new MissingRequiredPropertyException("ProjectPlan", "pricingMode");
            }
            this.pricingMode = pricingMode;
            return this;
        }
        public ProjectPlan build() {
            final var _resultValue = new ProjectPlan();
            _resultValue.catalogName = catalogName;
            _resultValue.configurations = configurations;
            _resultValue.duration = duration;
            _resultValue.planCode = planCode;
            _resultValue.pricingMode = pricingMode;
            return _resultValue;
        }
    }
}