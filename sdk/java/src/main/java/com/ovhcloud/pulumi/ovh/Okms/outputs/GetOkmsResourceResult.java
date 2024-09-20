// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovhcloud.pulumi.ovh.Okms.outputs;

import com.ovhcloud.pulumi.ovh.Okms.outputs.GetOkmsResourceIam;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetOkmsResourceResult {
    /**
     * @return (Attributes) IAM resource metadata (see below for nested schema)
     * 
     */
    private GetOkmsResourceIam iam;
    /**
     * @return (String) Unique identifier of the resource
     * 
     */
    private String id;
    /**
     * @return (String) KMS kmip API endpoint
     * 
     */
    private String kmipEndpoint;
    /**
     * @return (String) KMS public CA (Certificate Authority)
     * 
     */
    private String publicCa;
    /**
     * @return (String) Region
     * 
     */
    private String region;
    /**
     * @return (String) KMS rest API endpoint
     * 
     */
    private String restEndpoint;
    /**
     * @return (String) KMS rest API swagger UI
     * 
     */
    private String swaggerEndpoint;

    private GetOkmsResourceResult() {}
    /**
     * @return (Attributes) IAM resource metadata (see below for nested schema)
     * 
     */
    public GetOkmsResourceIam iam() {
        return this.iam;
    }
    /**
     * @return (String) Unique identifier of the resource
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (String) KMS kmip API endpoint
     * 
     */
    public String kmipEndpoint() {
        return this.kmipEndpoint;
    }
    /**
     * @return (String) KMS public CA (Certificate Authority)
     * 
     */
    public String publicCa() {
        return this.publicCa;
    }
    /**
     * @return (String) Region
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return (String) KMS rest API endpoint
     * 
     */
    public String restEndpoint() {
        return this.restEndpoint;
    }
    /**
     * @return (String) KMS rest API swagger UI
     * 
     */
    public String swaggerEndpoint() {
        return this.swaggerEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOkmsResourceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetOkmsResourceIam iam;
        private String id;
        private String kmipEndpoint;
        private String publicCa;
        private String region;
        private String restEndpoint;
        private String swaggerEndpoint;
        public Builder() {}
        public Builder(GetOkmsResourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iam = defaults.iam;
    	      this.id = defaults.id;
    	      this.kmipEndpoint = defaults.kmipEndpoint;
    	      this.publicCa = defaults.publicCa;
    	      this.region = defaults.region;
    	      this.restEndpoint = defaults.restEndpoint;
    	      this.swaggerEndpoint = defaults.swaggerEndpoint;
        }

        @CustomType.Setter
        public Builder iam(GetOkmsResourceIam iam) {
            if (iam == null) {
              throw new MissingRequiredPropertyException("GetOkmsResourceResult", "iam");
            }
            this.iam = iam;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetOkmsResourceResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder kmipEndpoint(String kmipEndpoint) {
            if (kmipEndpoint == null) {
              throw new MissingRequiredPropertyException("GetOkmsResourceResult", "kmipEndpoint");
            }
            this.kmipEndpoint = kmipEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder publicCa(String publicCa) {
            if (publicCa == null) {
              throw new MissingRequiredPropertyException("GetOkmsResourceResult", "publicCa");
            }
            this.publicCa = publicCa;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetOkmsResourceResult", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder restEndpoint(String restEndpoint) {
            if (restEndpoint == null) {
              throw new MissingRequiredPropertyException("GetOkmsResourceResult", "restEndpoint");
            }
            this.restEndpoint = restEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder swaggerEndpoint(String swaggerEndpoint) {
            if (swaggerEndpoint == null) {
              throw new MissingRequiredPropertyException("GetOkmsResourceResult", "swaggerEndpoint");
            }
            this.swaggerEndpoint = swaggerEndpoint;
            return this;
        }
        public GetOkmsResourceResult build() {
            final var _resultValue = new GetOkmsResourceResult();
            _resultValue.iam = iam;
            _resultValue.id = id;
            _resultValue.kmipEndpoint = kmipEndpoint;
            _resultValue.publicCa = publicCa;
            _resultValue.region = region;
            _resultValue.restEndpoint = restEndpoint;
            _resultValue.swaggerEndpoint = swaggerEndpoint;
            return _resultValue;
        }
    }
}