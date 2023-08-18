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
    public static class GetM3dbNamespaces
    {
        /// <summary>
        /// Use this data source to get the list of namespaces of a M3DB cluster associated with a public cloud project.
        /// 
        /// ## Example Usage
        /// 
        /// ```hcl
        /// data "ovh_cloud_project_database_m3db_namespaces" "namespaces" {
        ///   service_name  = "XXX"
        ///   cluster_id    = "YYY"
        /// }
        /// 
        /// output "namespace_ids" {
        ///   value = data.ovh_cloud_project_database_m3db_namespaces.namespaces.namespace_ids
        /// }
        /// ```
        /// </summary>
        public static Task<GetM3dbNamespacesResult> InvokeAsync(GetM3dbNamespacesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetM3dbNamespacesResult>("ovh:CloudProject/getM3dbNamespaces:getM3dbNamespaces", args ?? new GetM3dbNamespacesArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get the list of namespaces of a M3DB cluster associated with a public cloud project.
        /// 
        /// ## Example Usage
        /// 
        /// ```hcl
        /// data "ovh_cloud_project_database_m3db_namespaces" "namespaces" {
        ///   service_name  = "XXX"
        ///   cluster_id    = "YYY"
        /// }
        /// 
        /// output "namespace_ids" {
        ///   value = data.ovh_cloud_project_database_m3db_namespaces.namespaces.namespace_ids
        /// }
        /// ```
        /// </summary>
        public static Output<GetM3dbNamespacesResult> Invoke(GetM3dbNamespacesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetM3dbNamespacesResult>("ovh:CloudProject/getM3dbNamespaces:getM3dbNamespaces", args ?? new GetM3dbNamespacesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetM3dbNamespacesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Cluster ID
        /// </summary>
        [Input("clusterId", required: true)]
        public string ClusterId { get; set; } = null!;

        /// <summary>
        /// The id of the public cloud project. If omitted,
        /// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
        /// </summary>
        [Input("serviceName", required: true)]
        public string ServiceName { get; set; } = null!;

        public GetM3dbNamespacesArgs()
        {
        }
        public static new GetM3dbNamespacesArgs Empty => new GetM3dbNamespacesArgs();
    }

    public sealed class GetM3dbNamespacesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Cluster ID
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// The id of the public cloud project. If omitted,
        /// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        public GetM3dbNamespacesInvokeArgs()
        {
        }
        public static new GetM3dbNamespacesInvokeArgs Empty => new GetM3dbNamespacesInvokeArgs();
    }


    [OutputType]
    public sealed class GetM3dbNamespacesResult
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
        /// The list of namespaces ids of the M3DB cluster associated with the project.
        /// </summary>
        public readonly ImmutableArray<string> NamespaceIds;
        /// <summary>
        /// See Argument Reference above.
        /// </summary>
        public readonly string ServiceName;

        [OutputConstructor]
        private GetM3dbNamespacesResult(
            string clusterId,

            string id,

            ImmutableArray<string> namespaceIds,

            string serviceName)
        {
            ClusterId = clusterId;
            Id = id;
            NamespaceIds = namespaceIds;
            ServiceName = serviceName;
        }
    }
}
