// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovhcloud.pulumi.ovh.Iam.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetResourceGroupResult {
    /**
     * @return URN of the resource group, used when writing policies
     * 
     */
    private String GroupURN;
    /**
     * @return Date of the creation of the resource group
     * 
     */
    private String createdAt;
    private String id;
    /**
     * @return Name of the resource group
     * 
     */
    private String name;
    /**
     * @return Name of the account owning the resource group
     * 
     */
    private String owner;
    /**
     * @return Marks that the resource group is not editable. Usually means that this is a default resource group created by OVHcloud
     * 
     */
    private Boolean readOnly;
    /**
     * @return Set of the URNs of the resources contained in the resource group
     * 
     */
    private List<String> resources;
    /**
     * @return Date of the last modification of the resource group
     * 
     */
    private String updatedAt;

    private GetResourceGroupResult() {}
    /**
     * @return URN of the resource group, used when writing policies
     * 
     */
    public String GroupURN() {
        return this.GroupURN;
    }
    /**
     * @return Date of the creation of the resource group
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return Name of the resource group
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Name of the account owning the resource group
     * 
     */
    public String owner() {
        return this.owner;
    }
    /**
     * @return Marks that the resource group is not editable. Usually means that this is a default resource group created by OVHcloud
     * 
     */
    public Boolean readOnly() {
        return this.readOnly;
    }
    /**
     * @return Set of the URNs of the resources contained in the resource group
     * 
     */
    public List<String> resources() {
        return this.resources;
    }
    /**
     * @return Date of the last modification of the resource group
     * 
     */
    public String updatedAt() {
        return this.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String GroupURN;
        private String createdAt;
        private String id;
        private String name;
        private String owner;
        private Boolean readOnly;
        private List<String> resources;
        private String updatedAt;
        public Builder() {}
        public Builder(GetResourceGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.GroupURN = defaults.GroupURN;
    	      this.createdAt = defaults.createdAt;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.readOnly = defaults.readOnly;
    	      this.resources = defaults.resources;
    	      this.updatedAt = defaults.updatedAt;
        }

        @CustomType.Setter
        public Builder GroupURN(String GroupURN) {
            if (GroupURN == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupResult", "GroupURN");
            }
            this.GroupURN = GroupURN;
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupResult", "createdAt");
            }
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder owner(String owner) {
            if (owner == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupResult", "owner");
            }
            this.owner = owner;
            return this;
        }
        @CustomType.Setter
        public Builder readOnly(Boolean readOnly) {
            if (readOnly == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupResult", "readOnly");
            }
            this.readOnly = readOnly;
            return this;
        }
        @CustomType.Setter
        public Builder resources(List<String> resources) {
            if (resources == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupResult", "resources");
            }
            this.resources = resources;
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }
        @CustomType.Setter
        public Builder updatedAt(String updatedAt) {
            if (updatedAt == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupResult", "updatedAt");
            }
            this.updatedAt = updatedAt;
            return this;
        }
        public GetResourceGroupResult build() {
            final var _resultValue = new GetResourceGroupResult();
            _resultValue.GroupURN = GroupURN;
            _resultValue.createdAt = createdAt;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.owner = owner;
            _resultValue.readOnly = readOnly;
            _resultValue.resources = resources;
            _resultValue.updatedAt = updatedAt;
            return _resultValue;
        }
    }
}