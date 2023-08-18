// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace scraly.Ovh.Me
{
    public static class GetSshKeys
    {
        /// <summary>
        /// Use this data source to retrieve list of names of the account's SSH keys.
        /// 
        /// ## Example Usage
        /// 
        /// ```hcl
        /// data "ovh_me_ssh_keys" "mykeys" {}
        /// ```
        /// </summary>
        public static Task<GetSshKeysResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSshKeysResult>("ovh:Me/getSshKeys:getSshKeys", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetSshKeysResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The list of the names of all the SSH keys.
        /// </summary>
        public readonly ImmutableArray<string> Names;

        [OutputConstructor]
        private GetSshKeysResult(
            string id,

            ImmutableArray<string> names)
        {
            Id = id;
            Names = names;
        }
    }
}
