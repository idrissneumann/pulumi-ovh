// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to get the list of databases of a database cluster associated with a public cloud project.
 *
 * ## Example Usage
 */
export function getDatabaseInstances(args: GetDatabaseInstancesArgs, opts?: pulumi.InvokeOptions): Promise<GetDatabaseInstancesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("ovh:CloudProjectDatabase/getDatabaseInstances:getDatabaseInstances", {
        "clusterId": args.clusterId,
        "engine": args.engine,
        "serviceName": args.serviceName,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatabaseInstances.
 */
export interface GetDatabaseInstancesArgs {
    /**
     * Cluster ID
     */
    clusterId: string;
    /**
     * The engine of the database cluster you want to list databases. To get a full list of available engine visit:
     * [public documentation](https://docs.ovh.com/gb/en/publiccloud/databases).
     * Available engines:
     */
    engine: string;
    /**
     * The id of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     */
    serviceName: string;
}

/**
 * A collection of values returned by getDatabaseInstances.
 */
export interface GetDatabaseInstancesResult {
    /**
     * See Argument Reference above.
     */
    readonly clusterId: string;
    /**
     * The list of databases ids of the database cluster associated with the project.
     */
    readonly databaseIds: string[];
    /**
     * See Argument Reference above.
     */
    readonly engine: string;
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
 * Use this data source to get the list of databases of a database cluster associated with a public cloud project.
 *
 * ## Example Usage
 */
export function getDatabaseInstancesOutput(args: GetDatabaseInstancesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDatabaseInstancesResult> {
    return pulumi.output(args).apply((a: any) => getDatabaseInstances(a, opts))
}

/**
 * A collection of arguments for invoking getDatabaseInstances.
 */
export interface GetDatabaseInstancesOutputArgs {
    /**
     * Cluster ID
     */
    clusterId: pulumi.Input<string>;
    /**
     * The engine of the database cluster you want to list databases. To get a full list of available engine visit:
     * [public documentation](https://docs.ovh.com/gb/en/publiccloud/databases).
     * Available engines:
     */
    engine: pulumi.Input<string>;
    /**
     * The id of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     */
    serviceName: pulumi.Input<string>;
}