// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.CloudProject;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class S3CredentialArgs extends com.pulumi.resources.ResourceArgs {

    public static final S3CredentialArgs Empty = new S3CredentialArgs();

    /**
     * The ID of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The ID of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * The ID of a public cloud project&#39;s user.
     * 
     */
    @Import(name="userId", required=true)
    private Output<String> userId;

    /**
     * @return The ID of a public cloud project&#39;s user.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    private S3CredentialArgs() {}

    private S3CredentialArgs(S3CredentialArgs $) {
        this.serviceName = $.serviceName;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(S3CredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private S3CredentialArgs $;

        public Builder() {
            $ = new S3CredentialArgs();
        }

        public Builder(S3CredentialArgs defaults) {
            $ = new S3CredentialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serviceName The ID of the public cloud project. If omitted,
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
         * @param serviceName The ID of the public cloud project. If omitted,
         * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param userId The ID of a public cloud project&#39;s user.
         * 
         * @return builder
         * 
         */
        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The ID of a public cloud project&#39;s user.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public S3CredentialArgs build() {
            if ($.serviceName == null) {
                throw new MissingRequiredPropertyException("S3CredentialArgs", "serviceName");
            }
            if ($.userId == null) {
                throw new MissingRequiredPropertyException("S3CredentialArgs", "userId");
            }
            return $;
        }
    }

}