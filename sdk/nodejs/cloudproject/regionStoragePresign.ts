// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Generates a temporary presigned S3 URLs to download or upload an object.
 *
 * > __NOTE__ This resource is only compatible with the `High Performance - S3` solution for object storage.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as ovh from "@ovh-devrelteam/pulumi-ovh";
 *
 * const presignedUrlRegionStoragePresign = new ovh.cloudproject.RegionStoragePresign("presignedUrlRegionStoragePresign", {
 *     serviceName: "xxxxxxxxxxxxxxxxx",
 *     regionName: "GRA",
 *     expire: 3600,
 *     method: "GET",
 *     object: "an-object-in-the-bucket",
 * });
 * export const presignedUrl = presignedUrlRegionStoragePresign.url;
 * ```
 */
export class RegionStoragePresign extends pulumi.CustomResource {
    /**
     * Get an existing RegionStoragePresign resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RegionStoragePresignState, opts?: pulumi.CustomResourceOptions): RegionStoragePresign {
        return new RegionStoragePresign(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'ovh:CloudProject/regionStoragePresign:RegionStoragePresign';

    /**
     * Returns true if the given object is an instance of RegionStoragePresign.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RegionStoragePresign {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RegionStoragePresign.__pulumiType;
    }

    /**
     * Define, in seconds, for how long your URL will be valid.
     */
    public readonly expire!: pulumi.Output<number>;
    /**
     * The method you want to use to interact with your object. Can be either 'GET' or 'PUT'.
     */
    public readonly method!: pulumi.Output<string>;
    /**
     * The name of your S3 storage container/bucket.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the object in your S3 bucket.
     */
    public readonly object!: pulumi.Output<string>;
    /**
     * The region in which your storage is located.
     * Ex.: "GRA".
     */
    public readonly regionName!: pulumi.Output<string>;
    /**
     * The id of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     */
    public readonly serviceName!: pulumi.Output<string>;
    /**
     * Computed URL result.
     */
    public /*out*/ readonly url!: pulumi.Output<string>;

    /**
     * Create a RegionStoragePresign resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RegionStoragePresignArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RegionStoragePresignArgs | RegionStoragePresignState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RegionStoragePresignState | undefined;
            resourceInputs["expire"] = state ? state.expire : undefined;
            resourceInputs["method"] = state ? state.method : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["object"] = state ? state.object : undefined;
            resourceInputs["regionName"] = state ? state.regionName : undefined;
            resourceInputs["serviceName"] = state ? state.serviceName : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
        } else {
            const args = argsOrState as RegionStoragePresignArgs | undefined;
            if ((!args || args.expire === undefined) && !opts.urn) {
                throw new Error("Missing required property 'expire'");
            }
            if ((!args || args.method === undefined) && !opts.urn) {
                throw new Error("Missing required property 'method'");
            }
            if ((!args || args.object === undefined) && !opts.urn) {
                throw new Error("Missing required property 'object'");
            }
            if ((!args || args.regionName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'regionName'");
            }
            if ((!args || args.serviceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceName'");
            }
            resourceInputs["expire"] = args ? args.expire : undefined;
            resourceInputs["method"] = args ? args.method : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["object"] = args ? args.object : undefined;
            resourceInputs["regionName"] = args ? args.regionName : undefined;
            resourceInputs["serviceName"] = args ? args.serviceName : undefined;
            resourceInputs["url"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RegionStoragePresign.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RegionStoragePresign resources.
 */
export interface RegionStoragePresignState {
    /**
     * Define, in seconds, for how long your URL will be valid.
     */
    expire?: pulumi.Input<number>;
    /**
     * The method you want to use to interact with your object. Can be either 'GET' or 'PUT'.
     */
    method?: pulumi.Input<string>;
    /**
     * The name of your S3 storage container/bucket.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the object in your S3 bucket.
     */
    object?: pulumi.Input<string>;
    /**
     * The region in which your storage is located.
     * Ex.: "GRA".
     */
    regionName?: pulumi.Input<string>;
    /**
     * The id of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     */
    serviceName?: pulumi.Input<string>;
    /**
     * Computed URL result.
     */
    url?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RegionStoragePresign resource.
 */
export interface RegionStoragePresignArgs {
    /**
     * Define, in seconds, for how long your URL will be valid.
     */
    expire: pulumi.Input<number>;
    /**
     * The method you want to use to interact with your object. Can be either 'GET' or 'PUT'.
     */
    method: pulumi.Input<string>;
    /**
     * The name of your S3 storage container/bucket.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the object in your S3 bucket.
     */
    object: pulumi.Input<string>;
    /**
     * The region in which your storage is located.
     * Ex.: "GRA".
     */
    regionName: pulumi.Input<string>;
    /**
     * The id of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     */
    serviceName: pulumi.Input<string>;
}
