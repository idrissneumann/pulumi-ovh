// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace scraly.Ovh.Dbaas.Inputs
{

    public sealed class LogsInputConfigurationLogstashGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The filter section of logstash.conf
        /// </summary>
        [Input("filterSection")]
        public Input<string>? FilterSection { get; set; }

        /// <summary>
        /// The filter section of logstash.conf
        /// </summary>
        [Input("inputSection", required: true)]
        public Input<string> InputSection { get; set; } = null!;

        /// <summary>
        /// The list of customs Grok patterns
        /// </summary>
        [Input("patternSection")]
        public Input<string>? PatternSection { get; set; }

        public LogsInputConfigurationLogstashGetArgs()
        {
        }
        public static new LogsInputConfigurationLogstashGetArgs Empty => new LogsInputConfigurationLogstashGetArgs();
    }
}
