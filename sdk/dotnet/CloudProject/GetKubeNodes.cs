// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Ovh.CloudProject
{
    public static class GetKubeNodes
    {
        /// <summary>
        /// Use this data source to get a list of OVHcloud Managed Kubernetes nodes.
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
        ///     var nodesKubeNodes = Ovh.CloudProject.GetKubeNodes.Invoke(new()
        ///     {
        ///         ServiceName = "XXXXXX",
        ///         KubeId = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxx",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["nodes"] = nodesKubeNodes,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetKubeNodesResult> InvokeAsync(GetKubeNodesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetKubeNodesResult>("ovh:CloudProject/getKubeNodes:getKubeNodes", args ?? new GetKubeNodesArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get a list of OVHcloud Managed Kubernetes nodes.
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
        ///     var nodesKubeNodes = Ovh.CloudProject.GetKubeNodes.Invoke(new()
        ///     {
        ///         ServiceName = "XXXXXX",
        ///         KubeId = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxx",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["nodes"] = nodesKubeNodes,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetKubeNodesResult> Invoke(GetKubeNodesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetKubeNodesResult>("ovh:CloudProject/getKubeNodes:getKubeNodes", args ?? new GetKubeNodesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetKubeNodesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the managed kubernetes cluster.
        /// </summary>
        [Input("kubeId", required: true)]
        public string KubeId { get; set; } = null!;

        /// <summary>
        /// The id of the public cloud project. If omitted,
        /// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
        /// </summary>
        [Input("serviceName", required: true)]
        public string ServiceName { get; set; } = null!;

        public GetKubeNodesArgs()
        {
        }
        public static new GetKubeNodesArgs Empty => new GetKubeNodesArgs();
    }

    public sealed class GetKubeNodesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the managed kubernetes cluster.
        /// </summary>
        [Input("kubeId", required: true)]
        public Input<string> KubeId { get; set; } = null!;

        /// <summary>
        /// The id of the public cloud project. If omitted,
        /// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        public GetKubeNodesInvokeArgs()
        {
        }
        public static new GetKubeNodesInvokeArgs Empty => new GetKubeNodesInvokeArgs();
    }


    [OutputType]
    public sealed class GetKubeNodesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// See Argument Reference above.
        /// </summary>
        public readonly string KubeId;
        /// <summary>
        /// List of all nodes composing the kubernetes cluster
        /// </summary>
        public readonly ImmutableArray<Outputs.GetKubeNodesNodeResult> Nodes;
        /// <summary>
        /// See Argument Reference above.
        /// </summary>
        public readonly string ServiceName;

        [OutputConstructor]
        private GetKubeNodesResult(
            string id,

            string kubeId,

            ImmutableArray<Outputs.GetKubeNodesNodeResult> nodes,

            string serviceName)
        {
            Id = id;
            KubeId = kubeId;
            Nodes = nodes;
            ServiceName = serviceName;
        }
    }
}
