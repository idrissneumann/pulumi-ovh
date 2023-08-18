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

    public sealed class ContainerRegistryPlanGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Plan code from the catalog
        /// </summary>
        [Input("code")]
        public Input<string>? Code { get; set; }

        /// <summary>
        /// Plan creation date
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        [Input("features")]
        private InputList<Inputs.ContainerRegistryPlanFeatureGetArgs>? _features;

        /// <summary>
        /// Features of the plan
        /// </summary>
        public InputList<Inputs.ContainerRegistryPlanFeatureGetArgs> Features
        {
            get => _features ?? (_features = new InputList<Inputs.ContainerRegistryPlanFeatureGetArgs>());
            set => _features = value;
        }

        /// <summary>
        /// Plan ID
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Registry name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("registryLimits")]
        private InputList<Inputs.ContainerRegistryPlanRegistryLimitGetArgs>? _registryLimits;

        /// <summary>
        /// Container registry limits
        /// </summary>
        public InputList<Inputs.ContainerRegistryPlanRegistryLimitGetArgs> RegistryLimits
        {
            get => _registryLimits ?? (_registryLimits = new InputList<Inputs.ContainerRegistryPlanRegistryLimitGetArgs>());
            set => _registryLimits = value;
        }

        /// <summary>
        /// Registry last update date
        /// </summary>
        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        public ContainerRegistryPlanGetArgs()
        {
        }
        public static new ContainerRegistryPlanGetArgs Empty => new ContainerRegistryPlanGetArgs();
    }
}
