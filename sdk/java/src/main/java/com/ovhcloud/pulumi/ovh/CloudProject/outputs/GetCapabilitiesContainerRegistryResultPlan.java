// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovhcloud.pulumi.ovh.CloudProject.outputs;

import com.ovhcloud.pulumi.ovh.CloudProject.outputs.GetCapabilitiesContainerRegistryResultPlanFeature;
import com.ovhcloud.pulumi.ovh.CloudProject.outputs.GetCapabilitiesContainerRegistryResultPlanRegistryLimit;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCapabilitiesContainerRegistryResultPlan {
    /**
     * @return Plan code from the catalog
     * 
     */
    private String code;
    /**
     * @return Plan creation date
     * 
     */
    private String createdAt;
    /**
     * @return Features of the plan
     * 
     */
    private List<GetCapabilitiesContainerRegistryResultPlanFeature> features;
    /**
     * @return Plan ID
     * 
     */
    private String id;
    /**
     * @return Plan name
     * 
     */
    private String name;
    /**
     * @return Container registry limits
     * 
     */
    private List<GetCapabilitiesContainerRegistryResultPlanRegistryLimit> registryLimits;
    /**
     * @return Plan last update date
     * 
     */
    private String updatedAt;

    private GetCapabilitiesContainerRegistryResultPlan() {}
    /**
     * @return Plan code from the catalog
     * 
     */
    public String code() {
        return this.code;
    }
    /**
     * @return Plan creation date
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return Features of the plan
     * 
     */
    public List<GetCapabilitiesContainerRegistryResultPlanFeature> features() {
        return this.features;
    }
    /**
     * @return Plan ID
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Plan name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Container registry limits
     * 
     */
    public List<GetCapabilitiesContainerRegistryResultPlanRegistryLimit> registryLimits() {
        return this.registryLimits;
    }
    /**
     * @return Plan last update date
     * 
     */
    public String updatedAt() {
        return this.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCapabilitiesContainerRegistryResultPlan defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String code;
        private String createdAt;
        private List<GetCapabilitiesContainerRegistryResultPlanFeature> features;
        private String id;
        private String name;
        private List<GetCapabilitiesContainerRegistryResultPlanRegistryLimit> registryLimits;
        private String updatedAt;
        public Builder() {}
        public Builder(GetCapabilitiesContainerRegistryResultPlan defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.createdAt = defaults.createdAt;
    	      this.features = defaults.features;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.registryLimits = defaults.registryLimits;
    	      this.updatedAt = defaults.updatedAt;
        }

        @CustomType.Setter
        public Builder code(String code) {
            if (code == null) {
              throw new MissingRequiredPropertyException("GetCapabilitiesContainerRegistryResultPlan", "code");
            }
            this.code = code;
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
              throw new MissingRequiredPropertyException("GetCapabilitiesContainerRegistryResultPlan", "createdAt");
            }
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder features(List<GetCapabilitiesContainerRegistryResultPlanFeature> features) {
            if (features == null) {
              throw new MissingRequiredPropertyException("GetCapabilitiesContainerRegistryResultPlan", "features");
            }
            this.features = features;
            return this;
        }
        public Builder features(GetCapabilitiesContainerRegistryResultPlanFeature... features) {
            return features(List.of(features));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCapabilitiesContainerRegistryResultPlan", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetCapabilitiesContainerRegistryResultPlan", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder registryLimits(List<GetCapabilitiesContainerRegistryResultPlanRegistryLimit> registryLimits) {
            if (registryLimits == null) {
              throw new MissingRequiredPropertyException("GetCapabilitiesContainerRegistryResultPlan", "registryLimits");
            }
            this.registryLimits = registryLimits;
            return this;
        }
        public Builder registryLimits(GetCapabilitiesContainerRegistryResultPlanRegistryLimit... registryLimits) {
            return registryLimits(List.of(registryLimits));
        }
        @CustomType.Setter
        public Builder updatedAt(String updatedAt) {
            if (updatedAt == null) {
              throw new MissingRequiredPropertyException("GetCapabilitiesContainerRegistryResultPlan", "updatedAt");
            }
            this.updatedAt = updatedAt;
            return this;
        }
        public GetCapabilitiesContainerRegistryResultPlan build() {
            final var _resultValue = new GetCapabilitiesContainerRegistryResultPlan();
            _resultValue.code = code;
            _resultValue.createdAt = createdAt;
            _resultValue.features = features;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.registryLimits = registryLimits;
            _resultValue.updatedAt = updatedAt;
            return _resultValue;
        }
    }
}