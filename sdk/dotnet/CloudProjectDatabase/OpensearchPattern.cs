// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace scraly.Ovh.CloudProjectDatabase
{
    /// <summary>
    /// Creates a pattern for a opensearch cluster associated with a public cloud project.
    /// 
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// OVHcloud Managed opensearch clusters patterns can be imported using the `service_name`, `cluster_id` and `id` of the pattern, separated by "/" E.g., bash &lt;break&gt;&lt;break&gt;```sh&lt;break&gt; $ pulumi import ovh:CloudProjectDatabase/opensearchPattern:OpensearchPattern my_pattern service_name/cluster_id/id &lt;break&gt;```&lt;break&gt;&lt;break&gt;
    /// </summary>
    [OvhResourceType("ovh:CloudProjectDatabase/opensearchPattern:OpensearchPattern")]
    public partial class OpensearchPattern : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Cluster ID.
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// Maximum number of index for this pattern.
        /// </summary>
        [Output("maxIndexCount")]
        public Output<int?> MaxIndexCount { get; private set; } = null!;

        /// <summary>
        /// Pattern format.
        /// </summary>
        [Output("pattern")]
        public Output<string> Pattern { get; private set; } = null!;

        /// <summary>
        /// The id of the public cloud project. If omitted,
        /// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
        /// </summary>
        [Output("serviceName")]
        public Output<string> ServiceName { get; private set; } = null!;


        /// <summary>
        /// Create a OpensearchPattern resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OpensearchPattern(string name, OpensearchPatternArgs args, CustomResourceOptions? options = null)
            : base("ovh:CloudProjectDatabase/opensearchPattern:OpensearchPattern", name, args ?? new OpensearchPatternArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OpensearchPattern(string name, Input<string> id, OpensearchPatternState? state = null, CustomResourceOptions? options = null)
            : base("ovh:CloudProjectDatabase/opensearchPattern:OpensearchPattern", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/scraly/pulumi-ovh",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing OpensearchPattern resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OpensearchPattern Get(string name, Input<string> id, OpensearchPatternState? state = null, CustomResourceOptions? options = null)
        {
            return new OpensearchPattern(name, id, state, options);
        }
    }

    public sealed class OpensearchPatternArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cluster ID.
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// Maximum number of index for this pattern.
        /// </summary>
        [Input("maxIndexCount")]
        public Input<int>? MaxIndexCount { get; set; }

        /// <summary>
        /// Pattern format.
        /// </summary>
        [Input("pattern", required: true)]
        public Input<string> Pattern { get; set; } = null!;

        /// <summary>
        /// The id of the public cloud project. If omitted,
        /// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        public OpensearchPatternArgs()
        {
        }
        public static new OpensearchPatternArgs Empty => new OpensearchPatternArgs();
    }

    public sealed class OpensearchPatternState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cluster ID.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// Maximum number of index for this pattern.
        /// </summary>
        [Input("maxIndexCount")]
        public Input<int>? MaxIndexCount { get; set; }

        /// <summary>
        /// Pattern format.
        /// </summary>
        [Input("pattern")]
        public Input<string>? Pattern { get; set; }

        /// <summary>
        /// The id of the public cloud project. If omitted,
        /// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
        /// </summary>
        [Input("serviceName")]
        public Input<string>? ServiceName { get; set; }

        public OpensearchPatternState()
        {
        }
        public static new OpensearchPatternState Empty => new OpensearchPatternState();
    }
}
