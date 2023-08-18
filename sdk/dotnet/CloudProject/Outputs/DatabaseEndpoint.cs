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
    public sealed class DatabaseEndpoint
    {
        /// <summary>
        /// Type of component the URI relates to.
        /// </summary>
        public readonly string? Component;
        /// <summary>
        /// Domain of the cluster.
        /// </summary>
        public readonly string? Domain;
        /// <summary>
        /// Path of the endpoint.
        /// </summary>
        public readonly string? Path;
        /// <summary>
        /// Connection port for the endpoint.
        /// </summary>
        public readonly int? Port;
        /// <summary>
        /// Scheme used to generate the URI.
        /// </summary>
        public readonly string? Scheme;
        /// <summary>
        /// Defines whether the endpoint uses SSL.
        /// </summary>
        public readonly bool? Ssl;
        /// <summary>
        /// SSL mode used to connect to the service if the SSL is enabled.
        /// </summary>
        public readonly string? SslMode;
        /// <summary>
        /// URI of the endpoint.
        /// </summary>
        public readonly string? Uri;

        [OutputConstructor]
        private DatabaseEndpoint(
            string? component,

            string? domain,

            string? path,

            int? port,

            string? scheme,

            bool? ssl,

            string? sslMode,

            string? uri)
        {
            Component = component;
            Domain = domain;
            Path = path;
            Port = port;
            Scheme = scheme;
            Ssl = ssl;
            SslMode = sslMode;
            Uri = uri;
        }
    }
}
