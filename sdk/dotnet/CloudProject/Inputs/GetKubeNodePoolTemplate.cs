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

    public sealed class GetKubeNodePoolTemplateArgs : global::Pulumi.InvokeArgs
    {
        [Input("metadata")]
        public Inputs.GetKubeNodePoolTemplateMetadataArgs? Metadata { get; set; }

        [Input("spec")]
        public Inputs.GetKubeNodePoolTemplateSpecArgs? Spec { get; set; }

        public GetKubeNodePoolTemplateArgs()
        {
        }
        public static new GetKubeNodePoolTemplateArgs Empty => new GetKubeNodePoolTemplateArgs();
    }
}
