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
    public sealed class GetCapabilitiesContainerFilterRegistryLimitResult
    {
        /// <summary>
        /// Docker image storage limits in bytes
        /// </summary>
        public readonly int ImageStorage;
        /// <summary>
        /// Parallel requests on Docker image API (/v2 Docker registry API)
        /// </summary>
        public readonly int ParallelRequest;

        [OutputConstructor]
        private GetCapabilitiesContainerFilterRegistryLimitResult(
            int imageStorage,

            int parallelRequest)
        {
            ImageStorage = imageStorage;
            ParallelRequest = parallelRequest;
        }
    }
}
