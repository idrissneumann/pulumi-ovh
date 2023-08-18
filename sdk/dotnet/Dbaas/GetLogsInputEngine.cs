// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace scraly.Ovh.Dbaas
{
    public static class GetLogsInputEngine
    {
        /// <summary>
        /// Use this data source to retrieve information about a DBaas logs input engine.
        /// 
        /// ## Example Usage
        /// 
        /// ```hcl
        /// data "ovh_dbaas_logs_input_engine" "logstash" {
        ///   service_name = "ldp-xx-xxxxx"
        ///   name          = "logstash"
        ///   version       = "6.8"
        ///   is_deprecated = true
        /// }
        /// ```
        /// </summary>
        public static Task<GetLogsInputEngineResult> InvokeAsync(GetLogsInputEngineArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLogsInputEngineResult>("ovh:Dbaas/getLogsInputEngine:getLogsInputEngine", args ?? new GetLogsInputEngineArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about a DBaas logs input engine.
        /// 
        /// ## Example Usage
        /// 
        /// ```hcl
        /// data "ovh_dbaas_logs_input_engine" "logstash" {
        ///   service_name = "ldp-xx-xxxxx"
        ///   name          = "logstash"
        ///   version       = "6.8"
        ///   is_deprecated = true
        /// }
        /// ```
        /// </summary>
        public static Output<GetLogsInputEngineResult> Invoke(GetLogsInputEngineInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLogsInputEngineResult>("ovh:Dbaas/getLogsInputEngine:getLogsInputEngine", args ?? new GetLogsInputEngineInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLogsInputEngineArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Indicates if engine will soon not be supported.
        /// </summary>
        [Input("isDeprecated")]
        public bool? IsDeprecated { get; set; }

        /// <summary>
        /// The name of the logs input engine.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The service name. It's the ID of your Logs Data Platform instance.
        /// </summary>
        [Input("serviceName", required: true)]
        public string ServiceName { get; set; } = null!;

        /// <summary>
        /// Software version
        /// </summary>
        [Input("version")]
        public string? Version { get; set; }

        public GetLogsInputEngineArgs()
        {
        }
        public static new GetLogsInputEngineArgs Empty => new GetLogsInputEngineArgs();
    }

    public sealed class GetLogsInputEngineInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Indicates if engine will soon not be supported.
        /// </summary>
        [Input("isDeprecated")]
        public Input<bool>? IsDeprecated { get; set; }

        /// <summary>
        /// The name of the logs input engine.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The service name. It's the ID of your Logs Data Platform instance.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        /// <summary>
        /// Software version
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public GetLogsInputEngineInvokeArgs()
        {
        }
        public static new GetLogsInputEngineInvokeArgs Empty => new GetLogsInputEngineInvokeArgs();
    }


    [OutputType]
    public sealed class GetLogsInputEngineResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly bool IsDeprecated;
        public readonly string Name;
        public readonly string ServiceName;
        public readonly string Version;

        [OutputConstructor]
        private GetLogsInputEngineResult(
            string id,

            bool isDeprecated,

            string name,

            string serviceName,

            string version)
        {
            Id = id;
            IsDeprecated = isDeprecated;
            Name = name;
            ServiceName = serviceName;
            Version = version;
        }
    }
}
