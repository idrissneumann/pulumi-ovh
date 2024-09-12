// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovhcloud.pulumi.ovh.Dedicated.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServerInstallTaskDetails {
    /**
     * @return Set up the server using the provided hostname instead of the default hostname.
     * 
     */
    private @Nullable String customHostname;
    /**
     * @return Disk group id.
     * 
     */
    private @Nullable Integer diskGroupId;
    /**
     * @return Set to true to disable RAID.
     * 
     */
    private @Nullable Boolean noRaid;
    /**
     * @return soft raid devices.
     * 
     */
    private @Nullable Integer softRaidDevices;

    private ServerInstallTaskDetails() {}
    /**
     * @return Set up the server using the provided hostname instead of the default hostname.
     * 
     */
    public Optional<String> customHostname() {
        return Optional.ofNullable(this.customHostname);
    }
    /**
     * @return Disk group id.
     * 
     */
    public Optional<Integer> diskGroupId() {
        return Optional.ofNullable(this.diskGroupId);
    }
    /**
     * @return Set to true to disable RAID.
     * 
     */
    public Optional<Boolean> noRaid() {
        return Optional.ofNullable(this.noRaid);
    }
    /**
     * @return soft raid devices.
     * 
     */
    public Optional<Integer> softRaidDevices() {
        return Optional.ofNullable(this.softRaidDevices);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerInstallTaskDetails defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String customHostname;
        private @Nullable Integer diskGroupId;
        private @Nullable Boolean noRaid;
        private @Nullable Integer softRaidDevices;
        public Builder() {}
        public Builder(ServerInstallTaskDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customHostname = defaults.customHostname;
    	      this.diskGroupId = defaults.diskGroupId;
    	      this.noRaid = defaults.noRaid;
    	      this.softRaidDevices = defaults.softRaidDevices;
        }

        @CustomType.Setter
        public Builder customHostname(@Nullable String customHostname) {

            this.customHostname = customHostname;
            return this;
        }
        @CustomType.Setter
        public Builder diskGroupId(@Nullable Integer diskGroupId) {

            this.diskGroupId = diskGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder noRaid(@Nullable Boolean noRaid) {

            this.noRaid = noRaid;
            return this;
        }
        @CustomType.Setter
        public Builder softRaidDevices(@Nullable Integer softRaidDevices) {

            this.softRaidDevices = softRaidDevices;
            return this;
        }
        public ServerInstallTaskDetails build() {
            final var _resultValue = new ServerInstallTaskDetails();
            _resultValue.customHostname = customHostname;
            _resultValue.diskGroupId = diskGroupId;
            _resultValue.noRaid = noRaid;
            _resultValue.softRaidDevices = softRaidDevices;
            return _resultValue;
        }
    }
}
