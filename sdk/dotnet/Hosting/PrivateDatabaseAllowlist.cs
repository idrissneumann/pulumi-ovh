// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Ovh.Hosting
{
    /// <summary>
    /// Create a new IP whitelist on your private cloud database instance.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Ovh = Pulumi.Ovh;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var ip = new Ovh.Hosting.PrivateDatabaseAllowlist("ip", new()
    ///     {
    ///         Ip = "1.2.3.4",
    ///         Service = true,
    ///         ServiceName = "XXXXXX",
    ///         Sftp = true,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// OVHcloud database whitelist can be imported using the `service_name` and the `ip`, separated by "/" E.g.,
    /// 
    /// ```sh
    ///  $ pulumi import ovh:Hosting/privateDatabaseAllowlist:PrivateDatabaseAllowlist ip service_name/ip
    /// ```
    /// </summary>
    [OvhResourceType("ovh:Hosting/privateDatabaseAllowlist:PrivateDatabaseAllowlist")]
    public partial class PrivateDatabaseAllowlist : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The whitelisted IP in your instance.
        /// </summary>
        [Output("ip")]
        public Output<string> Ip { get; private set; } = null!;

        /// <summary>
        /// Custom name for your Whitelisted IP.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Authorize this IP to access service port. Values can be `true` or `false`
        /// </summary>
        [Output("service")]
        public Output<bool> Service { get; private set; } = null!;

        /// <summary>
        /// The internal name of your private database.
        /// </summary>
        [Output("serviceName")]
        public Output<string> ServiceName { get; private set; } = null!;

        /// <summary>
        /// Authorize this IP to access SFTP port. Values can be `true` or `false`
        /// </summary>
        [Output("sftp")]
        public Output<bool> Sftp { get; private set; } = null!;


        /// <summary>
        /// Create a PrivateDatabaseAllowlist resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PrivateDatabaseAllowlist(string name, PrivateDatabaseAllowlistArgs args, CustomResourceOptions? options = null)
            : base("ovh:Hosting/privateDatabaseAllowlist:PrivateDatabaseAllowlist", name, args ?? new PrivateDatabaseAllowlistArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PrivateDatabaseAllowlist(string name, Input<string> id, PrivateDatabaseAllowlistState? state = null, CustomResourceOptions? options = null)
            : base("ovh:Hosting/privateDatabaseAllowlist:PrivateDatabaseAllowlist", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/ovh/pulumi-ovh",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing PrivateDatabaseAllowlist resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PrivateDatabaseAllowlist Get(string name, Input<string> id, PrivateDatabaseAllowlistState? state = null, CustomResourceOptions? options = null)
        {
            return new PrivateDatabaseAllowlist(name, id, state, options);
        }
    }

    public sealed class PrivateDatabaseAllowlistArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The whitelisted IP in your instance.
        /// </summary>
        [Input("ip", required: true)]
        public Input<string> Ip { get; set; } = null!;

        /// <summary>
        /// Custom name for your Whitelisted IP.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Authorize this IP to access service port. Values can be `true` or `false`
        /// </summary>
        [Input("service", required: true)]
        public Input<bool> Service { get; set; } = null!;

        /// <summary>
        /// The internal name of your private database.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        /// <summary>
        /// Authorize this IP to access SFTP port. Values can be `true` or `false`
        /// </summary>
        [Input("sftp", required: true)]
        public Input<bool> Sftp { get; set; } = null!;

        public PrivateDatabaseAllowlistArgs()
        {
        }
        public static new PrivateDatabaseAllowlistArgs Empty => new PrivateDatabaseAllowlistArgs();
    }

    public sealed class PrivateDatabaseAllowlistState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The whitelisted IP in your instance.
        /// </summary>
        [Input("ip")]
        public Input<string>? Ip { get; set; }

        /// <summary>
        /// Custom name for your Whitelisted IP.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Authorize this IP to access service port. Values can be `true` or `false`
        /// </summary>
        [Input("service")]
        public Input<bool>? Service { get; set; }

        /// <summary>
        /// The internal name of your private database.
        /// </summary>
        [Input("serviceName")]
        public Input<string>? ServiceName { get; set; }

        /// <summary>
        /// Authorize this IP to access SFTP port. Values can be `true` or `false`
        /// </summary>
        [Input("sftp")]
        public Input<bool>? Sftp { get; set; }

        public PrivateDatabaseAllowlistState()
        {
        }
        public static new PrivateDatabaseAllowlistState Empty => new PrivateDatabaseAllowlistState();
    }
}
