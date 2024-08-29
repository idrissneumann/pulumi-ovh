// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Ovh.CloudProjectDatabase.Outputs
{

    [OutputType]
    public sealed class GetDatabaseIpRestrictionResult
    {
        /// <summary>
        /// Description of the IP restriction
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Authorized IP
        /// </summary>
        public readonly string Ip;
        /// <summary>
        /// Current status of the cluster.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetDatabaseIpRestrictionResult(
            string description,

            string ip,

            string status)
        {
            Description = description;
            Ip = ip;
            Status = status;
        }
    }
}