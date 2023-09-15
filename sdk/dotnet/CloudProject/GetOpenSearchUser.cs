// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Ovh.CloudProject
{
    public static class GetOpenSearchUser
    {
        /// <summary>
        /// Use this data source to get information about a user of a opensearch cluster associated with a public cloud project.
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
        ///     var osuser = Ovh.CloudProject.GetOpenSearchUser.Invoke(new()
        ///     {
        ///         ServiceName = "XXX",
        ///         ClusterId = "YYY",
        ///         Name = "ZZZ",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["osuserAcls"] = osuser.Apply(getOpenSearchUserResult =&gt; getOpenSearchUserResult.Acls),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetOpenSearchUserResult> InvokeAsync(GetOpenSearchUserArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetOpenSearchUserResult>("ovh:CloudProject/getOpenSearchUser:getOpenSearchUser", args ?? new GetOpenSearchUserArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a user of a opensearch cluster associated with a public cloud project.
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
        ///     var osuser = Ovh.CloudProject.GetOpenSearchUser.Invoke(new()
        ///     {
        ///         ServiceName = "XXX",
        ///         ClusterId = "YYY",
        ///         Name = "ZZZ",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["osuserAcls"] = osuser.Apply(getOpenSearchUserResult =&gt; getOpenSearchUserResult.Acls),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetOpenSearchUserResult> Invoke(GetOpenSearchUserInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetOpenSearchUserResult>("ovh:CloudProject/getOpenSearchUser:getOpenSearchUser", args ?? new GetOpenSearchUserInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetOpenSearchUserArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Cluster ID
        /// </summary>
        [Input("clusterId", required: true)]
        public string ClusterId { get; set; } = null!;

        /// <summary>
        /// Name of the user.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The id of the public cloud project. If omitted,
        /// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
        /// </summary>
        [Input("serviceName", required: true)]
        public string ServiceName { get; set; } = null!;

        public GetOpenSearchUserArgs()
        {
        }
        public static new GetOpenSearchUserArgs Empty => new GetOpenSearchUserArgs();
    }

    public sealed class GetOpenSearchUserInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Cluster ID
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// Name of the user.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The id of the public cloud project. If omitted,
        /// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        public GetOpenSearchUserInvokeArgs()
        {
        }
        public static new GetOpenSearchUserInvokeArgs Empty => new GetOpenSearchUserInvokeArgs();
    }


    [OutputType]
    public sealed class GetOpenSearchUserResult
    {
        /// <summary>
        /// Acls of the user.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetOpenSearchUserAclResult> Acls;
        /// <summary>
        /// See Argument Reference above.
        /// </summary>
        public readonly string ClusterId;
        /// <summary>
        /// Date of the creation of the user.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Name of the user.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Current status of the user.
        /// </summary>
        public readonly string ServiceName;
        /// <summary>
        /// Current status of the user.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetOpenSearchUserResult(
            ImmutableArray<Outputs.GetOpenSearchUserAclResult> acls,

            string clusterId,

            string createdAt,

            string id,

            string name,

            string serviceName,

            string status)
        {
            Acls = acls;
            ClusterId = clusterId;
            CreatedAt = createdAt;
            Id = id;
            Name = name;
            ServiceName = serviceName;
            Status = status;
        }
    }
}
