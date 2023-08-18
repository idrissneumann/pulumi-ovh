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
    public static class GetPaymentmeanCreditCard
    {
        /// <summary>
        /// Use this data source to retrieve information about a credit card
        /// payment mean associated with an OVHcloud account.
        /// 
        /// ## Example Usage
        /// 
        /// ```hcl
        /// data "ovh_me_paymentmean_creditcard" "cc" {
        ///   use_default = true
        /// }
        /// ```
        /// </summary>
        public static Task<GetPaymentmeanCreditCardResult> InvokeAsync(GetPaymentmeanCreditCardArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPaymentmeanCreditCardResult>("ovh:Me/getPaymentmeanCreditCard:getPaymentmeanCreditCard", args ?? new GetPaymentmeanCreditCardArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about a credit card
        /// payment mean associated with an OVHcloud account.
        /// 
        /// ## Example Usage
        /// 
        /// ```hcl
        /// data "ovh_me_paymentmean_creditcard" "cc" {
        ///   use_default = true
        /// }
        /// ```
        /// </summary>
        public static Output<GetPaymentmeanCreditCardResult> Invoke(GetPaymentmeanCreditCardInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPaymentmeanCreditCardResult>("ovh:Me/getPaymentmeanCreditCard:getPaymentmeanCreditCard", args ?? new GetPaymentmeanCreditCardInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPaymentmeanCreditCardArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// a regexp used to filter credit cards 
        /// on their `description` attributes.
        /// </summary>
        [Input("descriptionRegexp")]
        public string? DescriptionRegexp { get; set; }

        [Input("states")]
        private List<string>? _states;

        /// <summary>
        /// Filter credit cards on their `state` attribute.
        /// Can be "expired", "valid", "tooManyFailures"
        /// </summary>
        public List<string> States
        {
            get => _states ?? (_states = new List<string>());
            set => _states = value;
        }

        /// <summary>
        /// Retrieve credit card marked as default payment mean.
        /// </summary>
        [Input("useDefault")]
        public bool? UseDefault { get; set; }

        /// <summary>
        /// Retrieve the credit card that will be the last
        /// to expire according to its expiration date.
        /// </summary>
        [Input("useLastToExpire")]
        public bool? UseLastToExpire { get; set; }

        public GetPaymentmeanCreditCardArgs()
        {
        }
        public static new GetPaymentmeanCreditCardArgs Empty => new GetPaymentmeanCreditCardArgs();
    }

    public sealed class GetPaymentmeanCreditCardInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// a regexp used to filter credit cards 
        /// on their `description` attributes.
        /// </summary>
        [Input("descriptionRegexp")]
        public Input<string>? DescriptionRegexp { get; set; }

        [Input("states")]
        private InputList<string>? _states;

        /// <summary>
        /// Filter credit cards on their `state` attribute.
        /// Can be "expired", "valid", "tooManyFailures"
        /// </summary>
        public InputList<string> States
        {
            get => _states ?? (_states = new InputList<string>());
            set => _states = value;
        }

        /// <summary>
        /// Retrieve credit card marked as default payment mean.
        /// </summary>
        [Input("useDefault")]
        public Input<bool>? UseDefault { get; set; }

        /// <summary>
        /// Retrieve the credit card that will be the last
        /// to expire according to its expiration date.
        /// </summary>
        [Input("useLastToExpire")]
        public Input<bool>? UseLastToExpire { get; set; }

        public GetPaymentmeanCreditCardInvokeArgs()
        {
        }
        public static new GetPaymentmeanCreditCardInvokeArgs Empty => new GetPaymentmeanCreditCardInvokeArgs();
    }


    [OutputType]
    public sealed class GetPaymentmeanCreditCardResult
    {
        /// <summary>
        /// a boolean which tells if the retrieved credit card
        /// is marked as the default payment mean
        /// </summary>
        public readonly bool Default;
        /// <summary>
        /// the description attribute of the credit card
        /// </summary>
        public readonly string Description;
        public readonly string? DescriptionRegexp;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// the state attribute of the credit card
        /// </summary>
        public readonly string State;
        public readonly ImmutableArray<string> States;
        public readonly bool? UseDefault;
        public readonly bool? UseLastToExpire;

        [OutputConstructor]
        private GetPaymentmeanCreditCardResult(
            bool @default,

            string description,

            string? descriptionRegexp,

            string id,

            string state,

            ImmutableArray<string> states,

            bool? useDefault,

            bool? useLastToExpire)
        {
            Default = @default;
            Description = description;
            DescriptionRegexp = descriptionRegexp;
            Id = id;
            State = state;
            States = states;
            UseDefault = useDefault;
            UseLastToExpire = useLastToExpire;
        }
    }
}
