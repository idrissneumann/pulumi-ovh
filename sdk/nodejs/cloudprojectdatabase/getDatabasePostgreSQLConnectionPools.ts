// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to get the list of  connection pools of a postgresql cluster associated with a public cloud project.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as ovh from "@pulumi/ovh";
 *
 * const testPools = ovh.CloudProjectDatabase.getDatabasePostgreSQLConnectionPools({
 *     serviceName: "XXX",
 *     clusterId: "YYY",
 * });
 * export const connectionPoolIds = testPools.then(testPools => testPools.connectionPoolIds);
 * ```
 */
export function getDatabasePostgreSQLConnectionPools(args: GetDatabasePostgreSQLConnectionPoolsArgs, opts?: pulumi.InvokeOptions): Promise<GetDatabasePostgreSQLConnectionPoolsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("ovh:CloudProjectDatabase/getDatabasePostgreSQLConnectionPools:getDatabasePostgreSQLConnectionPools", {
        "clusterId": args.clusterId,
        "serviceName": args.serviceName,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatabasePostgreSQLConnectionPools.
 */
export interface GetDatabasePostgreSQLConnectionPoolsArgs {
    /**
     * Cluster ID.
     */
    clusterId: string;
    /**
     * The id of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     */
    serviceName: string;
}

/**
 * A collection of values returned by getDatabasePostgreSQLConnectionPools.
 */
export interface GetDatabasePostgreSQLConnectionPoolsResult {
    /**
     * See Argument Reference above.
     */
    readonly clusterId: string;
    /**
     * The list of patterns ids of the opensearch cluster associated with the project.
     */
    readonly connectionPoolIds: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * See Argument Reference above.
     */
    readonly serviceName: string;
}
/**
 * Use this data source to get the list of  connection pools of a postgresql cluster associated with a public cloud project.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as ovh from "@pulumi/ovh";
 *
 * const testPools = ovh.CloudProjectDatabase.getDatabasePostgreSQLConnectionPools({
 *     serviceName: "XXX",
 *     clusterId: "YYY",
 * });
 * export const connectionPoolIds = testPools.then(testPools => testPools.connectionPoolIds);
 * ```
 */
export function getDatabasePostgreSQLConnectionPoolsOutput(args: GetDatabasePostgreSQLConnectionPoolsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDatabasePostgreSQLConnectionPoolsResult> {
    return pulumi.output(args).apply((a: any) => getDatabasePostgreSQLConnectionPools(a, opts))
}

/**
 * A collection of arguments for invoking getDatabasePostgreSQLConnectionPools.
 */
export interface GetDatabasePostgreSQLConnectionPoolsOutputArgs {
    /**
     * Cluster ID.
     */
    clusterId: pulumi.Input<string>;
    /**
     * The id of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     */
    serviceName: pulumi.Input<string>;
}