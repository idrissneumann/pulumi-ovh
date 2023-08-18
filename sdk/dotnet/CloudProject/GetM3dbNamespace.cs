// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace scraly.Ovh.CloudProject
{
    public static class GetM3dbNamespace
    {
        /// <summary>
        /// Use this data source to get information about a namespace of a M3DB cluster associated with a public cloud project.
        /// 
        /// ## Example Usage
        /// 
        /// ```hcl
        /// data "ovh_cloud_project_database_m3db_namespace" "m3dbnamespace" {
        ///   service_name  = "XXX"
        ///   cluster_id    = "YYY"
        ///   name          = "ZZZ"
        /// }
        /// 
        /// output "m3dbnamespace_type" {
        ///   value = data.ovh_cloud_project_database_m3db_namespace.m3dbnamespace.type
        /// }
        /// ```
        /// </summary>
        public static Task<GetM3dbNamespaceResult> InvokeAsync(GetM3dbNamespaceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetM3dbNamespaceResult>("ovh:CloudProject/getM3dbNamespace:getM3dbNamespace", args ?? new GetM3dbNamespaceArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a namespace of a M3DB cluster associated with a public cloud project.
        /// 
        /// ## Example Usage
        /// 
        /// ```hcl
        /// data "ovh_cloud_project_database_m3db_namespace" "m3dbnamespace" {
        ///   service_name  = "XXX"
        ///   cluster_id    = "YYY"
        ///   name          = "ZZZ"
        /// }
        /// 
        /// output "m3dbnamespace_type" {
        ///   value = data.ovh_cloud_project_database_m3db_namespace.m3dbnamespace.type
        /// }
        /// ```
        /// </summary>
        public static Output<GetM3dbNamespaceResult> Invoke(GetM3dbNamespaceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetM3dbNamespaceResult>("ovh:CloudProject/getM3dbNamespace:getM3dbNamespace", args ?? new GetM3dbNamespaceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetM3dbNamespaceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Cluster ID
        /// </summary>
        [Input("clusterId", required: true)]
        public string ClusterId { get; set; } = null!;

        /// <summary>
        /// Name of the namespace.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The id of the public cloud project. If omitted,
        /// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
        /// </summary>
        [Input("serviceName", required: true)]
        public string ServiceName { get; set; } = null!;

        public GetM3dbNamespaceArgs()
        {
        }
        public static new GetM3dbNamespaceArgs Empty => new GetM3dbNamespaceArgs();
    }

    public sealed class GetM3dbNamespaceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Cluster ID
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// Name of the namespace.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The id of the public cloud project. If omitted,
        /// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        public GetM3dbNamespaceInvokeArgs()
        {
        }
        public static new GetM3dbNamespaceInvokeArgs Empty => new GetM3dbNamespaceInvokeArgs();
    }


    [OutputType]
    public sealed class GetM3dbNamespaceResult
    {
        /// <summary>
        /// See Argument Reference above.
        /// </summary>
        public readonly string ClusterId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// See Argument Reference above.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Resolution for an aggregated namespace.
        /// </summary>
        public readonly string Resolution;
        /// <summary>
        /// Controls how long we wait before expiring stale data.
        /// </summary>
        public readonly string RetentionBlockDataExpirationDuration;
        /// <summary>
        /// Controls how long to keep a block in memory before flushing to a fileset on disk.
        /// </summary>
        public readonly string RetentionBlockSizeDuration;
        /// <summary>
        /// Controls how far into the future writes to the namespace will be accepted.
        /// </summary>
        public readonly string RetentionBufferFutureDuration;
        /// <summary>
        /// Controls how far into the past writes to the namespace will be accepted.
        /// </summary>
        public readonly string RetentionBufferPastDuration;
        /// <summary>
        /// Controls the duration of time that M3DB will retain data for the namespace.
        /// </summary>
        public readonly string RetentionPeriodDuration;
        /// <summary>
        /// See Argument Reference above.
        /// </summary>
        public readonly string ServiceName;
        /// <summary>
        /// SDefines whether M3db will create snapshot files for this namespace.
        /// </summary>
        public readonly bool SnapshotEnabled;
        /// <summary>
        /// Type of namespace.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Defines whether M3DB will include writes to this namespace in the commit log.
        /// </summary>
        public readonly bool WritesToCommitLogEnabled;

        [OutputConstructor]
        private GetM3dbNamespaceResult(
            string clusterId,

            string id,

            string name,

            string resolution,

            string retentionBlockDataExpirationDuration,

            string retentionBlockSizeDuration,

            string retentionBufferFutureDuration,

            string retentionBufferPastDuration,

            string retentionPeriodDuration,

            string serviceName,

            bool snapshotEnabled,

            string type,

            bool writesToCommitLogEnabled)
        {
            ClusterId = clusterId;
            Id = id;
            Name = name;
            Resolution = resolution;
            RetentionBlockDataExpirationDuration = retentionBlockDataExpirationDuration;
            RetentionBlockSizeDuration = retentionBlockSizeDuration;
            RetentionBufferFutureDuration = retentionBufferFutureDuration;
            RetentionBufferPastDuration = retentionBufferPastDuration;
            RetentionPeriodDuration = retentionPeriodDuration;
            ServiceName = serviceName;
            SnapshotEnabled = snapshotEnabled;
            Type = type;
            WritesToCommitLogEnabled = writesToCommitLogEnabled;
        }
    }
}
