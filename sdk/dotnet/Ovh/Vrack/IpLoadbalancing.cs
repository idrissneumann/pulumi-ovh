// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Scraly.PulumiPackage.Ovh.Vrack
{
    /// <summary>
    /// Attach an IP Load Balancing to a VRack.
    /// 
    /// ## Example Usage
    /// </summary>
    [OvhResourceType("ovh:Vrack/ipLoadbalancing:IpLoadbalancing")]
    public partial class IpLoadbalancing : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The id of the IP Load Balancing.
        /// </summary>
        [Output("LoadbalancingId")]
        public Output<string> LoadbalancingId { get; private set; } = null!;

        /// <summary>
        /// The id of the vrack.
        /// </summary>
        [Output("serviceName")]
        public Output<string> ServiceName { get; private set; } = null!;


        /// <summary>
        /// Create a IpLoadbalancing resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IpLoadbalancing(string name, IpLoadbalancingArgs args, CustomResourceOptions? options = null)
            : base("ovh:Vrack/ipLoadbalancing:IpLoadbalancing", name, args ?? new IpLoadbalancingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IpLoadbalancing(string name, Input<string> id, IpLoadbalancingState? state = null, CustomResourceOptions? options = null)
            : base("ovh:Vrack/ipLoadbalancing:IpLoadbalancing", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/scraly/pulumi-ovh",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing IpLoadbalancing resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IpLoadbalancing Get(string name, Input<string> id, IpLoadbalancingState? state = null, CustomResourceOptions? options = null)
        {
            return new IpLoadbalancing(name, id, state, options);
        }
    }

    public sealed class IpLoadbalancingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The id of the IP Load Balancing.
        /// </summary>
        [Input("LoadbalancingId", required: true)]
        public Input<string> LoadbalancingId { get; set; } = null!;

        /// <summary>
        /// The id of the vrack.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        public IpLoadbalancingArgs()
        {
        }
        public static new IpLoadbalancingArgs Empty => new IpLoadbalancingArgs();
    }

    public sealed class IpLoadbalancingState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The id of the IP Load Balancing.
        /// </summary>
        [Input("LoadbalancingId")]
        public Input<string>? LoadbalancingId { get; set; }

        /// <summary>
        /// The id of the vrack.
        /// </summary>
        [Input("serviceName")]
        public Input<string>? ServiceName { get; set; }

        public IpLoadbalancingState()
        {
        }
        public static new IpLoadbalancingState Empty => new IpLoadbalancingState();
    }
}