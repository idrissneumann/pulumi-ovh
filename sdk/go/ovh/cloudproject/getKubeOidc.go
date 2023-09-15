// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudproject

import (
	"context"
	"reflect"

	"github.com/ovh/pulumi-ovh/sdk/go/ovh/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Use this data source to get a OVHcloud Managed Kubernetes Service cluster OIDC.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/ovh/pulumi-ovh/sdk/go/ovh/CloudProject"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			oidc, err := CloudProject.GetKubeOidc(ctx, &cloudproject.GetKubeOidcArgs{
//				ServiceName: "XXXXXX",
//				KubeId:      "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxx",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("oidc-val", oidc.ClientId)
//			return nil
//		})
//	}
//
// ```
func LookupKubeOidc(ctx *pulumi.Context, args *LookupKubeOidcArgs, opts ...pulumi.InvokeOption) (*LookupKubeOidcResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupKubeOidcResult
	err := ctx.Invoke("ovh:CloudProject/getKubeOidc:getKubeOidc", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getKubeOidc.
type LookupKubeOidcArgs struct {
	// The OIDC client ID.
	ClientId *string `pulumi:"clientId"`
	// The OIDC issuer url.
	IssuerUrl *string `pulumi:"issuerUrl"`
	// The id of the managed kubernetes cluster.
	KubeId             string   `pulumi:"kubeId"`
	OidcCaContent      *string  `pulumi:"oidcCaContent"`
	OidcGroupsClaims   []string `pulumi:"oidcGroupsClaims"`
	OidcGroupsPrefix   *string  `pulumi:"oidcGroupsPrefix"`
	OidcRequiredClaims []string `pulumi:"oidcRequiredClaims"`
	OidcSigningAlgs    []string `pulumi:"oidcSigningAlgs"`
	OidcUsernameClaim  *string  `pulumi:"oidcUsernameClaim"`
	OidcUsernamePrefix *string  `pulumi:"oidcUsernamePrefix"`
	// The id of the public cloud project. If omitted,
	// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
	ServiceName string `pulumi:"serviceName"`
}

// A collection of values returned by getKubeOidc.
type LookupKubeOidcResult struct {
	// The OIDC client ID.
	ClientId *string `pulumi:"clientId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The OIDC issuer url.
	IssuerUrl *string `pulumi:"issuerUrl"`
	// See Argument Reference above.
	KubeId             string   `pulumi:"kubeId"`
	OidcCaContent      *string  `pulumi:"oidcCaContent"`
	OidcGroupsClaims   []string `pulumi:"oidcGroupsClaims"`
	OidcGroupsPrefix   *string  `pulumi:"oidcGroupsPrefix"`
	OidcRequiredClaims []string `pulumi:"oidcRequiredClaims"`
	OidcSigningAlgs    []string `pulumi:"oidcSigningAlgs"`
	OidcUsernameClaim  *string  `pulumi:"oidcUsernameClaim"`
	OidcUsernamePrefix *string  `pulumi:"oidcUsernamePrefix"`
	// See Argument Reference above.
	ServiceName string `pulumi:"serviceName"`
}

func LookupKubeOidcOutput(ctx *pulumi.Context, args LookupKubeOidcOutputArgs, opts ...pulumi.InvokeOption) LookupKubeOidcResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupKubeOidcResult, error) {
			args := v.(LookupKubeOidcArgs)
			r, err := LookupKubeOidc(ctx, &args, opts...)
			var s LookupKubeOidcResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupKubeOidcResultOutput)
}

// A collection of arguments for invoking getKubeOidc.
type LookupKubeOidcOutputArgs struct {
	// The OIDC client ID.
	ClientId pulumi.StringPtrInput `pulumi:"clientId"`
	// The OIDC issuer url.
	IssuerUrl pulumi.StringPtrInput `pulumi:"issuerUrl"`
	// The id of the managed kubernetes cluster.
	KubeId             pulumi.StringInput      `pulumi:"kubeId"`
	OidcCaContent      pulumi.StringPtrInput   `pulumi:"oidcCaContent"`
	OidcGroupsClaims   pulumi.StringArrayInput `pulumi:"oidcGroupsClaims"`
	OidcGroupsPrefix   pulumi.StringPtrInput   `pulumi:"oidcGroupsPrefix"`
	OidcRequiredClaims pulumi.StringArrayInput `pulumi:"oidcRequiredClaims"`
	OidcSigningAlgs    pulumi.StringArrayInput `pulumi:"oidcSigningAlgs"`
	OidcUsernameClaim  pulumi.StringPtrInput   `pulumi:"oidcUsernameClaim"`
	OidcUsernamePrefix pulumi.StringPtrInput   `pulumi:"oidcUsernamePrefix"`
	// The id of the public cloud project. If omitted,
	// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
	ServiceName pulumi.StringInput `pulumi:"serviceName"`
}

func (LookupKubeOidcOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupKubeOidcArgs)(nil)).Elem()
}

// A collection of values returned by getKubeOidc.
type LookupKubeOidcResultOutput struct{ *pulumi.OutputState }

func (LookupKubeOidcResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupKubeOidcResult)(nil)).Elem()
}

func (o LookupKubeOidcResultOutput) ToLookupKubeOidcResultOutput() LookupKubeOidcResultOutput {
	return o
}

func (o LookupKubeOidcResultOutput) ToLookupKubeOidcResultOutputWithContext(ctx context.Context) LookupKubeOidcResultOutput {
	return o
}

func (o LookupKubeOidcResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupKubeOidcResult] {
	return pulumix.Output[LookupKubeOidcResult]{
		OutputState: o.OutputState,
	}
}

// The OIDC client ID.
func (o LookupKubeOidcResultOutput) ClientId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupKubeOidcResult) *string { return v.ClientId }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupKubeOidcResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKubeOidcResult) string { return v.Id }).(pulumi.StringOutput)
}

// The OIDC issuer url.
func (o LookupKubeOidcResultOutput) IssuerUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupKubeOidcResult) *string { return v.IssuerUrl }).(pulumi.StringPtrOutput)
}

// See Argument Reference above.
func (o LookupKubeOidcResultOutput) KubeId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKubeOidcResult) string { return v.KubeId }).(pulumi.StringOutput)
}

func (o LookupKubeOidcResultOutput) OidcCaContent() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupKubeOidcResult) *string { return v.OidcCaContent }).(pulumi.StringPtrOutput)
}

func (o LookupKubeOidcResultOutput) OidcGroupsClaims() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupKubeOidcResult) []string { return v.OidcGroupsClaims }).(pulumi.StringArrayOutput)
}

func (o LookupKubeOidcResultOutput) OidcGroupsPrefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupKubeOidcResult) *string { return v.OidcGroupsPrefix }).(pulumi.StringPtrOutput)
}

func (o LookupKubeOidcResultOutput) OidcRequiredClaims() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupKubeOidcResult) []string { return v.OidcRequiredClaims }).(pulumi.StringArrayOutput)
}

func (o LookupKubeOidcResultOutput) OidcSigningAlgs() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupKubeOidcResult) []string { return v.OidcSigningAlgs }).(pulumi.StringArrayOutput)
}

func (o LookupKubeOidcResultOutput) OidcUsernameClaim() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupKubeOidcResult) *string { return v.OidcUsernameClaim }).(pulumi.StringPtrOutput)
}

func (o LookupKubeOidcResultOutput) OidcUsernamePrefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupKubeOidcResult) *string { return v.OidcUsernamePrefix }).(pulumi.StringPtrOutput)
}

// See Argument Reference above.
func (o LookupKubeOidcResultOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKubeOidcResult) string { return v.ServiceName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupKubeOidcResultOutput{})
}
