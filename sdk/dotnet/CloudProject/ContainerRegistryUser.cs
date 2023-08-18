// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace scraly.Ovh.CloudProject
{
    /// <summary>
    /// Creates a user for a container registry associated with a public cloud project.
    /// 
    /// ## Example Usage
    /// </summary>
    [OvhResourceType("ovh:CloudProject/containerRegistryUser:ContainerRegistryUser")]
    public partial class ContainerRegistryUser : global::Pulumi.CustomResource
    {
        /// <summary>
        /// User email
        /// </summary>
        [Output("email")]
        public Output<string> Email { get; private set; } = null!;

        /// <summary>
        /// Registry name
        /// </summary>
        [Output("login")]
        public Output<string> Login { get; private set; } = null!;

        /// <summary>
        /// (Sensitive) User password
        /// </summary>
        [Output("password")]
        public Output<string> Password { get; private set; } = null!;

        /// <summary>
        /// Registry ID
        /// </summary>
        [Output("registryId")]
        public Output<string> RegistryId { get; private set; } = null!;

        /// <summary>
        /// The id of the public cloud project. If omitted,
        /// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
        /// </summary>
        [Output("serviceName")]
        public Output<string> ServiceName { get; private set; } = null!;

        /// <summary>
        /// User name
        /// </summary>
        [Output("user")]
        public Output<string> User { get; private set; } = null!;


        /// <summary>
        /// Create a ContainerRegistryUser resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ContainerRegistryUser(string name, ContainerRegistryUserArgs args, CustomResourceOptions? options = null)
            : base("ovh:CloudProject/containerRegistryUser:ContainerRegistryUser", name, args ?? new ContainerRegistryUserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ContainerRegistryUser(string name, Input<string> id, ContainerRegistryUserState? state = null, CustomResourceOptions? options = null)
            : base("ovh:CloudProject/containerRegistryUser:ContainerRegistryUser", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/scraly/pulumi-ovh",
                AdditionalSecretOutputs =
                {
                    "password",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ContainerRegistryUser resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ContainerRegistryUser Get(string name, Input<string> id, ContainerRegistryUserState? state = null, CustomResourceOptions? options = null)
        {
            return new ContainerRegistryUser(name, id, state, options);
        }
    }

    public sealed class ContainerRegistryUserArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// User email
        /// </summary>
        [Input("email", required: true)]
        public Input<string> Email { get; set; } = null!;

        /// <summary>
        /// Registry name
        /// </summary>
        [Input("login", required: true)]
        public Input<string> Login { get; set; } = null!;

        /// <summary>
        /// Registry ID
        /// </summary>
        [Input("registryId", required: true)]
        public Input<string> RegistryId { get; set; } = null!;

        /// <summary>
        /// The id of the public cloud project. If omitted,
        /// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        public ContainerRegistryUserArgs()
        {
        }
        public static new ContainerRegistryUserArgs Empty => new ContainerRegistryUserArgs();
    }

    public sealed class ContainerRegistryUserState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// User email
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// Registry name
        /// </summary>
        [Input("login")]
        public Input<string>? Login { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// (Sensitive) User password
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Registry ID
        /// </summary>
        [Input("registryId")]
        public Input<string>? RegistryId { get; set; }

        /// <summary>
        /// The id of the public cloud project. If omitted,
        /// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
        /// </summary>
        [Input("serviceName")]
        public Input<string>? ServiceName { get; set; }

        /// <summary>
        /// User name
        /// </summary>
        [Input("user")]
        public Input<string>? User { get; set; }

        public ContainerRegistryUserState()
        {
        }
        public static new ContainerRegistryUserState Empty => new ContainerRegistryUserState();
    }
}
