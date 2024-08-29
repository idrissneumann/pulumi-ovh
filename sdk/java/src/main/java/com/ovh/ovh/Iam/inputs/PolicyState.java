// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyState extends com.pulumi.resources.ResourceArgs {

    public static final PolicyState Empty = new PolicyState();

    /**
     * List of actions allowed on resources by identities
     * 
     */
    @Import(name="allows")
    private @Nullable Output<List<String>> allows;

    /**
     * @return List of actions allowed on resources by identities
     * 
     */
    public Optional<Output<List<String>>> allows() {
        return Optional.ofNullable(this.allows);
    }

    /**
     * Creation date of this group.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return Creation date of this group.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * List of actions that will always be denied even if also allowed by this policy or another one.
     * 
     */
    @Import(name="denies")
    private @Nullable Output<List<String>> denies;

    /**
     * @return List of actions that will always be denied even if also allowed by this policy or another one.
     * 
     */
    public Optional<Output<List<String>>> denies() {
        return Optional.ofNullable(this.denies);
    }

    /**
     * Description of the policy
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the policy
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * List of overrides of action that must not be allowed even if they are caught by allow. Only makes sens if allow contains wildcards.
     * 
     */
    @Import(name="excepts")
    private @Nullable Output<List<String>> excepts;

    /**
     * @return List of overrides of action that must not be allowed even if they are caught by allow. Only makes sens if allow contains wildcards.
     * 
     */
    public Optional<Output<List<String>>> excepts() {
        return Optional.ofNullable(this.excepts);
    }

    /**
     * List of identities affected by the policy
     * 
     */
    @Import(name="identities")
    private @Nullable Output<List<String>> identities;

    /**
     * @return List of identities affected by the policy
     * 
     */
    public Optional<Output<List<String>>> identities() {
        return Optional.ofNullable(this.identities);
    }

    /**
     * Name of the policy, must be unique
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the policy, must be unique
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Owner of the policy.
     * 
     */
    @Import(name="owner")
    private @Nullable Output<String> owner;

    /**
     * @return Owner of the policy.
     * 
     */
    public Optional<Output<String>> owner() {
        return Optional.ofNullable(this.owner);
    }

    /**
     * Set of permissions groups included in the policy. At evaluation, these permissions groups are each evaluated independently (notably, excepts actions only affect actions in the same permission group).
     * 
     */
    @Import(name="permissionsGroups")
    private @Nullable Output<List<String>> permissionsGroups;

    /**
     * @return Set of permissions groups included in the policy. At evaluation, these permissions groups are each evaluated independently (notably, excepts actions only affect actions in the same permission group).
     * 
     */
    public Optional<Output<List<String>>> permissionsGroups() {
        return Optional.ofNullable(this.permissionsGroups);
    }

    /**
     * Indicates that the policy is a default one.
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    /**
     * @return Indicates that the policy is a default one.
     * 
     */
    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    /**
     * List of resources affected by the policy
     * 
     */
    @Import(name="resources")
    private @Nullable Output<List<String>> resources;

    /**
     * @return List of resources affected by the policy
     * 
     */
    public Optional<Output<List<String>>> resources() {
        return Optional.ofNullable(this.resources);
    }

    /**
     * Date of the last update of this group.
     * 
     */
    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    /**
     * @return Date of the last update of this group.
     * 
     */
    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    private PolicyState() {}

    private PolicyState(PolicyState $) {
        this.allows = $.allows;
        this.createdAt = $.createdAt;
        this.denies = $.denies;
        this.description = $.description;
        this.excepts = $.excepts;
        this.identities = $.identities;
        this.name = $.name;
        this.owner = $.owner;
        this.permissionsGroups = $.permissionsGroups;
        this.readOnly = $.readOnly;
        this.resources = $.resources;
        this.updatedAt = $.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyState $;

        public Builder() {
            $ = new PolicyState();
        }

        public Builder(PolicyState defaults) {
            $ = new PolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param allows List of actions allowed on resources by identities
         * 
         * @return builder
         * 
         */
        public Builder allows(@Nullable Output<List<String>> allows) {
            $.allows = allows;
            return this;
        }

        /**
         * @param allows List of actions allowed on resources by identities
         * 
         * @return builder
         * 
         */
        public Builder allows(List<String> allows) {
            return allows(Output.of(allows));
        }

        /**
         * @param allows List of actions allowed on resources by identities
         * 
         * @return builder
         * 
         */
        public Builder allows(String... allows) {
            return allows(List.of(allows));
        }

        /**
         * @param createdAt Creation date of this group.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt Creation date of this group.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param denies List of actions that will always be denied even if also allowed by this policy or another one.
         * 
         * @return builder
         * 
         */
        public Builder denies(@Nullable Output<List<String>> denies) {
            $.denies = denies;
            return this;
        }

        /**
         * @param denies List of actions that will always be denied even if also allowed by this policy or another one.
         * 
         * @return builder
         * 
         */
        public Builder denies(List<String> denies) {
            return denies(Output.of(denies));
        }

        /**
         * @param denies List of actions that will always be denied even if also allowed by this policy or another one.
         * 
         * @return builder
         * 
         */
        public Builder denies(String... denies) {
            return denies(List.of(denies));
        }

        /**
         * @param description Description of the policy
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the policy
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param excepts List of overrides of action that must not be allowed even if they are caught by allow. Only makes sens if allow contains wildcards.
         * 
         * @return builder
         * 
         */
        public Builder excepts(@Nullable Output<List<String>> excepts) {
            $.excepts = excepts;
            return this;
        }

        /**
         * @param excepts List of overrides of action that must not be allowed even if they are caught by allow. Only makes sens if allow contains wildcards.
         * 
         * @return builder
         * 
         */
        public Builder excepts(List<String> excepts) {
            return excepts(Output.of(excepts));
        }

        /**
         * @param excepts List of overrides of action that must not be allowed even if they are caught by allow. Only makes sens if allow contains wildcards.
         * 
         * @return builder
         * 
         */
        public Builder excepts(String... excepts) {
            return excepts(List.of(excepts));
        }

        /**
         * @param identities List of identities affected by the policy
         * 
         * @return builder
         * 
         */
        public Builder identities(@Nullable Output<List<String>> identities) {
            $.identities = identities;
            return this;
        }

        /**
         * @param identities List of identities affected by the policy
         * 
         * @return builder
         * 
         */
        public Builder identities(List<String> identities) {
            return identities(Output.of(identities));
        }

        /**
         * @param identities List of identities affected by the policy
         * 
         * @return builder
         * 
         */
        public Builder identities(String... identities) {
            return identities(List.of(identities));
        }

        /**
         * @param name Name of the policy, must be unique
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the policy, must be unique
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param owner Owner of the policy.
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable Output<String> owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param owner Owner of the policy.
         * 
         * @return builder
         * 
         */
        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        /**
         * @param permissionsGroups Set of permissions groups included in the policy. At evaluation, these permissions groups are each evaluated independently (notably, excepts actions only affect actions in the same permission group).
         * 
         * @return builder
         * 
         */
        public Builder permissionsGroups(@Nullable Output<List<String>> permissionsGroups) {
            $.permissionsGroups = permissionsGroups;
            return this;
        }

        /**
         * @param permissionsGroups Set of permissions groups included in the policy. At evaluation, these permissions groups are each evaluated independently (notably, excepts actions only affect actions in the same permission group).
         * 
         * @return builder
         * 
         */
        public Builder permissionsGroups(List<String> permissionsGroups) {
            return permissionsGroups(Output.of(permissionsGroups));
        }

        /**
         * @param permissionsGroups Set of permissions groups included in the policy. At evaluation, these permissions groups are each evaluated independently (notably, excepts actions only affect actions in the same permission group).
         * 
         * @return builder
         * 
         */
        public Builder permissionsGroups(String... permissionsGroups) {
            return permissionsGroups(List.of(permissionsGroups));
        }

        /**
         * @param readOnly Indicates that the policy is a default one.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        /**
         * @param readOnly Indicates that the policy is a default one.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        /**
         * @param resources List of resources affected by the policy
         * 
         * @return builder
         * 
         */
        public Builder resources(@Nullable Output<List<String>> resources) {
            $.resources = resources;
            return this;
        }

        /**
         * @param resources List of resources affected by the policy
         * 
         * @return builder
         * 
         */
        public Builder resources(List<String> resources) {
            return resources(Output.of(resources));
        }

        /**
         * @param resources List of resources affected by the policy
         * 
         * @return builder
         * 
         */
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }

        /**
         * @param updatedAt Date of the last update of this group.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        /**
         * @param updatedAt Date of the last update of this group.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        public PolicyState build() {
            return $;
        }
    }

}