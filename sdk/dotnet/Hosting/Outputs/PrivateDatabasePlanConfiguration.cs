// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Ovh.Hosting.Outputs
{

    [OutputType]
    public sealed class PrivateDatabasePlanConfiguration
    {
        /// <summary>
        /// Identifier of the resource
        /// </summary>
        public readonly string Label;
        /// <summary>
        /// Path to the resource in API.OVH.COM
        /// 
        /// Plan order valid values can be found on OVHcloud [APIv6](https://api.ovh.com/console/#/hosting/privateDatabase/availableOrderCapacities~GET)
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private PrivateDatabasePlanConfiguration(
            string label,

            string value)
        {
            Label = label;
            Value = value;
        }
    }
}