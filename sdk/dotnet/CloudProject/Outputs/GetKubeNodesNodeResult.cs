// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace scraly.Ovh.CloudProject.Outputs
{

    [OutputType]
    public sealed class GetKubeNodesNodeResult
    {
        /// <summary>
        /// Creation date
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// (Optional) Date of the effective deployment
        /// </summary>
        public readonly string DeployedAt;
        /// <summary>
        /// Flavor name
        /// </summary>
        public readonly string Flavor;
        /// <summary>
        /// ID of the node
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Openstack ID of the underlying VM of the node
        /// </summary>
        public readonly string InstanceId;
        /// <summary>
        /// Is the node in the target version of the cluster
        /// </summary>
        public readonly bool IsUpToDate;
        /// <summary>
        /// Name of the node
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Managed kubernetes node pool ID
        /// </summary>
        public readonly string NodePoolId;
        /// <summary>
        /// Public cloud project ID
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// Current status
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Last update date
        /// </summary>
        public readonly string UpdatedAt;
        /// <summary>
        /// Version in which the node is
        /// </summary>
        public readonly string Version;

        [OutputConstructor]
        private GetKubeNodesNodeResult(
            string createdAt,

            string deployedAt,

            string flavor,

            string id,

            string instanceId,

            bool isUpToDate,

            string name,

            string nodePoolId,

            string projectId,

            string status,

            string updatedAt,

            string version)
        {
            CreatedAt = createdAt;
            DeployedAt = deployedAt;
            Flavor = flavor;
            Id = id;
            InstanceId = instanceId;
            IsUpToDate = isUpToDate;
            Name = name;
            NodePoolId = nodePoolId;
            ProjectId = projectId;
            Status = status;
            UpdatedAt = updatedAt;
            Version = version;
        }
    }
}
