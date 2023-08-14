// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace ediri.Ovh.CloudProject.Inputs
{

    public sealed class GetKubeCustomizationArgs : global::Pulumi.InvokeArgs
    {
        [Input("apiservers", required: true)]
        private List<Inputs.GetKubeCustomizationApiserverArgs>? _apiservers;

        /// <summary>
        /// Kubernetes API server customization
        /// </summary>
        [Obsolete(@"Use customization_apiserver instead")]
        public List<Inputs.GetKubeCustomizationApiserverArgs> Apiservers
        {
            get => _apiservers ?? (_apiservers = new List<Inputs.GetKubeCustomizationApiserverArgs>());
            set => _apiservers = value;
        }

        public GetKubeCustomizationArgs()
        {
        }
        public static new GetKubeCustomizationArgs Empty => new GetKubeCustomizationArgs();
    }
}