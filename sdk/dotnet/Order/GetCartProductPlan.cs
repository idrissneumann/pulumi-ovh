// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Ovh.Order
{
    public static class GetCartProductPlan
    {
        /// <summary>
        /// Use this data source to retrieve information of order cart product plan.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Ovh = Pulumi.Ovh;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myaccount = Ovh.Me.GetMe.Invoke();
        /// 
        ///     var mycart = Ovh.Order.GetCart.Invoke(new()
        ///     {
        ///         OvhSubsidiary = myaccount.Apply(getMeResult =&gt; getMeResult.OvhSubsidiary),
        ///     });
        /// 
        ///     var plan = Ovh.Order.GetCartProductPlan.Invoke(new()
        ///     {
        ///         CartId = mycart.Apply(getCartResult =&gt; getCartResult.Id),
        ///         PriceCapacity = "renew",
        ///         Product = "cloud",
        ///         PlanCode = "project",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetCartProductPlanResult> InvokeAsync(GetCartProductPlanArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCartProductPlanResult>("ovh:Order/getCartProductPlan:getCartProductPlan", args ?? new GetCartProductPlanArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information of order cart product plan.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Ovh = Pulumi.Ovh;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myaccount = Ovh.Me.GetMe.Invoke();
        /// 
        ///     var mycart = Ovh.Order.GetCart.Invoke(new()
        ///     {
        ///         OvhSubsidiary = myaccount.Apply(getMeResult =&gt; getMeResult.OvhSubsidiary),
        ///     });
        /// 
        ///     var plan = Ovh.Order.GetCartProductPlan.Invoke(new()
        ///     {
        ///         CartId = mycart.Apply(getCartResult =&gt; getCartResult.Id),
        ///         PriceCapacity = "renew",
        ///         Product = "cloud",
        ///         PlanCode = "project",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetCartProductPlanResult> Invoke(GetCartProductPlanInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCartProductPlanResult>("ovh:Order/getCartProductPlan:getCartProductPlan", args ?? new GetCartProductPlanInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCartProductPlanArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Cart identifier
        /// </summary>
        [Input("cartId", required: true)]
        public string CartId { get; set; } = null!;

        /// <summary>
        /// Catalog name
        /// </summary>
        [Input("catalogName")]
        public string? CatalogName { get; set; }

        /// <summary>
        /// Product offer identifier
        /// </summary>
        [Input("planCode", required: true)]
        public string PlanCode { get; set; } = null!;

        /// <summary>
        /// Capacity of the pricing (type of pricing)
        /// </summary>
        [Input("priceCapacity", required: true)]
        public string PriceCapacity { get; set; } = null!;

        /// <summary>
        /// Product
        /// </summary>
        [Input("product", required: true)]
        public string Product { get; set; } = null!;

        public GetCartProductPlanArgs()
        {
        }
        public static new GetCartProductPlanArgs Empty => new GetCartProductPlanArgs();
    }

    public sealed class GetCartProductPlanInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Cart identifier
        /// </summary>
        [Input("cartId", required: true)]
        public Input<string> CartId { get; set; } = null!;

        /// <summary>
        /// Catalog name
        /// </summary>
        [Input("catalogName")]
        public Input<string>? CatalogName { get; set; }

        /// <summary>
        /// Product offer identifier
        /// </summary>
        [Input("planCode", required: true)]
        public Input<string> PlanCode { get; set; } = null!;

        /// <summary>
        /// Capacity of the pricing (type of pricing)
        /// </summary>
        [Input("priceCapacity", required: true)]
        public Input<string> PriceCapacity { get; set; } = null!;

        /// <summary>
        /// Product
        /// </summary>
        [Input("product", required: true)]
        public Input<string> Product { get; set; } = null!;

        public GetCartProductPlanInvokeArgs()
        {
        }
        public static new GetCartProductPlanInvokeArgs Empty => new GetCartProductPlanInvokeArgs();
    }


    [OutputType]
    public sealed class GetCartProductPlanResult
    {
        public readonly string CartId;
        public readonly string? CatalogName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Product offer identifier
        /// </summary>
        public readonly string PlanCode;
        public readonly string PriceCapacity;
        /// <summary>
        /// Prices of the product offer
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCartProductPlanPriceResult> Prices;
        public readonly string Product;
        /// <summary>
        /// Name of the product
        /// </summary>
        public readonly string ProductName;
        /// <summary>
        /// Product type
        /// </summary>
        public readonly string ProductType;
        /// <summary>
        /// Selected Price according to capacity
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCartProductPlanSelectedPriceResult> SelectedPrices;

        [OutputConstructor]
        private GetCartProductPlanResult(
            string cartId,

            string? catalogName,

            string id,

            string planCode,

            string priceCapacity,

            ImmutableArray<Outputs.GetCartProductPlanPriceResult> prices,

            string product,

            string productName,

            string productType,

            ImmutableArray<Outputs.GetCartProductPlanSelectedPriceResult> selectedPrices)
        {
            CartId = cartId;
            CatalogName = catalogName;
            Id = id;
            PlanCode = planCode;
            PriceCapacity = priceCapacity;
            Prices = prices;
            Product = product;
            ProductName = productName;
            ProductType = productType;
            SelectedPrices = selectedPrices;
        }
    }
}
