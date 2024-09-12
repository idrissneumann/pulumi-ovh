// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovhcloud.pulumi.ovh.Me.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstallationTemplateCustomization {
    /**
     * @return Set up the server using the provided hostname instead of the default hostname.
     * 
     */
    private @Nullable String customHostname;

    private InstallationTemplateCustomization() {}
    /**
     * @return Set up the server using the provided hostname instead of the default hostname.
     * 
     */
    public Optional<String> customHostname() {
        return Optional.ofNullable(this.customHostname);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstallationTemplateCustomization defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String customHostname;
        public Builder() {}
        public Builder(InstallationTemplateCustomization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customHostname = defaults.customHostname;
        }

        @CustomType.Setter
        public Builder customHostname(@Nullable String customHostname) {

            this.customHostname = customHostname;
            return this;
        }
        public InstallationTemplateCustomization build() {
            final var _resultValue = new InstallationTemplateCustomization();
            _resultValue.customHostname = customHostname;
            return _resultValue;
        }
    }
}
