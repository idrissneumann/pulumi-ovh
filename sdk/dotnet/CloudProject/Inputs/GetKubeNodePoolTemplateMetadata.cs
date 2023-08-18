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

    public sealed class GetKubeNodePoolTemplateMetadataArgs : global::Pulumi.InvokeArgs
    {
        [Input("annotations")]
        private Dictionary<string, string>? _annotations;
        public Dictionary<string, string> Annotations
        {
            get => _annotations ?? (_annotations = new Dictionary<string, string>());
            set => _annotations = value;
        }

        [Input("finalizers")]
        private List<string>? _finalizers;
        public List<string> Finalizers
        {
            get => _finalizers ?? (_finalizers = new List<string>());
            set => _finalizers = value;
        }

        [Input("labels")]
        private Dictionary<string, string>? _labels;
        public Dictionary<string, string> Labels
        {
            get => _labels ?? (_labels = new Dictionary<string, string>());
            set => _labels = value;
        }

        public GetKubeNodePoolTemplateMetadataArgs()
        {
        }
        public static new GetKubeNodePoolTemplateMetadataArgs Empty => new GetKubeNodePoolTemplateMetadataArgs();
    }
}
