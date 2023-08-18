// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace scraly.Ovh.CloudProject.Inputs
{

    public sealed class KubeCustomizationKubeProxyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Kubernetes cluster kube-proxy customization of iptables specific config (durations format is RFC3339 duration, e.g. `PT60S`)
        /// </summary>
        [Input("iptables")]
        public Input<Inputs.KubeCustomizationKubeProxyIptablesGetArgs>? Iptables { get; set; }

        /// <summary>
        /// Kubernetes cluster kube-proxy customization of IPVS specific config (durations format is [RFC3339](https://www.rfc-editor.org/rfc/rfc3339) duration, e.g. `PT60S`)
        /// </summary>
        [Input("ipvs")]
        public Input<Inputs.KubeCustomizationKubeProxyIpvsGetArgs>? Ipvs { get; set; }

        public KubeCustomizationKubeProxyGetArgs()
        {
        }
        public static new KubeCustomizationKubeProxyGetArgs Empty => new KubeCustomizationKubeProxyGetArgs();
    }
}
