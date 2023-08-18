// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace scraly.Ovh.Hosting
{
    /// <summary>
    /// Add grant on a database in your private cloud database instance.
    /// 
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// OVHcloud database user's grant can be imported using the `service_name`, the `user_name`, the `database_name` and the `grant`, separated by "/" E.g., &lt;break&gt;&lt;break&gt;```sh&lt;break&gt; $ pulumi import ovh:Hosting/privateDatabaseUserGrant:PrivateDatabaseUserGrant user service_name/user_name/database_name/grant &lt;break&gt;```&lt;break&gt;&lt;break&gt;
    /// </summary>
    [OvhResourceType("ovh:Hosting/privateDatabaseUserGrant:PrivateDatabaseUserGrant")]
    public partial class PrivateDatabaseUserGrant : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Database name where add grant.
        /// </summary>
        [Output("databaseName")]
        public Output<string> DatabaseName { get; private set; } = null!;

        /// <summary>
        /// Database name where add grant. Values can be: 
        /// - admin
        /// - none
        /// - ro
        /// - rw
        /// </summary>
        [Output("grant")]
        public Output<string> Grant { get; private set; } = null!;

        /// <summary>
        /// The internal name of your private database.
        /// </summary>
        [Output("serviceName")]
        public Output<string> ServiceName { get; private set; } = null!;

        /// <summary>
        /// User name used to connect on your databases.
        /// </summary>
        [Output("userName")]
        public Output<string> UserName { get; private set; } = null!;


        /// <summary>
        /// Create a PrivateDatabaseUserGrant resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PrivateDatabaseUserGrant(string name, PrivateDatabaseUserGrantArgs args, CustomResourceOptions? options = null)
            : base("ovh:Hosting/privateDatabaseUserGrant:PrivateDatabaseUserGrant", name, args ?? new PrivateDatabaseUserGrantArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PrivateDatabaseUserGrant(string name, Input<string> id, PrivateDatabaseUserGrantState? state = null, CustomResourceOptions? options = null)
            : base("ovh:Hosting/privateDatabaseUserGrant:PrivateDatabaseUserGrant", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PrivateDatabaseUserGrant resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PrivateDatabaseUserGrant Get(string name, Input<string> id, PrivateDatabaseUserGrantState? state = null, CustomResourceOptions? options = null)
        {
            return new PrivateDatabaseUserGrant(name, id, state, options);
        }
    }

    public sealed class PrivateDatabaseUserGrantArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Database name where add grant.
        /// </summary>
        [Input("databaseName", required: true)]
        public Input<string> DatabaseName { get; set; } = null!;

        /// <summary>
        /// Database name where add grant. Values can be: 
        /// - admin
        /// - none
        /// - ro
        /// - rw
        /// </summary>
        [Input("grant", required: true)]
        public Input<string> Grant { get; set; } = null!;

        /// <summary>
        /// The internal name of your private database.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        /// <summary>
        /// User name used to connect on your databases.
        /// </summary>
        [Input("userName", required: true)]
        public Input<string> UserName { get; set; } = null!;

        public PrivateDatabaseUserGrantArgs()
        {
        }
        public static new PrivateDatabaseUserGrantArgs Empty => new PrivateDatabaseUserGrantArgs();
    }

    public sealed class PrivateDatabaseUserGrantState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Database name where add grant.
        /// </summary>
        [Input("databaseName")]
        public Input<string>? DatabaseName { get; set; }

        /// <summary>
        /// Database name where add grant. Values can be: 
        /// - admin
        /// - none
        /// - ro
        /// - rw
        /// </summary>
        [Input("grant")]
        public Input<string>? Grant { get; set; }

        /// <summary>
        /// The internal name of your private database.
        /// </summary>
        [Input("serviceName")]
        public Input<string>? ServiceName { get; set; }

        /// <summary>
        /// User name used to connect on your databases.
        /// </summary>
        [Input("userName")]
        public Input<string>? UserName { get; set; }

        public PrivateDatabaseUserGrantState()
        {
        }
        public static new PrivateDatabaseUserGrantState Empty => new PrivateDatabaseUserGrantState();
    }
}
