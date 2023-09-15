// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Ovh.Me
{
    public static class GetIpxeScripts
    {
        /// <summary>
        /// Use this data source to retrieve a list of the names of the account's IPXE Scripts.
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
        ///     var scripts = Ovh.Me.GetIpxeScripts.Invoke();
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetIpxeScriptsResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIpxeScriptsResult>("ovh:Me/getIpxeScripts:getIpxeScripts", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve a list of the names of the account's IPXE Scripts.
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
        ///     var scripts = Ovh.Me.GetIpxeScripts.Invoke();
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetIpxeScriptsResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetIpxeScriptsResult>("ovh:Me/getIpxeScripts:getIpxeScripts", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetIpxeScriptsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The list of the names of all the IPXE Scripts.
        /// </summary>
        public readonly ImmutableArray<string> Results;

        [OutputConstructor]
        private GetIpxeScriptsResult(
            string id,

            ImmutableArray<string> results)
        {
            Id = id;
            Results = results;
        }
    }
}
