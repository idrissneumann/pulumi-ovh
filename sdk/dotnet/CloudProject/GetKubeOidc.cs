// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Ovh.CloudProject
{
    public static class GetKubeOidc
    {
        /// <summary>
        /// Use this data source to get a OVHcloud Managed Kubernetes Service cluster OIDC.
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
        ///     var oidc = Ovh.CloudProject.GetKubeOidc.Invoke(new()
        ///     {
        ///         ServiceName = "XXXXXX",
        ///         KubeId = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxx",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["oidc-val"] = oidc.Apply(getKubeOidcResult =&gt; getKubeOidcResult.ClientId),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetKubeOidcResult> InvokeAsync(GetKubeOidcArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetKubeOidcResult>("ovh:CloudProject/getKubeOidc:getKubeOidc", args ?? new GetKubeOidcArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get a OVHcloud Managed Kubernetes Service cluster OIDC.
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
        ///     var oidc = Ovh.CloudProject.GetKubeOidc.Invoke(new()
        ///     {
        ///         ServiceName = "XXXXXX",
        ///         KubeId = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxx",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["oidc-val"] = oidc.Apply(getKubeOidcResult =&gt; getKubeOidcResult.ClientId),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetKubeOidcResult> Invoke(GetKubeOidcInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetKubeOidcResult>("ovh:CloudProject/getKubeOidc:getKubeOidc", args ?? new GetKubeOidcInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetKubeOidcArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The OIDC client ID.
        /// </summary>
        [Input("clientId")]
        public string? ClientId { get; set; }

        /// <summary>
        /// The OIDC issuer url.
        /// </summary>
        [Input("issuerUrl")]
        public string? IssuerUrl { get; set; }

        /// <summary>
        /// The id of the managed kubernetes cluster.
        /// </summary>
        [Input("kubeId", required: true)]
        public string KubeId { get; set; } = null!;

        [Input("oidcCaContent")]
        public string? OidcCaContent { get; set; }

        [Input("oidcGroupsClaims")]
        private List<string>? _oidcGroupsClaims;
        public List<string> OidcGroupsClaims
        {
            get => _oidcGroupsClaims ?? (_oidcGroupsClaims = new List<string>());
            set => _oidcGroupsClaims = value;
        }

        [Input("oidcGroupsPrefix")]
        public string? OidcGroupsPrefix { get; set; }

        [Input("oidcRequiredClaims")]
        private List<string>? _oidcRequiredClaims;
        public List<string> OidcRequiredClaims
        {
            get => _oidcRequiredClaims ?? (_oidcRequiredClaims = new List<string>());
            set => _oidcRequiredClaims = value;
        }

        [Input("oidcSigningAlgs")]
        private List<string>? _oidcSigningAlgs;
        public List<string> OidcSigningAlgs
        {
            get => _oidcSigningAlgs ?? (_oidcSigningAlgs = new List<string>());
            set => _oidcSigningAlgs = value;
        }

        [Input("oidcUsernameClaim")]
        public string? OidcUsernameClaim { get; set; }

        [Input("oidcUsernamePrefix")]
        public string? OidcUsernamePrefix { get; set; }

        /// <summary>
        /// The id of the public cloud project. If omitted,
        /// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
        /// </summary>
        [Input("serviceName", required: true)]
        public string ServiceName { get; set; } = null!;

        public GetKubeOidcArgs()
        {
        }
        public static new GetKubeOidcArgs Empty => new GetKubeOidcArgs();
    }

    public sealed class GetKubeOidcInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The OIDC client ID.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        /// <summary>
        /// The OIDC issuer url.
        /// </summary>
        [Input("issuerUrl")]
        public Input<string>? IssuerUrl { get; set; }

        /// <summary>
        /// The id of the managed kubernetes cluster.
        /// </summary>
        [Input("kubeId", required: true)]
        public Input<string> KubeId { get; set; } = null!;

        [Input("oidcCaContent")]
        public Input<string>? OidcCaContent { get; set; }

        [Input("oidcGroupsClaims")]
        private InputList<string>? _oidcGroupsClaims;
        public InputList<string> OidcGroupsClaims
        {
            get => _oidcGroupsClaims ?? (_oidcGroupsClaims = new InputList<string>());
            set => _oidcGroupsClaims = value;
        }

        [Input("oidcGroupsPrefix")]
        public Input<string>? OidcGroupsPrefix { get; set; }

        [Input("oidcRequiredClaims")]
        private InputList<string>? _oidcRequiredClaims;
        public InputList<string> OidcRequiredClaims
        {
            get => _oidcRequiredClaims ?? (_oidcRequiredClaims = new InputList<string>());
            set => _oidcRequiredClaims = value;
        }

        [Input("oidcSigningAlgs")]
        private InputList<string>? _oidcSigningAlgs;
        public InputList<string> OidcSigningAlgs
        {
            get => _oidcSigningAlgs ?? (_oidcSigningAlgs = new InputList<string>());
            set => _oidcSigningAlgs = value;
        }

        [Input("oidcUsernameClaim")]
        public Input<string>? OidcUsernameClaim { get; set; }

        [Input("oidcUsernamePrefix")]
        public Input<string>? OidcUsernamePrefix { get; set; }

        /// <summary>
        /// The id of the public cloud project. If omitted,
        /// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        public GetKubeOidcInvokeArgs()
        {
        }
        public static new GetKubeOidcInvokeArgs Empty => new GetKubeOidcInvokeArgs();
    }


    [OutputType]
    public sealed class GetKubeOidcResult
    {
        /// <summary>
        /// The OIDC client ID.
        /// </summary>
        public readonly string? ClientId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The OIDC issuer url.
        /// </summary>
        public readonly string? IssuerUrl;
        /// <summary>
        /// See Argument Reference above.
        /// </summary>
        public readonly string KubeId;
        public readonly string? OidcCaContent;
        public readonly ImmutableArray<string> OidcGroupsClaims;
        public readonly string? OidcGroupsPrefix;
        public readonly ImmutableArray<string> OidcRequiredClaims;
        public readonly ImmutableArray<string> OidcSigningAlgs;
        public readonly string? OidcUsernameClaim;
        public readonly string? OidcUsernamePrefix;
        /// <summary>
        /// See Argument Reference above.
        /// </summary>
        public readonly string ServiceName;

        [OutputConstructor]
        private GetKubeOidcResult(
            string? clientId,

            string id,

            string? issuerUrl,

            string kubeId,

            string? oidcCaContent,

            ImmutableArray<string> oidcGroupsClaims,

            string? oidcGroupsPrefix,

            ImmutableArray<string> oidcRequiredClaims,

            ImmutableArray<string> oidcSigningAlgs,

            string? oidcUsernameClaim,

            string? oidcUsernamePrefix,

            string serviceName)
        {
            ClientId = clientId;
            Id = id;
            IssuerUrl = issuerUrl;
            KubeId = kubeId;
            OidcCaContent = oidcCaContent;
            OidcGroupsClaims = oidcGroupsClaims;
            OidcGroupsPrefix = oidcGroupsPrefix;
            OidcRequiredClaims = oidcRequiredClaims;
            OidcSigningAlgs = oidcSigningAlgs;
            OidcUsernameClaim = oidcUsernameClaim;
            OidcUsernamePrefix = oidcUsernamePrefix;
            ServiceName = serviceName;
        }
    }
}
