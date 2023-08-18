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
    public static class GetKafkaTopics
    {
        /// <summary>
        /// Use this data source to get the list of topics of a kafka cluster associated with a public cloud project.
        /// 
        /// ## Example Usage
        /// 
        /// ```hcl
        /// data "ovh_cloud_project_database_kafka_topics" "topics" {
        ///   service_name  = "XXX"
        ///   cluster_id    = "YYY"
        /// }
        /// 
        /// output "topic_ids" {
        ///   value = data.ovh_cloud_project_database_kafka_topics.topics.topic_ids
        /// }
        /// ```
        /// </summary>
        public static Task<GetKafkaTopicsResult> InvokeAsync(GetKafkaTopicsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetKafkaTopicsResult>("ovh:CloudProjectDatabase/getKafkaTopics:getKafkaTopics", args ?? new GetKafkaTopicsArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get the list of topics of a kafka cluster associated with a public cloud project.
        /// 
        /// ## Example Usage
        /// 
        /// ```hcl
        /// data "ovh_cloud_project_database_kafka_topics" "topics" {
        ///   service_name  = "XXX"
        ///   cluster_id    = "YYY"
        /// }
        /// 
        /// output "topic_ids" {
        ///   value = data.ovh_cloud_project_database_kafka_topics.topics.topic_ids
        /// }
        /// ```
        /// </summary>
        public static Output<GetKafkaTopicsResult> Invoke(GetKafkaTopicsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetKafkaTopicsResult>("ovh:CloudProjectDatabase/getKafkaTopics:getKafkaTopics", args ?? new GetKafkaTopicsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetKafkaTopicsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Cluster ID
        /// </summary>
        [Input("clusterId", required: true)]
        public string ClusterId { get; set; } = null!;

        /// <summary>
        /// The id of the public cloud project. If omitted,
        /// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
        /// </summary>
        [Input("serviceName", required: true)]
        public string ServiceName { get; set; } = null!;

        public GetKafkaTopicsArgs()
        {
        }
        public static new GetKafkaTopicsArgs Empty => new GetKafkaTopicsArgs();
    }

    public sealed class GetKafkaTopicsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Cluster ID
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// The id of the public cloud project. If omitted,
        /// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        public GetKafkaTopicsInvokeArgs()
        {
        }
        public static new GetKafkaTopicsInvokeArgs Empty => new GetKafkaTopicsInvokeArgs();
    }


    [OutputType]
    public sealed class GetKafkaTopicsResult
    {
        /// <summary>
        /// See Argument Reference above.
        /// </summary>
        public readonly string ClusterId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// See Argument Reference above.
        /// </summary>
        public readonly string ServiceName;
        /// <summary>
        /// The list of topics ids of the kafka cluster associated with the project.
        /// </summary>
        public readonly ImmutableArray<string> TopicIds;

        [OutputConstructor]
        private GetKafkaTopicsResult(
            string clusterId,

            string id,

            string serviceName,

            ImmutableArray<string> topicIds)
        {
            ClusterId = clusterId;
            Id = id;
            ServiceName = serviceName;
            TopicIds = topicIds;
        }
    }
}
