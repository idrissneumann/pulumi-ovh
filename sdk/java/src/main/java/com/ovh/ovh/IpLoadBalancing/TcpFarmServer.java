// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.IpLoadBalancing;

import com.ovh.ovh.IpLoadBalancing.TcpFarmServerArgs;
import com.ovh.ovh.IpLoadBalancing.inputs.TcpFarmServerState;
import com.ovh.ovh.Utilities;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a backend server entry linked to loadbalancing group (farm)
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
 * import com.pulumi.ovh.IpLoadBalancing.IpLoadBalancingFunctions;
 * import com.pulumi.ovh.IpLoadBalancing.inputs.GetIpLoadBalancingArgs;
 * import com.pulumi.ovh.IpLoadBalancing.TcpFarm;
 * import com.pulumi.ovh.IpLoadBalancing.TcpFarmArgs;
 * import com.pulumi.ovh.IpLoadBalancing.TcpFarmServer;
 * import com.pulumi.ovh.IpLoadBalancing.TcpFarmServerArgs;
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
 *         final var lb = IpLoadBalancingFunctions.getIpLoadBalancing(GetIpLoadBalancingArgs.builder()
 *             .serviceName("ip-1.2.3.4")
 *             .state("ok")
 *             .build());
 * 
 *         var farmname = new TcpFarm("farmname", TcpFarmArgs.builder()
 *             .port(8080)
 *             .serviceName(lb.applyValue(getIpLoadBalancingResult -> getIpLoadBalancingResult.serviceName()))
 *             .zone("all")
 *             .build());
 * 
 *         var backend = new TcpFarmServer("backend", TcpFarmServerArgs.builder()
 *             .address("4.5.6.7")
 *             .backup(true)
 *             .displayName("mybackend")
 *             .farmId(farmname.id())
 *             .port(80)
 *             .probe(true)
 *             .proxyProtocolVersion("v2")
 *             .serviceName(lb.applyValue(getIpLoadBalancingResult -> getIpLoadBalancingResult.serviceName()))
 *             .ssl(false)
 *             .status("active")
 *             .weight(2)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * TCP farm server can be imported using the following format `service_name`, the `id` of the farm and the `id` of the server separated by &#34;/&#34; e.g.
 * 
 */
@ResourceType(type="ovh:IpLoadBalancing/tcpFarmServer:TcpFarmServer")
public class TcpFarmServer extends com.pulumi.resources.CustomResource {
    /**
     * Address of the backend server (IP from either internal or OVHcloud network)
     * 
     */
    @Export(name="address", refs={String.class}, tree="[0]")
    private Output<String> address;

    /**
     * @return Address of the backend server (IP from either internal or OVHcloud network)
     * 
     */
    public Output<String> address() {
        return this.address;
    }
    /**
     * is it a backup server used in case of failure of all the non-backup backends
     * 
     */
    @Export(name="backup", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> backup;

    /**
     * @return is it a backup server used in case of failure of all the non-backup backends
     * 
     */
    public Output<Optional<Boolean>> backup() {
        return Codegen.optional(this.backup);
    }
    @Export(name="chain", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> chain;

    public Output<Optional<String>> chain() {
        return Codegen.optional(this.chain);
    }
    /**
     * Label for the server
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> displayName;

    /**
     * @return Label for the server
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * ID of the farm this server is attached to
     * 
     */
    @Export(name="farmId", refs={Integer.class}, tree="[0]")
    private Output<Integer> farmId;

    /**
     * @return ID of the farm this server is attached to
     * 
     */
    public Output<Integer> farmId() {
        return this.farmId;
    }
    /**
     * enable action when backend marked down. (`shutdown-sessions`)
     * 
     */
    @Export(name="onMarkedDown", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> onMarkedDown;

    /**
     * @return enable action when backend marked down. (`shutdown-sessions`)
     * 
     */
    public Output<Optional<String>> onMarkedDown() {
        return Codegen.optional(this.onMarkedDown);
    }
    /**
     * Port that backend will respond on
     * 
     */
    @Export(name="port", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> port;

    /**
     * @return Port that backend will respond on
     * 
     */
    public Output<Optional<Integer>> port() {
        return Codegen.optional(this.port);
    }
    /**
     * defines if backend will be probed to determine health and keep as active in farm if healthy
     * 
     */
    @Export(name="probe", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> probe;

    /**
     * @return defines if backend will be probed to determine health and keep as active in farm if healthy
     * 
     */
    public Output<Optional<Boolean>> probe() {
        return Codegen.optional(this.probe);
    }
    /**
     * version of the PROXY protocol used to pass origin connection information from loadbalancer to receiving service (`v1`, `v2`, `v2-ssl`, `v2-ssl-cn`)
     * 
     */
    @Export(name="proxyProtocolVersion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> proxyProtocolVersion;

    /**
     * @return version of the PROXY protocol used to pass origin connection information from loadbalancer to receiving service (`v1`, `v2`, `v2-ssl`, `v2-ssl-cn`)
     * 
     */
    public Output<Optional<String>> proxyProtocolVersion() {
        return Codegen.optional(this.proxyProtocolVersion);
    }
    /**
     * The internal name of your IP load balancing
     * 
     */
    @Export(name="serviceName", refs={String.class}, tree="[0]")
    private Output<String> serviceName;

    /**
     * @return The internal name of your IP load balancing
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }
    /**
     * is the connection ciphered with SSL (TLS)
     * 
     */
    @Export(name="ssl", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ssl;

    /**
     * @return is the connection ciphered with SSL (TLS)
     * 
     */
    public Output<Optional<Boolean>> ssl() {
        return Codegen.optional(this.ssl);
    }
    /**
     * backend status - `active` or `inactive`
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return backend status - `active` or `inactive`
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * used in loadbalancing algorithm
     * 
     */
    @Export(name="weight", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> weight;

    /**
     * @return used in loadbalancing algorithm
     * 
     */
    public Output<Optional<Integer>> weight() {
        return Codegen.optional(this.weight);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TcpFarmServer(java.lang.String name) {
        this(name, TcpFarmServerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TcpFarmServer(java.lang.String name, TcpFarmServerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TcpFarmServer(java.lang.String name, TcpFarmServerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ovh:IpLoadBalancing/tcpFarmServer:TcpFarmServer", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private TcpFarmServer(java.lang.String name, Output<java.lang.String> id, @Nullable TcpFarmServerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ovh:IpLoadBalancing/tcpFarmServer:TcpFarmServer", name, state, makeResourceOptions(options, id), false);
    }

    private static TcpFarmServerArgs makeArgs(TcpFarmServerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TcpFarmServerArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static TcpFarmServer get(java.lang.String name, Output<java.lang.String> id, @Nullable TcpFarmServerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TcpFarmServer(name, id, state, options);
    }
}