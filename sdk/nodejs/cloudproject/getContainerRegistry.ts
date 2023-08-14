// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to get information about a container registry associated with a public cloud project.
 *
 * ## Example Usage
 */
export function getContainerRegistry(args: GetContainerRegistryArgs, opts?: pulumi.InvokeOptions): Promise<GetContainerRegistryResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("ovh:CloudProject/getContainerRegistry:getContainerRegistry", {
        "registryId": args.registryId,
        "serviceName": args.serviceName,
    }, opts);
}

/**
 * A collection of arguments for invoking getContainerRegistry.
 */
export interface GetContainerRegistryArgs {
    /**
     * Registry ID
     */
    registryId: string;
    /**
     * The id of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     */
    serviceName: string;
}

/**
 * A collection of values returned by getContainerRegistry.
 */
export interface GetContainerRegistryResult {
    /**
     * Registry creation date
     */
    readonly createdAt: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Registry name
     */
    readonly name: string;
    /**
     * Project ID of your registry
     */
    readonly projectId: string;
    /**
     * Region of the registry
     */
    readonly region: string;
    readonly registryId: string;
    readonly serviceName: string;
    /**
     * Current size of the registry (bytes)
     */
    readonly size: number;
    /**
     * Registry status
     */
    readonly status: string;
    /**
     * Registry last update date
     */
    readonly updatedAt: string;
    /**
     * Access url of the registry
     */
    readonly url: string;
    /**
     * Version of your registry
     */
    readonly version: string;
}
/**
 * Use this data source to get information about a container registry associated with a public cloud project.
 *
 * ## Example Usage
 */
export function getContainerRegistryOutput(args: GetContainerRegistryOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetContainerRegistryResult> {
    return pulumi.output(args).apply((a: any) => getContainerRegistry(a, opts))
}

/**
 * A collection of arguments for invoking getContainerRegistry.
 */
export interface GetContainerRegistryOutputArgs {
    /**
     * Registry ID
     */
    registryId: pulumi.Input<string>;
    /**
     * The id of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     */
    serviceName: pulumi.Input<string>;
}