// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovhcloud.pulumi.ovh.Dbaas;

import com.ovhcloud.pulumi.ovh.Dbaas.LogsInputArgs;
import com.ovhcloud.pulumi.ovh.Dbaas.inputs.LogsInputState;
import com.ovhcloud.pulumi.ovh.Dbaas.outputs.LogsInputConfiguration;
import com.ovhcloud.pulumi.ovh.Utilities;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a dbaas logs input.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.ovh.Dbaas.DbaasFunctions;
 * import com.pulumi.ovh.Dbaas.inputs.GetLogsInputEngineArgs;
 * import com.pulumi.ovh.Dbaas.LogsOutputGraylogStream;
 * import com.pulumi.ovh.Dbaas.LogsOutputGraylogStreamArgs;
 * import com.pulumi.ovh.Dbaas.LogsInput;
 * import com.pulumi.ovh.Dbaas.LogsInputArgs;
 * import com.pulumi.ovh.Dbaas.inputs.LogsInputConfigurationArgs;
 * import com.pulumi.ovh.Dbaas.inputs.LogsInputConfigurationLogstashArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var logstash = DbaasFunctions.getLogsInputEngine(GetLogsInputEngineArgs.builder()
 *             .name("logstash")
 *             .version("7.x")
 *             .build());
 * 
 *         var stream = new LogsOutputGraylogStream("stream", LogsOutputGraylogStreamArgs.builder()
 *             .serviceName("....")
 *             .title("my stream")
 *             .description("my graylog stream")
 *             .build());
 * 
 *         var input = new LogsInput("input", LogsInputArgs.builder()
 *             .serviceName(stream.serviceName())
 *             .description(stream.description())
 *             .title(stream.title())
 *             .engineId(logstash.applyValue(getLogsInputEngineResult -> getLogsInputEngineResult.id()))
 *             .streamId(stream.id())
 *             .allowedNetworks("10.0.0.0/16")
 *             .exposedPort("6154")
 *             .nbInstance(2)
 *             .configuration(LogsInputConfigurationArgs.builder()
 *                 .logstash(LogsInputConfigurationLogstashArgs.builder()
 *                     .inputSection("""
 *   beats {
 *     port => 6514
 *     ssl => true
 *     ssl_certificate => "/etc/ssl/private/server.crt"
 *     ssl_key => "/etc/ssl/private/server.key"
 *   }
 *                     """)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="ovh:Dbaas/logsInput:LogsInput")
public class LogsInput extends com.pulumi.resources.CustomResource {
    /**
     * List of IP blocks
     * 
     */
    @Export(name="allowedNetworks", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> allowedNetworks;

    /**
     * @return List of IP blocks
     * 
     */
    public Output<List<String>> allowedNetworks() {
        return this.allowedNetworks;
    }
    /**
     * Whether the workload is auto-scaled (mutually exclusive with parameter `nb_instance`)
     * 
     */
    @Export(name="autoscale", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoscale;

    /**
     * @return Whether the workload is auto-scaled (mutually exclusive with parameter `nb_instance`)
     * 
     */
    public Output<Optional<Boolean>> autoscale() {
        return Codegen.optional(this.autoscale);
    }
    /**
     * Input configuration
     * 
     */
    @Export(name="configuration", refs={LogsInputConfiguration.class}, tree="[0]")
    private Output<LogsInputConfiguration> configuration;

    /**
     * @return Input configuration
     * 
     */
    public Output<LogsInputConfiguration> configuration() {
        return this.configuration;
    }
    /**
     * Input creation
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return Input creation
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Number of instance running (returned by the API)
     * 
     */
    @Export(name="currentNbInstance", refs={Integer.class}, tree="[0]")
    private Output<Integer> currentNbInstance;

    /**
     * @return Number of instance running (returned by the API)
     * 
     */
    public Output<Integer> currentNbInstance() {
        return this.currentNbInstance;
    }
    /**
     * Input description
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return Input description
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Input engine ID
     * 
     */
    @Export(name="engineId", refs={String.class}, tree="[0]")
    private Output<String> engineId;

    /**
     * @return Input engine ID
     * 
     */
    public Output<String> engineId() {
        return this.engineId;
    }
    /**
     * Port
     * 
     */
    @Export(name="exposedPort", refs={String.class}, tree="[0]")
    private Output<String> exposedPort;

    /**
     * @return Port
     * 
     */
    public Output<String> exposedPort() {
        return this.exposedPort;
    }
    /**
     * Hostname
     * 
     */
    @Export(name="hostname", refs={String.class}, tree="[0]")
    private Output<String> hostname;

    /**
     * @return Hostname
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }
    /**
     * Input ID
     * 
     */
    @Export(name="inputId", refs={String.class}, tree="[0]")
    private Output<String> inputId;

    /**
     * @return Input ID
     * 
     */
    public Output<String> inputId() {
        return this.inputId;
    }
    /**
     * Indicate if input need to be restarted
     * 
     */
    @Export(name="isRestartRequired", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isRestartRequired;

    /**
     * @return Indicate if input need to be restarted
     * 
     */
    public Output<Boolean> isRestartRequired() {
        return this.isRestartRequired;
    }
    /**
     * Maximum number of instances in auto-scaled mode
     * 
     */
    @Export(name="maxScaleInstance", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maxScaleInstance;

    /**
     * @return Maximum number of instances in auto-scaled mode
     * 
     */
    public Output<Optional<Integer>> maxScaleInstance() {
        return Codegen.optional(this.maxScaleInstance);
    }
    /**
     * Minimum number of instances in auto-scaled mode
     * 
     */
    @Export(name="minScaleInstance", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> minScaleInstance;

    /**
     * @return Minimum number of instances in auto-scaled mode
     * 
     */
    public Output<Optional<Integer>> minScaleInstance() {
        return Codegen.optional(this.minScaleInstance);
    }
    /**
     * Number of instance running (input, mutually exclusive with parameter `autoscale`)
     * 
     */
    @Export(name="nbInstance", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> nbInstance;

    /**
     * @return Number of instance running (input, mutually exclusive with parameter `autoscale`)
     * 
     */
    public Output<Optional<Integer>> nbInstance() {
        return Codegen.optional(this.nbInstance);
    }
    /**
     * Input IP address
     * 
     */
    @Export(name="publicAddress", refs={String.class}, tree="[0]")
    private Output<String> publicAddress;

    /**
     * @return Input IP address
     * 
     */
    public Output<String> publicAddress() {
        return this.publicAddress;
    }
    /**
     * service name
     * 
     */
    @Export(name="serviceName", refs={String.class}, tree="[0]")
    private Output<String> serviceName;

    /**
     * @return service name
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }
    /**
     * Input SSL certificate
     * 
     */
    @Export(name="sslCertificate", refs={String.class}, tree="[0]")
    private Output<String> sslCertificate;

    /**
     * @return Input SSL certificate
     * 
     */
    public Output<String> sslCertificate() {
        return this.sslCertificate;
    }
    /**
     * init: configuration required, pending: ready to start, running: available
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return init: configuration required, pending: ready to start, running: available
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Associated Graylog stream
     * 
     */
    @Export(name="streamId", refs={String.class}, tree="[0]")
    private Output<String> streamId;

    /**
     * @return Associated Graylog stream
     * 
     */
    public Output<String> streamId() {
        return this.streamId;
    }
    /**
     * Input title
     * 
     */
    @Export(name="title", refs={String.class}, tree="[0]")
    private Output<String> title;

    /**
     * @return Input title
     * 
     */
    public Output<String> title() {
        return this.title;
    }
    /**
     * Input last update
     * 
     */
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output<String> updatedAt;

    /**
     * @return Input last update
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogsInput(java.lang.String name) {
        this(name, LogsInputArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogsInput(java.lang.String name, LogsInputArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogsInput(java.lang.String name, LogsInputArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ovh:Dbaas/logsInput:LogsInput", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private LogsInput(java.lang.String name, Output<java.lang.String> id, @Nullable LogsInputState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ovh:Dbaas/logsInput:LogsInput", name, state, makeResourceOptions(options, id), false);
    }

    private static LogsInputArgs makeArgs(LogsInputArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? LogsInputArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "sslCertificate"
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
    public static LogsInput get(java.lang.String name, Output<java.lang.String> id, @Nullable LogsInputState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogsInput(name, id, state, options);
    }
}
