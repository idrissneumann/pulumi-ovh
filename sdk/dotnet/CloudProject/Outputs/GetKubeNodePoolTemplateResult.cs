// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace scraly.Ovh.CloudProject.Outputs
{

    [OutputType]
    public sealed class GetKubeNodePoolTemplateResult
    {
        public readonly Outputs.GetKubeNodePoolTemplateMetadataResult? Metadata;
        public readonly Outputs.GetKubeNodePoolTemplateSpecResult? Spec;

        [OutputConstructor]
        private GetKubeNodePoolTemplateResult(
            Outputs.GetKubeNodePoolTemplateMetadataResult? metadata,

            Outputs.GetKubeNodePoolTemplateSpecResult? spec)
        {
            Metadata = metadata;
            Spec = spec;
        }
    }
}
