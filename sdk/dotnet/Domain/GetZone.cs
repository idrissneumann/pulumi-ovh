// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Ovh.Domain
{
    public static class GetZone
    {
        /// <summary>
        /// Use this data source to retrieve information about a domain zone.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Ovh = Pulumi.Ovh;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var rootzone = Ovh.Domain.GetZone.Invoke(new()
        ///     {
        ///         Name = "mysite.ovh",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetZoneResult> InvokeAsync(GetZoneArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetZoneResult>("ovh:Domain/getZone:getZone", args ?? new GetZoneArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about a domain zone.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Ovh = Pulumi.Ovh;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var rootzone = Ovh.Domain.GetZone.Invoke(new()
        ///     {
        ///         Name = "mysite.ovh",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetZoneResult> Invoke(GetZoneInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetZoneResult>("ovh:Domain/getZone:getZone", args ?? new GetZoneInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetZoneArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the domain zone.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetZoneArgs()
        {
        }
        public static new GetZoneArgs Empty => new GetZoneArgs();
    }

    public sealed class GetZoneInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the domain zone.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetZoneInvokeArgs()
        {
        }
        public static new GetZoneInvokeArgs Empty => new GetZoneInvokeArgs();
    }


    [OutputType]
    public sealed class GetZoneResult
    {
        /// <summary>
        /// Is DNSSEC supported by this zone
        /// </summary>
        public readonly bool DnssecSupported;
        /// <summary>
        /// hasDnsAnycast flag of the DNS zone
        /// </summary>
        public readonly bool HasDnsAnycast;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Last update date of the DNS zone
        /// </summary>
        public readonly string LastUpdate;
        public readonly string Name;
        /// <summary>
        /// Name servers that host the DNS zone
        /// </summary>
        public readonly ImmutableArray<string> NameServers;
        /// <summary>
        /// URN of the DNS zone
        /// </summary>
        public readonly string Urn;

        [OutputConstructor]
        private GetZoneResult(
            bool dnssecSupported,

            bool hasDnsAnycast,

            string id,

            string lastUpdate,

            string name,

            ImmutableArray<string> nameServers,

            string urn)
        {
            DnssecSupported = dnssecSupported;
            HasDnsAnycast = hasDnsAnycast;
            Id = id;
            LastUpdate = lastUpdate;
            Name = name;
            NameServers = nameServers;
            Urn = urn;
        }
    }
}
