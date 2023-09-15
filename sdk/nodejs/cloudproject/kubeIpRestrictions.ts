// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Apply IP restrictions to an OVHcloud Managed Kubernetes cluster.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as ovh from "@ovh-devrelteam/pulumi-ovh";
 *
 * const vrackOnly = new ovh.cloudproject.KubeIpRestrictions("vrackOnly", {
 *     ips: ["10.42.0.0/16"],
 *     kubeId: "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxx",
 *     serviceName: "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx",
 * });
 * ```
 *
 * ## Import
 *
 * OVHcloud Managed Kubernetes Service cluster IP restrictions can be imported using the `service_name` and the `id` of the cluster, separated by "/" E.g., bash
 *
 * ```sh
 *  $ pulumi import ovh:CloudProject/kubeIpRestrictions:KubeIpRestrictions iprestrictions service_name/kube_id
 * ```
 */
export class KubeIpRestrictions extends pulumi.CustomResource {
    /**
     * Get an existing KubeIpRestrictions resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: KubeIpRestrictionsState, opts?: pulumi.CustomResourceOptions): KubeIpRestrictions {
        return new KubeIpRestrictions(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'ovh:CloudProject/kubeIpRestrictions:KubeIpRestrictions';

    /**
     * Returns true if the given object is an instance of KubeIpRestrictions.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is KubeIpRestrictions {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === KubeIpRestrictions.__pulumiType;
    }

    /**
     * List of CIDR authorized to interact with the managed Kubernetes cluster.
     */
    public readonly ips!: pulumi.Output<string[]>;
    /**
     * The id of the managed Kubernetes cluster. **Changing this value recreates the resource.**
     */
    public readonly kubeId!: pulumi.Output<string>;
    /**
     * The id of the public cloud project. If omitted, the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used. **Changing this value recreates the resource.**
     */
    public readonly serviceName!: pulumi.Output<string>;

    /**
     * Create a KubeIpRestrictions resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: KubeIpRestrictionsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: KubeIpRestrictionsArgs | KubeIpRestrictionsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as KubeIpRestrictionsState | undefined;
            resourceInputs["ips"] = state ? state.ips : undefined;
            resourceInputs["kubeId"] = state ? state.kubeId : undefined;
            resourceInputs["serviceName"] = state ? state.serviceName : undefined;
        } else {
            const args = argsOrState as KubeIpRestrictionsArgs | undefined;
            if ((!args || args.ips === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ips'");
            }
            if ((!args || args.kubeId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'kubeId'");
            }
            if ((!args || args.serviceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceName'");
            }
            resourceInputs["ips"] = args ? args.ips : undefined;
            resourceInputs["kubeId"] = args ? args.kubeId : undefined;
            resourceInputs["serviceName"] = args ? args.serviceName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(KubeIpRestrictions.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering KubeIpRestrictions resources.
 */
export interface KubeIpRestrictionsState {
    /**
     * List of CIDR authorized to interact with the managed Kubernetes cluster.
     */
    ips?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The id of the managed Kubernetes cluster. **Changing this value recreates the resource.**
     */
    kubeId?: pulumi.Input<string>;
    /**
     * The id of the public cloud project. If omitted, the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used. **Changing this value recreates the resource.**
     */
    serviceName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a KubeIpRestrictions resource.
 */
export interface KubeIpRestrictionsArgs {
    /**
     * List of CIDR authorized to interact with the managed Kubernetes cluster.
     */
    ips: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The id of the managed Kubernetes cluster. **Changing this value recreates the resource.**
     */
    kubeId: pulumi.Input<string>;
    /**
     * The id of the public cloud project. If omitted, the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used. **Changing this value recreates the resource.**
     */
    serviceName: pulumi.Input<string>;
}
