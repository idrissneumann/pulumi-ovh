// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace scraly.Ovh.CloudProject.Inputs
{

    public sealed class KubePrivateNetworkConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If defined, all egress traffic will be routed towards this IP address, which should belong to the private network. Empty string means disabled.
        /// </summary>
        [Input("defaultVrackGateway", required: true)]
        public Input<string> DefaultVrackGateway { get; set; } = null!;

        /// <summary>
        /// Defines whether routing should default to using the nodes' private interface, instead of their public interface. Default is false.
        /// </summary>
        [Input("privateNetworkRoutingAsDefault", required: true)]
        public Input<bool> PrivateNetworkRoutingAsDefault { get; set; } = null!;

        public KubePrivateNetworkConfigurationArgs()
        {
        }
        public static new KubePrivateNetworkConfigurationArgs Empty => new KubePrivateNetworkConfigurationArgs();
    }
}
