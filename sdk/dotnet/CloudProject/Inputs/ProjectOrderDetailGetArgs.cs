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

    public sealed class ProjectOrderDetailGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A description associated with the user.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// expiration date
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        /// <summary>
        /// order detail id
        /// </summary>
        [Input("orderDetailId")]
        public Input<int>? OrderDetailId { get; set; }

        /// <summary>
        /// quantity
        /// </summary>
        [Input("quantity")]
        public Input<string>? Quantity { get; set; }

        public ProjectOrderDetailGetArgs()
        {
        }
        public static new ProjectOrderDetailGetArgs Empty => new ProjectOrderDetailGetArgs();
    }
}
