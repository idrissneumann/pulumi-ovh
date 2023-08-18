// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace scraly.Ovh.Iam
{
    public static class GetReferenceActions
    {
        /// <summary>
        /// Use this data source to list the IAM action associated with a resource type.
        /// 
        /// ## Important
        /// 
        /// &gt; Using this resource requires that the account is enrolled in the OVHcloud [IAM beta](https://labs.ovhcloud.com/en/iam/) 
        /// 
        /// ## Example Usage
        /// 
        /// ```hcl
        /// data "ovh_iam_reference_actions" "vps_actions" {
        ///     resource_type = "vps"
        /// }
        /// ```
        /// </summary>
        public static Task<GetReferenceActionsResult> InvokeAsync(GetReferenceActionsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetReferenceActionsResult>("ovh:Iam/getReferenceActions:getReferenceActions", args ?? new GetReferenceActionsArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to list the IAM action associated with a resource type.
        /// 
        /// ## Important
        /// 
        /// &gt; Using this resource requires that the account is enrolled in the OVHcloud [IAM beta](https://labs.ovhcloud.com/en/iam/) 
        /// 
        /// ## Example Usage
        /// 
        /// ```hcl
        /// data "ovh_iam_reference_actions" "vps_actions" {
        ///     resource_type = "vps"
        /// }
        /// ```
        /// </summary>
        public static Output<GetReferenceActionsResult> Invoke(GetReferenceActionsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetReferenceActionsResult>("ovh:Iam/getReferenceActions:getReferenceActions", args ?? new GetReferenceActionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetReferenceActionsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Kind of resource we want the actions for
        /// </summary>
        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        public GetReferenceActionsArgs()
        {
        }
        public static new GetReferenceActionsArgs Empty => new GetReferenceActionsArgs();
    }

    public sealed class GetReferenceActionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Kind of resource we want the actions for
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public GetReferenceActionsInvokeArgs()
        {
        }
        public static new GetReferenceActionsInvokeArgs Empty => new GetReferenceActionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetReferenceActionsResult
    {
        /// <summary>
        /// List of actions
        /// </summary>
        public readonly ImmutableArray<Outputs.GetReferenceActionsActionResult> Actions;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Type;

        [OutputConstructor]
        private GetReferenceActionsResult(
            ImmutableArray<Outputs.GetReferenceActionsActionResult> actions,

            string id,

            string type)
        {
            Actions = actions;
            Id = id;
            Type = type;
        }
    }
}
