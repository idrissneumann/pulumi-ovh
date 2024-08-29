// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.CloudProjectDatabase;

import com.ovh.ovh.CloudProjectDatabase.PostgresSqlUserArgs;
import com.ovh.ovh.CloudProjectDatabase.inputs.PostgresSqlUserState;
import com.ovh.ovh.Utilities;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * OVHcloud Managed PostgreSQL clusters users can be imported using the `service_name`, `cluster_id` and `id` of the user, separated by &#34;/&#34; E.g.,
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import ovh:CloudProjectDatabase/postgresSqlUser:PostgresSqlUser my_user service_name/cluster_id/id
 * ```
 * 
 */
@ResourceType(type="ovh:CloudProjectDatabase/postgresSqlUser:PostgresSqlUser")
public class PostgresSqlUser extends com.pulumi.resources.CustomResource {
    /**
     * Cluster ID.
     * 
     */
    @Export(name="clusterId", refs={String.class}, tree="[0]")
    private Output<String> clusterId;

    /**
     * @return Cluster ID.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * Date of the creation of the user.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return Date of the creation of the user.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Name of the user. A user named &#34;avnadmin&#34; is mapped with already created admin user and reset his password instead of creating a new user.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the user. A user named &#34;avnadmin&#34; is mapped with already created admin user and reset his password instead of creating a new user.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * (Sensitive) Password of the user.
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output<String> password;

    /**
     * @return (Sensitive) Password of the user.
     * 
     */
    public Output<String> password() {
        return this.password;
    }
    /**
     * Arbitrary string to change to trigger a password update
     * 
     */
    @Export(name="passwordReset", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> passwordReset;

    /**
     * @return Arbitrary string to change to trigger a password update
     * 
     */
    public Output<Optional<String>> passwordReset() {
        return Codegen.optional(this.passwordReset);
    }
    /**
     * Roles the user belongs to.
     * Available roles:
     * 
     */
    @Export(name="roles", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> roles;

    /**
     * @return Roles the user belongs to.
     * Available roles:
     * 
     */
    public Output<List<String>> roles() {
        return this.roles;
    }
    /**
     * The id of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     * 
     */
    @Export(name="serviceName", refs={String.class}, tree="[0]")
    private Output<String> serviceName;

    /**
     * @return The id of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }
    /**
     * Current status of the user.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Current status of the user.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PostgresSqlUser(java.lang.String name) {
        this(name, PostgresSqlUserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PostgresSqlUser(java.lang.String name, PostgresSqlUserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PostgresSqlUser(java.lang.String name, PostgresSqlUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ovh:CloudProjectDatabase/postgresSqlUser:PostgresSqlUser", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private PostgresSqlUser(java.lang.String name, Output<java.lang.String> id, @Nullable PostgresSqlUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ovh:CloudProjectDatabase/postgresSqlUser:PostgresSqlUser", name, state, makeResourceOptions(options, id), false);
    }

    private static PostgresSqlUserArgs makeArgs(PostgresSqlUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? PostgresSqlUserArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "password"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PostgresSqlUser get(java.lang.String name, Output<java.lang.String> id, @Nullable PostgresSqlUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PostgresSqlUser(name, id, state, options);
    }
}