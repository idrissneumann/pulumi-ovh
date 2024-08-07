// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to retrieve informations about a DBaas logs cluster tenant.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as ovh from "@pulumi/ovh";
 *
 * const logstash = ovh.Dbaas.getLogsCluster({
 *     clusterId: "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
 *     serviceName: "ldp-xx-xxxxx",
 * });
 * ```
 */
export function getLogsCluster(args: GetLogsClusterArgs, opts?: pulumi.InvokeOptions): Promise<GetLogsClusterResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("ovh:Dbaas/getLogsCluster:getLogsCluster", {
        "clusterId": args.clusterId,
        "serviceName": args.serviceName,
    }, opts);
}

/**
 * A collection of arguments for invoking getLogsCluster.
 */
export interface GetLogsClusterArgs {
    /**
     * Cluster ID. If not provided, the default clusterId is returned
     */
    clusterId?: string;
    /**
     * The service name. It's the ID of your Logs Data Platform instance.
     */
    serviceName: string;
}

/**
 * A collection of values returned by getLogsCluster.
 */
export interface GetLogsClusterResult {
    /**
     * is allowed networks for ARCHIVE flow type
     */
    readonly archiveAllowedNetworks: string[];
    readonly clusterId: string;
    /**
     * is type of cluster (DEDICATED, PRO or TRIAL)
     */
    readonly clusterType: string;
    /**
     * is PEM for dedicated inputs
     */
    readonly dedicatedInputPem: string;
    /**
     * is allowed networks for DIRECT_INPUT flow type
     */
    readonly directInputAllowedNetworks: string[];
    /**
     * is PEM for direct inputs
     */
    readonly directInputPem: string;
    /**
     * is cluster hostname hosting the tenant
     */
    readonly hostname: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * is true if all content generated by given service will be placed on this cluster
     */
    readonly isDefault: boolean;
    /**
     * is true if given service can perform advanced operations on cluster
     */
    readonly isUnlocked: boolean;
    /**
     * is allowed networks for QUERY flow type
     */
    readonly queryAllowedNetworks: string[];
    /**
     * is datacenter localization
     */
    readonly region: string;
    readonly serviceName: string;
    /**
     * is the URN of the DBaas logs instance
     */
    readonly urn: string;
}
/**
 * Use this data source to retrieve informations about a DBaas logs cluster tenant.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as ovh from "@pulumi/ovh";
 *
 * const logstash = ovh.Dbaas.getLogsCluster({
 *     clusterId: "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
 *     serviceName: "ldp-xx-xxxxx",
 * });
 * ```
 */
export function getLogsClusterOutput(args: GetLogsClusterOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetLogsClusterResult> {
    return pulumi.output(args).apply((a: any) => getLogsCluster(a, opts))
}

/**
 * A collection of arguments for invoking getLogsCluster.
 */
export interface GetLogsClusterOutputArgs {
    /**
     * Cluster ID. If not provided, the default clusterId is returned
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The service name. It's the ID of your Logs Data Platform instance.
     */
    serviceName: pulumi.Input<string>;
}
